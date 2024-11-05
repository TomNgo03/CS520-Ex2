import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = calculator0.divide(1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.add((int) (byte) 1, (int) ' ');
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.subtract((-1), (-97));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 96 + "'", int18 == 96);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((-97), 96);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9312) + "'", int12 == (-9312));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.subtract(109, (int) (short) 100);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.add(51, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.subtract((int) (short) 0, 110);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-110) + "'", int18 == (-110));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.multiply(0, 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.subtract(109, (int) (short) 100);
        int int15 = calculator0.subtract(96, (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 95 + "'", int15 == 95);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add(1, (-867133440));
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133439) + "'", int15 == (-867133439));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.subtract((-1), (-97));
        int int21 = calculator0.add((-131), (-867133440));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 96 + "'", int18 == 96);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-867133571) + "'", int21 == (-867133571));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.subtract((int) (byte) -1, (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.add(98, (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.divide((int) ' ', (-101));
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.divide(1, (-1));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide((-1769916224), (-36));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49164339 + "'", int18 == 49164339);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.multiply((int) (short) -1, 49164339);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-49164339) + "'", int9 == (-49164339));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        int int21 = calculator0.divide((-1010), 86713455);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.add((int) '#', 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 69 + "'", int12 == 69);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (byte) 100, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int12 = calculator0.divide((-58), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply((-76), (int) (short) -1);
        int int18 = calculator0.add((-10), (-68));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 76 + "'", int15 == 76);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-78) + "'", int18 == (-78));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.subtract(76, (-867133439));
        int int18 = calculator0.subtract((-15200), (int) (short) 100);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133515 + "'", int15 == 867133515);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-15300) + "'", int18 == (-15300));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply((-76), (int) (short) -1);
        int int18 = calculator0.multiply(20580, (-49164339));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 76 + "'", int15 == 76);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1810185236 + "'", int18 == 1810185236);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide((-68), (int) (byte) 100);
        int int12 = calculator0.subtract((-111), (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-121) + "'", int12 == (-121));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.multiply((-23318356), 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = calculator0.divide(757717952, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.subtract((int) (byte) -1, 100);
        int int12 = calculator0.multiply((-2146806784), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-101) + "'", int9 == (-101));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 67686400 + "'", int12 == 67686400);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.add(568480, 110);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.add(33, (-7600));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.subtract(20580, (-867133439));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867154019 + "'", int18 == 867154019);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.divide((-36), 33);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add(101, (-2020));
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1919) + "'", int9 == (-1919));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide(76, 692692992);
        int int21 = calculator0.divide((-867154019), 109);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7955541) + "'", int21 == (-7955541));
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply((-76), (int) (short) -1);
        int int18 = calculator0.multiply(20580, (-49164339));
        int int21 = calculator0.multiply(568480, (-86713457));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 76 + "'", int15 == 76);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1810185236 + "'", int18 == 1810185236);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1526379168) + "'", int21 == (-1526379168));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.add((int) 'a', (-2020));
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1923) + "'", int12 == (-1923));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.subtract((int) (short) 0, 110);
        int int21 = calculator0.multiply((-867133491), (-9280));
        int int24 = calculator0.divide(51, 86713457);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-110) + "'", int18 == (-110));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1769916224) + "'", int21 == (-1769916224));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.divide((-3), 86713344);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide(692692992, 2);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 346346496 + "'", int18 == 346346496);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (byte) 1, 96);
        int int24 = calculator0.subtract((-867125924), (int) (byte) 0);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 96 + "'", int21 == 96);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-867125924) + "'", int24 == (-867125924));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.add(51, (-97));
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-46) + "'", int12 == (-46));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide((-867133439), 9);
        int int12 = calculator0.subtract(0, 867154019);
        int int15 = calculator0.subtract(867154019, (-976));
        int int18 = calculator0.subtract((-101), (-121));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-867154019) + "'", int12 == (-867154019));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867154995 + "'", int15 == 867154995);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.divide(51, 109);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((-68), (int) (byte) 10);
        int int21 = calculator0.add((-86713551), 94);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-86713457) + "'", int21 == (-86713457));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract(568590, 20580);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 548010 + "'", int12 == 548010);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = calculator0.multiply((-46), (-152));
        int int27 = calculator0.divide(9277, (int) 'a');
        int int30 = calculator0.divide(86713455, 20580);
        int int33 = calculator0.add(25, 69);
        java.lang.Class<?> wildcardClass34 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6992 + "'", int24 == 6992);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 95 + "'", int27 == 95);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4213 + "'", int30 == 4213);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 94 + "'", int33 == 94);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((int) (short) 10, 867133501);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.subtract(131, 0);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 131 + "'", int15 == 131);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.divide(0, (-1769916224));
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide((-867133439), 9);
        int int12 = calculator0.subtract(0, 867154019);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = calculator0.divide(20580, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-867154019) + "'", int12 == (-867154019));
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.multiply(0, 210);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.add(1152037484, (int) '4');
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1152037536 + "'", int12 == 1152037536);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.divide((int) (short) 0, 34);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.divide(692692992, (-1010));
        int int21 = calculator0.multiply((-36), (-867133571));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-685834) + "'", int18 == (-685834));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1152037484 + "'", int21 == 1152037484);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.divide((-2020), (-10));
        int int21 = calculator0.divide(34, 42260032);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 202 + "'", int18 == 202);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (short) -1, 867133491);
        int int12 = calculator0.multiply((-111), (-3528));
        int int15 = calculator0.divide(0, (-3));
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133491) + "'", int9 == (-867133491));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 391608 + "'", int12 == 391608);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.divide(757717952, (-15));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-50514530) + "'", int12 == (-50514530));
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide(100, 98);
        int int21 = calculator0.subtract((-86713551), (int) (short) 100);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-86713651) + "'", int21 == (-86713651));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.divide((-100), 32);
        int int21 = calculator0.subtract(520297, 51);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 520246 + "'", int21 == 520246);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide((-1769916224), (-36));
        int int21 = calculator0.add(867133591, 76);
        int int24 = calculator0.divide(42927, (-7955541));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49164339 + "'", int18 == 49164339);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 867133667 + "'", int21 == 867133667);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.divide((-3), 86713344);
        int int15 = calculator0.divide((-15300), 867133511);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((int) '#', (int) ' ');
        int int18 = calculator0.add(34, (-1010));
        int int21 = calculator0.multiply(568480, (-6));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-976) + "'", int18 == (-976));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3410880) + "'", int21 == (-3410880));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.add(98, (int) (byte) 0);
        int int21 = calculator0.subtract((-111), (-111));
        int int24 = calculator0.multiply(1769916224, (int) (short) 100);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 897963264 + "'", int24 == 897963264);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (byte) 1, 96);
        int int24 = calculator0.subtract(25, 867133591);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = calculator0.divide((-1923), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 96 + "'", int21 == 96);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-867133566) + "'", int24 == (-867133566));
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(1145179144, 100);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1145179044 + "'", int12 == 1145179044);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.add((int) (byte) -1, (int) '4');
        int int21 = calculator0.divide(101, (-101));
        int int24 = calculator0.subtract((int) (short) 1, (int) (short) -1);
        int int27 = calculator0.divide(9, (-68));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.subtract(76, (-867133439));
        int int18 = calculator0.subtract((-15200), (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = calculator0.divide(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133515 + "'", int15 == 867133515);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-15300) + "'", int18 == (-15300));
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (byte) 1, 96);
        int int24 = calculator0.subtract((-867125924), (int) (byte) 0);
        int int27 = calculator0.divide(9277, 11);
        int int30 = calculator0.subtract((-442694645), 568480);
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 96 + "'", int21 == 96);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-867125924) + "'", int24 == (-867125924));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 843 + "'", int27 == 843);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-443263125) + "'", int30 == (-443263125));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.subtract(0, 867133515);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133515) + "'", int15 == (-867133515));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.divide((int) (short) 1, (int) (short) 100);
        int int15 = calculator0.add((int) (byte) -1, (-111));
        int int18 = calculator0.divide(110, (-1526379168));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-112) + "'", int15 == (-112));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.divide((int) 'a', (-207));
        int int21 = calculator0.multiply(0, (-867133440));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((-68), (int) (byte) 10);
        int int21 = calculator0.divide(96, (-68));
        int int24 = calculator0.divide((-15300), (-520200));
        int int27 = calculator0.add((-49164339), (-9433));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-49173772) + "'", int27 == (-49173772));
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-110), (int) (short) 0);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-110) + "'", int9 == (-110));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.multiply(34, (-685834));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-23318356) + "'", int18 == (-23318356));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((int) (short) 10, 867133501);
        int int21 = calculator0.add((-3528), (-7567));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11095) + "'", int21 == (-11095));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.multiply((-68), (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-68) + "'", int15 == (-68));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((-68), (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = calculator0.add(867133491, (int) (byte) 100);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 867133591 + "'", int24 == 867133591);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide(7955592, 6992);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1137 + "'", int15 == 1137);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.subtract((-1), (-97));
        int int21 = calculator0.add((-131), (-867133440));
        int int24 = calculator0.multiply((int) (byte) 0, (-3528));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 96 + "'", int18 == 96);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-867133571) + "'", int21 == (-867133571));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.subtract((-86713342), 86713455);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-173426797) + "'", int18 == (-173426797));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract(10, 346346496);
        int int18 = calculator0.divide(520201, (-1685643349));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-346346486) + "'", int15 == (-346346486));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.add((int) (byte) -1, (int) '4');
        int int21 = calculator0.subtract((int) (byte) 1, 32);
        int int24 = calculator0.divide((-86713457), (-2020));
        int int27 = calculator0.add((-88956677), (-867138628));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-31) + "'", int21 == (-31));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 42927 + "'", int24 == 42927);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-956095305) + "'", int27 == (-956095305));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.add(33, (-7600));
        int int21 = calculator0.divide((-173436074), 96);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1806625) + "'", int21 == (-1806625));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.multiply((int) (short) 10, 0);
        int int12 = calculator0.subtract(114096, 9347);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104749 + "'", int12 == 104749);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.add((-867133515), 1154271478);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 287137963 + "'", int15 == 287137963);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(95, 0);
        int int15 = calculator0.multiply(2243220, 1145169864);
        int int18 = calculator0.add(520246, (-845157802));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 95 + "'", int12 == 95);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 757944224 + "'", int15 == 757944224);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-844637556) + "'", int18 == (-844637556));
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.subtract((int) (short) 0, 110);
        int int21 = calculator0.multiply((-867133491), (-9280));
        int int24 = calculator0.multiply((-1769916224), (-173426797));
        int int27 = calculator0.multiply((-7480), (-76));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-110) + "'", int18 == (-110));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1769916224) + "'", int21 == (-1769916224));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 42260032 + "'", int24 == 42260032);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 568480 + "'", int27 == 568480);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.subtract((int) (short) 0, 110);
        int int21 = calculator0.multiply((-867133491), (-9280));
        int int24 = calculator0.multiply(98, 210);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-110) + "'", int18 == (-110));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1769916224) + "'", int21 == (-1769916224));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20580 + "'", int24 == 20580);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.divide((int) (short) 0, 34);
        int int15 = calculator0.divide((-1494342816), (-68));
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 21975629 + "'", int15 == 21975629);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.add(33, (-7600));
        int int21 = calculator0.add(2, 86713455);
        int int24 = calculator0.add((int) (byte) 100, 49164339);
        int int27 = calculator0.subtract(120, 120);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 86713457 + "'", int21 == 86713457);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 49164439 + "'", int24 == 49164439);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide(76, 692692992);
        int int21 = calculator0.subtract(51, (-665254));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 665305 + "'", int21 == 665305);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.add((-2146806784), 0);
        int int12 = calculator0.subtract(520297, 96);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2146806784) + "'", int9 == (-2146806784));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520201 + "'", int12 == 520201);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.add((int) (byte) -1, (int) '4');
        int int21 = calculator0.subtract((int) (byte) 1, 32);
        int int24 = calculator0.divide((-86713457), (-2020));
        int int27 = calculator0.add(101, 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-31) + "'", int21 == (-31));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 42927 + "'", int24 == 42927);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 197 + "'", int27 == 197);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.subtract((-1), (-97));
        int int21 = calculator0.subtract(37489359, (-11095));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 96 + "'", int18 == 96);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 37500454 + "'", int21 == 37500454);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.add((-111), (int) (byte) 10);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.divide((-36), 33);
        int int18 = calculator0.divide((-207), 33);
        int int21 = calculator0.add(97, (-1769916224));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1769916127) + "'", int21 == (-1769916127));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((int) '#', (int) (short) -1);
        int int21 = calculator0.subtract((int) (short) 0, (-1769916224));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1769916224 + "'", int21 == 1769916224);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.divide(25, (-1923));
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        int int21 = calculator0.divide((-1010), 86713455);
        int int24 = calculator0.add((-173436074), (int) ' ');
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-173436042) + "'", int24 == (-173436042));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-1), 1237148864);
        int int12 = calculator0.add((-20), (-112));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1237148863 + "'", int9 == 1237148863);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-132) + "'", int12 == (-132));
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.divide((-100), 32);
        int int21 = calculator0.divide(19670, 3325);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.add(33, (-7600));
        int int21 = calculator0.add(2, 86713455);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 86713457 + "'", int21 == 86713457);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.add(0, 86713457);
        int int15 = calculator0.add(1520179488, (-1459544222));
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713457 + "'", int12 == 86713457);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60635266 + "'", int15 == 60635266);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract(9, (-100));
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109 + "'", int12 == 109);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.subtract((int) (byte) -1, 100);
        int int12 = calculator0.divide(153, 21975629);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-101) + "'", int9 == (-101));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide((int) (byte) -1, 69);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide(100, (-867133440));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.add(33, (-7600));
        int int21 = calculator0.add(2, 86713455);
        int int24 = calculator0.add((int) (byte) 100, 49164339);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 86713457 + "'", int21 == 86713457);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 49164439 + "'", int24 == 49164439);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply((-76), (int) (byte) 100);
        int int18 = calculator0.multiply(109, 20580);
        int int21 = calculator0.divide(76, (-7466));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7600) + "'", int15 == (-7600));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2243220 + "'", int18 == 2243220);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(20580, (-685834));
        int int9 = calculator0.add(1152037536, 2);
        int int12 = calculator0.add(3563280, (-685834));
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-665254) + "'", int6 == (-665254));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1152037538 + "'", int9 == 1152037538);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2877446 + "'", int12 == 2877446);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.add(568480, 110);
        int int15 = calculator0.subtract(1787380221, 86713457);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1700666764 + "'", int15 == 1700666764);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = calculator0.multiply((-46), (-152));
        int int27 = calculator0.divide(9277, (int) 'a');
        int int30 = calculator0.add(780440677, 956080105);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6992 + "'", int24 == 6992);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 95 + "'", int27 == 95);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1736520782 + "'", int30 == 1736520782);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide((-1769916224), (-36));
        int int21 = calculator0.add((-9312), (-121));
        int int24 = calculator0.subtract((-867133439), (-867133666));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49164339 + "'", int18 == 49164339);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9433) + "'", int21 == (-9433));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 227 + "'", int24 == 227);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.divide(25, (-1923));
        int int12 = calculator0.multiply((-15300), 34);
        int int15 = calculator0.multiply((-1734245508), 568480);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-520200) + "'", int12 == (-520200));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86605184 + "'", int15 == 86605184);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.divide((-36), 33);
        int int18 = calculator0.subtract((-609787), (-867133537));
        int int21 = calculator0.multiply(452435152, (-362406912));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 866523750 + "'", int18 == 866523750);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1341734912) + "'", int21 == (-1341734912));
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.multiply((int) (short) -1, 49164339);
        int int12 = calculator0.add(86698157, 21975739);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-49164339) + "'", int9 == (-49164339));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 108673896 + "'", int12 == 108673896);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.add(51, (-97));
        int int15 = calculator0.multiply(1978473568, 1810185237);
        int int18 = calculator0.subtract((-1555994343), (-101));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-46) + "'", int12 == (-46));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1057369120) + "'", int15 == (-1057369120));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1555994242) + "'", int18 == (-1555994242));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.subtract(20580, (-867133439));
        int int21 = calculator0.divide((-609787), (-31));
        int int24 = calculator0.multiply((-50514530), (-867133666));
        int int27 = calculator0.subtract((-1526379168), 1152037331);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867154019 + "'", int18 == 867154019);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19670 + "'", int21 == 19670);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1448314236) + "'", int24 == (-1448314236));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1616550797 + "'", int27 == 1616550797);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (byte) 1, 96);
        int int24 = calculator0.subtract((-867125924), (int) (byte) 0);
        int int27 = calculator0.divide(9277, 11);
        int int30 = calculator0.subtract((-442694645), 568480);
        int int33 = calculator0.multiply((-867133440), 346346496);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 96 + "'", int21 == 96);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-867125924) + "'", int24 == (-867125924));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 843 + "'", int27 == 843);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-443263125) + "'", int30 == (-443263125));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 501219328 + "'", int33 == 501219328);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.subtract((int) (byte) -1, (int) (short) -1);
        int int15 = calculator0.add((-6858340), (-9280));
        int int18 = calculator0.divide(897963264, 94);
        int int21 = calculator0.multiply(32, 867133667);
        int int24 = calculator0.divide((-1145179180), 520297);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6867620) + "'", int15 == (-6867620));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9552800 + "'", int18 == 9552800);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1978473568 + "'", int21 == 1978473568);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2201) + "'", int24 == (-2201));
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide(2243220, (int) '4');
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 43138 + "'", int18 == 43138);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.add((int) (byte) -1, (int) '4');
        int int21 = calculator0.divide(101, (-101));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.add(51, (int) (short) 1);
        int int15 = calculator0.add((-68), 32);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-36) + "'", int15 == (-36));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide((int) (byte) -1, 69);
        int int21 = calculator0.add((-747485824), 867133420);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = calculator0.divide(86713455, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 119647596 + "'", int21 == 119647596);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.divide((int) 'a', (-207));
        int int21 = calculator0.multiply(0, (-867133440));
        int int24 = calculator0.divide((-1923), (-520185));
        int int27 = calculator0.multiply((-346346486), 1237148864);
        int int30 = calculator0.subtract(1810186246, 867133546);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2130112384 + "'", int27 == 2130112384);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 943052700 + "'", int30 == 943052700);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.divide((int) ' ', (-101));
        int int15 = calculator0.add(1152037484, (-6858340));
        int int18 = calculator0.divide(4213, 867133667);
        int int21 = calculator0.subtract((-173426914), 1810705533);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1145179144 + "'", int15 == 1145179144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1984132447) + "'", int21 == (-1984132447));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((int) '#', (int) (short) -1);
        int int21 = calculator0.subtract((-76), (int) (byte) 10);
        int int24 = calculator0.multiply((-5), 86713457);
        int int27 = calculator0.add((-2146806852), 0);
        int int30 = calculator0.multiply(2064, 736984748);
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-86) + "'", int21 == (-86));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-433567285) + "'", int24 == (-433567285));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2146806852) + "'", int27 == (-2146806852));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 718097088 + "'", int30 == 718097088);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract(2020, (-867133439));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 867135459 + "'", int12 == 867135459);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.subtract((-97), 110);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-207) + "'", int9 == (-207));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = calculator0.add((-76), (-76));
        int int27 = calculator0.multiply((-6858340), 3563280);
        int int30 = calculator0.subtract((-867133566), 100);
        int int33 = calculator0.subtract(757717952, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-152) + "'", int24 == (-152));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 178159040 + "'", int27 == 178159040);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-867133666) + "'", int30 == (-867133666));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 757717952 + "'", int33 == 757717952);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.add(86713457, (-15300));
        int int21 = calculator0.subtract(867133616, 196);
        int int24 = calculator0.divide(86698157, (-7955541));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 86698157 + "'", int18 == 86698157);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 867133420 + "'", int21 == 867133420);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10) + "'", int24 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.subtract(76, (-867133439));
        int int18 = calculator0.subtract((-15200), (int) (short) 100);
        int int21 = calculator0.multiply(86713455, 391608);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133515 + "'", int15 == 867133515);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-15300) + "'", int18 == (-15300));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1671243464 + "'", int21 == 1671243464);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = calculator0.multiply((-46), (-152));
        int int27 = calculator0.divide(9277, (int) 'a');
        int int30 = calculator0.divide(86713455, 20580);
        int int33 = calculator0.add(25, 69);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = calculator0.divide((-10), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6992 + "'", int24 == 6992);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 95 + "'", int27 == 95);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4213 + "'", int30 == 4213);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 94 + "'", int33 == 94);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(757717952, 867133515);
        int int15 = calculator0.divide((-1738066976), 866523750);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-109415563) + "'", int12 == (-109415563));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply((-76), (int) (short) -1);
        int int18 = calculator0.add((-10), (-68));
        int int21 = calculator0.add((-346346486), (-96348159));
        int int24 = calculator0.subtract((-2146806784), 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 76 + "'", int15 == 76);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-78) + "'", int18 == (-78));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-442694645) + "'", int21 == (-442694645));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2146806804) + "'", int24 == (-2146806804));
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.add(51, (-97));
        int int15 = calculator0.multiply(1978473568, 1810185237);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-46) + "'", int12 == (-46));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1057369120) + "'", int15 == (-1057369120));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide((-68), (int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.multiply((int) (short) 100, (-152));
        int int18 = calculator0.add((-1685643349), (-1336575288));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15200) + "'", int15 == (-15200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1272748659 + "'", int18 == 1272748659);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.divide(86698157, 867133515);
        int int24 = calculator0.add(1754528448, 1923);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1754530371 + "'", int24 == 1754530371);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(95, 0);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 95 + "'", int12 == 95);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.multiply((-23318356), 0);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (short) -1, 867133491);
        int int12 = calculator0.subtract((-86), (-109415563));
        int int15 = calculator0.add(0, 757944224);
        int int18 = calculator0.add(2, 1152037536);
        int int21 = calculator0.add(548010, (-1985610752));
        int int24 = calculator0.add(1236538978, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133491) + "'", int9 == (-867133491));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109415477 + "'", int12 == 109415477);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 757944224 + "'", int15 == 757944224);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1152037538 + "'", int18 == 1152037538);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1985062742) + "'", int21 == (-1985062742));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1236538979 + "'", int24 == 1236538979);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.add((int) (byte) 1, (int) ' ');
        int int15 = calculator0.subtract(754840506, (-1984132447));
        int int18 = calculator0.multiply(1, 94);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1555994343) + "'", int15 == (-1555994343));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 94 + "'", int18 == 94);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide((int) (byte) -1, 69);
        int int21 = calculator0.add((-747485824), 867133420);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 119647596 + "'", int21 == 119647596);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((-68), (int) (byte) 10);
        int int21 = calculator0.add((-86713551), 94);
        int int24 = calculator0.subtract((int) (short) 100, 1700666764);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-86713457) + "'", int21 == (-86713457));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1700666664) + "'", int24 == (-1700666664));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.add(0, (-1010));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1010) + "'", int18 == (-1010));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.subtract((-86713342), 86713455);
        int int21 = calculator0.subtract(1, (-152));
        int int24 = calculator0.subtract(1154271478, 2064);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-173426797) + "'", int18 == (-173426797));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 153 + "'", int21 == 153);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1154269414 + "'", int24 == 1154269414);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.divide((-3), 86713344);
        int int15 = calculator0.divide((-15300), 867133511);
        int int18 = calculator0.subtract((-1010), (-173436042));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 173435032 + "'", int18 == 173435032);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.add(51, (-97));
        int int15 = calculator0.divide(9, 867133591);
        int int18 = calculator0.subtract(9, (-109415563));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-46) + "'", int12 == (-46));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 109415572 + "'", int18 == 109415572);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide((-58), 568480);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.add(86713457, (-15300));
        int int21 = calculator0.subtract((-173426797), 0);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 86698157 + "'", int18 == 86698157);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-173426797) + "'", int21 == (-173426797));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) ' ', (int) (byte) 100);
        int int15 = calculator0.subtract((-207), 86713344);
        int int18 = calculator0.subtract(119647596, 17);
        int int21 = calculator0.multiply((-867133329), (-7955431));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-68) + "'", int12 == (-68));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713551) + "'", int15 == (-86713551));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 119647579 + "'", int18 == 119647579);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1809614551 + "'", int21 == 1809614551);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((int) '#', (int) ' ');
        int int18 = calculator0.add(34, (-1010));
        int int21 = calculator0.multiply(568480, (-6));
        int int24 = calculator0.add((-2146806784), 1693566793);
        int int27 = calculator0.subtract(1700666764, 109413727);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-976) + "'", int18 == (-976));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3410880) + "'", int21 == (-3410880));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-453239991) + "'", int24 == (-453239991));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1591253037 + "'", int27 == 1591253037);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((-68), (int) (byte) 10);
        int int21 = calculator0.divide(96, (-68));
        int int24 = calculator0.divide((-10), 9347);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.add(25, 867133591);
        int int6 = calculator0.subtract((-46), (int) (byte) -1);
        int int9 = calculator0.divide(520297, (-867133491));
        int int12 = calculator0.divide((-1923), 9277);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 867133616 + "'", int3 == 867133616);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-45) + "'", int6 == (-45));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.add((int) (byte) -1, (int) '4');
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.add(98, (int) (byte) 0);
        int int21 = calculator0.subtract((int) (short) 100, 98);
        int int24 = calculator0.add((-1813700023), (-747485824));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1733781449 + "'", int24 == 1733781449);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.add(0, 86713457);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = calculator0.divide((-298772224), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713457 + "'", int12 == 86713457);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(757717952, 867133515);
        int int15 = calculator0.divide(897963264, 1152044530);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-109415563) + "'", int12 == (-109415563));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((-68), (int) (byte) 10);
        int int21 = calculator0.divide(96, (-68));
        int int24 = calculator0.divide((-15300), (-520200));
        int int27 = calculator0.multiply(98, (int) (byte) 0);
        int int30 = calculator0.subtract((-8085940), (-1020111879));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1012025939 + "'", int30 == 1012025939);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add(101, (-2020));
        int int12 = calculator0.subtract(1356945246, 1145179044);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1919) + "'", int9 == (-1919));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 211766202 + "'", int12 == 211766202);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-110), (int) (short) 0);
        int int12 = calculator0.divide(1769916224, (-86713342));
        int int15 = calculator0.add(0, (-351870447));
        int int18 = calculator0.divide((-49164407), (-1806625));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-110) + "'", int9 == (-110));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-20) + "'", int12 == (-20));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-351870447) + "'", int15 == (-351870447));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 27 + "'", int18 == 27);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.add((int) (byte) -1, (int) '4');
        int int21 = calculator0.add((-101), (-1526379168));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1526379269) + "'", int21 == (-1526379269));
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.subtract((-24578), 867133591);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-867158169) + "'", int18 == (-867158169));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.divide(25, (-1923));
        int int12 = calculator0.multiply(1357146709, (-1494342816));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1992851744) + "'", int12 == (-1992851744));
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) ' ', (int) (byte) 100);
        int int15 = calculator0.subtract((-207), 86713344);
        int int18 = calculator0.add((-2), (-609787));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-68) + "'", int12 == (-68));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713551) + "'", int15 == (-86713551));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-609789) + "'", int18 == (-609789));
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((-68), (int) (byte) 10);
        int int21 = calculator0.divide(96, (-68));
        int int24 = calculator0.divide((-15300), (-520200));
        int int27 = calculator0.subtract(51, (-7955541));
        // The following exception was thrown during execution in test generation
        try {
            int int30 = calculator0.divide(956079995, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7955592 + "'", int27 == 7955592);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.multiply(284903989, 21975629);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1263186959) + "'", int12 == (-1263186959));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((int) '#', (int) (short) -1);
        int int21 = calculator0.subtract((-76), (int) (byte) 10);
        int int24 = calculator0.multiply((-5), 86713457);
        int int27 = calculator0.divide((-2093236467), (-1237148864));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-86) + "'", int21 == (-86));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-433567285) + "'", int24 == (-433567285));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.subtract((int) (short) 0, 110);
        int int21 = calculator0.multiply((-867133491), (-9280));
        int int24 = calculator0.multiply((-1769916224), (-173426797));
        int int27 = calculator0.divide(5419, (-341775360));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-110) + "'", int18 == (-110));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1769916224) + "'", int21 == (-1769916224));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 42260032 + "'", int24 == 42260032);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.subtract((int) (byte) -1, 0);
        int int21 = calculator0.add(0, (-520200));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-520200) + "'", int21 == (-520200));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.divide((-6), (-757113551));
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.subtract(2, 86713344);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713342) + "'", int15 == (-86713342));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.divide((int) (short) 1, (int) (short) 100);
        int int15 = calculator0.add((int) (byte) -1, (-111));
        int int18 = calculator0.subtract((-68), 49164339);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-112) + "'", int15 == (-112));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-49164407) + "'", int18 == (-49164407));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.divide(86713381, (-3528));
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-24578) + "'", int9 == (-24578));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide(100, 98);
        int int21 = calculator0.multiply(897963264, 109415477);
        int int24 = calculator0.subtract(119647579, (-86713551));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-298772224) + "'", int21 == (-298772224));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 206361130 + "'", int24 == 206361130);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((int) '#', (int) ' ');
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide(100, 98);
        int int21 = calculator0.multiply(3563280, 867133546);
        int int24 = calculator0.subtract(3325, 493715456);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1494342816 + "'", int21 == 1494342816);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-493712131) + "'", int24 == (-493712131));
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.add(568480, 110);
        int int15 = calculator0.subtract(1787380221, 86713457);
        int int18 = calculator0.multiply(8671336, (-1481140680));
        int int21 = calculator0.multiply(178159040, (int) (byte) 0);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1700666764 + "'", int15 == 1700666764);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-161052992) + "'", int18 == (-161052992));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.divide((-36), 33);
        int int18 = calculator0.divide((-207), 33);
        int int21 = calculator0.add(67686400, 861507584);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 929193984 + "'", int21 == 929193984);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide(76, 692692992);
        int int21 = calculator0.subtract(51, (-665254));
        int int24 = calculator0.multiply(131, 867133667);
        int int27 = calculator0.add((-86713342), 867154019);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 665305 + "'", int21 == 665305);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1925360681 + "'", int24 == 1925360681);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 780440677 + "'", int27 == 780440677);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.divide((-36), 33);
        int int18 = calculator0.divide((-207), 33);
        int int21 = calculator0.add((-867133440), 9);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-867133431) + "'", int21 == (-867133431));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.multiply((-86713457), 692692992);
        int int21 = calculator0.subtract(1271882624, 3400);
        int int24 = calculator0.add(287137963, 1);
        int int27 = calculator0.add(8671369, (-86713457));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1271879224 + "'", int21 == 1271879224);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 287137964 + "'", int24 == 287137964);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-78042088) + "'", int27 == (-78042088));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(1145179144, 100);
        int int15 = calculator0.multiply((-2146806784), 287137963);
        int int18 = calculator0.add((-1772159544), (-241122442));
        int int21 = calculator0.multiply((-16428397), 272082650);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1145179044 + "'", int12 == 1145179044);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-362406912) + "'", int15 == (-362406912));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2013281986) + "'", int18 == (-2013281986));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1951882450) + "'", int21 == (-1951882450));
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.divide((-36), 33);
        int int18 = calculator0.subtract((-609787), (-867133537));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 866523750 + "'", int18 == 866523750);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, (-49164339));
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-49164339) + "'", int6 == (-49164339));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.add(0, 86713457);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713457 + "'", int12 == 86713457);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.add((int) 'a', (-2020));
        int int15 = calculator0.multiply(49164339, (-173426797));
        int int18 = calculator0.add((-15300), 2243220);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1923) + "'", int12 == (-1923));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1813700023) + "'", int15 == (-1813700023));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2227920 + "'", int18 == 2227920);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.multiply((-36), 98);
        int int21 = calculator0.divide((-7480), 34);
        int int24 = calculator0.subtract((-1494342816), (-747485824));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3528) + "'", int18 == (-3528));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-220) + "'", int21 == (-220));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-746856992) + "'", int24 == (-746856992));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, (-49164339));
        // The following exception was thrown during execution in test generation
        try {
            int int9 = calculator0.divide((-826840308), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-49164339) + "'", int6 == (-49164339));
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.multiply((-86713457), 692692992);
        int int21 = calculator0.subtract(1271882624, 3400);
        int int24 = calculator0.divide(780440677, 867133667);
        int int27 = calculator0.subtract(0, (-1481140680));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1271879224 + "'", int21 == 1271879224);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1481140680 + "'", int27 == 1481140680);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.multiply((-68), 110);
        int int18 = calculator0.add(1371450554, (-49164339));
        int int21 = calculator0.multiply((-1964453610), 86713455);
        int int24 = calculator0.add((-207), (-2019171204));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7480) + "'", int15 == (-7480));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1322286215 + "'", int18 == 1322286215);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2062827382) + "'", int21 == (-2062827382));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2019171411) + "'", int24 == (-2019171411));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.divide((-3), 86713344);
        int int15 = calculator0.subtract((-520200), (-15));
        int int18 = calculator0.subtract((-867133666), 1152037538);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-520185) + "'", int15 == (-520185));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2019171204) + "'", int18 == (-2019171204));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.subtract((int) (byte) -1, (int) (short) -1);
        int int15 = calculator0.add((-6858340), (-9280));
        int int18 = calculator0.divide(897963264, 94);
        int int21 = calculator0.divide((-1700666664), (int) (byte) 10);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6867620) + "'", int15 == (-6867620));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9552800 + "'", int18 == 9552800);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-170066666) + "'", int21 == (-170066666));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (byte) 100, (-1));
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (byte) 1, 96);
        int int24 = calculator0.subtract(25, 867133591);
        int int27 = calculator0.divide((-362406912), (-433567285));
        int int30 = calculator0.multiply(1322286197, (-1020111879));
        int int33 = calculator0.divide((-866613314), (-2110419406));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 96 + "'", int21 == 96);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-867133566) + "'", int24 == (-867133566));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1359151923) + "'", int30 == (-1359151923));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', 1);
        int int15 = calculator0.multiply((-111), (-1919));
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 213009 + "'", int15 == 213009);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.subtract(96, 97);
        int int15 = calculator0.multiply((-45), (-23318356));
        int int18 = calculator0.multiply(19670, 0);
        int int21 = calculator0.divide(11, 284903989);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1049326020 + "'", int15 == 1049326020);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.add(98, (int) (byte) 0);
        int int21 = calculator0.subtract((-111), (-111));
        int int24 = calculator0.multiply((-685834), 867133616);
        int int27 = calculator0.divide(32, (-1497046780));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1520179488 + "'", int24 == 1520179488);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = calculator0.divide(95, (int) (byte) 10);
        int int27 = calculator0.subtract((-6867620), 1013244259);
        int int30 = calculator0.add((-131), (int) (byte) 100);
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1020111879) + "'", int27 == (-1020111879));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-31) + "'", int30 == (-31));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.add((int) 'a', (-2020));
        int int15 = calculator0.divide((-15300), (-1964453610));
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1923) + "'", int12 == (-1923));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.divide(210, (-976));
        int int21 = calculator0.subtract(0, (-110));
        int int24 = calculator0.divide((int) (byte) -1, 867133667);
        int int27 = calculator0.add((-2146806784), 119647596);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 110 + "'", int21 == 110);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2027159188) + "'", int27 == (-2027159188));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (byte) 100, (-1));
        int int12 = calculator0.add((-665254), (-1357151573));
        int int15 = calculator0.divide(0, 1769916224);
        int int18 = calculator0.multiply(520201, 745957086);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1357816827) + "'", int12 == (-1357816827));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1621867982 + "'", int18 == 1621867982);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.subtract((-86713342), 86713455);
        int int21 = calculator0.subtract(1, (-152));
        int int24 = calculator0.subtract((-6867620), 1474273060);
        int int27 = calculator0.add((-1336575288), (-207));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-173426797) + "'", int18 == (-173426797));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 153 + "'", int21 == 153);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1481140680) + "'", int24 == (-1481140680));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1336575495) + "'", int27 == (-1336575495));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.multiply(867133511, (-7955431));
        int int15 = calculator0.add((-1248231612), 1700666764);
        int int18 = calculator0.add(42260032, (-609789));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1037464303 + "'", int12 == 1037464303);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 452435152 + "'", int15 == 452435152);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 41650243 + "'", int18 == 41650243);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-110), (-867133491));
        // The following exception was thrown during execution in test generation
        try {
            int int12 = calculator0.divide((-1769916224), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 867133381 + "'", int9 == 867133381);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide(1219996744, 109415572);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide((-867133439), 9);
        int int12 = calculator0.multiply((-96348159), (-9280));
        int int15 = calculator0.divide((-5), 202);
        int int18 = calculator0.divide(110, 853334016);
        int int21 = calculator0.subtract(42927, (-72012));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 757717952 + "'", int12 == 757717952);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 114939 + "'", int21 == 114939);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply(0, 0);
        int int18 = calculator0.multiply(867133667, (-97));
        int int21 = calculator0.subtract((-173426797), 9277);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1787380221 + "'", int18 == 1787380221);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-173436074) + "'", int21 == (-173436074));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.divide(210, (-976));
        int int21 = calculator0.subtract(0, (-110));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 110 + "'", int21 == 110);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.add((int) (byte) -1, (int) '4');
        int int21 = calculator0.divide(101, (-101));
        int int24 = calculator0.divide(67686400, (-76265));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-887) + "'", int24 == (-887));
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) '#', (-9312));
        int int18 = calculator0.multiply(86713455, 1769916224);
        int int21 = calculator0.multiply(232346588, (-76265));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9347 + "'", int15 == 9347);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1237148864 + "'", int18 == 1237148864);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1122529476 + "'", int21 == 1122529476);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = calculator0.add((-76), (-76));
        int int27 = calculator0.multiply((-6858340), 3563280);
        int int30 = calculator0.multiply(0, (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-152) + "'", int24 == (-152));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 178159040 + "'", int27 == 178159040);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(867133591, (-15200));
        int int15 = calculator0.subtract((-1475972619), (-2201));
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 867148791 + "'", int12 == 867148791);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1475970418) + "'", int15 == (-1475970418));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.subtract((int) (byte) -1, 0);
        int int21 = calculator0.divide((-9312), 867133515);
        int int24 = calculator0.subtract(1237148863, 52);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1237148811 + "'", int24 == 1237148811);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.multiply((-298772224), 2243220);
        int int15 = calculator0.add(1408199649, (-1556003565));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 638350336 + "'", int12 == 638350336);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-147803916) + "'", int15 == (-147803916));
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.divide(210, (-976));
        int int21 = calculator0.subtract(0, (-110));
        int int24 = calculator0.divide(213009, (-241122442));
        int int27 = calculator0.add(98, 1013244259);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 110 + "'", int21 == 110);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1013244357 + "'", int27 == 1013244357);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.multiply(867133511, (-7955431));
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1037464303 + "'", int12 == 1037464303);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply((-76), (int) (byte) 100);
        int int18 = calculator0.multiply(109, 20580);
        int int21 = calculator0.divide(76, (-7466));
        // The following exception was thrown during execution in test generation
        try {
            int int24 = calculator0.divide((-170066666), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7600) + "'", int15 == (-7600));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2243220 + "'", int18 == 2243220);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) ' ', (int) (byte) 100);
        int int15 = calculator0.subtract((-207), 86713344);
        int int18 = calculator0.subtract((-867133491), (-7567));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-68) + "'", int12 == (-68));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713551) + "'", int15 == (-86713551));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-867125924) + "'", int18 == (-867125924));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.divide((int) (short) 0, 34);
        int int15 = calculator0.subtract((-887), 109);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-996) + "'", int15 == (-996));
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.add(33, (-7600));
        int int21 = calculator0.divide((-173436074), 96);
        int int24 = calculator0.subtract(25, 37489359);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1806625) + "'", int21 == (-1806625));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-37489334) + "'", int24 == (-37489334));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.divide(8, (-235439));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(1145179144, 100);
        int int15 = calculator0.multiply((-2146806784), 287137963);
        int int18 = calculator0.add((-1772159544), (-241122442));
        int int21 = calculator0.subtract((-214132468), 210);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1145179044 + "'", int12 == 1145179044);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-362406912) + "'", int15 == (-362406912));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2013281986) + "'", int18 == (-2013281986));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-214132678) + "'", int21 == (-214132678));
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply(0, 1810705533);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.add(33, (-7600));
        int int21 = calculator0.divide((-220), (int) '#');
        int int24 = calculator0.divide(6992, (-68));
        int int27 = calculator0.multiply((-844637556), 1237148811);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-102) + "'", int24 == (-102));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2132911612) + "'", int27 == (-2132911612));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide(867133546, (-442694645));
        int int21 = calculator0.multiply(1700666860, (-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 173200584 + "'", int21 == 173200584);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.subtract(867133420, 1269639304);
        int int21 = calculator0.subtract((-2146806784), (-1359151923));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-402505884) + "'", int18 == (-402505884));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-787654861) + "'", int21 == (-787654861));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.divide(210, (-976));
        int int21 = calculator0.add((-109415539), (-111));
        int int24 = calculator0.add((-29), 120);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-109415650) + "'", int21 == (-109415650));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 91 + "'", int24 == 91);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(20580, (-685834));
        int int9 = calculator0.add(1152037536, 2);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-665254) + "'", int6 == (-665254));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1152037538 + "'", int9 == 1152037538);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) ' ', 109415477);
        int int15 = calculator0.add((-46), (-1555994343));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-109415445) + "'", int12 == (-109415445));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1555994389) + "'", int15 == (-1555994389));
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (byte) 1, 96);
        int int24 = calculator0.multiply(2, (-1010));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 96 + "'", int21 == 96);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2020) + "'", int24 == (-2020));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.add(86713457, (-15300));
        int int21 = calculator0.subtract((-173426797), 0);
        int int24 = calculator0.add(287137963, 757717952);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 86698157 + "'", int18 == 86698157);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-173426797) + "'", int21 == (-173426797));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1044855915 + "'", int24 == 1044855915);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((int) (short) 10, 867133501);
        int int21 = calculator0.multiply(2, (-86713457));
        int int24 = calculator0.add(86713344, 131);
        int int27 = calculator0.subtract(34, (-290738176));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-173426914) + "'", int21 == (-173426914));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 86713475 + "'", int24 == 86713475);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 290738210 + "'", int27 == 290738210);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply(0, 1810705533);
        int int24 = calculator0.subtract((-341775360), 52);
        int int27 = calculator0.subtract(1520179488, (-1341734912));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-341775412) + "'", int24 == (-341775412));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1433052896) + "'", int27 == (-1433052896));
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.subtract((-24578), 867133591);
        int int21 = calculator0.divide((-1435799528), 196);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-867158169) + "'", int18 == (-867158169));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7325507) + "'", int21 == (-7325507));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((int) (short) 10, 867133501);
        int int21 = calculator0.add(110, 20);
        int int24 = calculator0.multiply((-1984132447), (-56));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 130 + "'", int21 == 130);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-557732664) + "'", int24 == (-557732664));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((int) (short) 10, 867133501);
        int int21 = calculator0.add((-3528), (-7567));
        int int24 = calculator0.divide((-346346486), (int) (short) 100);
        int int27 = calculator0.add(1520179488, 236472665);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = calculator0.divide(110, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11095) + "'", int21 == (-11095));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3463464) + "'", int24 == (-3463464));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1756652153 + "'", int27 == 1756652153);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide(692692992, 2);
        int int21 = calculator0.add((-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = calculator0.divide((-7567), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 346346496 + "'", int18 == 346346496);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.subtract((-7955541), (-867133515));
        int int18 = calculator0.divide(0, (-1297438693));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 859177974 + "'", int15 == 859177974);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((-866613314), 692692992);
        int int18 = calculator0.add((int) (short) -1, (-111));
        int int21 = calculator0.subtract(1269639304, (-1555994343));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-112) + "'", int18 == (-112));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1469333649) + "'", int21 == (-1469333649));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.subtract(867133420, 1269639304);
        int int21 = calculator0.divide((-152), (-1555994363));
        int int24 = calculator0.add(1532796050, 67686400);
        int int27 = calculator0.subtract(452435152, (-1145179180));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-402505884) + "'", int18 == (-402505884));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1600482450 + "'", int24 == 1600482450);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1597614332 + "'", int27 == 1597614332);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(1145179144, 100);
        int int15 = calculator0.multiply((-2146806784), 287137963);
        int int18 = calculator0.add((-1772159544), (-241122442));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1145179044 + "'", int12 == 1145179044);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-362406912) + "'", int15 == (-362406912));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2013281986) + "'", int18 == (-2013281986));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.add(25, 867133591);
        int int6 = calculator0.subtract((-46), (int) (byte) -1);
        int int9 = calculator0.divide((-1951882450), 43138);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 867133616 + "'", int3 == 867133616);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-45) + "'", int6 == (-45));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-45247) + "'", int9 == (-45247));
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide((int) (byte) -1, 69);
        int int21 = calculator0.add(6992, 2020);
        int int24 = calculator0.subtract((-1587684236), (-58));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9012 + "'", int21 == 9012);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1587684178) + "'", int24 == (-1587684178));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.add(25, 867133591);
        int int6 = calculator0.subtract((-46), (int) (byte) -1);
        int int9 = calculator0.divide(520297, (-867133491));
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 867133616 + "'", int3 == 867133616);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-45) + "'", int6 == (-45));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.subtract((-1), 9);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.divide((-36), 33);
        int int18 = calculator0.divide((-207), 33);
        int int21 = calculator0.add((-867133440), 9);
        int int24 = calculator0.subtract(1322291616, (-121));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-867133431) + "'", int21 == (-867133431));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1322291737 + "'", int24 == 1322291737);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.add(0, 86713457);
        int int15 = calculator0.add(1520179488, (-1459544222));
        int int18 = calculator0.subtract(0, 0);
        int int21 = calculator0.multiply((-86713551), (-49173772));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713457 + "'", int12 == 86713457);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60635266 + "'", int15 == 60635266);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1739617460 + "'", int21 == 1739617460);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide((-867133439), 9);
        int int12 = calculator0.subtract(0, 867154019);
        int int15 = calculator0.subtract(867154019, (-976));
        int int18 = calculator0.add((-171620289), 51);
        int int21 = calculator0.divide(1269639304, (-1769916127));
        int int24 = calculator0.subtract((-49164372), 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-867154019) + "'", int12 == (-867154019));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867154995 + "'", int15 == 867154995);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-171620238) + "'", int18 == (-171620238));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-49164380) + "'", int24 == (-49164380));
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide(1219996744, 109415572);
        int int21 = calculator0.subtract(1497046722, (-6867620));
        int int24 = calculator0.subtract(202, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1503914342 + "'", int21 == 1503914342);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 202 + "'", int24 == 202);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide((-867133439), 9);
        int int12 = calculator0.subtract(0, 867154019);
        int int15 = calculator0.subtract(867154019, (-976));
        int int18 = calculator0.add((-171620289), 51);
        int int21 = calculator0.divide(1269639304, (-1769916127));
        int int24 = calculator0.subtract(86698157, (-1237148864));
        int int27 = calculator0.divide(1154271478, (int) (short) 1);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-867154019) + "'", int12 == (-867154019));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867154995 + "'", int15 == 867154995);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-171620238) + "'", int18 == (-171620238));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1323847021 + "'", int24 == 1323847021);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1154271478 + "'", int27 == 1154271478);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((-866613314), 692692992);
        int int18 = calculator0.multiply((-442694645), (-1357151573));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 236472665 + "'", int18 == 236472665);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.divide((-2020), (-10));
        int int21 = calculator0.add(1271882624, (-2243320));
        int int24 = calculator0.add((-869367269), (-665254));
        int int27 = calculator0.subtract(1322291616, (-49164339));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 202 + "'", int18 == 202);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1269639304 + "'", int21 == 1269639304);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-870032523) + "'", int24 == (-870032523));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1371455955 + "'", int27 == 1371455955);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (short) -1, 867133491);
        int int12 = calculator0.multiply((-111), (-3528));
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133491) + "'", int9 == (-867133491));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 391608 + "'", int12 == 391608);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.divide((-2020), (-10));
        int int21 = calculator0.add(1271882624, (-2243320));
        int int24 = calculator0.add((-869367269), (-665254));
        int int27 = calculator0.add(0, 119647596);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 202 + "'", int18 == 202);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1269639304 + "'", int21 == 1269639304);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-870032523) + "'", int24 == (-870032523));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 119647596 + "'", int27 == 119647596);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        int int21 = calculator0.add((int) (short) 100, 1754528448);
        int int24 = calculator0.divide(1923, 6992);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1754528548 + "'", int21 == 1754528548);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((int) (short) 10, 867133501);
        int int21 = calculator0.add(110, 20);
        int int24 = calculator0.divide(1481140680, 548010);
        int int27 = calculator0.add((-844637556), 1004);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 130 + "'", int21 == 130);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2702 + "'", int24 == 2702);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-844636552) + "'", int27 == (-844636552));
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.add(51, (int) (short) 1);
        int int15 = calculator0.add((-68), 32);
        int int18 = calculator0.subtract(1810185237, (-2132911612));
        int int21 = calculator0.add(1002899992, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-36) + "'", int15 == (-36));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-351870447) + "'", int18 == (-351870447));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1002899992 + "'", int21 == 1002899992);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.add(51, (-97));
        int int15 = calculator0.multiply(1978473568, 1810185237);
        int int18 = calculator0.divide((-402505884), (-173426797));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-46) + "'", int12 == (-46));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1057369120) + "'", int15 == (-1057369120));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide((-867133439), 9);
        int int12 = calculator0.multiply((-96348159), (-9280));
        int int15 = calculator0.divide((-5), 202);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 757717952 + "'", int12 == 757717952);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', 1);
        int int15 = calculator0.multiply((-220), 6992);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1538240) + "'", int15 == (-1538240));
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((-3528), (-1010));
        int int15 = calculator0.add((-2020), (-1772159544));
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3563280 + "'", int12 == 3563280);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1772161564) + "'", int15 == (-1772161564));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.add((-2146806784), 0);
        int int12 = calculator0.subtract((-1475972619), 1237148765);
        int int15 = calculator0.divide((-178330532), (-555681720));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2146806784) + "'", int9 == (-2146806784));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1581845912 + "'", int12 == 1581845912);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.subtract(867133420, 1269639304);
        int int21 = calculator0.divide((-152), (-1555994363));
        int int24 = calculator0.multiply((-989528052), (-7600));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-402505884) + "'", int18 == (-402505884));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-74540096) + "'", int24 == (-74540096));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide((-867133439), 9);
        int int12 = calculator0.subtract(0, 867154019);
        int int15 = calculator0.subtract(867154019, (-976));
        int int18 = calculator0.add((-171620289), 51);
        int int21 = calculator0.multiply(86605184, 244543876);
        int int24 = calculator0.divide((-1481140680), 4213);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-867154019) + "'", int12 == (-867154019));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867154995 + "'", int15 == 867154995);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-171620238) + "'", int18 == (-171620238));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 172635648 + "'", int21 == 172635648);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-351564) + "'", int24 == (-351564));
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.subtract((int) (short) 0, 110);
        int int21 = calculator0.multiply((-867133491), (-9280));
        int int24 = calculator0.multiply((int) (short) -1, (-1923));
        int int27 = calculator0.multiply(1610593080, (-609787));
        int int30 = calculator0.subtract(1736520782, 428644672);
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-110) + "'", int18 == (-110));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1769916224) + "'", int21 == (-1769916224));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1923 + "'", int24 == 1923);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1435799528) + "'", int27 == (-1435799528));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1307876110 + "'", int30 == 1307876110);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.add(33, (-7600));
        int int21 = calculator0.divide((-173436074), 96);
        int int24 = calculator0.divide(67686400, 11);
        int int27 = calculator0.multiply((-241101862), (int) '#');
        int int30 = calculator0.multiply((-307225), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1806625) + "'", int21 == (-1806625));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6153309 + "'", int24 == 6153309);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 151369422 + "'", int27 == 151369422);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-30722500) + "'", int30 == (-30722500));
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide((-68), (int) (byte) 100);
        int int12 = calculator0.subtract((-111), (int) (short) 10);
        int int15 = calculator0.multiply((-7600), (-34));
        int int18 = calculator0.multiply(9012, (-1813700023));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-121) + "'", int12 == (-121));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 258400 + "'", int15 == 258400);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1580921300 + "'", int18 == 1580921300);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.add(520297, (-867133611));
        int int18 = calculator0.divide(272082650, 757944224);
        int int21 = calculator0.add(153, 232346435);
        int int24 = calculator0.add(867133491, 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-866613314) + "'", int15 == (-866613314));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 232346588 + "'", int21 == 232346588);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 867133509 + "'", int24 == 867133509);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide(1219996744, 109415572);
        int int21 = calculator0.subtract(1497046722, (-6867620));
        int int24 = calculator0.add(2366375, 866613314);
        int int27 = calculator0.subtract((-2093236467), (-290738176));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1503914342 + "'", int21 == 1503914342);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 868979689 + "'", int24 == 868979689);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1802498291) + "'", int27 == (-1802498291));
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (short) -1, 867133491);
        int int12 = calculator0.subtract((-86), (-109415563));
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133491) + "'", int9 == (-867133491));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109415477 + "'", int12 == 109415477);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.multiply((-9312), (-9312));
        int int15 = calculator0.divide((-100), 1152037484);
        int int18 = calculator0.add(1154271478, (-362955086));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713344 + "'", int12 == 86713344);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 791316392 + "'", int18 == 791316392);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.divide(1610593080, (-932693954));
        int int15 = calculator0.add((-1), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (short) -1, 867133491);
        int int12 = calculator0.subtract((-86), (-109415563));
        int int15 = calculator0.add(0, 757944224);
        int int18 = calculator0.add(2, 1152037536);
        int int21 = calculator0.add(548010, (-1985610752));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133491) + "'", int9 == (-867133491));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109415477 + "'", int12 == 109415477);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 757944224 + "'", int15 == 757944224);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1152037538 + "'", int18 == 1152037538);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1985062742) + "'", int21 == (-1985062742));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((int) (short) 10, 867133501);
        int int21 = calculator0.multiply(2, (-86713457));
        int int24 = calculator0.divide((-1176431440), (-78042088));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-173426914) + "'", int21 == (-173426914));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15 + "'", int24 == 15);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract(9, (-100));
        int int15 = calculator0.divide(76, 692692992);
        int int18 = calculator0.add((int) 'a', (-867133439));
        int int21 = calculator0.add(69, (-3528));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109 + "'", int12 == 109);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-867133342) + "'", int18 == (-867133342));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3459) + "'", int21 == (-3459));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply(0, 0);
        int int18 = calculator0.multiply(867133667, (-97));
        int int21 = calculator0.divide(34, (-1923));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1787380221 + "'", int18 == 1787380221);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(95, 0);
        int int15 = calculator0.multiply((-867138628), (-15200));
        int int18 = calculator0.multiply(100, 34);
        int int21 = calculator0.add(1733781449, 0);
        int int24 = calculator0.subtract((-845157802), (-1951882450));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 95 + "'", int12 == 95);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-747485824) + "'", int15 == (-747485824));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3400 + "'", int18 == 3400);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1733781449 + "'", int21 == 1733781449);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1106724648 + "'", int24 == 1106724648);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (short) -1, 867133491);
        int int12 = calculator0.subtract((-86), (-109415563));
        int int15 = calculator0.add(0, 757944224);
        int int18 = calculator0.add(2, 1152037536);
        int int21 = calculator0.add(548010, (-1985610752));
        int int24 = calculator0.multiply(2139980843, 95596657);
        int int27 = calculator0.multiply((-1382667017), 1360351360);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133491) + "'", int9 == (-867133491));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109415477 + "'", int12 == 109415477);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 757944224 + "'", int15 == 757944224);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1152037538 + "'", int18 == 1152037538);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1985062742) + "'", int21 == (-1985062742));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1429923579 + "'", int24 == 1429923579);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1872319616) + "'", int27 == (-1872319616));
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.multiply((-86713457), 692692992);
        int int21 = calculator0.subtract(1271882624, 3400);
        int int24 = calculator0.add(287137963, 1);
        int int27 = calculator0.multiply((-49173772), (-171620238));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1271879224 + "'", int21 == 1271879224);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 287137964 + "'", int24 == 287137964);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1145651032) + "'", int27 == (-1145651032));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((-68), (int) (byte) 10);
        int int21 = calculator0.divide(96, (-68));
        int int24 = calculator0.divide((-15300), (-520200));
        int int27 = calculator0.subtract((-8085940), 86144901);
        int int30 = calculator0.add(101, 780440642);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-94230841) + "'", int27 == (-94230841));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 780440743 + "'", int30 == 780440743);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.subtract(2, 86713344);
        int int18 = calculator0.multiply(1700666860, (-15200));
        int int21 = calculator0.multiply(866523750, 1693566793);
        int int24 = calculator0.multiply((-867133666), (-2020));
        int int27 = calculator0.divide(1145186611, 173200584);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713342) + "'", int15 == (-86713342));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1271882624 + "'", int18 == 1271882624);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1964453610) + "'", int21 == (-1964453610));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-736651448) + "'", int24 == (-736651448));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.subtract((int) (byte) -1, 0);
        int int21 = calculator0.divide((-9312), 867133515);
        int int24 = calculator0.subtract(1481140680, 1659460117);
        int int27 = calculator0.multiply(86713344, 67686496);
        int int30 = calculator0.subtract((-175453037), (-147803916));
        int int33 = calculator0.subtract((-1357151573), (-88));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-178319437) + "'", int24 == (-178319437));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 493715456 + "'", int27 == 493715456);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-27649121) + "'", int30 == (-27649121));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1357151485) + "'", int33 == (-1357151485));
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.divide(210, (-976));
        int int21 = calculator0.subtract(0, (-110));
        int int24 = calculator0.divide((int) (byte) -1, 867133667);
        int int27 = calculator0.subtract(17, (int) (short) -1);
        int int30 = calculator0.multiply(1322291616, (-867158169));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 110 + "'", int21 == 110);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 18 + "'", int27 == 18);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2026637472) + "'", int30 == (-2026637472));
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.divide(210, (-976));
        int int21 = calculator0.subtract(0, (-110));
        int int24 = calculator0.divide((int) (byte) -1, 867133667);
        int int27 = calculator0.subtract(17, (int) (short) -1);
        int int30 = calculator0.add(1152037484, (-74870788));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 110 + "'", int21 == 110);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 18 + "'", int27 == 18);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1077166696 + "'", int30 == 1077166696);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.multiply((int) (short) 100, (-152));
        int int18 = calculator0.add((-1685643349), (-1336575288));
        int int21 = calculator0.subtract((-867133440), 3325);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15200) + "'", int15 == (-15200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1272748659 + "'", int18 == 1272748659);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-867136765) + "'", int21 == (-867136765));
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(95, 0);
        int int15 = calculator0.multiply((-867138628), (-15200));
        int int18 = calculator0.multiply(100, 34);
        int int21 = calculator0.add((-49173772), (-171620238));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 95 + "'", int12 == 95);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-747485824) + "'", int15 == (-747485824));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3400 + "'", int18 == 3400);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-220794010) + "'", int21 == (-220794010));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', 1);
        int int15 = calculator0.multiply((-111), (-1919));
        int int18 = calculator0.subtract(1810186246, (-867133329));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 213009 + "'", int15 == 213009);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1617647721) + "'", int18 == (-1617647721));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.multiply((-9312), (-9312));
        int int15 = calculator0.divide((-100), 1152037484);
        int int18 = calculator0.multiply(1591253037, (-307225));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713344 + "'", int12 == 86713344);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1938174875 + "'", int18 == 1938174875);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((-1872794142), 1013244259);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.multiply((-86713457), 692692992);
        int int21 = calculator0.subtract(1271882624, 3400);
        int int24 = calculator0.add(287137963, 1);
        int int27 = calculator0.subtract((-23207515), (-1556003565));
        int int30 = calculator0.add((int) (byte) -1, 378379962);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1271879224 + "'", int21 == 1271879224);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 287137964 + "'", int24 == 287137964);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1532796050 + "'", int27 == 1532796050);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 378379961 + "'", int30 == 378379961);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.subtract(109, (int) (short) 100);
        int int15 = calculator0.subtract((-36), (-31));
        int int18 = calculator0.subtract((int) (byte) 0, 1494342816);
        int int21 = calculator0.divide(1152037536, 37489359);
        int int24 = calculator0.add(910738184, (-1399144532));
        int int27 = calculator0.multiply((-1058206662), 37489359);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = calculator0.divide((-96348159), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1494342816) + "'", int18 == (-1494342816));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30 + "'", int21 == 30);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-488406348) + "'", int24 == (-488406348));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1816189210) + "'", int27 == (-1816189210));
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = calculator0.add((-76), (-76));
        int int27 = calculator0.multiply((-6858340), 3563280);
        int int30 = calculator0.divide(42927, (-867138628));
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-152) + "'", int24 == (-152));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 178159040 + "'", int27 == 178159040);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.divide((-3), 86713344);
        int int15 = calculator0.divide((-15300), 867133511);
        int int18 = calculator0.divide((-76265), 11);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6933) + "'", int18 == (-6933));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide((-867133439), 9);
        int int12 = calculator0.multiply((-96348159), (-9280));
        int int15 = calculator0.divide((-5), 202);
        int int18 = calculator0.divide(110, 853334016);
        int int21 = calculator0.multiply(2139980843, (-1802498291));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 757717952 + "'", int12 == 757717952);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-115459281) + "'", int21 == (-115459281));
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.multiply(37489359, 0);
        int int12 = calculator0.subtract(0, (-2033296844));
        int int15 = calculator0.divide((-702203532), (-867138628));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2033296844 + "'", int12 == 2033296844);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.subtract((int) (byte) -1, 0);
        int int21 = calculator0.add(0, (-520200));
        int int24 = calculator0.subtract((-443263125), 25);
        int int27 = calculator0.subtract((-3528), (-49173772));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-520200) + "'", int21 == (-520200));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-443263150) + "'", int24 == (-443263150));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 49170244 + "'", int27 == 49170244);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide(692692992, 2);
        int int21 = calculator0.divide(1237148864, (-1));
        int int24 = calculator0.divide(501219328, 754840506);
        int int27 = calculator0.multiply((-9280), 2130112384);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 346346496 + "'", int18 == 346346496);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1237148864) + "'", int21 == (-1237148864));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2003427328) + "'", int27 == (-2003427328));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (short) 0, (int) ' ');
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.multiply(0, 210);
        int int18 = calculator0.subtract(1810185236, 1810185237);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.add(520297, (-867133611));
        int int18 = calculator0.subtract((-1923), (-109415650));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-866613314) + "'", int15 == (-866613314));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 109413727 + "'", int18 == 109413727);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) '#', (-9312));
        int int18 = calculator0.add(109410199, (-2146806784));
        int int21 = calculator0.add(2877446, (-88));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9347 + "'", int15 == 9347);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2037396585) + "'", int18 == (-2037396585));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2877358 + "'", int21 == 2877358);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply((-76), (int) (byte) 100);
        int int18 = calculator0.subtract(100, (-1));
        int int21 = calculator0.multiply((-5), 378379962);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7600) + "'", int15 == (-7600));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1891899810) + "'", int21 == (-1891899810));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.subtract(109, (int) (short) 100);
        int int15 = calculator0.subtract(96, (int) (byte) 1);
        int int18 = calculator0.multiply((-170954984), (-1459544222));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 95 + "'", int15 == 95);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2129948464 + "'", int18 == 2129948464);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.add(33, (-7600));
        int int21 = calculator0.divide((-220), (int) '#');
        int int24 = calculator0.divide(6992, (-68));
        int int27 = calculator0.add((-26411181), 0);
        int int30 = calculator0.add(0, (-1734245508));
        int int33 = calculator0.multiply(0, 37500454);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-102) + "'", int24 == (-102));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-26411181) + "'", int27 == (-26411181));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1734245508) + "'", int30 == (-1734245508));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.subtract(20580, (-867133439));
        int int21 = calculator0.divide((-609787), (-31));
        int int24 = calculator0.multiply((-50514530), (-867133666));
        int int27 = calculator0.add((-37489334), (-1145651032));
        int int30 = calculator0.multiply(1494342816, (-1322291616));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867154019 + "'", int18 == 867154019);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19670 + "'", int21 == 19670);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1448314236) + "'", int24 == (-1448314236));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1183140366) + "'", int27 == (-1183140366));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 887061504 + "'", int30 == 887061504);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((-1822007072), (-152));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1822007224) + "'", int18 == (-1822007224));
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.add(32, (-9312));
        int int12 = calculator0.divide(3563280, (-442694645));
        int int15 = calculator0.subtract((-1435799528), (-5));
        int int18 = calculator0.add((-39007237), 1810185237);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-9280) + "'", int9 == (-9280));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1435799523) + "'", int15 == (-1435799523));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1771178000 + "'", int18 == 1771178000);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        int int21 = calculator0.multiply(1269639246, 1037464303);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 164584658 + "'", int21 == 164584658);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.divide((-36), 33);
        int int18 = calculator0.divide((-207), 33);
        int int21 = calculator0.add(67686400, 861507584);
        int int24 = calculator0.subtract(3325, (-1248231612));
        int int27 = calculator0.divide((-58), 1970219360);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 929193984 + "'", int21 == 929193984);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1248234937 + "'", int24 == 1248234937);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((-68), (int) (byte) 10);
        int int21 = calculator0.divide(96, (-68));
        int int24 = calculator0.divide((-15300), (-520200));
        int int27 = calculator0.divide(1237148864, 33);
        int int30 = calculator0.subtract(104749, 172635648);
        int int33 = calculator0.multiply((-1777146311), 1754528448);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 37489359 + "'", int27 == 37489359);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-172530899) + "'", int30 == (-172530899));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1572558016 + "'", int33 == 1572558016);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.subtract(96, 97);
        int int15 = calculator0.multiply((-45), (-23318356));
        int int18 = calculator0.subtract(232346588, (-844637556));
        int int21 = calculator0.subtract((-36), 1269639319);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1049326020 + "'", int15 == 1049326020);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1076984144 + "'", int18 == 1076984144);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1269639355) + "'", int21 == (-1269639355));
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.subtract((-1), (-97));
        int int21 = calculator0.multiply(173435032, (-755028714));
        int int24 = calculator0.multiply((-36), (-1769916224));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 96 + "'", int18 == 96);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-214452976) + "'", int21 == (-214452976));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-707525376) + "'", int24 == (-707525376));
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(95, 0);
        int int15 = calculator0.multiply((-867138628), (-15200));
        int int18 = calculator0.multiply(100, 34);
        int int21 = calculator0.add(1733781449, 0);
        int int24 = calculator0.add(1532796050, 7029297);
        int int27 = calculator0.divide(258400, 1261453047);
        int int30 = calculator0.add((-1058206662), (-816470980));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 95 + "'", int12 == 95);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-747485824) + "'", int15 == (-747485824));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3400 + "'", int18 == 3400);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1733781449 + "'", int21 == 1733781449);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1539825347 + "'", int24 == 1539825347);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1874677642) + "'", int30 == (-1874677642));
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.multiply(0, 210);
        int int18 = calculator0.add((-23318356), 1037464303);
        int int21 = calculator0.subtract(1322286215, 18);
        int int24 = calculator0.multiply((-1010), (-1555994363));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1014145947 + "'", int18 == 1014145947);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1322286197 + "'", int21 == 1322286197);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-403723706) + "'", int24 == (-403723706));
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.add(568480, 110);
        int int15 = calculator0.subtract(1787380221, 86713457);
        int int18 = calculator0.add((-68), (-2146806784));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1700666764 + "'", int15 == 1700666764);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2146806852) + "'", int18 == (-2146806852));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((-866613314), 692692992);
        int int18 = calculator0.add((int) (short) -1, (-111));
        int int21 = calculator0.subtract(1269639304, (-1555994343));
        int int24 = calculator0.divide(2130112384, (-7325507));
        int int27 = calculator0.divide(52, (int) (byte) -1);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-112) + "'", int18 == (-112));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1469333649) + "'", int21 == (-1469333649));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-290) + "'", int24 == (-290));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-52) + "'", int27 == (-52));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.divide(210, (-976));
        int int21 = calculator0.add((-109415539), (-111));
        int int24 = calculator0.add((-29), 120);
        int int27 = calculator0.subtract((-97), 1154271574);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-109415650) + "'", int21 == (-109415650));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 91 + "'", int24 == 91);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1154271671) + "'", int27 == (-1154271671));
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (byte) 1, 96);
        int int24 = calculator0.subtract(25, 867133591);
        int int27 = calculator0.divide((-362406912), (-433567285));
        int int30 = calculator0.multiply(1322286197, (-1020111879));
        int int33 = calculator0.multiply((-362955086), (-18090313));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 96 + "'", int21 == 96);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-867133566) + "'", int24 == (-867133566));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1359151923) + "'", int30 == (-1359151923));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1202216254 + "'", int33 == 1202216254);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.add(86713457, (-15300));
        int int21 = calculator0.subtract((-173426797), 0);
        int int24 = calculator0.multiply(1580921300, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 86698157 + "'", int18 == 86698157);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-173426797) + "'", int21 == (-173426797));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-685328092) + "'", int24 == (-685328092));
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide(67686400, (-111));
        int int21 = calculator0.multiply((-1010), 2064);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-609787) + "'", int18 == (-609787));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2084640) + "'", int21 == (-2084640));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.divide((int) ' ', (-101));
        int int15 = calculator0.subtract(867154995, 4213);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867150782 + "'", int15 == 867150782);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.subtract((-86713342), 86713455);
        int int21 = calculator0.subtract(1, (-152));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-173426797) + "'", int18 == (-173426797));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 153 + "'", int21 == 153);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (byte) 100, (-1));
        int int12 = calculator0.add((-665254), (-1357151573));
        int int15 = calculator0.divide(0, 1769916224);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = calculator0.divide((-586398088), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1357816827) + "'", int12 == (-1357816827));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.subtract(76, (-867133439));
        int int18 = calculator0.multiply(33, 213009);
        int int21 = calculator0.divide((-867133491), 86144901);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133515 + "'", int15 == 867133515);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7029297 + "'", int18 == 7029297);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.subtract((int) (short) 0, 110);
        int int21 = calculator0.multiply((-867133491), (-9280));
        int int24 = calculator0.multiply(98, 210);
        int int27 = calculator0.divide((-1872794142), (-867133566));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-110) + "'", int18 == (-110));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1769916224) + "'", int21 == (-1769916224));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20580 + "'", int24 == 20580);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.subtract(20580, (-867133439));
        int int21 = calculator0.divide((-609787), (-31));
        int int24 = calculator0.multiply((-50514530), (-867133666));
        int int27 = calculator0.add((-37489334), (-1145651032));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867154019 + "'", int18 == 867154019);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19670 + "'", int21 == 19670);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1448314236) + "'", int24 == (-1448314236));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1183140366) + "'", int27 == (-1183140366));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.subtract(96, 97);
        int int15 = calculator0.multiply((-45), (-23318356));
        int int18 = calculator0.divide((-1322291616), 25);
        int int21 = calculator0.subtract(868979689, (-1738066976));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1049326020 + "'", int15 == 1049326020);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-52891664) + "'", int18 == (-52891664));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1687920631) + "'", int21 == (-1687920631));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.multiply((int) (short) 100, (-152));
        int int18 = calculator0.add(3563280, 867133491);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15200) + "'", int15 == (-15200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 870696771 + "'", int18 == 870696771);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.add(33, (-7600));
        int int21 = calculator0.add(2, 86713455);
        int int24 = calculator0.add((int) (byte) 100, 49164339);
        int int27 = calculator0.subtract(109, 1495828402);
        int int30 = calculator0.multiply((-172530899), (-1322291616));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 86713457 + "'", int21 == 86713457);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 49164439 + "'", int24 == 49164439);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1495828293) + "'", int27 == (-1495828293));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1134921440 + "'", int30 == 1134921440);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.multiply(867133511, (-7955431));
        int int15 = calculator0.divide((-1359151923), (-109415445));
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1037464303 + "'", int12 == 1037464303);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.add((-111), (int) (byte) 10);
        int int18 = calculator0.divide(391608, 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 23035 + "'", int18 == 23035);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply((-76), (int) (short) -1);
        int int18 = calculator0.add((-10), (-68));
        int int21 = calculator0.add((-346346486), (-96348159));
        int int24 = calculator0.add((-1769916224), 867133591);
        int int27 = calculator0.subtract(1154269414, 151369422);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 76 + "'", int15 == 76);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-78) + "'", int18 == (-78));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-442694645) + "'", int21 == (-442694645));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-902782633) + "'", int24 == (-902782633));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1002899992 + "'", int27 == 1002899992);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.divide((int) (short) 1, (int) (short) 100);
        int int15 = calculator0.add((int) (byte) -1, (-111));
        int int18 = calculator0.divide(110, (-1526379168));
        int int21 = calculator0.subtract(60635266, (-1617647721));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-112) + "'", int15 == (-112));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1678282987 + "'", int21 == 1678282987);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.multiply((int) (short) 10, (-685834));
        int int21 = calculator0.subtract(867154019, 1925360681);
        int int24 = calculator0.add((-3), 20);
        int int27 = calculator0.subtract((-707525376), 9277);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6858340) + "'", int18 == (-6858340));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1058206662) + "'", int21 == (-1058206662));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17 + "'", int24 == 17);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-707534653) + "'", int27 == (-707534653));
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(20580, (-685834));
        int int9 = calculator0.add(1152037536, 2);
        int int12 = calculator0.multiply(867133667, 949005184);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-665254) + "'", int6 == (-665254));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1152037538 + "'", int9 == 1152037538);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1435233664) + "'", int12 == (-1435233664));
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.add(98, (int) (byte) 0);
        int int21 = calculator0.subtract((-111), (-111));
        int int24 = calculator0.multiply(1769916224, (int) (short) 100);
        int int27 = calculator0.subtract(0, 34);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 897963264 + "'", int24 == 897963264);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-34) + "'", int27 == (-34));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((-866613314), 692692992);
        int int18 = calculator0.add(1693566793, 867154995);
        int int21 = calculator0.add(5, 1581845912);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1734245508) + "'", int18 == (-1734245508));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1581845917 + "'", int21 == 1581845917);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.divide(0, (-1769916224));
        int int12 = calculator0.add((-9280), 2243220);
        int int15 = calculator0.subtract((-23207515), 1357146709);
        int int18 = calculator0.subtract((-867133666), 109411264);
        int int21 = calculator0.add((-2026637472), (-1503190165));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2233940 + "'", int12 == 2233940);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1380354224) + "'", int15 == (-1380354224));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-976544930) + "'", int18 == (-976544930));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 765139659 + "'", int21 == 765139659);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.multiply((-68), (int) (short) 1);
        int int18 = calculator0.divide(20, (-109415445));
        int int21 = calculator0.add(210, (-96348159));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-68) + "'", int15 == (-68));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-96347949) + "'", int21 == (-96347949));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(757717952, 867133515);
        int int15 = calculator0.divide((-86713342), (-826840308));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-109415563) + "'", int12 == (-109415563));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.add(33, (-7600));
        int int21 = calculator0.divide((-220), (int) '#');
        int int24 = calculator0.divide(6992, (-68));
        int int27 = calculator0.add((-26411181), 0);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-102) + "'", int24 == (-102));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-26411181) + "'", int27 == (-26411181));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = calculator0.add(867133491, (int) (byte) 100);
        int int27 = calculator0.divide(86713344, 9347);
        int int30 = calculator0.subtract((-36), (-520185));
        int int33 = calculator0.divide(109, 3400);
        int int36 = calculator0.multiply(956079995, (-1687920631));
        // The following exception was thrown during execution in test generation
        try {
            int int39 = calculator0.divide((-35), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 867133591 + "'", int24 == 867133591);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9277 + "'", int27 == 9277);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 520149 + "'", int30 == 520149);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-2118403245) + "'", int36 == (-2118403245));
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((int) '#', (int) (short) -1);
        int int21 = calculator0.subtract((-76), (int) (byte) 10);
        int int24 = calculator0.multiply((-5), 86713457);
        int int27 = calculator0.add((-2146806852), 0);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-86) + "'", int21 == (-86));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-433567285) + "'", int24 == (-433567285));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2146806852) + "'", int27 == (-2146806852));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide(867133546, (-442694645));
        int int21 = calculator0.subtract((-36), 1145179144);
        int int24 = calculator0.add((int) (byte) 1, (-3));
        int int27 = calculator0.divide(287137964, 1049326020);
        int int30 = calculator0.multiply(1269639304, (-868095375));
        int int33 = calculator0.subtract(10107303, (-1357151573));
        java.lang.Class<?> wildcardClass34 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1145179180) + "'", int21 == (-1145179180));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1493382152 + "'", int30 == 1493382152);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1367258876 + "'", int33 == 1367258876);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.subtract(109, (int) (short) 100);
        int int15 = calculator0.subtract((-110), 867133501);
        int int18 = calculator0.divide((-581169146), 1597614332);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133611) + "'", int15 == (-867133611));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.subtract((-86713342), 86713455);
        int int21 = calculator0.subtract(1, (-152));
        int int24 = calculator0.multiply((-910738153), (-934840507));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-173426797) + "'", int18 == (-173426797));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 153 + "'", int21 == 153);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1965697075 + "'", int24 == 1965697075);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.divide((-1237148864), 153);
        int int12 = calculator0.divide(757717952, (-109415563));
        int int15 = calculator0.divide((-887), (-207));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8085940) + "'", int9 == (-8085940));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.subtract(20580, (-867133439));
        int int21 = calculator0.divide((-609787), (-31));
        int int24 = calculator0.multiply((-50514530), (-867133666));
        int int27 = calculator0.subtract((-1526379168), 1152037331);
        int int30 = calculator0.add(1145179044, (-520185));
        int int33 = calculator0.divide(1237148765, (-178330532));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867154019 + "'", int18 == 867154019);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19670 + "'", int21 == 19670);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1448314236) + "'", int24 == (-1448314236));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1616550797 + "'", int27 == 1616550797);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1144658859 + "'", int30 == 1144658859);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-6) + "'", int33 == (-6));
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.multiply((int) (short) 100, (-152));
        int int18 = calculator0.divide((-1248231612), 1754528548);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15200) + "'", int15 == (-15200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.subtract((int) (byte) -1, 100);
        int int12 = calculator0.subtract(1810185236, (-1010));
        int int15 = calculator0.divide(1257480666, (-341775360));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-101) + "'", int9 == (-101));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1810186246 + "'", int12 == 1810186246);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3) + "'", int15 == (-3));
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.divide((-100), 32);
        int int21 = calculator0.divide((-1357151573), (-20));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 67857578 + "'", int21 == 67857578);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply(0, 0);
        int int18 = calculator0.multiply(867133667, (-97));
        int int21 = calculator0.divide(34, (-1923));
        int int24 = calculator0.multiply((-467179908), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1787380221 + "'", int18 == 1787380221);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((-68), (int) (byte) 10);
        int int21 = calculator0.divide(96, (-68));
        int int24 = calculator0.divide((-15300), (-520200));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.add(0, 86713457);
        int int15 = calculator0.subtract((-1923), 1154269414);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713457 + "'", int12 == 86713457);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1154271337) + "'", int15 == (-1154271337));
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide(67686400, (-111));
        int int21 = calculator0.divide((-1951882450), (-1494342816));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-609787) + "'", int18 == (-609787));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.subtract((-86713342), 86713455);
        int int21 = calculator0.subtract(1, (-152));
        int int24 = calculator0.subtract(1154271478, 2064);
        int int27 = calculator0.multiply(870696771, (-1497046780));
        int int30 = calculator0.subtract(104946, 520149);
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-173426797) + "'", int18 == (-173426797));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 153 + "'", int21 == 153);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1154269414 + "'", int24 == 1154269414);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-989528052) + "'", int27 == (-989528052));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-415203) + "'", int30 == (-415203));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((int) (short) 10, 867133501);
        int int21 = calculator0.multiply(2, (-86713457));
        int int24 = calculator0.subtract(867133420, (int) (byte) 0);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-173426914) + "'", int21 == (-173426914));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 867133420 + "'", int24 == 867133420);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((-101), (-86));
        int int15 = calculator0.add((-362406912), (-173426797));
        int int18 = calculator0.subtract(2129948464, 1730079900);
        int int21 = calculator0.add((-18090313), (-917629359));
        int int24 = calculator0.divide((-49164407), (-733999));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-15) + "'", int12 == (-15));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-535833709) + "'", int15 == (-535833709));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 399868564 + "'", int18 == 399868564);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-935719672) + "'", int21 == (-935719672));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 66 + "'", int24 == 66);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.add((int) (byte) 1, (int) ' ');
        int int15 = calculator0.subtract(754840506, (-1984132447));
        int int18 = calculator0.multiply(745957086, 0);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1555994343) + "'", int15 == (-1555994343));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) '#', (-9312));
        int int18 = calculator0.divide((-97), (-867138628));
        int int21 = calculator0.divide(1395, (-867125924));
        int int24 = calculator0.add((-1439965725), 88947384);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9347 + "'", int15 == 9347);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1351018341) + "'", int24 == (-1351018341));
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.add(520297, (-867133611));
        // The following exception was thrown during execution in test generation
        try {
            int int18 = calculator0.divide((-2115365052), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-866613314) + "'", int15 == (-866613314));
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.subtract((-86713342), 86713455);
        int int21 = calculator0.subtract(1, (-152));
        int int24 = calculator0.subtract((-6867620), 1474273060);
        int int27 = calculator0.subtract((-49164407), 86144901);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-173426797) + "'", int18 == (-173426797));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 153 + "'", int21 == 153);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1481140680) + "'", int24 == (-1481140680));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-135309308) + "'", int27 == (-135309308));
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.add(0, (-1010));
        int int21 = calculator0.divide((-1435233664), 1353728);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1010) + "'", int18 == (-1010));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1060) + "'", int21 == (-1060));
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((int) '#', (int) (short) -1);
        int int21 = calculator0.subtract((int) (short) 0, (-1769916224));
        int int24 = calculator0.multiply((-2146806852), 665);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1769916224 + "'", int21 == 1769916224);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1697414308) + "'", int24 == (-1697414308));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.multiply((-1587684178), (-1155286483));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-710920554) + "'", int18 == (-710920554));
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.divide((-36), 33);
        int int18 = calculator0.divide((-207), 33);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(95, 0);
        int int15 = calculator0.multiply((-867138628), (-15200));
        int int18 = calculator0.multiply(100, 34);
        int int21 = calculator0.add((-49173772), (-171620238));
        // The following exception was thrown during execution in test generation
        try {
            int int24 = calculator0.divide(493715456, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 95 + "'", int12 == 95);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-747485824) + "'", int15 == (-747485824));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3400 + "'", int18 == 3400);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-220794010) + "'", int21 == (-220794010));
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.add((int) 'a', (-2020));
        int int15 = calculator0.divide((-15300), (-1964453610));
        int int18 = calculator0.add((-404066219), (-965191816));
        int int21 = calculator0.divide((-2084640), 1754530371);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1923) + "'", int12 == (-1923));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1369258035) + "'", int18 == (-1369258035));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (byte) 1, 96);
        int int24 = calculator0.subtract((-867125924), (int) (byte) 0);
        int int27 = calculator0.divide(9277, 11);
        int int30 = calculator0.subtract((-442694645), 568480);
        int int33 = calculator0.subtract(1237148863, 98);
        int int36 = calculator0.add(1520179488, 866523750);
        java.lang.Class<?> wildcardClass37 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 96 + "'", int21 == 96);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-867125924) + "'", int24 == (-867125924));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 843 + "'", int27 == 843);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-443263125) + "'", int30 == (-443263125));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1237148765 + "'", int33 == 1237148765);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1908264058) + "'", int36 == (-1908264058));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.add(568480, 110);
        int int15 = calculator0.subtract(1787380221, 86713457);
        int int18 = calculator0.subtract(1271879224, 9347);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1700666764 + "'", int15 == 1700666764);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1271869877 + "'", int18 == 1271869877);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.add(98, (int) (byte) 0);
        int int21 = calculator0.subtract((-111), (-111));
        int int24 = calculator0.add(197, (-757113551));
        // The following exception was thrown during execution in test generation
        try {
            int int27 = calculator0.divide((-1286026560), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-757113354) + "'", int24 == (-757113354));
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.subtract((-1), 9);
        int int18 = calculator0.multiply(18, (-867138628));
        int int21 = calculator0.subtract((-180712367), (-74870788));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1571373880 + "'", int18 == 1571373880);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-105841579) + "'", int21 == (-105841579));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.subtract(76, (-867133439));
        int int18 = calculator0.multiply(33, 213009);
        int int21 = calculator0.subtract(0, 568590);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133515 + "'", int15 == 867133515);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7029297 + "'", int18 == 7029297);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-568590) + "'", int21 == (-568590));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide(100, (-867133440));
        int int21 = calculator0.multiply((-1769916127), 843);
        int int24 = calculator0.divide((-702203532), 110);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1685643349) + "'", int21 == (-1685643349));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-6383668) + "'", int24 == (-6383668));
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.divide(1610593080, (-932693954));
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(95, 0);
        int int15 = calculator0.multiply((-867138628), (-15200));
        int int18 = calculator0.multiply(100, 34);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 95 + "'", int12 == 95);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-747485824) + "'", int15 == (-747485824));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3400 + "'", int18 == 3400);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.subtract((-86713342), 86713455);
        int int21 = calculator0.subtract((-1494342816), 1787380221);
        int int24 = calculator0.divide(1754530371, (-10));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-173426797) + "'", int18 == (-173426797));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1013244259 + "'", int21 == 1013244259);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-175453037) + "'", int24 == (-175453037));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.add(86713457, (-15300));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 86698157 + "'", int18 == 86698157);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.multiply((-607867904), 1445304909);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1168096256 + "'", int12 == 1168096256);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) ' ', (int) (byte) 100);
        int int15 = calculator0.subtract((-207), 86713344);
        int int18 = calculator0.subtract(119647596, 17);
        int int21 = calculator0.add((-110), 96);
        int int24 = calculator0.subtract(1925360681, (-757113354));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-68) + "'", int12 == (-68));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713551) + "'", int15 == (-86713551));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 119647579 + "'", int18 == 119647579);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-14) + "'", int21 == (-14));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1612493261) + "'", int24 == (-1612493261));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.multiply(1474273060, (-867133566));
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-240317368) + "'", int12 == (-240317368));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply((-76), (int) (short) -1);
        int int18 = calculator0.multiply(20580, (-49164339));
        int int21 = calculator0.multiply(568480, (-86713457));
        int int24 = calculator0.divide((-1), (-2146806784));
        int int27 = calculator0.subtract((-15200), (-956095305));
        int int30 = calculator0.divide(1875857755, 1269639319);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 76 + "'", int15 == 76);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1810185236 + "'", int18 == 1810185236);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1526379168) + "'", int21 == (-1526379168));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 956080105 + "'", int27 == 956080105);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract(9, (-100));
        int int15 = calculator0.add(1733781449, 18);
        int int18 = calculator0.divide(29811430, 1897078486);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109 + "'", int12 == 109);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1733781467 + "'", int15 == 1733781467);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.add(98, (int) (byte) 0);
        int int21 = calculator0.subtract((int) (short) 100, 98);
        int int24 = calculator0.multiply(537567364, 210);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1219996744 + "'", int24 == 1219996744);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.add(568480, 110);
        int int15 = calculator0.divide(51, 101);
        int int18 = calculator0.add(1013244259, 4213);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1013248472 + "'", int18 == 1013248472);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.divide((-36), 33);
        int int18 = calculator0.divide((-1448314236), 1238032199);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((int) (short) 10, 867133501);
        int int21 = calculator0.add((-3528), (-7567));
        int int24 = calculator0.divide((int) 'a', 251488941);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11095) + "'", int21 == (-11095));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.subtract((-1), (-97));
        int int21 = calculator0.add((-97), 98);
        int int24 = calculator0.divide(1730729969, 21975629);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 96 + "'", int18 == 96);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 78 + "'", int24 == 78);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.divide((-36), 33);
        int int18 = calculator0.divide((-31), 119647579);
        int int21 = calculator0.subtract((-520200), (-170954984));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 170434784 + "'", int21 == 170434784);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.multiply((-9312), (-9312));
        int int15 = calculator0.subtract(867133515, (-6));
        int int18 = calculator0.subtract((-857622013), 1771863899);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713344 + "'", int12 == 86713344);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133521 + "'", int15 == 867133521);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1665481384 + "'", int18 == 1665481384);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.divide(86698157, 867133515);
        int int24 = calculator0.divide(98, 101);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.subtract(109, (int) (short) 100);
        int int15 = calculator0.subtract((-36), (-31));
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((-68), (int) (byte) 10);
        int int21 = calculator0.add((-86713551), 94);
        int int24 = calculator0.subtract((int) (short) 100, 1700666764);
        int int27 = calculator0.divide((-865948009), 1326084746);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-86713457) + "'", int21 == (-86713457));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1700666664) + "'", int24 == (-1700666664));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.multiply(34, (-685834));
        int int21 = calculator0.add(1700666860, 1237148863);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-23318356) + "'", int18 == (-23318356));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1357151573) + "'", int21 == (-1357151573));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide((-867133571), (-7600));
        int int21 = calculator0.subtract((-8085940), 757717952);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 114096 + "'", int18 == 114096);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-765803892) + "'", int21 == (-765803892));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.subtract((-86713342), 86713455);
        int int21 = calculator0.subtract((-1494342816), 1787380221);
        int int24 = calculator0.divide(1271879224, 1037464303);
        int int27 = calculator0.subtract(1145169864, 17);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-173426797) + "'", int18 == (-173426797));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1013244259 + "'", int21 == 1013244259);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1145169847 + "'", int27 == 1145169847);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide(867133546, (-442694645));
        int int21 = calculator0.subtract((-36), 1145179144);
        int int24 = calculator0.add((int) (byte) 1, (-3));
        int int27 = calculator0.divide(287137964, 1049326020);
        int int30 = calculator0.multiply(1269639304, (-868095375));
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1145179180) + "'", int21 == (-1145179180));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1493382152 + "'", int30 == 1493382152);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.multiply((int) (short) 10, (-685834));
        int int21 = calculator0.subtract(867154019, 1925360681);
        int int24 = calculator0.add((-3), 20);
        int int27 = calculator0.add((-2013281986), 1145186611);
        int int30 = calculator0.add((-841742365), 1495828402);
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6858340) + "'", int18 == (-6858340));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1058206662) + "'", int21 == (-1058206662));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17 + "'", int24 == 17);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-868095375) + "'", int27 == (-868095375));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 654086037 + "'", int30 == 654086037);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.multiply((-68), 110);
        int int18 = calculator0.add(1371450554, (-49164339));
        int int21 = calculator0.add(1152037331, (-867133342));
        int int24 = calculator0.multiply((-976), 273140353);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7480) + "'", int15 == (-7480));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1322286215 + "'", int18 == 1322286215);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 284903989 + "'", int21 == 284903989);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-297012176) + "'", int24 == (-297012176));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((-68), (int) (byte) 10);
        int int21 = calculator0.divide(96, (-68));
        int int24 = calculator0.divide((-15300), (-520200));
        int int27 = calculator0.multiply(98, (int) (byte) 0);
        int int30 = calculator0.multiply(867133546, 1520179488);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2075617088 + "'", int30 == 2075617088);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.divide((-1237148864), 153);
        int int12 = calculator0.add(164584658, (-853113394));
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8085940) + "'", int9 == (-8085940));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-688528736) + "'", int12 == (-688528736));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.divide((-2020), (-10));
        int int21 = calculator0.multiply(0, (-765803892));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 202 + "'", int18 == 202);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.add(86713457, (-15300));
        int int21 = calculator0.subtract((-13365), 1271882624);
        int int24 = calculator0.divide((-702203532), (-1286026560));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 86698157 + "'", int18 == 86698157);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1271895989) + "'", int21 == (-1271895989));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.subtract((-1263186959), (-493712131));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-769474828) + "'", int18 == (-769474828));
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        int int21 = calculator0.subtract((-2146806852), 1237148863);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 911011581 + "'", int21 == 911011581);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        int int21 = calculator0.divide((-1010), 1152037484);
        int int24 = calculator0.subtract((-2146806852), 1610593080);
        int int27 = calculator0.subtract((-956095305), (-1760882346));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 537567364 + "'", int24 == 537567364);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 804787041 + "'", int27 == 804787041);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply(0, 0);
        int int18 = calculator0.multiply(867133667, (-97));
        int int21 = calculator0.divide(34, (-1923));
        int int24 = calculator0.divide(1237148864, (-172530899));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1787380221 + "'", int18 == 1787380221);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-7) + "'", int24 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.multiply(867133511, (-7955431));
        int int15 = calculator0.divide(1754528448, 1152037536);
        int int18 = calculator0.multiply(3, 1908264017);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1037464303 + "'", int12 == 1037464303);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1429824755 + "'", int18 == 1429824755);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(95, 0);
        int int15 = calculator0.multiply((-867138628), (-15200));
        int int18 = calculator0.multiply(100, 34);
        int int21 = calculator0.divide(7, 537567364);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 95 + "'", int12 == 95);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-747485824) + "'", int15 == (-747485824));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3400 + "'", int18 == 3400);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = calculator0.multiply((-46), (-152));
        int int27 = calculator0.multiply(867133491, 202);
        int int30 = calculator0.subtract((-88956701), 69);
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6992 + "'", int24 == 6992);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-932693954) + "'", int27 == (-932693954));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-88956770) + "'", int30 == (-88956770));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (byte) 100, (-1));
        int int12 = calculator0.add((-665254), (-1357151573));
        int int15 = calculator0.divide(0, 1769916224);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1357816827) + "'", int12 == (-1357816827));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        int int21 = calculator0.divide((-1010), 1152037484);
        int int24 = calculator0.subtract((-2146806852), 1610593080);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 537567364 + "'", int24 == 537567364);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.multiply((int) (short) 100, (-152));
        int int18 = calculator0.divide((-1248231612), 1754528548);
        int int21 = calculator0.multiply((-16428397), 11);
        int int24 = calculator0.subtract((-1475970418), (-272902));
        int int27 = calculator0.subtract((-102), 1665481384);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15200) + "'", int15 == (-15200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-180712367) + "'", int21 == (-180712367));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1475697516) + "'", int24 == (-1475697516));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1665481486) + "'", int27 == (-1665481486));
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.subtract(2, 86713344);
        int int18 = calculator0.multiply(1700666860, (-15200));
        // The following exception was thrown during execution in test generation
        try {
            int int21 = calculator0.divide(8939518, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713342) + "'", int15 == (-86713342));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1271882624 + "'", int18 == 1271882624);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.add(568480, 110);
        int int15 = calculator0.subtract(1787380221, 86713457);
        int int18 = calculator0.add((-68), (-2146806784));
        int int21 = calculator0.divide(88956711, 1037464303);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1700666764 + "'", int15 == 1700666764);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2146806852) + "'", int18 == (-2146806852));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.add(33, (-7600));
        int int21 = calculator0.divide((-173436074), 96);
        int int24 = calculator0.multiply((-240317368), (-100));
        int int27 = calculator0.subtract(0, (-2));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1806625) + "'", int21 == (-1806625));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1738066976) + "'", int24 == (-1738066976));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.add((-2146806784), 0);
        int int12 = calculator0.subtract(520297, 96);
        int int15 = calculator0.divide(20580, 780440677);
        int int18 = calculator0.multiply((-1820924517), 1497039730);
        int int21 = calculator0.multiply(1323847021, 8939518);
        int int24 = calculator0.divide((-170066666), 1106724648);
        int int27 = calculator0.divide(206361130, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2146806784) + "'", int9 == (-2146806784));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520201 + "'", int12 == 520201);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-581169146) + "'", int18 == (-581169146));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-477385434) + "'", int21 == (-477385434));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20636113 + "'", int27 == 20636113);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = calculator0.divide(72529, 109);
        int int27 = calculator0.add((-1740511737), (-6383668));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 665 + "'", int24 == 665);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1746895405) + "'", int27 == (-1746895405));
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.multiply((int) (short) 10, 0);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) '#', (-9312));
        int int18 = calculator0.divide((-97), (-867138628));
        int int21 = calculator0.multiply((-298772224), 1908264058);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9347 + "'", int15 == 9347);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 408021504 + "'", int21 == 408021504);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.divide((-36), 33);
        int int18 = calculator0.divide((-207), 33);
        int int21 = calculator0.add((-867133440), 9);
        int int24 = calculator0.multiply((-545574417), (-1740511737));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-867133431) + "'", int21 == (-867133431));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1625954185 + "'", int24 == 1625954185);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide(867133546, (-442694645));
        int int21 = calculator0.subtract((-36), 1145179144);
        int int24 = calculator0.add((int) (byte) 1, (-3));
        int int27 = calculator0.divide(287137964, 1049326020);
        int int30 = calculator0.divide(67854305, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1145179180) + "'", int21 == (-1145179180));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 11309050 + "'", int30 == 11309050);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.divide(86698157, 867133515);
        int int24 = calculator0.add(21975629, (-867133431));
        int int27 = calculator0.subtract(109, 0);
        int int30 = calculator0.add((-867133666), 1754530371);
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-845157802) + "'", int24 == (-845157802));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 109 + "'", int27 == 109);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 887396705 + "'", int30 == 887396705);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = calculator0.multiply((-46), (-152));
        int int27 = calculator0.divide(9277, (int) 'a');
        int int30 = calculator0.divide(86713455, 20580);
        int int33 = calculator0.add(25, 69);
        int int36 = calculator0.divide(110, 1322291737);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6992 + "'", int24 == 6992);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 95 + "'", int27 == 95);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4213 + "'", int30 == 4213);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 94 + "'", int33 == 94);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.subtract(20580, (-867133439));
        int int21 = calculator0.divide((-609787), (-31));
        int int24 = calculator0.multiply((-50514530), (-867133666));
        int int27 = calculator0.multiply(1754530371, (-1879178559));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867154019 + "'", int18 == 867154019);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19670 + "'", int21 == 19670);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1448314236) + "'", int24 == (-1448314236));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1424737661) + "'", int27 == (-1424737661));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide((-58), 568480);
        int int21 = calculator0.divide(86713457, (-109415563));
        int int24 = calculator0.subtract((-453239991), (-49173772));
        int int27 = calculator0.add((-685328092), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-404066219) + "'", int24 == (-404066219));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-685328092) + "'", int27 == (-685328092));
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(95, 0);
        int int15 = calculator0.subtract((-86), 757944224);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 95 + "'", int12 == 95);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-757944310) + "'", int15 == (-757944310));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (byte) 1, 96);
        int int24 = calculator0.subtract((-867125924), (int) (byte) 0);
        int int27 = calculator0.divide(9277, 11);
        int int30 = calculator0.subtract((-442694645), 568480);
        int int33 = calculator0.multiply(736984748, (-86713457));
        int int36 = calculator0.divide(408021504, 1510267836);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 96 + "'", int21 == 96);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-867125924) + "'", int24 == (-867125924));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 843 + "'", int27 == 843);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-443263125) + "'", int30 == (-443263125));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1820924396) + "'", int33 == (-1820924396));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((-3528), (-1010));
        int int15 = calculator0.add((-2020), (-1772159544));
        int int18 = calculator0.subtract((-1734245508), 1371450554);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3563280 + "'", int12 == 3563280);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1772161564) + "'", int15 == (-1772161564));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1189271234 + "'", int18 == 1189271234);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.subtract((int) (byte) -1, 0);
        int int21 = calculator0.divide((-9312), 867133515);
        int int24 = calculator0.subtract(1481140680, 1659460117);
        int int27 = calculator0.subtract(870696771, (-1665941363));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-178319437) + "'", int24 == (-178319437));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1758329162) + "'", int27 == (-1758329162));
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.subtract((-86713342), 86713455);
        int int21 = calculator0.subtract(1, (-152));
        int int24 = calculator0.subtract((-6867620), 1474273060);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-173426797) + "'", int18 == (-173426797));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 153 + "'", int21 == 153);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1481140680) + "'", int24 == (-1481140680));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (byte) 1, 96);
        int int24 = calculator0.subtract(25, 867133591);
        int int27 = calculator0.multiply((-173426797), (-110));
        int int30 = calculator0.multiply(1593893681, 1870667305);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 96 + "'", int21 == 96);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-867133566) + "'", int24 == (-867133566));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1897078486 + "'", int27 == 1897078486);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 692330713 + "'", int30 == 692330713);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide(692692992, 2);
        int int21 = calculator0.divide(1237148864, (-1));
        int int24 = calculator0.divide(501219328, 754840506);
        int int27 = calculator0.add(0, (-867138628));
        int int30 = calculator0.divide((-1984132447), (-290440224));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 346346496 + "'", int18 == 346346496);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1237148864) + "'", int21 == (-1237148864));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-867138628) + "'", int27 == (-867138628));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6 + "'", int30 == 6);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (short) -1, 867133491);
        int int12 = calculator0.subtract((-86), (-109415563));
        int int15 = calculator0.add(0, 757944224);
        int int18 = calculator0.add(2, 1152037536);
        int int21 = calculator0.add(548010, (-1985610752));
        int int24 = calculator0.multiply(2139980843, 95596657);
        int int27 = calculator0.multiply((-887), (-477385434));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133491) + "'", int9 == (-867133491));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109415477 + "'", int12 == 109415477);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 757944224 + "'", int15 == 757944224);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1152037538 + "'", int18 == 1152037538);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1985062742) + "'", int21 == (-1985062742));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1429923579 + "'", int24 == 1429923579);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1760882346) + "'", int27 == (-1760882346));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply((-76), (int) (short) -1);
        int int18 = calculator0.multiply(20580, (-49164339));
        int int21 = calculator0.add((-2003427328), (-171620238));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 76 + "'", int15 == 76);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1810185236 + "'", int18 == 1810185236);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2119919730 + "'", int21 == 2119919730);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.multiply(0, 210);
        int int18 = calculator0.subtract(1810185236, 1810185237);
        int int21 = calculator0.divide(2003425405, 1339770992);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.divide((-3), 86713344);
        int int15 = calculator0.subtract((-520200), (-15));
        int int18 = calculator0.subtract((-867133666), 1152037538);
        int int21 = calculator0.subtract((-26730), (-493712131));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-520185) + "'", int15 == (-520185));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2019171204) + "'", int18 == (-2019171204));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 493685401 + "'", int21 == 493685401);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.divide(4213, (-7567));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.subtract((-86713342), 86713455);
        int int21 = calculator0.subtract((-1494342816), 1787380221);
        int int24 = calculator0.divide(1271879224, 1037464303);
        int int27 = calculator0.divide((-976), 1944410221);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-173426797) + "'", int18 == (-173426797));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1013244259 + "'", int21 == 1013244259);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide((-867133439), 9);
        int int12 = calculator0.subtract(0, 867154019);
        int int15 = calculator0.subtract(867154019, (-976));
        int int18 = calculator0.add((-171620289), 51);
        int int21 = calculator0.divide(1269639304, (-1769916127));
        int int24 = calculator0.divide((-1145179180), (-1951649816));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-867154019) + "'", int12 == (-867154019));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867154995 + "'", int15 == 867154995);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-171620238) + "'", int18 == (-171620238));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = calculator0.multiply((-46), (-152));
        int int27 = calculator0.divide(9277, (int) 'a');
        int int30 = calculator0.divide(86713455, 20580);
        int int33 = calculator0.add(25, 69);
        int int36 = calculator0.add(2233940, 1152037538);
        int int39 = calculator0.multiply((-86713457), 1730079900);
        java.lang.Class<?> wildcardClass40 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6992 + "'", int24 == 6992);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 95 + "'", int27 == 95);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4213 + "'", int30 == 4213);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 94 + "'", int33 == 94);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1154271478 + "'", int36 == 1154271478);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1474273060 + "'", int39 == 1474273060);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.subtract(109, (int) (short) 100);
        int int15 = calculator0.multiply((-101), (int) (short) 10);
        int int18 = calculator0.divide((int) 'a', 196);
        int int21 = calculator0.subtract((-866613314), (-1582342682));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1010) + "'", int15 == (-1010));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 715729368 + "'", int21 == 715729368);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.subtract((-86713342), 86713455);
        int int21 = calculator0.subtract(1, (-152));
        int int24 = calculator0.multiply((-3), 867133501);
        int int27 = calculator0.multiply((-258), (-8));
        int int30 = calculator0.add(867133420, 202);
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-173426797) + "'", int18 == (-173426797));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 153 + "'", int21 == 153);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1693566793 + "'", int24 == 1693566793);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2064 + "'", int27 == 2064);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 867133622 + "'", int30 == 867133622);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.add((-346346486), (-1838369148));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2110251662 + "'", int18 == 2110251662);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.divide(30, (-934840515));
        int int21 = calculator0.add(173435032, 1271869877);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1445304909 + "'", int21 == 1445304909);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.add(568480, 110);
        int int15 = calculator0.divide(51, 101);
        int int18 = calculator0.add(1810705533, (-402505884));
        int int21 = calculator0.multiply(1580921300, 1516144230);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1408199649 + "'", int18 == 1408199649);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1175891336) + "'", int21 == (-1175891336));
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.multiply((-68), 110);
        int int18 = calculator0.add(1371450554, (-49164339));
        int int21 = calculator0.add(1152037331, (-867133342));
        int int24 = calculator0.divide((-20), (-8));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7480) + "'", int15 == (-7480));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1322286215 + "'", int18 == 1322286215);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 284903989 + "'", int21 == 284903989);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.add(33, (-7600));
        int int21 = calculator0.multiply(867133381, 1693566793);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1155286483) + "'", int21 == (-1155286483));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide(0, (-2037396585));
        int int12 = calculator0.subtract(0, (-675399327));
        int int15 = calculator0.multiply(0, 72529);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 675399327 + "'", int12 == 675399327);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = calculator0.add(867133491, (int) (byte) 100);
        int int27 = calculator0.divide(1730079900, (-3));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 867133591 + "'", int24 == 867133591);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-576693300) + "'", int27 == (-576693300));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.subtract(109, (int) (short) 100);
        int int15 = calculator0.subtract((-36), (-31));
        int int18 = calculator0.subtract((int) (byte) 0, 1494342816);
        int int21 = calculator0.multiply(88947384, (-1382667017));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1494342816) + "'", int18 == (-1494342816));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 594233224 + "'", int21 == 594233224);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.divide((-3), 86713344);
        int int15 = calculator0.subtract((-520200), (-15));
        int int18 = calculator0.subtract((-2020), 1237148765);
        int int21 = calculator0.add(0, 866523750);
        int int24 = calculator0.subtract((-869367269), 1);
        int int27 = calculator0.divide((-14), (-341775412));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-520185) + "'", int15 == (-520185));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1237150785) + "'", int18 == (-1237150785));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 866523750 + "'", int21 == 866523750);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-869367270) + "'", int24 == (-869367270));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.divide(210, (-976));
        int int21 = calculator0.subtract(0, (-110));
        int int24 = calculator0.divide((int) (byte) -1, 867133667);
        int int27 = calculator0.subtract(17, (int) (short) -1);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 110 + "'", int21 == 110);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 18 + "'", int27 == 18);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.divide(692692992, (-1010));
        int int21 = calculator0.add((-5189), (-867133439));
        int int24 = calculator0.multiply(0, (-52));
        int int27 = calculator0.multiply((-38255), 692692);
        int int30 = calculator0.divide(273140353, (-1110676512));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-685834) + "'", int18 == (-685834));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-867138628) + "'", int21 == (-867138628));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-729128684) + "'", int27 == (-729128684));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.add((int) (byte) -1, (int) '4');
        int int21 = calculator0.subtract((int) (byte) 1, 32);
        int int24 = calculator0.divide((-86713457), (-2020));
        int int27 = calculator0.divide((int) (byte) 0, 42260032);
        int int30 = calculator0.divide((-3463464), (-5));
        int int33 = calculator0.subtract((-1519675107), 81677);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-31) + "'", int21 == (-31));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 42927 + "'", int24 == 42927);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 692692 + "'", int30 == 692692);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1519756784) + "'", int33 == (-1519756784));
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.add(33, (-7600));
        int int21 = calculator0.divide((-173436074), 96);
        int int24 = calculator0.subtract(25, 37489359);
        int int27 = calculator0.subtract(199017, (-24578));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1806625) + "'", int21 == (-1806625));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-37489334) + "'", int24 == (-37489334));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 223595 + "'", int27 == 223595);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((-866613314), 692692992);
        int int18 = calculator0.add((int) (short) -1, (-111));
        int int21 = calculator0.subtract(1269639304, (-1555994343));
        int int24 = calculator0.divide(2130112384, (-7325507));
        int int27 = calculator0.multiply((-867154019), (-76265));
        int int30 = calculator0.subtract(1474273060, 1013248472);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-112) + "'", int18 == (-112));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1469333649) + "'", int21 == (-1469333649));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-290) + "'", int24 == (-290));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-405164773) + "'", int27 == (-405164773));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 461024588 + "'", int30 == 461024588);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = calculator0.multiply((-46), (-152));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6992 + "'", int24 == 6992);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.multiply((-86713457), 692692992);
        int int21 = calculator0.subtract(1271882624, 3400);
        int int24 = calculator0.divide(780440677, 867133667);
        int int27 = calculator0.subtract(0, (-1481140680));
        int int30 = calculator0.add((-1820924396), (-121));
        int int33 = calculator0.multiply((-1820924517), (-207));
        int int36 = calculator0.add((-171620238), (-2131780436));
        int int39 = calculator0.subtract((-11), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1271879224 + "'", int21 == 1271879224);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1481140680 + "'", int27 == 1481140680);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1820924517) + "'", int30 == (-1820924517));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1025747029) + "'", int33 == (-1025747029));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1991566622 + "'", int36 == 1991566622);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-11) + "'", int39 == (-11));
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.divide(10107303, (-1769916224));
        int int21 = calculator0.subtract((-88947591), 1322286215);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1411233806) + "'", int21 == (-1411233806));
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide((-1769916224), (-36));
        int int21 = calculator0.add(867133591, 76);
        int int24 = calculator0.divide(42927, (-7955541));
        int int27 = calculator0.divide((-15), (-1152034604));
        int int30 = calculator0.add((-665254), 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49164339 + "'", int18 == 49164339);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 867133667 + "'", int21 == 867133667);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-665227) + "'", int30 == (-665227));
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.subtract((-1), (-97));
        int int21 = calculator0.add((-131), (-867133440));
        int int24 = calculator0.multiply((int) (byte) 0, (-3528));
        int int27 = calculator0.subtract((-86713651), 2233940);
        int int30 = calculator0.subtract((-868095375), (-1364644474));
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 96 + "'", int18 == 96);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-867133571) + "'", int21 == (-867133571));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-88947591) + "'", int27 == (-88947591));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 496549099 + "'", int30 == 496549099);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.subtract((int) (short) 0, 110);
        int int21 = calculator0.multiply((-867133491), (-9280));
        int int24 = calculator0.multiply((-1769916224), (-173426797));
        int int27 = calculator0.subtract(1049326020, 1371450554);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-110) + "'", int18 == (-110));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1769916224) + "'", int21 == (-1769916224));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 42260032 + "'", int24 == 42260032);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-322124534) + "'", int27 == (-322124534));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.subtract(76, (-867133439));
        int int18 = calculator0.multiply(33, 213009);
        int int21 = calculator0.add((-1145179180), 1647836480);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133515 + "'", int15 == 867133515);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7029297 + "'", int18 == 7029297);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 502657300 + "'", int21 == 502657300);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.add(98, (int) (byte) 0);
        int int21 = calculator0.subtract((-111), (-111));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((int) (short) 10, 867133501);
        int int21 = calculator0.add((-3528), (-7567));
        int int24 = calculator0.divide((-346346486), (int) (short) 100);
        int int27 = calculator0.add(1520179488, 236472665);
        int int30 = calculator0.divide((-3698467), (-14300));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11095) + "'", int21 == (-11095));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3463464) + "'", int24 == (-3463464));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1756652153 + "'", int27 == 1756652153);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 258 + "'", int30 == 258);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.add(33, (-7600));
        int int21 = calculator0.divide((-220), (int) '#');
        int int24 = calculator0.divide(6992, (-68));
        int int27 = calculator0.add((-26411181), 0);
        int int30 = calculator0.add(0, (-1734245508));
        int int33 = calculator0.multiply(0, (-3459));
        int int36 = calculator0.multiply((-1556003565), 718097088);
        int int39 = calculator0.multiply(1520179488, 1495828402);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-102) + "'", int24 == (-102));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-26411181) + "'", int27 == (-26411181));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1734245508) + "'", int30 == (-1734245508));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1121825728) + "'", int36 == (-1121825728));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1590253632 + "'", int39 == 1590253632);
    }
}

