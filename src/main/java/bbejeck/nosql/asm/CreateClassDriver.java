package bbejeck.nosql.asm;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;

import static org.objectweb.asm.Opcodes.*;

/**
 * User: Bill Bejeck
 * Date: 5/13/14
 * Time: 9:19 PM
 */
public class CreateClassDriver {


    public static void main(String[] args) throws Exception {
        CreateClassDriver driver = new CreateClassDriver();
        byte[] classBytes = driver.writeClass();
        Class<Sample> sampleClass = driver.loadClass(classBytes);
        System.out.println(sampleClass);
        Sample sc = sampleClass.newInstance();
        sc.printMessage("Hot damn, I've created an ASM class!!");

    }

    private Class loadClass(byte[] classBytes) throws Exception {
        SimpleClassLoader classLoader = new SimpleClassLoader(Sample.class.getClassLoader());
        return classLoader.defineClass("bbejeck.nosql.asm.SampleClassXX", classBytes);
    }

    private byte[] writeClass() {
        ClassWriter cw = new ClassWriter(0);
        cw.visit(V1_8, ACC_PUBLIC + ACC_SUPER, "bbejeck/nosql/asm/SampleClassXX", null, "java/lang/Object", new String[]{Sample.class.getName().replace(".", "/")});
        createConstructor(cw);
        addMethod(cw);
        cw.visitEnd();
        return cw.toByteArray();
    }

    private void addMethod(ClassWriter classWriter) {
        MethodVisitor mv = classWriter.visitMethod(ACC_PUBLIC, "printMessage", "(Ljava/lang/String;)V", null, null);
        mv.visitCode();
        mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
        mv.visitVarInsn(ALOAD, 1);
        mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
        mv.visitInsn(RETURN);
        mv.visitMaxs(2, 2);
        mv.visitEnd();
    }

    private void createConstructor(ClassWriter classWriter) {
        MethodVisitor mv = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
        mv.visitCode();
        mv.visitVarInsn(ALOAD, 0);
        mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
        mv.visitInsn(RETURN);
        mv.visitMaxs(1, 1);
        mv.visitEnd();
    }
}
