import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
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
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
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
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
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
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
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
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
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
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
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
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
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
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
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
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
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
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
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
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
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
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
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
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
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

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.subtract(76, (-867133439));
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133515 + "'", int15 == 867133515);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply((-76), (int) (short) -1);
        int int18 = calculator0.add((-10), (-68));
        int int21 = calculator0.add((-346346486), (-96348159));
        int int24 = calculator0.divide((-609789), (-1697414308));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 76 + "'", int15 == 76);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-78) + "'", int18 == (-78));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-442694645) + "'", int21 == (-442694645));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.divide(210, (-976));
        int int21 = calculator0.add((-109415539), (-111));
        int int24 = calculator0.multiply(86713475, (-1526379269));
        int int27 = calculator0.subtract(153, (-2115365052));
        int int30 = calculator0.subtract(0, (-74540096));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-109415650) + "'", int21 == (-109415650));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 95596657 + "'", int24 == 95596657);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2115365205 + "'", int27 == 2115365205);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 74540096 + "'", int30 == 74540096);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.add(25, 867133591);
        int int6 = calculator0.subtract((-46), (int) (byte) -1);
        int int9 = calculator0.divide(520297, (-867133491));
        int int12 = calculator0.multiply((-65), 1429923579);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 867133616 + "'", int3 == 867133616);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-45) + "'", int6 == (-45));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1544247877 + "'", int12 == 1544247877);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.divide((int) ' ', (-101));
        int int15 = calculator0.add(1152037484, (-6858340));
        int int18 = calculator0.divide(4213, 867133667);
        int int21 = calculator0.subtract((-4864), (-1357151573));
        int int24 = calculator0.divide((-1441521995), 1486954452);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1145179144 + "'", int15 == 1145179144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1357146709 + "'", int21 == 1357146709);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.divide(210, (-976));
        int int21 = calculator0.add((-109415539), (-111));
        int int24 = calculator0.add((-757113551), (-1807123776));
        int int27 = calculator0.subtract(8, (-1));
        int int30 = calculator0.multiply((-3528), (-934840515));
        int int33 = calculator0.multiply((-35), (-555681721));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-109415650) + "'", int21 == (-109415650));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1730729969 + "'", int24 == 1730729969);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-417546408) + "'", int30 == (-417546408));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-2025976245) + "'", int33 == (-2025976245));
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.add((int) (byte) 1, (int) ' ');
        int int15 = calculator0.subtract(754840506, (-1984132447));
        int int18 = calculator0.multiply(1, 94);
        int int21 = calculator0.multiply(1371450554, 2130112384);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1555994343) + "'", int15 == (-1555994343));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 94 + "'", int18 == 94);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1767113472 + "'", int21 == 1767113472);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((int) '#', (int) ' ');
        int int18 = calculator0.add(34, (-1010));
        int int21 = calculator0.add(21975629, (-1777146311));
        int int24 = calculator0.subtract(227, (-351564));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-976) + "'", int18 == (-976));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1755170682) + "'", int21 == (-1755170682));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 351791 + "'", int24 == 351791);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.add((-2146806784), 0);
        int int12 = calculator0.subtract(520297, 96);
        int int15 = calculator0.divide(20580, 780440677);
        int int18 = calculator0.multiply((-1820924517), 1497039730);
        int int21 = calculator0.multiply(1323847021, 8939518);
        int int24 = calculator0.subtract((-1935849733), (-1889283420));
        int int27 = calculator0.divide(692692992, 867154019);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2146806784) + "'", int9 == (-2146806784));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520201 + "'", int12 == 520201);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-581169146) + "'", int18 == (-581169146));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-477385434) + "'", int21 == (-477385434));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-46566313) + "'", int24 == (-46566313));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(867133591, (-15200));
        int int15 = calculator0.subtract((-1475972619), (-2201));
        int int18 = calculator0.add(827072948, (-175453037));
        int int21 = calculator0.divide(0, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 867148791 + "'", int12 == 867148791);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1475970418) + "'", int15 == (-1475970418));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 651619911 + "'", int18 == 651619911);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.add(867133667, (-121));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133546 + "'", int18 == 867133546);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.add((-609787), 1237148765);
        int int18 = calculator0.multiply(1539825347, (-816470980));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1236538978 + "'", int15 == 1236538978);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 827072948 + "'", int18 == 827072948);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (byte) 1, 96);
        int int24 = calculator0.divide((-344187052), (-1145651032));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 96 + "'", int21 == 96);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.add(520297, (-867133611));
        int int18 = calculator0.subtract((-1923), (-109415650));
        int int21 = calculator0.subtract(780440677, 35);
        int int24 = calculator0.divide((-576693300), (-755028714));
        int int27 = calculator0.multiply(2, (-13365));
        int int30 = calculator0.subtract(2, 1539825347);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-866613314) + "'", int15 == (-866613314));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 109413727 + "'", int18 == 109413727);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 780440642 + "'", int21 == 780440642);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-26730) + "'", int27 == (-26730));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1539825345) + "'", int30 == (-1539825345));
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.subtract((-609787), 1525782115);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1526391902) + "'", int15 == (-1526391902));
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.subtract((-1), 9);
        int int18 = calculator0.multiply(18, (-867138628));
        // The following exception was thrown during execution in test generation
        try {
            int int21 = calculator0.divide(2033296844, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1571373880 + "'", int18 == 1571373880);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.add(86713457, (-15300));
        int int21 = calculator0.subtract((-13365), 1271882624);
        int int24 = calculator0.multiply((-846679733), (-1476245521));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 86698157 + "'", int18 == 86698157);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1271895989) + "'", int21 == (-1271895989));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1717522949 + "'", int24 == 1717522949);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.subtract(0, 1730079900);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1730079900) + "'", int21 == (-1730079900));
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide((-1769916224), (-36));
        int int21 = calculator0.add((-9312), (-121));
        int int24 = calculator0.multiply((int) (short) -1, 0);
        int int27 = calculator0.subtract(42927, 346346496);
        int int30 = calculator0.multiply((-178330532), (-1020111879));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49164339 + "'", int18 == 49164339);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9433) + "'", int21 == (-9433));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-346303569) + "'", int27 == (-346303569));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 458092924 + "'", int30 == 458092924);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.subtract((-86713342), 86713455);
        int int21 = calculator0.subtract(1, (-152));
        int int24 = calculator0.subtract((-6867620), 1474273060);
        int int27 = calculator0.multiply(49164339, (-2093236467));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-173426797) + "'", int18 == (-173426797));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 153 + "'", int21 == 153);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1481140680) + "'", int24 == (-1481140680));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 282034071 + "'", int27 == 282034071);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.divide(210, (-976));
        int int21 = calculator0.subtract(0, (-110));
        int int24 = calculator0.divide(213009, (-241122442));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 110 + "'", int21 == 110);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.multiply((-86713457), (-2146806784));
        int int18 = calculator0.add((-86713342), (-34));
        int int21 = calculator0.multiply(2133564696, (-1486954551));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-341775360) + "'", int15 == (-341775360));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-86713376) + "'", int18 == (-86713376));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 770064344 + "'", int21 == 770064344);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
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
        int int30 = calculator0.subtract((-9280), (-26411181));
        int int33 = calculator0.multiply((-1872319616), 95596657);
        int int36 = calculator0.subtract(11868326, (-2084640));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-31) + "'", int21 == (-31));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 42927 + "'", int24 == 42927);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-956095305) + "'", int27 == (-956095305));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 26401901 + "'", int30 == 26401901);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 305771392 + "'", int33 == 305771392);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 13952966 + "'", int36 == 13952966);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply((-76), (-7480));
        int int9 = calculator0.subtract(1610593080, 1258058047);
        int int12 = calculator0.subtract(2, 206361130);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 568480 + "'", int6 == 568480);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 352535033 + "'", int9 == 352535033);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-206361128) + "'", int12 == (-206361128));
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.add(33, (-7600));
        int int21 = calculator0.divide((-173436074), 96);
        int int24 = calculator0.subtract(867153943, (int) (byte) 10);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1806625) + "'", int21 == (-1806625));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 867153933 + "'", int24 == 867153933);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.subtract((-1), (-97));
        int int21 = calculator0.multiply(173435032, (-755028714));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 96 + "'", int18 == 96);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-214452976) + "'", int21 == (-214452976));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
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
        int int30 = calculator0.subtract((-9280), (-26411181));
        int int33 = calculator0.divide(537567364, 1700666764);
        int int36 = calculator0.divide((-88956677), 7029297);
        int int39 = calculator0.subtract(20, 866523750);
        int int42 = calculator0.add(1168096256, 1955142987);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-31) + "'", int21 == (-31));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 42927 + "'", int24 == 42927);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-956095305) + "'", int27 == (-956095305));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 26401901 + "'", int30 == 26401901);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-12) + "'", int36 == (-12));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-866523730) + "'", int39 == (-866523730));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1171728053) + "'", int42 == (-1171728053));
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.multiply((-86713457), (-2146806784));
        int int18 = calculator0.add((-86713342), (-34));
        int int21 = calculator0.add(1429824755, (-1845536552));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-341775360) + "'", int15 == (-341775360));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-86713376) + "'", int18 == (-86713376));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-415711797) + "'", int21 == (-415711797));
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) ' ', (int) (byte) 100);
        int int15 = calculator0.add(757717952, (-867133491));
        int int18 = calculator0.add((-933798035), (-2084640));
        int int21 = calculator0.multiply(0, 1274638223);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-68) + "'", int12 == (-68));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-109415539) + "'", int15 == (-109415539));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-935882675) + "'", int18 == (-935882675));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.subtract(96, 97);
        int int15 = calculator0.multiply((-45), (-23318356));
        int int18 = calculator0.multiply(19670, 0);
        int int21 = calculator0.divide(11, 284903989);
        int int24 = calculator0.add((-10), 867154019);
        int int27 = calculator0.subtract((-132), 654086037);
        int int30 = calculator0.divide(1616550797, (-1697414308));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1049326020 + "'", int15 == 1049326020);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 867154009 + "'", int24 == 867154009);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-654086169) + "'", int27 == (-654086169));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
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
        int int30 = calculator0.multiply(88947384, 33);
        int int33 = calculator0.divide((-2019171204), 1897078486);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-173426914) + "'", int21 == (-173426914));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 86713475 + "'", int24 == 86713475);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 290738210 + "'", int27 == 290738210);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1359703624) + "'", int30 == (-1359703624));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.multiply((int) (short) 100, (-152));
        int int18 = calculator0.multiply(0, (-170066666));
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
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (short) -1, 867133491);
        int int12 = calculator0.subtract((-86), (-109415563));
        int int15 = calculator0.add(0, 757944224);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133491) + "'", int9 == (-867133491));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109415477 + "'", int12 == 109415477);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 757944224 + "'", int15 == 757944224);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
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
        int int30 = calculator0.divide((-1556003565), (-109415539));
        int int33 = calculator0.add(2133564696, (-601961808));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 110 + "'", int21 == 110);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1013244357 + "'", int27 == 1013244357);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 14 + "'", int30 == 14);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1531602888 + "'", int33 == 1531602888);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((int) '#', (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply((-76), (-7480));
        int int9 = calculator0.multiply((-1281026853), (-2026637472));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 568480 + "'", int6 == 568480);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1235754784 + "'", int9 == 1235754784);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
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
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 96 + "'", int21 == 96);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-867133566) + "'", int24 == (-867133566));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.add(98, (int) (byte) 0);
        int int21 = calculator0.multiply((int) (byte) -1, (int) '4');
        int int24 = calculator0.subtract((-220794010), (-6858340));
        int int27 = calculator0.multiply((-1121825728), (-1174926336));
        int int30 = calculator0.divide(5983, (-2661528));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-52) + "'", int21 == (-52));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-213935670) + "'", int24 == (-213935670));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1181548544) + "'", int27 == (-1181548544));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.add((-609787), 1237148765);
        int int18 = calculator0.multiply(1539825347, (-816470980));
        int int21 = calculator0.multiply((-920261842), (-161052992));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1236538978 + "'", int15 == 1236538978);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 827072948 + "'", int18 == 827072948);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1646365056) + "'", int21 == (-1646365056));
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) '#', (-9312));
        int int18 = calculator0.divide((-97), (-867138628));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9347 + "'", int15 == 9347);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
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
        int int30 = calculator0.divide((-1556003565), (-109415539));
        int int33 = calculator0.multiply(1152037538, (-109415563));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 110 + "'", int21 == 110);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1013244357 + "'", int27 == 1013244357);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 14 + "'", int30 == 14);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1015649782) + "'", int33 == (-1015649782));
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.subtract((int) (byte) -1, 0);
        int int21 = calculator0.divide((-9312), 867133515);
        int int24 = calculator0.subtract(1237148863, 52);
        int int27 = calculator0.multiply(1154271478, 86713475);
        int int30 = calculator0.subtract(520246, (-826840308));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1237148811 + "'", int24 == 1237148811);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1872794142) + "'", int27 == (-1872794142));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 827360554 + "'", int30 == 827360554);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.add(51, (-97));
        int int15 = calculator0.multiply(1978473568, 1810185237);
        int int18 = calculator0.multiply((-2146806784), 2);
        int int21 = calculator0.divide(0, (-1308624019));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-46) + "'", int12 == (-46));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1057369120) + "'", int15 == (-1057369120));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1353728 + "'", int18 == 1353728);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.add((-867133515), 1154271478);
        int int18 = calculator0.multiply(0, (-1964453610));
        int int21 = calculator0.divide(1580921303, 1829824526);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 287137963 + "'", int15 == 287137963);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide(76, 692692992);
        int int21 = calculator0.subtract(51, (-665254));
        int int24 = calculator0.multiply((-1556003565), 867154019);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 665305 + "'", int21 == 665305);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 216030809 + "'", int24 == 216030809);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide(100, 98);
        int int21 = calculator0.multiply((-867133612), (-1490574368));
        int int24 = calculator0.subtract(11309050, (-86713551));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-257235584) + "'", int21 == (-257235584));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 98022601 + "'", int24 == 98022601);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
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
        int int30 = calculator0.divide((-258), 1152037538);
        int int33 = calculator0.divide(164584658, (-58));
        int int36 = calculator0.multiply((-867154019), 67686400);
        int int39 = calculator0.add((-971832620), 867133509);
        int int42 = calculator0.divide((-78), (-404066219));
        java.lang.Class<?> wildcardClass43 = calculator0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-2837666) + "'", int33 == (-2837666));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-350777344) + "'", int36 == (-350777344));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-104699111) + "'", int39 == (-104699111));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide((-867133439), 9);
        int int12 = calculator0.subtract(0, 867154019);
        int int15 = calculator0.subtract(867154019, (-976));
        int int18 = calculator0.add((-171620289), 51);
        int int21 = calculator0.multiply(109415572, 672432064);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-867154019) + "'", int12 == (-867154019));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867154995 + "'", int15 == 867154995);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-171620238) + "'", int18 == (-171620238));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1081531136 + "'", int21 == 1081531136);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.add(51, (-97));
        int int15 = calculator0.multiply(1978473568, 1810185237);
        int int18 = calculator0.subtract((-1555994343), (-101));
        int int21 = calculator0.add((-7955431), (-86713342));
        int int24 = calculator0.multiply(100205648, 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-46) + "'", int12 == (-46));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1057369120) + "'", int15 == (-1057369120));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1555994242) + "'", int18 == (-1555994242));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-94668773) + "'", int21 == (-94668773));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1202467776 + "'", int24 == 1202467776);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide((-867133439), 9);
        int int12 = calculator0.multiply((-96348159), (-9280));
        int int15 = calculator0.divide((-5), 202);
        int int18 = calculator0.divide(110, 853334016);
        int int21 = calculator0.divide(114096, 1925360681);
        int int24 = calculator0.subtract(49164339, (-867133566));
        int int27 = calculator0.add((-31), 1090625663);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 757717952 + "'", int12 == 757717952);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 916297905 + "'", int24 == 916297905);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1090625632 + "'", int27 == 1090625632);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.multiply((-68), (int) (short) 1);
        int int18 = calculator0.divide(20, (-109415445));
        int int21 = calculator0.add(210, (-96348159));
        int int24 = calculator0.add(0, 910738184);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-68) + "'", int15 == (-68));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-96347949) + "'", int21 == (-96347949));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 910738184 + "'", int24 == 910738184);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (byte) 1, 96);
        int int24 = calculator0.subtract(25, 867133591);
        int int27 = calculator0.divide(1493382152, (-7955541));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 96 + "'", int21 == 96);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-867133566) + "'", int24 == (-867133566));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-187) + "'", int27 == (-187));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.divide((int) ' ', (-101));
        int int15 = calculator0.add(1152037484, (-6858340));
        int int18 = calculator0.add(1810185236, (-290440224));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1145179144 + "'", int15 == 1145179144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1519745012 + "'", int18 == 1519745012);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply((-76), (int) (byte) 100);
        int int18 = calculator0.subtract(100, (-1));
        int int21 = calculator0.multiply((-5), 378379962);
        int int24 = calculator0.add(1520179488, (-1494342816));
        int int27 = calculator0.subtract(870696771, 638350336);
        int int30 = calculator0.add(1769916224, 1591253037);
        int int33 = calculator0.add((int) ' ', (-198788080));
        java.lang.Class<?> wildcardClass34 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7600) + "'", int15 == (-7600));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1891899810) + "'", int21 == (-1891899810));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 25836672 + "'", int24 == 25836672);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 232346435 + "'", int27 == 232346435);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-933798035) + "'", int30 == (-933798035));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-198788048) + "'", int33 == (-198788048));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.divide(692692992, (-1010));
        int int21 = calculator0.multiply((-36), (-867133571));
        int int24 = calculator0.divide(520297, 96);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-685834) + "'", int18 == (-685834));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1152037484 + "'", int21 == 1152037484);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5419 + "'", int24 == 5419);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
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
        int int30 = calculator0.divide((-7466), 20580);
        int int33 = calculator0.subtract(1503190044, (-109415650));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1271879224 + "'", int21 == 1271879224);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1481140680 + "'", int27 == 1481140680);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1612605694 + "'", int33 == 1612605694);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.subtract((int) (byte) -1, (int) (short) -1);
        int int15 = calculator0.add((-6858340), (-9280));
        int int18 = calculator0.divide(897963264, 94);
        int int21 = calculator0.subtract((-86713342), (-1380354224));
        int int24 = calculator0.add(2877358, (-1985610752));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6867620) + "'", int15 == (-6867620));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9552800 + "'", int18 == 9552800);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1293640882 + "'", int21 == 1293640882);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1982733394) + "'", int24 == (-1982733394));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.subtract((-1), 9);
        int int18 = calculator0.add(1495828402, 1274638223);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1524500671) + "'", int18 == (-1524500671));
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.multiply((-68), 110);
        int int18 = calculator0.add(1371450554, (-49164339));
        int int21 = calculator0.multiply((-1964453610), 86713455);
        int int24 = calculator0.add((-207), (-2019171204));
        int int27 = calculator0.divide((-1369258035), (-39007237));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7480) + "'", int15 == (-7480));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1322286215 + "'", int18 == 1322286215);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2062827382) + "'", int21 == (-2062827382));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2019171411) + "'", int24 == (-2019171411));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        int int21 = calculator0.add((int) (short) 100, 1754528448);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = calculator0.divide((-702203532), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1754528548 + "'", int21 == 1754528548);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) '#', (-9312));
        int int18 = calculator0.multiply(86713455, 1769916224);
        int int21 = calculator0.subtract((-2), 1154271478);
        int int24 = calculator0.add((-1300680656), 98022601);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9347 + "'", int15 == 9347);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1237148864 + "'", int18 == 1237148864);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1154271480) + "'", int21 == (-1154271480));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1202658055) + "'", int24 == (-1202658055));
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((-97), 96);
        int int15 = calculator0.divide(5419, (-34));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9312) + "'", int12 == (-9312));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-159) + "'", int15 == (-159));
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
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
        int int30 = calculator0.add(0, 0);
        int int33 = calculator0.divide(2060248172, (-78042088));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 346346496 + "'", int18 == 346346496);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1237148864) + "'", int21 == (-1237148864));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2003427328) + "'", int27 == (-2003427328));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-26) + "'", int33 == (-26));
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((-68), (int) (byte) 10);
        int int21 = calculator0.divide(96, (-68));
        int int24 = calculator0.divide((-2019171204), 850335808);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
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
        int int39 = calculator0.multiply(1219996744, (-1224898));
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-2125598352) + "'", int39 == (-2125598352));
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.add(33, (-7600));
        int int21 = calculator0.divide((-173436074), 96);
        int int24 = calculator0.subtract(25, 37489359);
        int int27 = calculator0.add(1581845917, 109413727);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1806625) + "'", int21 == (-1806625));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-37489334) + "'", int24 == (-37489334));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1691259644 + "'", int27 == 1691259644);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply(0, 0);
        int int18 = calculator0.multiply(1002899992, 1090625632);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-217396992) + "'", int18 == (-217396992));
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.subtract((-1), (-97));
        int int21 = calculator0.add((-97), 98);
        int int24 = calculator0.divide(178159040, (-867158093));
        int int27 = calculator0.divide(88947384, (-173426797));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 96 + "'", int18 == 96);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.divide((int) (short) 0, 34);
        int int15 = calculator0.multiply(290738210, (-1336575288));
        int int18 = calculator0.multiply(1237148765, (-910738285));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1286025584) + "'", int15 == (-1286025584));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2126605671 + "'", int18 == 2126605671);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide(1219996744, 109415572);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = calculator0.divide(236472665, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide((-214132468), (-49164380));
        int int12 = calculator0.add((-7466), 822110308);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 822102842 + "'", int12 == 822102842);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
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
        int int33 = calculator0.divide((-31), (-94668773));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.add(51, (-97));
        int int15 = calculator0.add((-34682070), (-1043243661));
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-46) + "'", int12 == (-46));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1077925731) + "'", int15 == (-1077925731));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.divide(692692992, (-1010));
        int int21 = calculator0.multiply((-36), (-867133571));
        int int24 = calculator0.divide((-2020), 241122679);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-685834) + "'", int18 == (-685834));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1152037484 + "'", int21 == 1152037484);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (short) -1, 867133491);
        int int12 = calculator0.subtract((-86), (-109415563));
        int int15 = calculator0.add(0, 757944224);
        int int18 = calculator0.add(2, 1152037536);
        int int21 = calculator0.add(548010, (-1985610752));
        int int24 = calculator0.subtract(37500454, 1477466179);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133491) + "'", int9 == (-867133491));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109415477 + "'", int12 == 109415477);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 757944224 + "'", int15 == 757944224);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1152037538 + "'", int18 == 1152037538);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1985062742) + "'", int21 == (-1985062742));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1439965725) + "'", int24 == (-1439965725));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.subtract(2, 86713344);
        int int18 = calculator0.multiply(1700666860, (-15200));
        int int21 = calculator0.multiply(866523750, 1693566793);
        int int24 = calculator0.multiply((-867133666), (-2020));
        int int27 = calculator0.divide((-729128684), (-8639589));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713342) + "'", int15 == (-86713342));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1271882624 + "'", int18 == 1271882624);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1964453610) + "'", int21 == (-1964453610));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-736651448) + "'", int24 == (-736651448));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 84 + "'", int27 == 84);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((int) '#', (int) (short) -1);
        int int21 = calculator0.subtract((-76), (int) (byte) 10);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-86) + "'", int21 == (-86));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
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
        int int30 = calculator0.add(1970219360, (-39007237));
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 96 + "'", int21 == 96);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-867133566) + "'", int24 == (-867133566));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1931212123 + "'", int30 == 1931212123);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
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
        int int30 = calculator0.multiply(1339770992, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1145179180) + "'", int21 == (-1145179180));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-275654320) + "'", int30 == (-275654320));
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.subtract((int) (short) 0, 110);
        int int21 = calculator0.multiply((-867133491), (-9280));
        int int24 = calculator0.add((-49164407), (int) '#');
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-110) + "'", int18 == (-110));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1769916224) + "'", int21 == (-1769916224));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-49164372) + "'", int24 == (-49164372));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.multiply(0, 210);
        int int18 = calculator0.add((-23318356), 1037464303);
        int int21 = calculator0.divide(1106724648, 1632827392);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1014145947 + "'", int18 == 1014145947);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide((int) (short) 10, (-173426914));
        int int21 = calculator0.add((-109415445), 1145169864);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1035754419 + "'", int21 == 1035754419);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
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
        int int30 = calculator0.multiply(52, 1145651162);
        int int33 = calculator0.multiply(1870667305, (-870032523));
        int int36 = calculator0.subtract((-68), 108673896);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 96 + "'", int21 == 96);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-867133566) + "'", int24 == (-867133566));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1897078486 + "'", int27 == 1897078486);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-555681720) + "'", int30 == (-555681720));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1779063741 + "'", int33 == 1779063741);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-108673964) + "'", int36 == (-108673964));
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.add(33, (-7600));
        int int21 = calculator0.divide((-220), (int) '#');
        int int24 = calculator0.divide(6992, (-68));
        int int27 = calculator0.multiply(623809483, (-869370670));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-102) + "'", int24 == (-102));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-307808122) + "'", int27 == (-307808122));
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
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
        int int30 = calculator0.multiply(1968289463, 822099432);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-86) + "'", int21 == (-86));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-433567285) + "'", int24 == (-433567285));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2146806852) + "'", int27 == (-2146806852));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-778620712) + "'", int30 == (-778620712));
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.subtract((-757113354), (-2084640));
        int int21 = calculator0.divide(1726946994, (-1145179180));
        int int24 = calculator0.subtract(352535033, (-1359151923));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-755028714) + "'", int18 == (-755028714));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1711686956 + "'", int24 == 1711686956);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.subtract((int) (byte) -1, (int) (short) -1);
        int int15 = calculator0.add((-6858340), (-9280));
        int int18 = calculator0.divide(897963264, 94);
        int int21 = calculator0.subtract((-86713342), (-1380354224));
        int int24 = calculator0.subtract((int) '#', 1293640882);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6867620) + "'", int15 == (-6867620));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9552800 + "'", int18 == 9552800);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1293640882 + "'", int21 == 1293640882);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1293640847) + "'", int24 == (-1293640847));
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply(0, 0);
        int int18 = calculator0.divide(19670, (-76));
        int int21 = calculator0.subtract((int) (short) -1, 1925360681);
        int int24 = calculator0.subtract(2877446, 0);
        int int27 = calculator0.multiply((-1351018341), (-171620289));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-258) + "'", int18 == (-258));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1925360682) + "'", int21 == (-1925360682));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2877446 + "'", int24 == 2877446);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2080397787) + "'", int27 == (-2080397787));
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
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
        int int33 = calculator0.divide((-1058206662), 1307876110);
        int int36 = calculator0.add((-344187052), 0);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-344187052) + "'", int36 == (-344187052));
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.multiply(2702, (-101));
        // The following exception was thrown during execution in test generation
        try {
            int int21 = calculator0.divide((-1364644474), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-272902) + "'", int18 == (-272902));
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.subtract((-1), (-97));
        int int21 = calculator0.add((-97), 98);
        int int24 = calculator0.divide(178159040, (-867158093));
        int int27 = calculator0.divide(88947384, (-173426797));
        int int30 = calculator0.subtract((-867118337), (-867133342));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 96 + "'", int18 == 96);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 15005 + "'", int30 == 15005);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((-101), (-86));
        int int15 = calculator0.add((-362406912), (-173426797));
        int int18 = calculator0.subtract(2129948464, 1730079900);
        int int21 = calculator0.multiply(0, 520484954);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-15) + "'", int12 == (-15));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-535833709) + "'", int15 == (-535833709));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 399868564 + "'", int18 == 399868564);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply((-76), (int) (byte) 100);
        int int18 = calculator0.multiply((-88956701), 568480);
        int int21 = calculator0.multiply((-341775360), (-2019171204));
        int int24 = calculator0.add((-857622013), (-869367270));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7600) + "'", int15 == (-7600));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1160441376) + "'", int18 == (-1160441376));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1876799488) + "'", int21 == (-1876799488));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1726989283) + "'", int24 == (-1726989283));
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(867133591, (-15200));
        int int15 = calculator0.subtract((-1475972619), (-2201));
        int int18 = calculator0.subtract(88956711, (-757113354));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 867148791 + "'", int12 == 867148791);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1475970418) + "'", int15 == (-1475970418));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 846070065 + "'", int18 == 846070065);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide((-867133439), 9);
        int int12 = calculator0.multiply((-96348159), (-9280));
        int int15 = calculator0.divide((-5), 202);
        int int18 = calculator0.divide(110, 853334016);
        int int21 = calculator0.divide(67686496, 867154995);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 757717952 + "'", int12 == 757717952);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.add(33, (-7600));
        int int21 = calculator0.divide((-173436074), 96);
        int int24 = calculator0.multiply(1772546271, 887128884);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1806625) + "'", int21 == (-1806625));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-298751412) + "'", int24 == (-298751412));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.multiply((-9312), (-9312));
        int int15 = calculator0.subtract(867133515, (-6));
        int int18 = calculator0.add(867153943, (-1700666664));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713344 + "'", int12 == 86713344);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133521 + "'", int15 == 867133521);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-833512721) + "'", int18 == (-833512721));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.subtract((int) (byte) -1, 100);
        int int12 = calculator0.add((-9433), (-341775360));
        int int15 = calculator0.add(1493382152, (-417546408));
        int int18 = calculator0.subtract(97, (-346346486));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-101) + "'", int9 == (-101));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-341784793) + "'", int12 == (-341784793));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1075835744 + "'", int15 == 1075835744);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 346346583 + "'", int18 == 346346583);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.add(51, (-97));
        int int15 = calculator0.divide(9, 867133591);
        int int18 = calculator0.add((-272902), (-1475972619));
        int int21 = calculator0.multiply((-307808122), 822099412);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-46) + "'", int12 == (-46));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1476245521) + "'", int18 == (-1476245521));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1290976504 + "'", int21 == 1290976504);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((-110), (-68));
        int int9 = calculator0.divide(1756652153, (-867138628));
        int int12 = calculator0.divide(378379962, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 378379962 + "'", int12 == 378379962);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.subtract(96, 97);
        int int15 = calculator0.multiply((-45), (-23318356));
        int int18 = calculator0.multiply(19670, 0);
        int int21 = calculator0.subtract(52, 867133381);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1049326020 + "'", int15 == 1049326020);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-867133329) + "'", int21 == (-867133329));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.divide((int) 'a', (-207));
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
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.add((int) (byte) -1, (int) '4');
        int int21 = calculator0.subtract((int) (byte) 1, 32);
        int int24 = calculator0.divide((-86713457), (-2020));
        int int27 = calculator0.multiply((-707534653), (-290440224));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-31) + "'", int21 == (-31));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 42927 + "'", int24 == 42927);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1102996576) + "'", int27 == (-1102996576));
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.multiply(867133511, (-7955431));
        int int15 = calculator0.divide((-2118403245), (-397900692));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1037464303 + "'", int12 == 1037464303);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply((-76), (int) (short) -1);
        int int18 = calculator0.multiply((-1369258035), 352535033);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 76 + "'", int15 == 76);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-617192603) + "'", int18 == (-617192603));
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.subtract((-86713342), 86713455);
        int int21 = calculator0.subtract((-1494342816), 1787380221);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-173426797) + "'", int18 == (-173426797));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1013244259 + "'", int21 == 1013244259);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.subtract((int) (short) 0, 110);
        int int21 = calculator0.multiply((-867133491), (-9280));
        int int24 = calculator0.multiply(98, 210);
        int int27 = calculator0.multiply(867150782, 1672101496);
        int int30 = calculator0.subtract(8, 1429824755);
        int int33 = calculator0.divide((-34), (-1269671715));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-110) + "'", int18 == (-110));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1769916224) + "'", int21 == (-1769916224));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20580 + "'", int24 == 20580);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1276937488 + "'", int27 == 1276937488);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1429824747) + "'", int30 == (-1429824747));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(95, 0);
        int int15 = calculator0.multiply((-867138628), (-15200));
        int int18 = calculator0.multiply(100, 34);
        int int21 = calculator0.add((-49173772), (-171620238));
        int int24 = calculator0.multiply(2003425405, 1739617460);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 95 + "'", int12 == 95);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-747485824) + "'", int15 == (-747485824));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3400 + "'", int18 == 3400);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-220794010) + "'", int21 == (-220794010));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 225762276 + "'", int24 == 225762276);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide((-1769916224), (-36));
        int int21 = calculator0.add(867133591, 76);
        int int24 = calculator0.add(42260032, (int) (byte) 100);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49164339 + "'", int18 == 49164339);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 867133667 + "'", int21 == 867133667);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 42260132 + "'", int24 == 42260132);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(1145179144, 100);
        int int15 = calculator0.subtract((-932693954), 2110251662);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1145179044 + "'", int12 == 1145179044);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1252021680 + "'", int15 == 1252021680);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = calculator0.divide(72529, 109);
        int int27 = calculator0.divide((-737836352), (-171620289));
        int int30 = calculator0.subtract((int) (byte) 10, 1007395645);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 665 + "'", int24 == 665);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1007395635) + "'", int30 == (-1007395635));
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        int int21 = calculator0.subtract(0, (-747485824));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 747485824 + "'", int21 == 747485824);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
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
        int int36 = calculator0.subtract(96, 0);
        int int39 = calculator0.add((-1746895405), (-13314));
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 96 + "'", int36 == 96);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1746908719) + "'", int39 == (-1746908719));
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.add(32, (-9312));
        int int12 = calculator0.divide(3563280, (-442694645));
        int int15 = calculator0.add((-341775360), (-1556003565));
        int int18 = calculator0.add((-1772161564), (-568590));
        int int21 = calculator0.add((-1935849733), 1432976652);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-9280) + "'", int9 == (-9280));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1897778925) + "'", int15 == (-1897778925));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1772730154) + "'", int18 == (-1772730154));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-502873081) + "'", int21 == (-502873081));
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
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
        int int30 = calculator0.divide(1771863899, 867148791);
        int int33 = calculator0.subtract((-94230841), 867133491);
        java.lang.Class<?> wildcardClass34 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1271879224 + "'", int21 == 1271879224);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 287137964 + "'", int24 == 287137964);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1532796050 + "'", int27 == 1532796050);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-961364332) + "'", int33 == (-961364332));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.multiply((-29), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract(568590, 20580);
        int int15 = calculator0.add(2115365205, 1323847021);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 548010 + "'", int12 == 548010);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-855755070) + "'", int15 == (-855755070));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.add((-867133515), 1154271478);
        int int18 = calculator0.multiply(0, (-1964453610));
        int int21 = calculator0.divide((-1248231612), 69);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 287137963 + "'", int15 == 287137963);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-18090313) + "'", int21 == (-18090313));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.add(33, (-7600));
        int int21 = calculator0.divide((-173436074), 96);
        int int24 = calculator0.divide(67686400, 11);
        int int27 = calculator0.add((-467179908), (-2033296844));
        int int30 = calculator0.multiply(86713344, (-1262618369));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1806625) + "'", int21 == (-1806625));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6153309 + "'", int24 == 6153309);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1794490544 + "'", int27 == 1794490544);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2066162688) + "'", int30 == (-2066162688));
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.multiply((-68), 110);
        int int18 = calculator0.add(1371450554, (-49164339));
        int int21 = calculator0.add(1152037331, (-867133342));
        int int24 = calculator0.multiply((-173), 99474071);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7480) + "'", int15 == (-7480));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1322286215 + "'", int18 == 1322286215);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 284903989 + "'", int21 == 284903989);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-29145099) + "'", int24 == (-29145099));
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide(100, 98);
        int int21 = calculator0.multiply(3563280, 867133546);
        int int24 = calculator0.subtract(86713381, 1730079900);
        int int27 = calculator0.subtract(86713381, 568480);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = calculator0.divide(119647596, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1494342816 + "'", int21 == 1494342816);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1643366519) + "'", int24 == (-1643366519));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 86144901 + "'", int27 == 86144901);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.subtract((-1700666664), (-241122442));
        int int18 = calculator0.subtract((-1270709336), (-2125598352));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1459544222) + "'", int15 == (-1459544222));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 854889016 + "'", int18 == 854889016);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((-110), (-68));
        int int9 = calculator0.divide(1756652153, (-867138628));
        int int12 = calculator0.multiply(100, (-910738184));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-879505184) + "'", int12 == (-879505184));
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.multiply((int) (short) 100, (-152));
        int int18 = calculator0.divide((-1248231612), 1754528548);
        int int21 = calculator0.add(6153309, 1001242336);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15200) + "'", int15 == (-15200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1007395645 + "'", int21 == 1007395645);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.multiply((int) (short) 100, (-152));
        int int18 = calculator0.multiply(0, (-170066666));
        int int21 = calculator0.multiply((-72482652), (-341775412));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15200) + "'", int15 == (-15200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1002376880 + "'", int21 == 1002376880);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((-110), (-68));
        int int9 = calculator0.add(6992, 1152037538);
        int int12 = calculator0.divide((-30722500), (-1010));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1152044530 + "'", int9 == 1152044530);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 30418 + "'", int12 == 30418);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
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
        int int30 = calculator0.multiply(19670, (-2243320));
        int int33 = calculator0.multiply(1931212123, (-14300));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 665305 + "'", int21 == 665305);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1925360681 + "'", int24 == 1925360681);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 780440677 + "'", int27 == 780440677);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1176431440) + "'", int30 == (-1176431440));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 306354380 + "'", int33 == 306354380);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((int) (short) 10, 867133501);
        int int21 = calculator0.add(110, 20);
        int int24 = calculator0.divide(1481140680, 548010);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 130 + "'", int21 == 130);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2702 + "'", int24 == 2702);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.divide((-1760882346), 211766202);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.add((-346346486), (-1838369148));
        int int21 = calculator0.subtract((-867133329), 2233940);
        int int24 = calculator0.add((-287587), (-1121822200));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2110251662 + "'", int18 == 2110251662);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-869367269) + "'", int21 == (-869367269));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1122109787) + "'", int24 == (-1122109787));
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.multiply((-68), 110);
        int int18 = calculator0.multiply((-3020), (-702203532));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7480) + "'", int15 == (-7480));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1059177584) + "'", int18 == (-1059177584));
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-110), (int) (short) 0);
        int int12 = calculator0.multiply((int) ' ', (-152));
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-110) + "'", int9 == (-110));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-4864) + "'", int12 == (-4864));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract(109413727, (-297012176));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 406425903 + "'", int12 == 406425903);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.multiply((-68), (int) (short) 1);
        int int18 = calculator0.divide(20, (-109415445));
        int int21 = calculator0.add((-1772159544), 0);
        int int24 = calculator0.divide(8, 1035754419);
        int int27 = calculator0.multiply(86713455, 1754528448);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-68) + "'", int15 == (-68));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1772159544) + "'", int21 == (-1772159544));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 95205696 + "'", int27 == 95205696);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide((-867133439), 9);
        int int12 = calculator0.subtract(0, 867154019);
        int int15 = calculator0.subtract(867154019, (-976));
        int int18 = calculator0.add((-171620289), 51);
        int int21 = calculator0.multiply((-1769916224), (-76265));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-867154019) + "'", int12 == (-867154019));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867154995 + "'", int15 == 867154995);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-171620238) + "'", int18 == (-171620238));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 428644672 + "'", int21 == 428644672);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
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
        int int30 = calculator0.divide((-1998737168), (-1140394960));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-112) + "'", int18 == (-112));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1469333649) + "'", int21 == (-1469333649));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-290) + "'", int24 == (-290));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-52) + "'", int27 == (-52));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.multiply((int) (short) 100, (-152));
        int int18 = calculator0.divide((-1248231612), 1754528548);
        int int21 = calculator0.multiply((-16428397), 11);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15200) + "'", int15 == (-15200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-180712367) + "'", int21 == (-180712367));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.multiply(6153309, (-1769916127));
        int int15 = calculator0.add((-869367269), (-26730));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2066733827) + "'", int12 == (-2066733827));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-869393999) + "'", int15 == (-869393999));
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.subtract((int) (byte) -1, 100);
        int int12 = calculator0.divide(153, 21975629);
        int int15 = calculator0.add(815415403, 236472665);
        int int18 = calculator0.multiply(850335808, (-68));
        int int21 = calculator0.add(7566, (-425855760));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-101) + "'", int9 == (-101));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1051888068 + "'", int15 == 1051888068);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1988260096) + "'", int18 == (-1988260096));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-425848194) + "'", int21 == (-425848194));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.add((-1772161564), 867133420);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-905028144) + "'", int15 == (-905028144));
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.multiply((-68), 110);
        int int18 = calculator0.add(1371450554, (-49164339));
        int int21 = calculator0.multiply((-1964453610), 86713455);
        int int24 = calculator0.add((-207), (-2019171204));
        int int27 = calculator0.add((-557732664), 651619911);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7480) + "'", int15 == (-7480));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1322286215 + "'", int18 == 1322286215);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2062827382) + "'", int21 == (-2062827382));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2019171411) + "'", int24 == (-2019171411));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 93887247 + "'", int27 == 93887247);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.add(520297, (-867133611));
        int int18 = calculator0.divide(272082650, 757944224);
        int int21 = calculator0.add(153, 232346435);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = calculator0.divide((-665254), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-866613314) + "'", int15 == (-866613314));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 232346588 + "'", int21 == 232346588);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.subtract((int) (byte) -1, 100);
        int int12 = calculator0.divide(153, 21975629);
        int int15 = calculator0.add(815415403, 236472665);
        int int18 = calculator0.multiply(0, 284903972);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-101) + "'", int9 == (-101));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1051888068 + "'", int15 == 1051888068);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
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
        int int30 = calculator0.divide((-867051763), 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 346346496 + "'", int18 == 346346496);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1237148864) + "'", int21 == (-1237148864));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2003427328) + "'", int27 == (-2003427328));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-26274295) + "'", int30 == (-26274295));
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        int int21 = calculator0.add((int) (short) 100, 1754528448);
        int int24 = calculator0.add(1, 17);
        int int27 = calculator0.multiply((-35), (-124878848));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1754528548 + "'", int21 == 1754528548);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 18 + "'", int24 == 18);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 75792384 + "'", int27 == 75792384);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) '#', (-9312));
        int int18 = calculator0.divide((-97), (-867138628));
        int int21 = calculator0.multiply((-298772224), 1908264058);
        int int24 = calculator0.add(0, (-2033296854));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9347 + "'", int15 == 9347);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 408021504 + "'", int21 == 408021504);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2033296854) + "'", int24 == (-2033296854));
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
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
        int int30 = calculator0.multiply((-52), 86713457);
        int int33 = calculator0.add((-1248231612), (-867133440));
        int int36 = calculator0.multiply(1257480666, (-774138863));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-214132468) + "'", int30 == (-214132468));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-2115365052) + "'", int33 == (-2115365052));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1128122234 + "'", int36 == 1128122234);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.subtract(76, (-867133439));
        int int18 = calculator0.subtract((-976), 4213);
        int int21 = calculator0.divide(119647596, 109413727);
        int int24 = calculator0.subtract((-477385434), (-369993770));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133515 + "'", int15 == 867133515);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-5189) + "'", int18 == (-5189));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-107391664) + "'", int24 == (-107391664));
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.subtract(96, 97);
        int int15 = calculator0.multiply((-45), (-23318356));
        int int18 = calculator0.multiply(19670, 0);
        int int21 = calculator0.divide(11, 284903989);
        int int24 = calculator0.add((-10), 867154019);
        int int27 = calculator0.subtract((-132), 654086037);
        int int30 = calculator0.divide((-178330532), 868979689);
        int int33 = calculator0.divide(21975628, 1360351360);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1049326020 + "'", int15 == 1049326020);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 867154009 + "'", int24 == 867154009);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-654086169) + "'", int27 == (-654086169));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.divide(51, 109);
        int int18 = calculator0.add(0, (-1919));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1919) + "'", int18 == (-1919));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.add(33, (-7600));
        int int21 = calculator0.divide((-173436074), 96);
        int int24 = calculator0.subtract(25, 37489359);
        int int27 = calculator0.multiply(213009, 1371450554);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1806625) + "'", int21 == (-1806625));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-37489334) + "'", int24 == (-37489334));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 520484954 + "'", int27 == 520484954);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
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
        int int30 = calculator0.add(853668752, 573738264);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-110) + "'", int18 == (-110));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1769916224) + "'", int21 == (-1769916224));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 42260032 + "'", int24 == 42260032);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 568480 + "'", int27 == 568480);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1427407016 + "'", int30 == 1427407016);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.add(520297, (-867133611));
        int int18 = calculator0.add((-287587), (-3410880));
        int int21 = calculator0.multiply((-86), 1908264022);
        int int24 = calculator0.divide(1302854894, (-1738066976));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-866613314) + "'", int15 == (-866613314));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3698467) + "'", int18 == (-3698467));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-901948644) + "'", int21 == (-901948644));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.add(51, (int) (short) 1);
        int int15 = calculator0.add((-68), 32);
        int int18 = calculator0.subtract(1810185237, (-2132911612));
        int int21 = calculator0.multiply(867138284, (-88));
        int int24 = calculator0.subtract((-1015476224), 1152037538);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-36) + "'", int15 == (-36));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-351870447) + "'", int18 == (-351870447));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1001242336 + "'", int21 == 1001242336);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2127453534 + "'", int24 == 2127453534);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.multiply((int) (short) -1, 49164339);
        int int12 = calculator0.divide(95596657, (-112879003));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-49164339) + "'", int9 == (-49164339));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.multiply((int) (short) 100, (-152));
        int int18 = calculator0.add((-1685643349), (-1336575288));
        int int21 = calculator0.multiply(1769916123, (-86));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15200) + "'", int15 == (-15200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1272748659 + "'", int18 == 1272748659);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1888931218) + "'", int21 == (-1888931218));
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.subtract(109, (int) (short) 100);
        int int15 = calculator0.multiply((-101), (int) (short) 10);
        int int18 = calculator0.divide((int) 'a', 196);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1010) + "'", int15 == (-1010));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.subtract((-86713342), 86713455);
        int int21 = calculator0.multiply((-404066219), (-34));
        int int24 = calculator0.divide((-453239991), (-397900692));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-173426797) + "'", int18 == (-173426797));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 853349558 + "'", int21 == 853349558);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide(1219996744, 109415572);
        int int21 = calculator0.divide(1769916224, (-24578));
        int int24 = calculator0.divide(1754530371, (-867133342));
        int int27 = calculator0.multiply((-1341547376), 1572558016);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-72012) + "'", int21 == (-72012));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-607867904) + "'", int27 == (-607867904));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) '#', (-9312));
        int int18 = calculator0.subtract(1908264058, (-94668773));
        int int21 = calculator0.multiply((-1813700023), (-8639589));
        int int24 = calculator0.multiply(2233940, 2016961242);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9347 + "'", int15 == 9347);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2002932831 + "'", int18 == 2002932831);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1524237619 + "'", int21 == 1524237619);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1811098504 + "'", int24 == 1811098504);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide((-58), 568480);
        int int21 = calculator0.divide(86713457, (-109415563));
        int int24 = calculator0.subtract((-453239991), (-49173772));
        int int27 = calculator0.subtract((-52), 86713381);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-404066219) + "'", int24 == (-404066219));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-86713433) + "'", int27 == (-86713433));
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide(67686400, (-111));
        int int21 = calculator0.multiply(867133381, 867133420);
        int int24 = calculator0.subtract((-37489334), 1632827392);
        int int27 = calculator0.divide(949005184, 206361130);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-609787) + "'", int18 == (-609787));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1730079900 + "'", int21 == 1730079900);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1670316726) + "'", int24 == (-1670316726));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
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
        int int39 = calculator0.multiply(213009, (-2020));
        java.lang.Class<?> wildcardClass40 = calculator0.getClass();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-430278180) + "'", int39 == (-430278180));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((-110), (-68));
        int int9 = calculator0.add((-20), (-1555994343));
        int int12 = calculator0.add(296448802, (-1145179290));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1555994363) + "'", int9 == (-1555994363));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-848730488) + "'", int12 == (-848730488));
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide(67686400, (-111));
        int int21 = calculator0.multiply(867133381, 867133420);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-609787) + "'", int18 == (-609787));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1730079900 + "'", int21 == 1730079900);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide(1219996744, 109415572);
        int int21 = calculator0.divide(1769916224, (-24578));
        int int24 = calculator0.divide(1754530371, (-867133342));
        int int27 = calculator0.multiply((-1341547376), 1572558016);
        int int30 = calculator0.multiply(1049326020, 109);
        int int33 = calculator0.multiply((-3528), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-72012) + "'", int21 == (-72012));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-607867904) + "'", int27 == (-607867904));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1587580812) + "'", int30 == (-1587580812));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) ' ', (int) (byte) 100);
        int int15 = calculator0.subtract((-207), 86713344);
        int int18 = calculator0.subtract(119647596, 17);
        int int21 = calculator0.multiply((-867133329), (-7955431));
        int int24 = calculator0.add((-887061404), (-3459));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-68) + "'", int12 == (-68));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713551) + "'", int15 == (-86713551));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 119647579 + "'", int18 == 119647579);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1809614551 + "'", int21 == 1809614551);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-887064863) + "'", int24 == (-887064863));
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract((-1263186959), 306354380);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1569541339) + "'", int9 == (-1569541339));
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.multiply(284903989, 21975629);
        int int15 = calculator0.subtract((-1556003554), 11);
        int int18 = calculator0.multiply(1678282987, 1862482752);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1263186959) + "'", int12 == (-1263186959));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1556003565) + "'", int15 == (-1556003565));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1823775808) + "'", int18 == (-1823775808));
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((int) '#', (int) (short) -1);
        int int21 = calculator0.subtract((-76), (int) (byte) 10);
        int int24 = calculator0.divide((-609789), (-214452976));
        int int27 = calculator0.divide(27, (-2066162688));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-86) + "'", int21 == (-86));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.subtract(96, 97);
        int int15 = calculator0.multiply((-45), (-23318356));
        int int18 = calculator0.multiply(19670, 0);
        int int21 = calculator0.divide(11, 284903989);
        int int24 = calculator0.add((-10), 867154019);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1049326020 + "'", int15 == 1049326020);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 867154009 + "'", int24 == 867154009);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.divide(210, (-976));
        int int21 = calculator0.subtract(0, (-110));
        int int24 = calculator0.divide(213009, (-241122442));
        int int27 = calculator0.add((-1248231612), (-1845536552));
        int int30 = calculator0.multiply((-453239991), 211766202);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 110 + "'", int21 == 110);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1201199132 + "'", int27 == 1201199132);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1719585270) + "'", int30 == (-1719585270));
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply(0, 0);
        int int18 = calculator0.multiply(867133667, (-97));
        int int21 = calculator0.divide(34, (-1923));
        int int24 = calculator0.divide((-7325507), (-101));
        int int27 = calculator0.multiply((-362955086), (-736651448));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1787380221 + "'", int18 == 1787380221);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 72529 + "'", int24 == 72529);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1076453360) + "'", int27 == (-1076453360));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.add(51, (int) (short) 1);
        int int15 = calculator0.add((-68), 32);
        int int18 = calculator0.subtract(1810185237, (-2132911612));
        int int21 = calculator0.add((-50514530), (-867125924));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-36) + "'", int15 == (-36));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-351870447) + "'", int18 == (-351870447));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-917640454) + "'", int21 == (-917640454));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', 1);
        int int15 = calculator0.multiply((-111), (-1919));
        int int18 = calculator0.subtract(1810186246, (-867133329));
        int int21 = calculator0.multiply((-547417792), (-659322));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 213009 + "'", int15 == 213009);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1617647721) + "'", int18 == (-1617647721));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1311704960 + "'", int21 == 1311704960);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide(1219996744, 109415572);
        int int21 = calculator0.divide(1769916224, (-24578));
        int int24 = calculator0.divide(1754530371, (-867133342));
        int int27 = calculator0.multiply((-1341547376), 1572558016);
        int int30 = calculator0.divide(0, (-502873081));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-72012) + "'", int21 == (-72012));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-607867904) + "'", int27 == (-607867904));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.add(568480, 110);
        int int15 = calculator0.subtract(1787380221, 86713457);
        int int18 = calculator0.add((-68), (-2146806784));
        int int21 = calculator0.divide((-1813700023), (-50514530));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1700666764 + "'", int15 == 1700666764);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2146806852) + "'", int18 == (-2146806852));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((-443263150), 1597614332);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 915784888 + "'", int3 == 915784888);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = calculator0.divide((-52), (-2243320));
        int int27 = calculator0.multiply(520484954, 1944410221);
        int int30 = calculator0.divide(1612605694, (-867133666));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-647254446) + "'", int27 == (-647254446));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.divide(210, (-976));
        int int21 = calculator0.subtract(0, (-110));
        int int24 = calculator0.divide(213009, (-241122442));
        int int27 = calculator0.add((-1248231612), (-1845536552));
        int int30 = calculator0.multiply(284903972, 1237147755);
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 110 + "'", int21 == 110);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1201199132 + "'", int27 == 1201199132);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1432976652 + "'", int30 == 1432976652);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-110), (-867133491));
        int int12 = calculator0.subtract(1323847021, (-761355104));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 867133381 + "'", int9 == 867133381);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2085202125 + "'", int12 == 2085202125);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.multiply(1474273060, (-867133566));
        int int15 = calculator0.divide(0, 178159040);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-240317368) + "'", int12 == (-240317368));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide(1219996744, 109415572);
        int int21 = calculator0.subtract(1497046722, (-6867620));
        int int24 = calculator0.add(2366375, 866613314);
        int int27 = calculator0.divide((-1121822200), 109413727);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1503914342 + "'", int21 == 1503914342);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 868979689 + "'", int24 == 868979689);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-10) + "'", int27 == (-10));
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.divide((int) (short) 1, (int) (short) 100);
        int int15 = calculator0.multiply(1659460117, 3325);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1328086335) + "'", int15 == (-1328086335));
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.subtract((-1), (-97));
        int int21 = calculator0.multiply(0, 287137963);
        int int24 = calculator0.add((-94668773), (-2066733827));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 96 + "'", int18 == 96);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2133564696 + "'", int24 == 2133564696);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.divide((-36), 33);
        int int18 = calculator0.divide((-207), 33);
        int int21 = calculator0.multiply((-920261842), (-1788169344));
        int int24 = calculator0.multiply(1536756800, (-1145179290));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1030930688 + "'", int21 == 1030930688);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1864654464) + "'", int24 == (-1864654464));
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.subtract((-555681720), (int) (short) 1);
        int int21 = calculator0.divide(2085965638, 49164439);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-555681721) + "'", int18 == (-555681721));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 42 + "'", int21 == 42);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = calculator0.multiply((-46), (-152));
        int int27 = calculator0.multiply((-7466), (-867133526));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6992 + "'", int24 == 6992);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1503190044 + "'", int27 == 1503190044);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.multiply(1474273060, (-867133566));
        int int15 = calculator0.subtract(0, 1126964223);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-240317368) + "'", int12 == (-240317368));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1126964223) + "'", int15 == (-1126964223));
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.divide(51, 109);
        int int18 = calculator0.add((-737836352), (-935882675));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1673719027) + "'", int18 == (-1673719027));
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide((int) (short) 10, (-173426914));
        int int21 = calculator0.add((-109415445), 1145169864);
        int int24 = calculator0.multiply(0, (-2115365052));
        // The following exception was thrown during execution in test generation
        try {
            int int27 = calculator0.divide((-26730), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1035754419 + "'", int21 == 1035754419);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.multiply((-853113394), 1756652153);
        int int18 = calculator0.add(1794490544, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2068191838 + "'", int15 == 2068191838);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1794490544 + "'", int18 == 1794490544);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((int) (short) 10, 867133501);
        int int21 = calculator0.add((-3528), (-7567));
        int int24 = calculator0.divide((-346346486), (int) (short) 100);
        int int27 = calculator0.add((int) (short) 0, (-757113551));
        int int30 = calculator0.subtract((-976544930), 72529);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11095) + "'", int21 == (-11095));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3463464) + "'", int24 == (-3463464));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-757113551) + "'", int27 == (-757113551));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-976617459) + "'", int30 == (-976617459));
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.divide((-1237148864), 153);
        int int12 = calculator0.subtract((-2013281986), 1970219360);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8085940) + "'", int9 == (-8085940));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 311465950 + "'", int12 == 311465950);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
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
        int int30 = calculator0.multiply((-26411181), 0);
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 110 + "'", int21 == 110);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2027159188) + "'", int27 == (-2027159188));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) ' ', (int) (byte) 100);
        int int15 = calculator0.add(757717952, (-867133491));
        int int18 = calculator0.add(1702058646, (-1717387524));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-68) + "'", int12 == (-68));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-109415539) + "'", int15 == (-109415539));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-15328878) + "'", int18 == (-15328878));
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.add(568480, 110);
        int int15 = calculator0.add((-56), 0);
        int int18 = calculator0.multiply(2119919730, 1269639304);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-56) + "'", int15 == (-56));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1676364944 + "'", int18 == 1676364944);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide((-867133571), (-7600));
        int int21 = calculator0.subtract((-8085940), 757717952);
        int int24 = calculator0.multiply(1395, 0);
        int int27 = calculator0.multiply(1271879224, (-272902));
        int int30 = calculator0.divide((-442694645), 109413727);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 114096 + "'", int18 == 114096);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-765803892) + "'", int21 == (-765803892));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-601961808) + "'", int27 == (-601961808));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-4) + "'", int30 == (-4));
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide(100, 98);
        int int21 = calculator0.multiply(3563280, 867133546);
        int int24 = calculator0.subtract(86713381, 1730079900);
        int int27 = calculator0.add(91, (-339618637));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1494342816 + "'", int21 == 1494342816);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1643366519) + "'", int24 == (-1643366519));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-339618546) + "'", int27 == (-339618546));
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply((-76), (int) (short) -1);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 76 + "'", int15 == 76);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
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
        int int39 = calculator0.multiply(67686496, 287137963);
        int int42 = calculator0.subtract((-868095375), (-9433));
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-85512160) + "'", int39 == (-85512160));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-868085942) + "'", int42 == (-868085942));
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
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
        int int30 = calculator0.multiply((-868095375), 86713457);
        int int33 = calculator0.add((-382875265), (-79882359));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 67854305 + "'", int30 == 67854305);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-462757624) + "'", int33 == (-462757624));
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.subtract(20580, (-867133439));
        int int21 = calculator0.multiply(1237148864, (-97));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867154019 + "'", int18 == 867154019);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 255644480 + "'", int21 == 255644480);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.subtract((-1), (-97));
        int int21 = calculator0.add((-97), 98);
        int int24 = calculator0.divide(178159040, (-867158093));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 96 + "'", int18 == 96);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.subtract((int) (short) 0, 110);
        int int21 = calculator0.subtract((-207), (-88947591));
        int int24 = calculator0.divide((-290738176), 870696771);
        int int27 = calculator0.multiply(211766202, (-1459544222));
        int int30 = calculator0.subtract((-568590), 0);
        int int33 = calculator0.divide(1152037538, (-2125598352));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-110) + "'", int18 == (-110));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 88947384 + "'", int21 == 88947384);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 887128884 + "'", int27 == 887128884);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-568590) + "'", int30 == (-568590));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide((-1769916224), (-36));
        int int21 = calculator0.add((-9312), (-121));
        int int24 = calculator0.multiply((int) (short) -1, 0);
        int int27 = calculator0.subtract(42927, 346346496);
        int int30 = calculator0.subtract((-8085940), 109415572);
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49164339 + "'", int18 == 49164339);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9433) + "'", int21 == (-9433));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-346303569) + "'", int27 == (-346303569));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-117501512) + "'", int30 == (-117501512));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
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
        int int30 = calculator0.subtract((-9280), (-26411181));
        int int33 = calculator0.divide(537567364, 1700666764);
        int int36 = calculator0.divide((-88956677), 7029297);
        int int39 = calculator0.subtract((-172530899), 1013248472);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-31) + "'", int21 == (-31));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 42927 + "'", int24 == 42927);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-956095305) + "'", int27 == (-956095305));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 26401901 + "'", int30 == 26401901);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-12) + "'", int36 == (-12));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1185779371) + "'", int39 == (-1185779371));
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.divide(210, (-976));
        int int21 = calculator0.add((-109415539), (-111));
        int int24 = calculator0.multiply((-152), 1598732630);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-109415650) + "'", int21 == (-109415650));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1805776112 + "'", int24 == 1805776112);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide(67686400, (-111));
        int int21 = calculator0.multiply((-1010), 2064);
        int int24 = calculator0.subtract((-433567285), (-867743227));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-609787) + "'", int18 == (-609787));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2084640) + "'", int21 == (-2084640));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 434175942 + "'", int24 == 434175942);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide((-867133571), (-7600));
        int int21 = calculator0.subtract((-8085940), 757717952);
        int int24 = calculator0.multiply(1395, 0);
        int int27 = calculator0.multiply(1271879224, (-272902));
        int int30 = calculator0.multiply((-1923), 9277);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 114096 + "'", int18 == 114096);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-765803892) + "'", int21 == (-765803892));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-601961808) + "'", int27 == (-601961808));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-17839671) + "'", int30 == (-17839671));
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.divide((-3), 86713344);
        int int15 = calculator0.divide((-15300), 867133511);
        int int18 = calculator0.divide((-76265), 11);
        int int21 = calculator0.add(2115365205, (-170954984));
        int int24 = calculator0.subtract((-109415563), 867133667);
        int int27 = calculator0.multiply(1700666860, 956080105);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6933) + "'", int18 == (-6933));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1944410221 + "'", int21 == 1944410221);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-976549230) + "'", int24 == (-976549230));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-879833140) + "'", int27 == (-879833140));
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (short) -1, 867133491);
        int int12 = calculator0.subtract((-86), (-109415563));
        int int15 = calculator0.add(0, 757944224);
        int int18 = calculator0.add(2, 1152037536);
        int int21 = calculator0.subtract(100, (-7466));
        int int24 = calculator0.divide((-1685150444), (-1318605841));
        int int27 = calculator0.divide(280533860, 963497028);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133491) + "'", int9 == (-867133491));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109415477 + "'", int12 == 109415477);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 757944224 + "'", int15 == 757944224);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1152037538 + "'", int18 == 1152037538);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7566 + "'", int21 == 7566);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide(867133546, (-442694645));
        int int21 = calculator0.subtract((-36), 1145179144);
        int int24 = calculator0.add(236472665, 1581845917);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1145179180) + "'", int21 == (-1145179180));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1818318582 + "'", int24 == 1818318582);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply(0, 0);
        int int18 = calculator0.multiply(867133667, (-97));
        int int21 = calculator0.divide(1448299036, 651619911);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1787380221 + "'", int18 == 1787380221);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', 1);
        int int15 = calculator0.subtract((-272082615), 1445304909);
        int int18 = calculator0.multiply((-1838369148), 1616550797);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1717387524) + "'", int15 == (-1717387524));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 583692980 + "'", int18 == 583692980);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(757717952, 867133515);
        int int15 = calculator0.divide(10, 6153309);
        int int18 = calculator0.subtract(1671243464, (-858032));
        int int21 = calculator0.add(1665481384, 258238464);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-109415563) + "'", int12 == (-109415563));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1672101496 + "'", int18 == 1672101496);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1923719848 + "'", int21 == 1923719848);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        int int21 = calculator0.divide((-1010), 86713455);
        int int24 = calculator0.add((int) (byte) 10, 867133491);
        int int27 = calculator0.divide((-1810185227), 1829824526);
        int int30 = calculator0.add((-1145651032), (-659322));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 867133501 + "'", int24 == 867133501);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1146310354) + "'", int30 == (-1146310354));
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.add((-867133515), 1154271478);
        int int18 = calculator0.multiply((-1925360682), 867138284);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 287137963 + "'", int15 == 287137963);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1606894920 + "'", int18 == 1606894920);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply(0, 1810705533);
        int int24 = calculator0.subtract((-341775360), 52);
        int int27 = calculator0.add((-2025976245), (-1670316726));
        int int30 = calculator0.add((-86713342), (-1988260096));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-341775412) + "'", int24 == (-341775412));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 598674325 + "'", int27 == 598674325);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2074973438) + "'", int30 == (-2074973438));
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((int) (short) 10, 867133501);
        int int21 = calculator0.multiply(2, (-86713457));
        int int24 = calculator0.divide((-1919), 109415572);
        int int27 = calculator0.add(7566, 2133564696);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-173426914) + "'", int21 == (-173426914));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2133572262 + "'", int27 == 2133572262);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(95, 0);
        int int15 = calculator0.multiply((-867138628), (-15200));
        int int18 = calculator0.multiply(100, 34);
        int int21 = calculator0.add(1733781449, 0);
        int int24 = calculator0.add(1532796050, 7029297);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = calculator0.divide((-170954984), 0);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1733781449 + "'", int21 == 1733781449);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1539825347 + "'", int24 == 1539825347);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.add(568480, 110);
        int int15 = calculator0.subtract(1787380221, 86713457);
        int int18 = calculator0.multiply(8671336, (-1481140680));
        int int21 = calculator0.multiply(178159040, (int) (byte) 0);
        int int24 = calculator0.divide(1512046592, (-173436042));
        int int27 = calculator0.subtract(1145179144, 378379962);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = calculator0.divide((-1369258035), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1700666764 + "'", int15 == 1700666764);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-161052992) + "'", int18 == (-161052992));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-8) + "'", int24 == (-8));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 766799182 + "'", int27 == 766799182);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
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
        int int33 = calculator0.multiply((-757944310), 20580);
        int int36 = calculator0.divide((-867051763), 25);
        int int39 = calculator0.multiply(9277, (-298751412));
        int int42 = calculator0.subtract(1519745012, 67857578);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 827319272 + "'", int33 == 827319272);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-34682070) + "'", int36 == (-34682070));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1262943204) + "'", int39 == (-1262943204));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1451887434 + "'", int42 == 1451887434);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
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
        int int30 = calculator0.add(5419, 765139659);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 110 + "'", int21 == 110);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 18 + "'", int27 == 18);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 765145078 + "'", int30 == 765145078);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.subtract(96, 97);
        int int15 = calculator0.multiply((-45), (-23318356));
        int int18 = calculator0.multiply(19670, 0);
        int int21 = calculator0.divide(11, 284903989);
        int int24 = calculator0.add((-10), 867154019);
        int int27 = calculator0.multiply((-178330532), (-1171728053));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1049326020 + "'", int15 == 1049326020);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 867154009 + "'", int24 == 867154009);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-658578700) + "'", int27 == (-658578700));
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((-132), (-910738153));
        int int21 = calculator0.add(9, (-1269639355));
        int int24 = calculator0.divide(867133509, (-1919));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-910738285) + "'", int18 == (-910738285));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1269639346) + "'", int21 == (-1269639346));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-451867) + "'", int24 == (-451867));
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide(867133546, (-442694645));
        int int21 = calculator0.subtract(35, 272082650);
        int int24 = calculator0.add(67686400, (-581169146));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-272082615) + "'", int21 == (-272082615));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-513482746) + "'", int24 == (-513482746));
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.add(568480, 110);
        int int15 = calculator0.divide((-7600), (-109415539));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
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
        int int30 = calculator0.divide(1787380221, (-86713551));
        int int33 = calculator0.divide((-845157802), 32);
        int int36 = calculator0.add((-1864654464), (-26730));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6992 + "'", int24 == 6992);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-932693954) + "'", int27 == (-932693954));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-20) + "'", int30 == (-20));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-26411181) + "'", int33 == (-26411181));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1864681194) + "'", int36 == (-1864681194));
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
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
        int int30 = calculator0.multiply((-1555994389), (-147803916));
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867154019 + "'", int18 == 867154019);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19670 + "'", int21 == 19670);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1448314236) + "'", int24 == (-1448314236));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1616550797 + "'", int27 == 1616550797);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-74870788) + "'", int30 == (-74870788));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.add(51, (-97));
        int int15 = calculator0.multiply(1978473568, 1810185237);
        int int18 = calculator0.subtract((-1555994343), (-101));
        int int21 = calculator0.add((-7955431), (-86713342));
        int int24 = calculator0.multiply(1, 1077166696);
        int int27 = calculator0.subtract((-5189), (-902782633));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-46) + "'", int12 == (-46));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1057369120) + "'", int15 == (-1057369120));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1555994242) + "'", int18 == (-1555994242));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-94668773) + "'", int21 == (-94668773));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1077166696 + "'", int24 == 1077166696);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 902777444 + "'", int27 == 902777444);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.divide(25, (-1923));
        int int12 = calculator0.multiply((-15300), 34);
        int int15 = calculator0.subtract(1152037484, (-109415563));
        int int18 = calculator0.divide(1810186246, (-78));
        int int21 = calculator0.add((-1876799488), 109);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-520200) + "'", int12 == (-520200));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1261453047 + "'", int15 == 1261453047);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-23207515) + "'", int18 == (-23207515));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1876799379) + "'", int21 == (-1876799379));
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.divide((-164593938), 1252021680);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((-68), (int) (byte) 10);
        int int21 = calculator0.divide(96, (-68));
        int int24 = calculator0.add((-34), (-1145651032));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1145651066) + "'", int24 == (-1145651066));
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.divide((-3), 86713344);
        int int15 = calculator0.divide((-15300), 867133511);
        int int18 = calculator0.divide((-76265), 11);
        int int21 = calculator0.add(2115365205, (-170954984));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6933) + "'", int18 == (-6933));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1944410221 + "'", int21 == 1944410221);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.add(757944224, (-85512160));
        int int21 = calculator0.divide((-241122442), 1254594707);
        int int24 = calculator0.add((-241101862), 1730079900);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 672432064 + "'", int18 == 672432064);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1488978038 + "'", int24 == 1488978038);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.subtract(867133420, 1269639304);
        int int21 = calculator0.divide((-152), (-1555994363));
        int int24 = calculator0.multiply((-45247), 1486954452);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-402505884) + "'", int18 == (-402505884));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 434602196 + "'", int24 == 434602196);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.multiply((-31), 346346496);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2146806784) + "'", int12 == (-2146806784));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.divide((-3), 86713344);
        int int15 = calculator0.subtract((-520200), (-15));
        int int18 = calculator0.add(91806, 1271882624);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-520185) + "'", int15 == (-520185));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1271974430 + "'", int18 == 1271974430);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide((-867133439), 9);
        int int12 = calculator0.multiply((-96348159), (-9280));
        int int15 = calculator0.divide((-5), 202);
        int int18 = calculator0.divide(110, 853334016);
        int int21 = calculator0.divide(114096, 1925360681);
        int int24 = calculator0.subtract(49164339, (-867133566));
        int int27 = calculator0.multiply((-74870788), (-50514530));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 757717952 + "'", int12 == 757717952);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 916297905 + "'", int24 == 916297905);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 365037960 + "'", int27 == 365037960);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.add(51, (-97));
        int int15 = calculator0.multiply(1978473568, 1810185237);
        int int18 = calculator0.divide((-402505884), (-173426797));
        int int21 = calculator0.divide(0, 867133515);
        int int24 = calculator0.multiply(114096, 2139980843);
        int int27 = calculator0.add((-30722500), (-934840515));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-46) + "'", int12 == (-46));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1057369120) + "'", int15 == (-1057369120));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1341547376) + "'", int24 == (-1341547376));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-965563015) + "'", int27 == (-965563015));
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide(867133546, (-442694645));
        int int21 = calculator0.subtract((-36), 1145179144);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1145179180) + "'", int21 == (-1145179180));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.subtract(867133420, 1269639304);
        int int21 = calculator0.divide((-152), (-1555994363));
        int int24 = calculator0.add(1532796050, 67686400);
        int int27 = calculator0.add((-636451253), (-52));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-402505884) + "'", int18 == (-402505884));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1600482450 + "'", int24 == 1600482450);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-636451305) + "'", int27 == (-636451305));
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply((-76), (int) (byte) 100);
        int int18 = calculator0.multiply((-88956701), 568480);
        int int21 = calculator0.multiply((-341775360), (-2019171204));
        int int24 = calculator0.multiply((-58), (-132));
        int int27 = calculator0.divide((-702203532), (-1032010672));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7600) + "'", int15 == (-7600));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1160441376) + "'", int18 == (-1160441376));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1876799488) + "'", int21 == (-1876799488));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7656 + "'", int24 == 7656);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
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
        int int36 = calculator0.multiply((-110), 130);
        int int39 = calculator0.add((-757717954), 598674325);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-14300) + "'", int36 == (-14300));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-159043629) + "'", int39 == (-159043629));
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.add(33, (-7600));
        int int21 = calculator0.divide((-173436074), 96);
        int int24 = calculator0.divide((-1806625), (-1559826432));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1806625) + "'", int21 == (-1806625));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.add(51, (-97));
        int int15 = calculator0.divide(6843642, (-65));
        int int18 = calculator0.subtract(35, 1383615488);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-46) + "'", int12 == (-46));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-105286) + "'", int15 == (-105286));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1383615453) + "'", int18 == (-1383615453));
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (byte) 1, 96);
        int int24 = calculator0.add((-1643366519), 1322291616);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 96 + "'", int21 == 96);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-321074903) + "'", int24 == (-321074903));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-110), (int) (short) 0);
        int int12 = calculator0.divide(1769916224, (-86713342));
        int int15 = calculator0.add(0, (-351870447));
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-110) + "'", int9 == (-110));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-20) + "'", int12 == (-20));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-351870447) + "'", int15 == (-351870447));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.add(867133667, (-121));
        int int21 = calculator0.multiply((-2020), 867133501);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133546 + "'", int18 == 867133546);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 736984748 + "'", int21 == 736984748);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.add(520297, (-867133611));
        int int18 = calculator0.multiply((-1216649620), (-272082615));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-866613314) + "'", int15 == (-866613314));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 288080076 + "'", int18 == 288080076);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.divide((-100), 32);
        int int21 = calculator0.divide((-1357151573), (-20));
        int int24 = calculator0.divide((-867133329), (-867133515));
        int int27 = calculator0.subtract(5983, 665305);
        int int30 = calculator0.multiply(408021504, (-2037396585));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 67857578 + "'", int21 == 67857578);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-659322) + "'", int27 == (-659322));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 48170496 + "'", int30 == 48170496);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.divide(692692992, (-1010));
        int int21 = calculator0.multiply((-36), (-867133571));
        int int24 = calculator0.divide(101, 9);
        int int27 = calculator0.add((-2003427328), (-2025976245));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-685834) + "'", int18 == (-685834));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1152037484 + "'", int21 == 1152037484);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 265563723 + "'", int27 == 265563723);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.add(568480, 110);
        int int15 = calculator0.subtract(1787380221, 86713457);
        int int18 = calculator0.multiply(8671336, (-1481140680));
        int int21 = calculator0.multiply(178159040, (int) (byte) 0);
        int int24 = calculator0.divide(406425903, (-866613314));
        int int27 = calculator0.subtract(1276937488, (-2025976245));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1700666764 + "'", int15 == 1700666764);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-161052992) + "'", int18 == (-161052992));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-992053563) + "'", int27 == (-992053563));
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.divide((-1237148864), 153);
        int int12 = calculator0.divide(757717952, (-109415563));
        int int15 = calculator0.divide((-7955431), 520484954);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8085940) + "'", int9 == (-8085940));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.divide((-3), 86713344);
        int int15 = calculator0.subtract((-520200), (-15));
        int int18 = calculator0.subtract((-867133666), 1152037538);
        int int21 = calculator0.multiply(2130112384, (-1160441376));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-520185) + "'", int15 == (-520185));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2019171204) + "'", int18 == (-2019171204));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1015476224) + "'", int21 == (-1015476224));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.divide((-100), 32);
        int int21 = calculator0.multiply((int) (byte) -1, (-8));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.subtract(76, (-867133439));
        int int18 = calculator0.multiply(33, 213009);
        int int21 = calculator0.subtract(0, 568590);
        int int24 = calculator0.add(866613314, 0);
        int int27 = calculator0.multiply(8671336, 624046464);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133515 + "'", int15 == 867133515);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7029297 + "'", int18 == 7029297);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-568590) + "'", int21 == (-568590));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 866613314 + "'", int24 == 866613314);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1373379584 + "'", int27 == 1373379584);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide((int) (byte) -1, 69);
        int int21 = calculator0.multiply((-1286025584), (-787654861));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-164358480) + "'", int21 == (-164358480));
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
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
        int int30 = calculator0.subtract(9, 1810185236);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1810185227) + "'", int30 == (-1810185227));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.add((-2146806784), 0);
        int int12 = calculator0.subtract(520297, 96);
        int int15 = calculator0.add((-20), (-68));
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2146806784) + "'", int9 == (-2146806784));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520201 + "'", int12 == 520201);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-88) + "'", int15 == (-88));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.add(520297, (-867133611));
        int int18 = calculator0.subtract((-1923), (-109415650));
        int int21 = calculator0.subtract(780440677, 35);
        int int24 = calculator0.multiply((-1341734912), 1724755534);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-866613314) + "'", int15 == (-866613314));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 109413727 + "'", int18 == 109413727);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 780440642 + "'", int21 == 780440642);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-124878848) + "'", int24 == (-124878848));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.add(520297, (-867133611));
        int int18 = calculator0.subtract((-1923), (-109415650));
        int int21 = calculator0.subtract(780440677, 35);
        int int24 = calculator0.divide((-576693300), (-755028714));
        int int27 = calculator0.divide(1486954504, (-1202658055));
        int int30 = calculator0.subtract((-1896831404), 822099432);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-866613314) + "'", int15 == (-866613314));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 109413727 + "'", int18 == 109413727);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 780440642 + "'", int21 == 780440642);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1576036460 + "'", int30 == 1576036460);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.divide(86698157, 867133515);
        int int24 = calculator0.add(21975629, (-867133431));
        int int27 = calculator0.divide(866613314, (-1010));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-845157802) + "'", int24 == (-845157802));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-858032) + "'", int27 == (-858032));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide(67686400, (-111));
        int int21 = calculator0.multiply(867133381, 867133420);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = calculator0.divide(105343664, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-609787) + "'", int18 == (-609787));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1730079900 + "'", int21 == 1730079900);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.divide(210, (-976));
        int int21 = calculator0.add((-109415539), (-111));
        int int24 = calculator0.multiply(86713475, (-1526379269));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-109415650) + "'", int21 == (-109415650));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 95596657 + "'", int24 == 95596657);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
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
        int int30 = calculator0.divide(1787380221, (-86713551));
        int int33 = calculator0.divide((-845157802), 32);
        int int36 = calculator0.multiply((-74540096), 867133515);
        java.lang.Class<?> wildcardClass37 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6992 + "'", int24 == 6992);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-932693954) + "'", int27 == (-932693954));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-20) + "'", int30 == (-20));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-26411181) + "'", int33 == (-26411181));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1515036992 + "'", int36 == 1515036992);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply((-76), (int) (byte) 100);
        int int18 = calculator0.multiply((-88956701), 568480);
        int int21 = calculator0.multiply((-341775360), (-2019171204));
        int int24 = calculator0.multiply((-206505725), 765145078);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7600) + "'", int15 == (-7600));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1160441376) + "'", int18 == (-1160441376));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1876799488) + "'", int21 == (-1876799488));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-174598686) + "'", int24 == (-174598686));
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.multiply((-86713457), 692692992);
        int int21 = calculator0.subtract(1271882624, 3400);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1271879224 + "'", int21 == 1271879224);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.multiply((-86713457), 692692992);
        int int21 = calculator0.divide(867133667, (int) (byte) 100);
        int int24 = calculator0.multiply((-296335505), 917629283);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8671336 + "'", int21 == 8671336);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2145343763) + "'", int24 == (-2145343763));
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide(1219996744, 109415572);
        int int21 = calculator0.subtract(1497046722, (-6867620));
        int int24 = calculator0.divide(1075835744, 1527277189);
        int int27 = calculator0.multiply(2025060192, 943052700);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1503914342 + "'", int21 == 1503914342);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-380871040) + "'", int27 == (-380871040));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
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
        int int30 = calculator0.multiply((-6858340), 326167110);
        int int33 = calculator0.subtract(0, 850335808);
        java.lang.Class<?> wildcardClass34 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-173426797) + "'", int18 == (-173426797));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 153 + "'", int21 == 153);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1693566793 + "'", int24 == 1693566793);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2064 + "'", int27 == 2064);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 59447464 + "'", int30 == 59447464);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-850335808) + "'", int33 == (-850335808));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.multiply((-68), (int) (short) 1);
        int int18 = calculator0.divide(20, (-109415445));
        int int21 = calculator0.add((-1772159544), 0);
        int int24 = calculator0.add((-36), 452435152);
        int int27 = calculator0.divide((-42145093), 1576036460);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-68) + "'", int15 == (-68));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1772159544) + "'", int21 == (-1772159544));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 452435116 + "'", int24 == 452435116);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add(101, (-2020));
        int int12 = calculator0.add(0, 1693566793);
        int int15 = calculator0.divide(86713344, (-1336575495));
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1919) + "'", int9 == (-1919));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1693566793 + "'", int12 == 1693566793);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide(67686400, (-111));
        int int21 = calculator0.multiply(867133381, 867133420);
        int int24 = calculator0.divide(1730729969, 1610593080);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-609787) + "'", int18 == (-609787));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1730079900 + "'", int21 == 1730079900);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.divide(51, 109);
        int int18 = calculator0.add(0, (-1919));
        int int21 = calculator0.subtract(1145179044, (-7567));
        int int24 = calculator0.multiply(16, 502657300);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1919) + "'", int18 == (-1919));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1145186611 + "'", int21 == 1145186611);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-547417792) + "'", int24 == (-547417792));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
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
        int int30 = calculator0.divide(1771863899, 867148791);
        int int33 = calculator0.multiply((-887061404), 6668008);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1271879224 + "'", int21 == 1271879224);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 287137964 + "'", int24 == 287137964);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1532796050 + "'", int27 == 1532796050);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1932407456 + "'", int33 == 1932407456);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.multiply((-68), (int) (short) 1);
        int int18 = calculator0.divide(20, (-109415445));
        int int21 = calculator0.add((-1772159544), 0);
        int int24 = calculator0.divide(8, 1035754419);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-68) + "'", int15 == (-68));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1772159544) + "'", int21 == (-1772159544));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.add((-2146806784), 0);
        int int12 = calculator0.subtract(520297, 96);
        int int15 = calculator0.divide(20580, 780440677);
        int int18 = calculator0.multiply((-1820924517), 1497039730);
        int int21 = calculator0.multiply(1323847021, 8939518);
        int int24 = calculator0.divide((-170066666), 1106724648);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2146806784) + "'", int9 == (-2146806784));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520201 + "'", int12 == 520201);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-581169146) + "'", int18 == (-581169146));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-477385434) + "'", int21 == (-477385434));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.subtract((-86713342), 86713455);
        int int21 = calculator0.subtract(1, (-152));
        int int24 = calculator0.divide(9552800, 1391530220);
        int int27 = calculator0.multiply((-2084640), 1794490544);
        int int30 = calculator0.multiply((-173435032), 1076983947);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-173426797) + "'", int18 == (-173426797));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 153 + "'", int21 == 153);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1792435712) + "'", int27 == (-1792435712));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-587860616) + "'", int30 == (-587860616));
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.subtract((int) (byte) -1, 0);
        int int21 = calculator0.divide(3400, 95);
        int int24 = calculator0.divide(0, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply((-76), (int) (byte) 100);
        int int18 = calculator0.subtract(100, (-1));
        int int21 = calculator0.multiply((-5), 378379962);
        int int24 = calculator0.add(1520179488, (-1494342816));
        int int27 = calculator0.subtract(870696771, 638350336);
        int int30 = calculator0.add(1769916224, 1591253037);
        int int33 = calculator0.divide((-866523730), (-609789));
        java.lang.Class<?> wildcardClass34 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7600) + "'", int15 == (-7600));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1891899810) + "'", int21 == (-1891899810));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 25836672 + "'", int24 == 25836672);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 232346435 + "'", int27 == 232346435);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-933798035) + "'", int30 == (-933798035));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1421 + "'", int33 == 1421);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.add((int) (byte) -1, (int) '4');
        int int21 = calculator0.subtract((int) (byte) 1, 32);
        int int24 = calculator0.add(520297, 1810185236);
        int int27 = calculator0.multiply(910738184, 1486954504);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-31) + "'", int21 == (-31));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1810705533 + "'", int24 == 1810705533);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 850335808 + "'", int27 == 850335808);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.subtract(20580, (-867133439));
        int int21 = calculator0.divide((-609787), (-31));
        int int24 = calculator0.subtract((-1248191799), 672432064);
        int int27 = calculator0.add((-707525376), (-685834));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867154019 + "'", int18 == 867154019);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19670 + "'", int21 == 19670);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1920623863) + "'", int24 == (-1920623863));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-708211210) + "'", int27 == (-708211210));
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (short) -1, 867133491);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133491) + "'", int9 == (-867133491));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((int) (short) 10, 867133501);
        int int21 = calculator0.add((-3528), (-7567));
        int int24 = calculator0.divide((-346346486), (int) (short) 100);
        int int27 = calculator0.multiply((-867133342), 867154019);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11095) + "'", int21 == (-11095));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3463464) + "'", int24 == (-3463464));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1582342682) + "'", int27 == (-1582342682));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.add(51, (-97));
        int int15 = calculator0.multiply(1978473568, 1810185237);
        int int18 = calculator0.divide((-402505884), (-173426797));
        int int21 = calculator0.divide(0, 867133515);
        int int24 = calculator0.multiply(956079995, 1356945246);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-46) + "'", int12 == (-46));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1057369120) + "'", int15 == (-1057369120));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1645239338 + "'", int24 == 1645239338);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.add(520297, (-867133611));
        int int18 = calculator0.add((-287587), (-3410880));
        int int21 = calculator0.multiply((-86), 1908264022);
        int int24 = calculator0.subtract((-867133611), 0);
        int int27 = calculator0.multiply((-206361130), 2015073664);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-866613314) + "'", int15 == (-866613314));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3698467) + "'", int18 == (-3698467));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-901948644) + "'", int21 == (-901948644));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-867133611) + "'", int24 == (-867133611));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1222015232 + "'", int27 == 1222015232);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.divide((int) ' ', (-101));
        int int15 = calculator0.add(1152037484, (-6858340));
        int int18 = calculator0.subtract(861507584, (-901948644));
        int int21 = calculator0.divide(119647596, (-335544320));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1145179144 + "'", int15 == 1145179144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1763456228 + "'", int18 == 1763456228);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide((-867133439), 9);
        int int12 = calculator0.divide((-2146806852), 1145179044);
        int int15 = calculator0.divide(0, (-1769916224));
        int int18 = calculator0.divide(216030809, 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18002567 + "'", int18 == 18002567);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.subtract(1925360681, 1672101496);
        int int12 = calculator0.add((-197121368), 940146681);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 253259185 + "'", int9 == 253259185);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 743025313 + "'", int12 == 743025313);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.add((int) (byte) 1, (int) ' ');
        int int15 = calculator0.multiply((int) (short) 1, (-6858340));
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6858340) + "'", int15 == (-6858340));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.multiply((-68), 110);
        int int18 = calculator0.add(1371450554, (-49164339));
        int int21 = calculator0.multiply((-1964453610), 86713455);
        int int24 = calculator0.subtract(1145179144, (-109415563));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7480) + "'", int15 == (-7480));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1322286215 + "'", int18 == 1322286215);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2062827382) + "'", int21 == (-2062827382));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1254594707 + "'", int24 == 1254594707);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.add((int) (byte) 1, (int) ' ');
        int int15 = calculator0.add(52, 870696771);
        int int18 = calculator0.divide((-1526379168), (-866613314));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 870696823 + "'", int15 == 870696823);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.subtract(2, 86713344);
        int int18 = calculator0.subtract(757717952, 2877446);
        int int21 = calculator0.add((-1582342682), 284903989);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713342) + "'", int15 == (-86713342));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 754840506 + "'", int18 == 754840506);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1297438693) + "'", int21 == (-1297438693));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.add(520297, (-867133611));
        int int18 = calculator0.divide(272082650, 757944224);
        int int21 = calculator0.add(153, 232346435);
        int int24 = calculator0.multiply(265563723, 1235754784);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-866613314) + "'", int15 == (-866613314));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 232346588 + "'", int21 == 232346588);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1884872288 + "'", int24 == 1884872288);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide((-867133439), 9);
        int int12 = calculator0.multiply((-96348159), (-9280));
        int int15 = calculator0.divide(1272748659, (-2243320));
        int int18 = calculator0.add(1810185237, (-453239991));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 757717952 + "'", int12 == 757717952);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-567) + "'", int15 == (-567));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1356945246 + "'", int18 == 1356945246);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.subtract(76, (-867133439));
        int int18 = calculator0.subtract((-15200), (int) (short) 100);
        int int21 = calculator0.multiply(86713455, 391608);
        int int24 = calculator0.divide((-24578), 26401901);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133515 + "'", int15 == 867133515);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-15300) + "'", int18 == (-15300));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1671243464 + "'", int21 == 1671243464);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.subtract((-1), (-97));
        int int21 = calculator0.multiply(173435032, (-755028714));
        int int24 = calculator0.add((-351564), 1672101496);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 96 + "'", int18 == 96);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-214452976) + "'", int21 == (-214452976));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1671749932 + "'", int24 == 1671749932);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.add(568480, 110);
        int int15 = calculator0.subtract(1787380221, 86713457);
        int int18 = calculator0.add((-68), (-2146806784));
        int int21 = calculator0.divide((-1813700023), (-50514530));
        int int24 = calculator0.divide((-1145179180), 4864);
        int int27 = calculator0.subtract(42260132, (-757113551));
        int int30 = calculator0.divide((-2110419406), (-2016961242));
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1700666764 + "'", int15 == 1700666764);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2146806852) + "'", int18 == (-2146806852));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-235439) + "'", int24 == (-235439));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 799373683 + "'", int27 == 799373683);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.multiply((-68), 110);
        int int18 = calculator0.add(1371450554, (-49164339));
        int int21 = calculator0.add(1152037331, (-867133342));
        int int24 = calculator0.multiply((-976), 273140353);
        int int27 = calculator0.multiply((-579176885), (-513259903));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7480) + "'", int15 == (-7480));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1322286215 + "'", int18 == 1322286215);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 284903989 + "'", int21 == 284903989);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-297012176) + "'", int24 == (-297012176));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 277224907 + "'", int27 == 277224907);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.add((int) (byte) -1, (int) '4');
        int int21 = calculator0.subtract((int) (byte) 1, 32);
        int int24 = calculator0.add(520297, 1810185236);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-31) + "'", int21 == (-31));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1810705533 + "'", int24 == 1810705533);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((-7466), 67686400);
        int int18 = calculator0.divide(0, 6992);
        int int21 = calculator0.multiply((-31), (-346346486));
        int int24 = calculator0.divide(236316608, (-8085940));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2146806474 + "'", int21 == 2146806474);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-29) + "'", int24 == (-29));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.multiply((int) (short) 100, (-152));
        int int18 = calculator0.divide((-1248231612), 1754528548);
        int int21 = calculator0.add((-1364644474), (-989528052));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15200) + "'", int15 == (-15200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1940794770 + "'", int21 == 1940794770);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) ' ', 109415477);
        int int15 = calculator0.subtract(1037464303, (-1469333649));
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-109415445) + "'", int12 == (-109415445));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1788169344) + "'", int15 == (-1788169344));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.add(98, (int) (byte) 0);
        int int21 = calculator0.subtract((int) (short) 100, 98);
        int int24 = calculator0.add((-1813700023), (-747485824));
        int int27 = calculator0.multiply(2075617088, 1249740532);
        int int30 = calculator0.divide(654086037, 1671243464);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1733781449 + "'", int24 == 1733781449);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-719722240) + "'", int27 == (-719722240));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
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
        int int30 = calculator0.add(0, 0);
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 346346496 + "'", int18 == 346346496);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1237148864) + "'", int21 == (-1237148864));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2003427328) + "'", int27 == (-2003427328));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
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
        int int30 = calculator0.divide((-1556003565), (-109415539));
        int int33 = calculator0.add(887061504, (-6867620));
        java.lang.Class<?> wildcardClass34 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 110 + "'", int21 == 110);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1013244357 + "'", int27 == 1013244357);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 14 + "'", int30 == 14);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 880193884 + "'", int33 == 880193884);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.subtract((int) (byte) -1, (int) (short) -1);
        int int15 = calculator0.add((-6858340), (-9280));
        int int18 = calculator0.multiply((-1359151923), (-557732664));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6867620) + "'", int15 == (-6867620));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 202128424 + "'", int18 == 202128424);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide((-867133439), 9);
        int int12 = calculator0.subtract(0, 867154019);
        int int15 = calculator0.subtract(867154019, (-976));
        int int18 = calculator0.add((-171620289), 51);
        int int21 = calculator0.add((int) (short) 100, (-1497046880));
        int int24 = calculator0.add((-867133515), 1307876110);
        int int27 = calculator0.divide((-1555994343), (-298751412));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-867154019) + "'", int12 == (-867154019));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867154995 + "'", int15 == 867154995);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-171620238) + "'", int18 == (-171620238));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1497046780) + "'", int21 == (-1497046780));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 440742595 + "'", int24 == 440742595);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
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
        int int30 = calculator0.multiply((-867133491), 86713381);
        int int33 = calculator0.add((-1606434250), (-15));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1494342816) + "'", int18 == (-1494342816));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30 + "'", int21 == 30);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-488406348) + "'", int24 == (-488406348));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1816189210) + "'", int27 == (-1816189210));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1567474849 + "'", int30 == 1567474849);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1606434265) + "'", int33 == (-1606434265));
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.add((int) (byte) 1, (int) ' ');
        int int15 = calculator0.add((-362955086), 428644672);
        int int18 = calculator0.subtract((-97), 1486954454);
        int int21 = calculator0.subtract((-1271895989), 654086037);
        int int24 = calculator0.subtract((-46), 520484954);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 65689586 + "'", int15 == 65689586);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1486954551) + "'", int18 == (-1486954551));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1925982026) + "'", int21 == (-1925982026));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-520485000) + "'", int24 == (-520485000));
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) '#', (-9312));
        int int18 = calculator0.divide((-97), (-867138628));
        int int21 = calculator0.divide(1395, (-867125924));
        int int24 = calculator0.multiply((-654086169), (-430278180));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9347 + "'", int15 == 9347);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 940420 + "'", int24 == 940420);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.divide(25, (-1923));
        int int12 = calculator0.multiply(548010, 3563280);
        int int15 = calculator0.divide(822102842, (-1820924396));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1497046880) + "'", int12 == (-1497046880));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.divide(0, (-1769916224));
        int int12 = calculator0.add((-9280), 2243220);
        int int15 = calculator0.subtract((-23207515), 1357146709);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2233940 + "'", int12 == 2233940);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1380354224) + "'", int15 == (-1380354224));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
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
        int int30 = calculator0.subtract(1258058047, 2003425405);
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 110 + "'", int21 == 110);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2027159188) + "'", int27 == (-2027159188));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-745367358) + "'", int30 == (-745367358));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.divide(210, (-976));
        int int21 = calculator0.subtract(0, (-110));
        int int24 = calculator0.divide(213009, (-241122442));
        int int27 = calculator0.multiply((-702444943), 1383615488);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 110 + "'", int21 == 110);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 202476544 + "'", int27 == 202476544);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.divide((int) ' ', (-101));
        int int15 = calculator0.add(1152037484, (-6858340));
        int int18 = calculator0.divide(4213, 867133667);
        int int21 = calculator0.subtract((-173426914), 1810705533);
        int int24 = calculator0.subtract((-173436042), 67686400);
        int int27 = calculator0.add((-477996044), 1525782115);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1145179144 + "'", int15 == 1145179144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1984132447) + "'", int21 == (-1984132447));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-241122442) + "'", int24 == (-241122442));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1047786071 + "'", int27 == 1047786071);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.divide(692692992, (-1010));
        int int21 = calculator0.add((-241122442), (-757113551));
        int int24 = calculator0.divide((-34682070), (-1121822200));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-685834) + "'", int18 == (-685834));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-998235993) + "'", int21 == (-998235993));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.subtract((-86713342), 86713455);
        int int21 = calculator0.subtract((-1494342816), 1787380221);
        int int24 = calculator0.divide(1754530371, (-10));
        int int27 = calculator0.divide((-1984131052), (-1816189210));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-173426797) + "'", int18 == (-173426797));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1013244259 + "'", int21 == 1013244259);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-175453037) + "'", int24 == (-175453037));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.subtract((-86713342), 86713455);
        int int21 = calculator0.subtract(1, (-152));
        int int24 = calculator0.subtract((-6867620), 1474273060);
        int int27 = calculator0.multiply(49164339, (-2093236467));
        int int30 = calculator0.divide((-833512721), 2064);
        int int33 = calculator0.divide((-1382667017), 880193884);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-173426797) + "'", int18 == (-173426797));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 153 + "'", int21 == 153);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1481140680) + "'", int24 == (-1481140680));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 282034071 + "'", int27 == 282034071);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-403833) + "'", int30 == (-403833));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.add((int) (byte) 1, (int) ' ');
        int int15 = calculator0.divide((-152), (-6867620));
        int int18 = calculator0.subtract((-2115365052), (-1439965725));
        int int21 = calculator0.multiply(241122679, (-535833709));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-675399327) + "'", int18 == (-675399327));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2052218965 + "'", int21 == 2052218965);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', 1);
        int int15 = calculator0.multiply((-111), (-1919));
        int int18 = calculator0.subtract(1810186246, (-867133329));
        int int21 = calculator0.multiply((-88956701), (-8639589));
        int int24 = calculator0.subtract((-917640454), (-11095));
        int int27 = calculator0.add(1897078486, 854889016);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 213009 + "'", int15 == 213009);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1617647721) + "'", int18 == (-1617647721));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-702444943) + "'", int21 == (-702444943));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-917629359) + "'", int24 == (-917629359));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1542999794) + "'", int27 == (-1542999794));
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((-152), (-867154019));
        int int24 = calculator0.subtract(1965697075, (-1286026560));
        int int27 = calculator0.subtract(0, (-907339462));
        int int30 = calculator0.multiply((-715737728), (-123493));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1336575288) + "'", int21 == (-1336575288));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1043243661) + "'", int24 == (-1043243661));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 907339462 + "'", int27 == 907339462);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1827707776) + "'", int30 == (-1827707776));
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide(1219996744, 109415572);
        int int21 = calculator0.divide(1769916224, (-24578));
        int int24 = calculator0.divide(1754530371, (-867133342));
        int int27 = calculator0.multiply((-1341547376), 1572558016);
        int int30 = calculator0.multiply(1049326020, 109);
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-72012) + "'", int21 == (-72012));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-607867904) + "'", int27 == (-607867904));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1587580812) + "'", int30 == (-1587580812));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.subtract((-7955541), (-867133515));
        int int18 = calculator0.add((-867051763), (-1567474935));
        int int21 = calculator0.multiply(0, (-707534653));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 859177974 + "'", int15 == 859177974);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1860440598 + "'", int18 == 1860440598);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide((-867133439), 9);
        int int12 = calculator0.multiply((-96348159), (-9280));
        int int15 = calculator0.divide((-5), 202);
        int int18 = calculator0.divide(110, 853334016);
        int int21 = calculator0.subtract(42927, (-72012));
        int int24 = calculator0.divide((-857622013), (-867136765));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 757717952 + "'", int12 == 757717952);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 114939 + "'", int21 == 114939);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
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
        int int33 = calculator0.multiply((-757944310), 20580);
        int int36 = calculator0.subtract(1493382152, (-217396992));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 827319272 + "'", int33 == 827319272);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1710779144 + "'", int36 == 1710779144);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide(440742595, 1477466179);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.subtract((int) (byte) -1, 0);
        int int21 = calculator0.divide(3400, 95);
        int int24 = calculator0.add(920356679, (-1850343988));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-929987309) + "'", int24 == (-929987309));
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.divide((int) (short) 1, (int) (short) 100);
        int int15 = calculator0.add((int) (byte) -1, (-111));
        int int18 = calculator0.divide(110, (-1526379168));
        int int21 = calculator0.add((-685834), (-1687920631));
        int int24 = calculator0.multiply(21975628, (-403723706));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-112) + "'", int15 == (-112));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1688606465) + "'", int21 == (-1688606465));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1900738760 + "'", int24 == 1900738760);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.subtract((-1), (-97));
        int int21 = calculator0.multiply(0, 287137963);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 96 + "'", int18 == 96);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.subtract(20580, (-867133439));
        int int21 = calculator0.divide((-609787), (-31));
        int int24 = calculator0.subtract((-1248191799), 672432064);
        int int27 = calculator0.subtract((-3528), (-1058206662));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867154019 + "'", int18 == 867154019);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19670 + "'", int21 == 19670);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1920623863) + "'", int24 == (-1920623863));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1058203134 + "'", int27 == 1058203134);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.add(568480, 110);
        int int15 = calculator0.subtract(1787380221, 86713457);
        int int18 = calculator0.multiply(8671336, (-1481140680));
        int int21 = calculator0.multiply(178159040, (int) (byte) 0);
        int int24 = calculator0.divide(1512046592, (-173436042));
        int int27 = calculator0.add(0, 9347);
        int int30 = calculator0.subtract(1448299036, (-869367270));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1700666764 + "'", int15 == 1700666764);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-161052992) + "'", int18 == (-161052992));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-8) + "'", int24 == (-8));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9347 + "'", int27 == 9347);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1977300990) + "'", int30 == (-1977300990));
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
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
        int int33 = calculator0.multiply((-258), (-1556003565));
        int int36 = calculator0.multiply(867148791, 1339770992);
        int int39 = calculator0.divide((-1333062898), 1736938240);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2016961242 + "'", int33 == 2016961242);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-2143144944) + "'", int36 == (-2143144944));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
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
        int int30 = calculator0.divide(51, 887396705);
        int int33 = calculator0.subtract(0, (-1769916127));
        int int36 = calculator0.subtract((-1262943204), 870716441);
        java.lang.Class<?> wildcardClass37 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 95 + "'", int12 == 95);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-747485824) + "'", int15 == (-747485824));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3400 + "'", int18 == 3400);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1733781449 + "'", int21 == 1733781449);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1539825347 + "'", int24 == 1539825347);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1769916127 + "'", int33 == 1769916127);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-2133659645) + "'", int36 == (-2133659645));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.add((int) (byte) 1, (int) ' ');
        int int15 = calculator0.add((-362955086), 428644672);
        int int18 = calculator0.subtract((-97), 1486954454);
        int int21 = calculator0.divide((-866523730), (-867133537));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 65689586 + "'", int15 == 65689586);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1486954551) + "'", int18 == (-1486954551));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.multiply((-68), 110);
        int int18 = calculator0.add(1371450554, (-49164339));
        int int21 = calculator0.add(1152037331, (-867133342));
        int int24 = calculator0.divide((-20), (-8));
        int int27 = calculator0.subtract(86144901, 98022601);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7480) + "'", int15 == (-7480));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1322286215 + "'", int18 == 1322286215);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 284903989 + "'", int21 == 284903989);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-11877700) + "'", int27 == (-11877700));
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide(440742595, 1477466179);
        int int18 = calculator0.subtract(654086037, 1965697075);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1311611038) + "'", int18 == (-1311611038));
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
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
        int int30 = calculator0.add((-132), (-1123990489));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 346346496 + "'", int18 == 346346496);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1237148864) + "'", int21 == (-1237148864));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-867138628) + "'", int27 == (-867138628));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1123990621) + "'", int30 == (-1123990621));
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((int) '#', (int) ' ');
        int int18 = calculator0.add(34, (-1010));
        int int21 = calculator0.multiply(568480, (-6));
        int int24 = calculator0.multiply((-170954984), (-601961808));
        int int27 = calculator0.subtract(37474034, (-164656960));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-976) + "'", int18 == (-976));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3410880) + "'", int21 == (-3410880));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1360351360 + "'", int24 == 1360351360);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 202130994 + "'", int27 == 202130994);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide((int) (byte) -1, 69);
        int int21 = calculator0.add(822110308, (-88956677));
        int int24 = calculator0.multiply(1058206889, 1754528448);
        int int27 = calculator0.add(1659460117, 67686400);
        int int30 = calculator0.divide(458092924, 1938174875);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 733153631 + "'", int21 == 733153631);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-164656960) + "'", int24 == (-164656960));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1727146517 + "'", int27 == 1727146517);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.divide((int) ' ', (-101));
        int int15 = calculator0.add(1152037484, (-6858340));
        int int18 = calculator0.divide(4213, 867133667);
        int int21 = calculator0.subtract(0, 86713457);
        int int24 = calculator0.add((-1076453360), (-567));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1145179144 + "'", int15 == 1145179144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-86713457) + "'", int21 == (-86713457));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1076453927) + "'", int24 == (-1076453927));
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = calculator0.add((-76), (-76));
        int int27 = calculator0.multiply(867148791, (-178319437));
        int int30 = calculator0.add((-3459), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-152) + "'", int24 == (-152));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1441521995) + "'", int27 == (-1441521995));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-3459) + "'", int30 == (-3459));
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((int) (short) 10, 867133501);
        int int21 = calculator0.multiply(2, (-86713457));
        int int24 = calculator0.add(86713344, 131);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-173426914) + "'", int21 == (-173426914));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 86713475 + "'", int24 == 86713475);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.add((int) (byte) 1, (int) ' ');
        int int15 = calculator0.subtract(754840506, (-1984132447));
        int int18 = calculator0.multiply(1, 94);
        int int21 = calculator0.subtract(1248234937, (-1760882346));
        int int24 = calculator0.divide((-257235584), 2146806474);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1555994343) + "'", int15 == (-1555994343));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 94 + "'", int18 == 94);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1285850013) + "'", int21 == (-1285850013));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.subtract((int) (byte) -1, (int) (short) -1);
        int int15 = calculator0.add((-6858340), (-9280));
        int int18 = calculator0.multiply((-1359151923), (-557732664));
        int int21 = calculator0.divide(37489359, 6596677);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6867620) + "'", int15 == (-6867620));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 202128424 + "'", int18 == 202128424);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) ' ', (int) (byte) 100);
        int int15 = calculator0.subtract((-207), 86713344);
        int int18 = calculator0.subtract(119647596, 17);
        int int21 = calculator0.add((-110), 96);
        int int24 = calculator0.subtract(1925360681, (-757113354));
        int int27 = calculator0.subtract(9552704, 0);
        int int30 = calculator0.divide((-1140394960), (-10909665));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-68) + "'", int12 == (-68));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713551) + "'", int15 == (-86713551));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 119647579 + "'", int18 == 119647579);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-14) + "'", int21 == (-14));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1612493261) + "'", int24 == (-1612493261));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9552704 + "'", int27 == 9552704);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 104 + "'", int30 == 104);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.add(568480, 110);
        int int15 = calculator0.subtract(1787380221, 86713457);
        int int18 = calculator0.multiply(8671336, (-1481140680));
        int int21 = calculator0.multiply(178159040, (int) (byte) 0);
        int int24 = calculator0.divide(406425903, (-866613314));
        int int27 = calculator0.multiply((-502873081), 1908264017);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1700666764 + "'", int15 == 1700666764);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-161052992) + "'", int18 == (-161052992));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1199269321) + "'", int27 == (-1199269321));
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.subtract(109, (int) (short) 100);
        int int15 = calculator0.subtract((-36), (-31));
        int int18 = calculator0.subtract((int) (byte) 0, 1494342816);
        int int21 = calculator0.multiply((-45), (-31));
        int int24 = calculator0.subtract(37500454, (-94230841));
        int int27 = calculator0.multiply(1154271478, (-451867));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1494342816) + "'", int18 == (-1494342816));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1395 + "'", int21 == 1395);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 131731295 + "'", int24 == 131731295);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-656490482) + "'", int27 == (-656490482));
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.add(568480, 110);
        int int15 = calculator0.subtract((-867154019), 67686496);
        int int18 = calculator0.add((-214452976), (-1838369148));
        int int21 = calculator0.subtract(692692992, 1271869877);
        int int24 = calculator0.subtract(692330713, 1049326020);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-934840515) + "'", int15 == (-934840515));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2052822124) + "'", int18 == (-2052822124));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-579176885) + "'", int21 == (-579176885));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-356995307) + "'", int24 == (-356995307));
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.subtract((int) (byte) -1, 100);
        int int12 = calculator0.add((-9433), (-341775360));
        int int15 = calculator0.multiply(131, (-609789));
        int int18 = calculator0.subtract(1154271574, 35);
        int int21 = calculator0.divide(109413727, (-1819445740));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-101) + "'", int9 == (-101));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-341784793) + "'", int12 == (-341784793));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-79882359) + "'", int15 == (-79882359));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1154271539 + "'", int18 == 1154271539);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.add((int) (byte) 1, (int) ' ');
        int int15 = calculator0.multiply(67854305, 867154009);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-223539911) + "'", int15 == (-223539911));
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(1145179144, 100);
        int int15 = calculator0.subtract((-932693954), 2110251662);
        int int18 = calculator0.multiply(1484018126, 75792384);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1145179044 + "'", int12 == 1145179044);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1252021680 + "'", int15 == 1252021680);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1893793792) + "'", int18 == (-1893793792));
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.subtract((int) (short) 0, 110);
        int int21 = calculator0.multiply((-867133491), (-9280));
        int int24 = calculator0.multiply((-1769916224), (-173426797));
        int int27 = calculator0.subtract((-109415445), 1503914342);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-110) + "'", int18 == (-110));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1769916224) + "'", int21 == (-1769916224));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 42260032 + "'", int24 == 42260032);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1613329787) + "'", int27 == (-1613329787));
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.add(86713457, (-15300));
        int int21 = calculator0.subtract(867133616, 196);
        int int24 = calculator0.multiply(131731295, (-1665941363));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 86698157 + "'", int18 == 86698157);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 867133420 + "'", int21 == 867133420);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2112964781) + "'", int24 == (-2112964781));
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.subtract((int) (short) 0, 110);
        int int21 = calculator0.multiply((-867133491), (-9280));
        int int24 = calculator0.multiply(98, 210);
        int int27 = calculator0.multiply(867150782, 1672101496);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-110) + "'", int18 == (-110));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1769916224) + "'", int21 == (-1769916224));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20580 + "'", int24 == 20580);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1276937488 + "'", int27 == 1276937488);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
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
        int int30 = calculator0.divide((-258), 1152037538);
        int int33 = calculator0.divide(164584658, (-58));
        int int36 = calculator0.multiply((-867154019), 67686400);
        int int39 = calculator0.add(1002899992, (-206361128));
        int int42 = calculator0.multiply(104, 6992);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-2837666) + "'", int33 == (-2837666));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-350777344) + "'", int36 == (-350777344));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 796538864 + "'", int39 == 796538864);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 727168 + "'", int42 == 727168);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.subtract(2, 86713344);
        int int18 = calculator0.multiply(1700666860, (-15200));
        int int21 = calculator0.multiply(866523750, 1693566793);
        int int24 = calculator0.multiply((-845157802), 2125191714);
        int int27 = calculator0.add((-88947591), (-1174926336));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713342) + "'", int15 == (-86713342));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1271882624 + "'", int18 == 1271882624);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1964453610) + "'", int21 == (-1964453610));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1480350572 + "'", int24 == 1480350572);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1263873927) + "'", int27 == (-1263873927));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.divide((int) ' ', (-101));
        int int15 = calculator0.add(1152037484, (-6858340));
        int int18 = calculator0.multiply((-31), 9277);
        int int21 = calculator0.subtract((-88956701), 273998385);
        int int24 = calculator0.subtract(823407538, (-1951884651));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1145179144 + "'", int15 == 1145179144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-287587) + "'", int18 == (-287587));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-362955086) + "'", int21 == (-362955086));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1519675107) + "'", int24 == (-1519675107));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.subtract((int) (short) 0, 110);
        int int21 = calculator0.multiply((-867133491), (-9280));
        int int24 = calculator0.multiply(98, 210);
        int int27 = calculator0.multiply(2243220, 1809614551);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-110) + "'", int18 == (-110));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1769916224) + "'", int21 == (-1769916224));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20580 + "'", int24 == 20580);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 983083596 + "'", int27 == 983083596);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
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
        int int30 = calculator0.subtract((-321074903), 1810705533);
        int int33 = calculator0.divide(1353728, (-1807123776));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 897963264 + "'", int24 == 897963264);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-34) + "'", int27 == (-34));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2131780436) + "'", int30 == (-2131780436));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((-866613314), 692692992);
        int int18 = calculator0.add((int) (short) -1, (-111));
        int int21 = calculator0.subtract(1269639304, (-1555994343));
        int int24 = calculator0.subtract(1152037538, 20580);
        int int27 = calculator0.subtract(867154995, 1237148765);
        int int30 = calculator0.multiply((-576693300), 2064);
        int int33 = calculator0.subtract((-1448314236), 42260132);
        int int36 = calculator0.divide((-1746895405), 2877446);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-112) + "'", int18 == (-112));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1469333649) + "'", int21 == (-1469333649));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1152016958 + "'", int24 == 1152016958);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-369993770) + "'", int27 == (-369993770));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-589030208) + "'", int30 == (-589030208));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1490574368) + "'", int33 == (-1490574368));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-607) + "'", int36 == (-607));
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.add((int) (byte) -1, (int) '4');
        int int21 = calculator0.subtract((int) (byte) 1, 32);
        int int24 = calculator0.add(520297, 1810185236);
        int int27 = calculator0.multiply(0, 1272748659);
        int int30 = calculator0.divide((-88956701), 2125191714);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = calculator0.divide(34, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-31) + "'", int21 == (-31));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1810705533 + "'", int24 == 1810705533);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.add(520297, (-867133611));
        int int18 = calculator0.subtract((-1923), (-109415650));
        int int21 = calculator0.subtract(780440677, 35);
        int int24 = calculator0.divide((-576693300), (-755028714));
        int int27 = calculator0.divide(1486954504, (-1202658055));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-866613314) + "'", int15 == (-866613314));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 109413727 + "'", int18 == 109413727);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 780440642 + "'", int21 == 780440642);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.divide((int) (short) 1, (int) (short) 100);
        int int15 = calculator0.subtract(481696220, (-535833709));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1017529929 + "'", int15 == 1017529929);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply((-76), (int) (byte) 100);
        int int18 = calculator0.subtract(100, (-1));
        int int21 = calculator0.multiply((-5), 378379962);
        int int24 = calculator0.add(1520179488, (-1494342816));
        int int27 = calculator0.subtract(870696771, 638350336);
        int int30 = calculator0.add((-20), 822099432);
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7600) + "'", int15 == (-7600));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1891899810) + "'", int21 == (-1891899810));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 25836672 + "'", int24 == 25836672);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 232346435 + "'", int27 == 232346435);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 822099412 + "'", int30 == 822099412);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.subtract(76, (-867133439));
        int int18 = calculator0.subtract((-976), 4213);
        int int21 = calculator0.subtract((-867133612), (-2115365052));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133515 + "'", int15 == 867133515);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-5189) + "'", int18 == (-5189));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1248231440 + "'", int21 == 1248231440);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.add(51, (int) (short) 1);
        int int15 = calculator0.add((-68), 32);
        int int18 = calculator0.subtract(1810185237, (-2132911612));
        int int21 = calculator0.multiply(867138284, (-88));
        int int24 = calculator0.multiply(692330713, (-88956770));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-36) + "'", int15 == (-36));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-351870447) + "'", int18 == (-351870447));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1001242336 + "'", int21 == 1001242336);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-847911442) + "'", int24 == (-847911442));
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
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
        int int30 = calculator0.divide(1787380221, (-86713551));
        int int33 = calculator0.add((-341784811), (-79882359));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6992 + "'", int24 == 6992);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-932693954) + "'", int27 == (-932693954));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-20) + "'", int30 == (-20));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-421667170) + "'", int33 == (-421667170));
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply(0, 1810705533);
        int int24 = calculator0.subtract((-341775360), 52);
        int int27 = calculator0.add((-2025976245), (-1670316726));
        int int30 = calculator0.add(767600184, (-132));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-341775412) + "'", int24 == (-341775412));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 598674325 + "'", int27 == 598674325);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 767600052 + "'", int30 == 767600052);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        int int21 = calculator0.divide((-1010), 1152037484);
        int int24 = calculator0.subtract((-2146806852), 1610593080);
        int int27 = calculator0.divide((-1497046880), (-412970881));
        int int30 = calculator0.divide(53495052, (-60));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 537567364 + "'", int24 == 537567364);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-891584) + "'", int30 == (-891584));
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
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
        int int30 = calculator0.multiply((-1224898), (-2125062739));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1020111879) + "'", int27 == (-1020111879));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1305701658) + "'", int30 == (-1305701658));
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
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
        int int30 = calculator0.divide((-1872319616), 1274638223);
        int int33 = calculator0.divide(1488978038, (-607));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11095) + "'", int21 == (-11095));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3463464) + "'", int24 == (-3463464));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1756652153 + "'", int27 == 1756652153);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-2453011) + "'", int33 == (-2453011));
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.subtract((-1), (-97));
        int int21 = calculator0.multiply(0, 287137963);
        int int24 = calculator0.subtract(109410199, 866523750);
        int int27 = calculator0.add((-938163200), 1580921300);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 96 + "'", int18 == 96);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-757113551) + "'", int24 == (-757113551));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 642758100 + "'", int27 == 642758100);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide(692692992, 2);
        int int21 = calculator0.divide(1237148864, (-1));
        int int24 = calculator0.divide(501219328, 754840506);
        int int27 = calculator0.multiply((-867133515), 1307876110);
        int int30 = calculator0.multiply((-1486954551), (-1486954551));
        int int33 = calculator0.add(1145169864, (-698088384));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 346346496 + "'", int18 == 346346496);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1237148864) + "'", int21 == (-1237148864));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 29811430 + "'", int27 == 29811430);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1497091025 + "'", int30 == 1497091025);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 447081480 + "'", int33 == 447081480);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.subtract((-1), (-97));
        int int21 = calculator0.multiply(0, 287137963);
        int int24 = calculator0.subtract(109410199, 866523750);
        int int27 = calculator0.divide((-826840308), 296448802);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 96 + "'", int18 == 96);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-757113551) + "'", int24 == (-757113551));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2) + "'", int27 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) '#', (-9312));
        int int18 = calculator0.multiply(86713455, 1769916224);
        int int21 = calculator0.add(1810185237, 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9347 + "'", int15 == 9347);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1237148864 + "'", int18 == 1237148864);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1810185264 + "'", int21 == 1810185264);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.divide((-100), 32);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.subtract(96, 97);
        int int15 = calculator0.multiply((-45), (-23318356));
        int int18 = calculator0.multiply(19670, 0);
        int int21 = calculator0.divide(11, 284903989);
        int int24 = calculator0.add((-10), 867154019);
        int int27 = calculator0.subtract((-132), 654086037);
        int int30 = calculator0.divide((-178330532), 868979689);
        int int33 = calculator0.subtract(431551980, 1357146709);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1049326020 + "'", int15 == 1049326020);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 867154009 + "'", int24 == 867154009);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-654086169) + "'", int27 == (-654086169));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-925594729) + "'", int33 == (-925594729));
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.add((-2146806784), 0);
        int int12 = calculator0.subtract(520297, 96);
        int int15 = calculator0.add((-20), (-68));
        int int18 = calculator0.subtract(1497046722, 6992);
        int int21 = calculator0.multiply(1152037484, (-214452976));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2146806784) + "'", int9 == (-2146806784));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520201 + "'", int12 == 520201);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-88) + "'", int15 == (-88));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1497039730 + "'", int18 == 1497039730);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-737836352) + "'", int21 == (-737836352));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.add(32, (-9312));
        int int12 = calculator0.divide(3563280, (-442694645));
        int int15 = calculator0.subtract((-1435799528), (-5));
        int int18 = calculator0.add((-39007237), 1810185237);
        int int21 = calculator0.add((-902782633), 1154271574);
        int int24 = calculator0.multiply(346346583, (-362955086));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-9280) + "'", int9 == (-9280));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1435799523) + "'", int15 == (-1435799523));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1771178000 + "'", int18 == 1771178000);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 251488941 + "'", int21 == 251488941);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1506752126 + "'", int24 == 1506752126);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.add(51, (int) (short) 1);
        int int15 = calculator0.add(1700666764, 96);
        int int18 = calculator0.add(96, 67686400);
        int int21 = calculator0.add(65689586, 757717952);
        int int24 = calculator0.divide((-325549817), 9347);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1700666860 + "'", int15 == 1700666860);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 67686496 + "'", int18 == 67686496);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 823407538 + "'", int21 == 823407538);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-34829) + "'", int24 == (-34829));
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.subtract((-867133537), 0);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-867133537) + "'", int12 == (-867133537));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.subtract((-1), 9);
        int int18 = calculator0.subtract(173200584, 21975628);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 151224956 + "'", int18 == 151224956);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((int) (short) 10, 867133501);
        int int21 = calculator0.add((-3528), (-7567));
        int int24 = calculator0.divide((-346346486), (int) (short) 100);
        int int27 = calculator0.add((int) (short) 0, (-757113551));
        int int30 = calculator0.divide((-1123990621), 2139980843);
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11095) + "'", int21 == (-11095));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3463464) + "'", int24 == (-3463464));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-757113551) + "'", int27 == (-757113551));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(757717952, 867133515);
        int int15 = calculator0.divide((-1738066976), 866523750);
        int int18 = calculator0.multiply(754840506, (-135309308));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-109415563) + "'", int12 == (-109415563));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6668008 + "'", int18 == 6668008);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract(9, (-100));
        int int15 = calculator0.add(1733781449, 18);
        int int18 = calculator0.divide(1898423450, (-135309308));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109 + "'", int12 == 109);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1733781467 + "'", int15 == 1733781467);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-14) + "'", int18 == (-14));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((int) (short) 10, 867133501);
        int int21 = calculator0.multiply(2, (-86713457));
        int int24 = calculator0.subtract(9552800, 96);
        int int27 = calculator0.divide(1202467776, 1972498146);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-173426914) + "'", int21 == (-173426914));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9552704 + "'", int24 == 9552704);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.add((int) (byte) -1, (int) '4');
        int int21 = calculator0.multiply((-555681720), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((-866613314), 692692992);
        int int18 = calculator0.add((int) (short) -1, (-111));
        int int21 = calculator0.subtract(1269639304, (-1555994343));
        int int24 = calculator0.divide(2130112384, (-7325507));
        int int27 = calculator0.add(1271974430, 452435116);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-112) + "'", int18 == (-112));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1469333649) + "'", int21 == (-1469333649));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-290) + "'", int24 == (-290));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1724409546 + "'", int27 == 1724409546);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.multiply(1474273060, (-867133566));
        int int15 = calculator0.divide(0, 178159040);
        int int18 = calculator0.subtract((-214452976), (-1951884651));
        int int21 = calculator0.multiply((-1555994343), (-102));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-240317368) + "'", int12 == (-240317368));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1737431675 + "'", int18 == 1737431675);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-202366966) + "'", int21 == (-202366966));
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-110), (int) (short) 0);
        int int12 = calculator0.divide(1769916224, (-86713342));
        int int15 = calculator0.multiply(1145179144, (-607867904));
        int int18 = calculator0.add(1272748659, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-110) + "'", int9 == (-110));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-20) + "'", int12 == (-20));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1848991744 + "'", int15 == 1848991744);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1272748659 + "'", int18 == 1272748659);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.subtract((int) (byte) -1, (int) (short) -1);
        int int15 = calculator0.add((-6858340), (-9280));
        int int18 = calculator0.divide(897963264, 94);
        int int21 = calculator0.divide((-1700666664), (int) (byte) 10);
        int int24 = calculator0.multiply((-171620289), 501219328);
        int int27 = calculator0.multiply((-1612493261), 399868564);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6867620) + "'", int15 == (-6867620));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9552800 + "'", int18 == 9552800);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-170066666) + "'", int21 == (-170066666));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1512046592 + "'", int24 == 1512046592);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2104616068) + "'", int27 == (-2104616068));
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply(0, 1810705533);
        int int24 = calculator0.divide((-1248231612), 32);
        int int27 = calculator0.add(1678282987, 9552704);
        int int30 = calculator0.divide(0, (-110));
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-39007237) + "'", int24 == (-39007237));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1687835691 + "'", int27 == 1687835691);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((-178319437), (-11095));
        int int15 = calculator0.divide((-220794010), (-46566313));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-178330532) + "'", int12 == (-178330532));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (byte) 100, (-1));
        int int12 = calculator0.subtract(1152037484, 153);
        int int15 = calculator0.multiply(867133667, 42260032);
        int int18 = calculator0.multiply((-36), 867133491);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1152037331 + "'", int12 == 1152037331);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1754528448 + "'", int15 == 1754528448);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1152034604) + "'", int18 == (-1152034604));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.subtract(20580, (-867133439));
        int int21 = calculator0.divide((-609787), (-31));
        int int24 = calculator0.multiply((-50514530), (-867133666));
        int int27 = calculator0.divide(1323847021, (-23318356));
        int int30 = calculator0.add(0, 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867154019 + "'", int18 == 867154019);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19670 + "'", int21 == 19670);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1448314236) + "'", int24 == (-1448314236));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-56) + "'", int27 == (-56));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 19 + "'", int30 == 19);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((-7466), 67686400);
        int int18 = calculator0.divide(0, 6992);
        int int21 = calculator0.multiply((-173436074), (int) (short) 0);
        int int24 = calculator0.divide((-52), 1219996744);
        int int27 = calculator0.add(1145169864, 823407538);
        int int30 = calculator0.multiply(736984748, 1383615488);
        int int33 = calculator0.subtract((-685328092), 1013244357);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1968577402 + "'", int27 == 1968577402);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-96792576) + "'", int30 == (-96792576));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1698572449) + "'", int33 == (-1698572449));
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide((-1769916224), (-36));
        int int21 = calculator0.add((-9312), (-121));
        int int24 = calculator0.divide((-220), 1);
        int int27 = calculator0.divide(611523584, (-1286025584));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49164339 + "'", int18 == 49164339);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9433) + "'", int21 == (-9433));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-220) + "'", int24 == (-220));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((-1459544222), (-867133611));
        int int15 = calculator0.add((-1494342816), (-49164380));
        int int18 = calculator0.subtract(0, 867133515);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1968289463 + "'", int12 == 1968289463);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1543507196) + "'", int15 == (-1543507196));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-867133515) + "'", int18 == (-867133515));
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide(1219996744, 109415572);
        int int21 = calculator0.divide(1769916224, (-24578));
        int int24 = calculator0.divide(1754530371, (-867133342));
        int int27 = calculator0.divide((-1730079900), 1004);
        int int30 = calculator0.subtract(1262618367, 867133521);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-72012) + "'", int21 == (-72012));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1723187) + "'", int27 == (-1723187));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 395484846 + "'", int30 == 395484846);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.divide((int) ' ', (-101));
        int int15 = calculator0.add(1152037484, (-6858340));
        int int18 = calculator0.divide(4213, 867133667);
        int int21 = calculator0.subtract((-4864), (-1357151573));
        int int24 = calculator0.subtract(867154009, 10107303);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1145179144 + "'", int15 == 1145179144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1357146709 + "'", int21 == 1357146709);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 857046706 + "'", int24 == 857046706);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.multiply((int) (short) 10, (-685834));
        int int21 = calculator0.divide((-76), (-3528));
        int int24 = calculator0.divide((-86713342), 1137);
        int int27 = calculator0.add(1525782115, 2064);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6858340) + "'", int18 == (-6858340));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-76265) + "'", int24 == (-76265));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1525784179 + "'", int27 == 1525784179);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((int) (short) 10, 867133501);
        int int21 = calculator0.multiply(2, (-86713457));
        int int24 = calculator0.divide((-1176431440), (-78042088));
        int int27 = calculator0.divide((-715737728), 867154995);
        int int30 = calculator0.divide((-1341611195), 86144864);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-173426914) + "'", int21 == (-173426914));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15 + "'", int24 == 15);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-15) + "'", int30 == (-15));
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.subtract(109, (int) (short) 100);
        int int15 = calculator0.add(290738210, 1236538979);
        int int18 = calculator0.add((-2201), (-1951882450));
        int int21 = calculator0.add(867133546, 1126964223);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1527277189 + "'", int15 == 1527277189);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1951884651) + "'", int18 == (-1951884651));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1994097769 + "'", int21 == 1994097769);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply(0, 0);
        int int18 = calculator0.divide(19670, (-76));
        int int21 = calculator0.subtract((int) (short) -1, 1925360681);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-258) + "'", int18 == (-258));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1925360682) + "'", int21 == (-1925360682));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((int) '#', (int) (short) -1);
        int int21 = calculator0.subtract((int) (short) 0, (-1769916224));
        int int24 = calculator0.multiply((-2146806852), 665);
        int int27 = calculator0.multiply((-68), 791316392);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1769916224 + "'", int21 == 1769916224);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1697414308) + "'", int24 == (-1697414308));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2025060192 + "'", int27 == 2025060192);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(95, 0);
        int int15 = calculator0.multiply((-867138628), (-15200));
        int int18 = calculator0.multiply(1090625663, 665);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 95 + "'", int12 == 95);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-747485824) + "'", int15 == (-747485824));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-583407129) + "'", int18 == (-583407129));
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply((-76), (int) (byte) 100);
        int int18 = calculator0.subtract((-867133440), 692692992);
        int int21 = calculator0.add(1769916224, (-101));
        int int24 = calculator0.add(1448299036, 311465950);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7600) + "'", int15 == (-7600));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1559826432) + "'", int18 == (-1559826432));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1769916123 + "'", int21 == 1769916123);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1759764986 + "'", int24 == 1759764986);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.subtract((-1), 9);
        int int18 = calculator0.subtract((-2243320), 86713381);
        int int21 = calculator0.add(1145651162, (-917629359));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-88956701) + "'", int18 == (-88956701));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 228021803 + "'", int21 == 228021803);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.subtract(20580, (-867133439));
        int int21 = calculator0.divide((-609787), (-31));
        int int24 = calculator0.multiply((-50514530), (-867133666));
        int int27 = calculator0.subtract(1908264022, 5);
        int int30 = calculator0.multiply(0, 870696771);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867154019 + "'", int18 == 867154019);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19670 + "'", int21 == 19670);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1448314236) + "'", int24 == (-1448314236));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1908264017 + "'", int27 == 1908264017);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.multiply((int) (short) 100, (-152));
        int int18 = calculator0.multiply(0, (-170066666));
        int int21 = calculator0.multiply(97, 1258058047);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15200) + "'", int15 == (-15200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1772546271 + "'", int21 == 1772546271);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.subtract(2, 86713344);
        int int18 = calculator0.multiply(20, 1154271478);
        int int21 = calculator0.add(67854305, 37489359);
        int int24 = calculator0.multiply((-1441521995), (-173));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713342) + "'", int15 == (-86713342));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1610593080 + "'", int18 == 1610593080);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 105343664 + "'", int21 == 105343664);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 275201967 + "'", int24 == 275201967);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.multiply((int) (short) 10, (-685834));
        int int21 = calculator0.divide((-76), (-3528));
        int int24 = calculator0.multiply(114939, (-417546408));
        int int27 = calculator0.add((-1526379168), 1458866016);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6858340) + "'", int18 == (-6858340));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-402023608) + "'", int24 == (-402023608));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-67513152) + "'", int27 == (-67513152));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        int int21 = calculator0.add((-1538240), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1538241) + "'", int21 == (-1538241));
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (short) -1, 867133491);
        int int12 = calculator0.subtract((-86), (-109415563));
        int int15 = calculator0.multiply((-1738066976), (-1333062898));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133491) + "'", int9 == (-867133491));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109415477 + "'", int12 == 109415477);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 689862208 + "'", int15 == 689862208);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
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
        int int30 = calculator0.subtract((-307808122), 0);
        int int33 = calculator0.add((-7600), (-15300));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713342) + "'", int15 == (-86713342));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1271882624 + "'", int18 == 1271882624);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1964453610) + "'", int21 == (-1964453610));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-736651448) + "'", int24 == (-736651448));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-307808122) + "'", int30 == (-307808122));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-22900) + "'", int33 == (-22900));
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract(9, (-100));
        int int15 = calculator0.add(1733781449, 18);
        int int18 = calculator0.add(1436206848, 1237148863);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109 + "'", int12 == 109);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1733781467 + "'", int15 == 1733781467);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1621611585) + "'", int18 == (-1621611585));
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.add(0, (-1010));
        int int21 = calculator0.add(1271882624, 119647596);
        int int24 = calculator0.add(0, (-7567));
        int int27 = calculator0.divide((-1726989283), 1037464303);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1010) + "'", int18 == (-1010));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1391530220 + "'", int21 == 1391530220);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-7567) + "'", int24 == (-7567));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide(1219996744, 109415572);
        int int21 = calculator0.subtract(1497046722, (-6867620));
        int int24 = calculator0.add(2366375, 866613314);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1503914342 + "'", int21 == 1503914342);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 868979689 + "'", int24 == 868979689);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
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
        int int36 = calculator0.multiply((-110), 130);
        int int39 = calculator0.multiply((-1322291616), (-2016961242));
        int int42 = calculator0.multiply(178605, (-127527494));
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-14300) + "'", int36 == (-14300));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-799325632) + "'", int39 == (-799325632));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-836495182) + "'", int42 == (-836495182));
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
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
        int int30 = calculator0.divide((-1369258035), 8939518);
        int int33 = calculator0.divide(1261453047, 1237148765);
        int int36 = calculator0.subtract(1810185236, (-50514530));
        int int39 = calculator0.multiply(225762276, 1923);
        java.lang.Class<?> wildcardClass40 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-102) + "'", int24 == (-102));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2132911612) + "'", int27 == (-2132911612));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-153) + "'", int30 == (-153));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1860699766 + "'", int36 == 1860699766);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 349159852 + "'", int39 == 349159852);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.divide(4213, (-7567));
        int int21 = calculator0.subtract((-1643366519), (-2125062739));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 481696220 + "'", int21 == 481696220);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.divide(210, (-976));
        int int21 = calculator0.add((-109415539), (-111));
        int int24 = calculator0.add((-757113551), (-1807123776));
        int int27 = calculator0.subtract(8, (-1));
        int int30 = calculator0.multiply((-3528), (-934840515));
        int int33 = calculator0.multiply(1632827392, 867133622);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-109415650) + "'", int21 == (-109415650));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1730729969 + "'", int24 == 1730729969);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-417546408) + "'", int30 == (-417546408));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1841057792 + "'", int33 == 1841057792);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.subtract(20580, (-867133439));
        int int21 = calculator0.divide((-609787), (-31));
        int int24 = calculator0.multiply((-50514530), (-867133666));
        int int27 = calculator0.divide(1323847021, (-23318356));
        int int30 = calculator0.add((-240317368), 21975628);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867154019 + "'", int18 == 867154019);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19670 + "'", int21 == 19670);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1448314236) + "'", int24 == (-1448314236));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-56) + "'", int27 == (-56));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-218341740) + "'", int30 == (-218341740));
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (byte) 100, (-1));
        int int12 = calculator0.subtract(1152037484, 153);
        int int15 = calculator0.multiply(95, 35);
        int int18 = calculator0.multiply((-847911442), (-1351018341));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1152037331 + "'", int12 == 1152037331);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3325 + "'", int15 == 3325);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-747731174) + "'", int18 == (-747731174));
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.add(568480, 110);
        int int15 = calculator0.subtract(1759764986, 784472846);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 975292140 + "'", int15 == 975292140);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((int) (short) 10, 867133501);
        int int21 = calculator0.multiply(2, (-86713457));
        int int24 = calculator0.subtract(9552800, 96);
        int int27 = calculator0.add((-109415539), (-3463464));
        int int30 = calculator0.subtract((-1490574368), (-1328086335));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-173426914) + "'", int21 == (-173426914));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9552704 + "'", int24 == 9552704);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-112879003) + "'", int27 == (-112879003));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-162488033) + "'", int30 == (-162488033));
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide((-214132468), (-49164380));
        int int12 = calculator0.divide((-85116928), (-1820924396));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide((int) (byte) -1, 69);
        int int21 = calculator0.add((-747485824), 867133420);
        int int24 = calculator0.divide(1237147755, (-1010));
        int int27 = calculator0.divide((-5189), (-708211210));
        int int30 = calculator0.subtract(461024588, 194322266);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 119647596 + "'", int21 == 119647596);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1224898) + "'", int24 == (-1224898));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 266702322 + "'", int30 == 266702322);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((-866613314), 692692992);
        int int18 = calculator0.add(1693566793, 867154995);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1734245508) + "'", int18 == (-1734245508));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide(100, 98);
        int int21 = calculator0.multiply(897963264, 109415477);
        int int24 = calculator0.add(20636113, (-867133491));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-298772224) + "'", int21 == (-298772224));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-846497378) + "'", int24 == (-846497378));
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply(0, 0);
        int int18 = calculator0.multiply(867133667, (-97));
        int int21 = calculator0.divide(34, (-1923));
        int int24 = calculator0.divide(1237148864, (-172530899));
        int int27 = calculator0.divide((-1896831404), 520484954);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1787380221 + "'", int18 == 1787380221);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-7) + "'", int24 == (-7));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3) + "'", int27 == (-3));
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.divide(86713381, (-3528));
        int int12 = calculator0.multiply(1923, (-1469333649));
        int int15 = calculator0.multiply((-869370670), (-287593));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-24578) + "'", int9 == (-24578));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 559873741 + "'", int12 == 559873741);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1987895262 + "'", int15 == 1987895262);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.divide(210, (-976));
        int int21 = calculator0.add((-109415539), (-111));
        int int24 = calculator0.subtract((-6867620), (-341775412));
        int int27 = calculator0.subtract((-430278180), (-971832620));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-109415650) + "'", int21 == (-109415650));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 334907792 + "'", int24 == 334907792);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 541554440 + "'", int27 == 541554440);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide((-867133439), 9);
        int int12 = calculator0.subtract(0, 867154019);
        int int15 = calculator0.subtract(867154019, (-976));
        int int18 = calculator0.add((-171620289), 51);
        int int21 = calculator0.divide(1269639304, (-1769916127));
        int int24 = calculator0.subtract(86698157, (-1237148864));
        int int27 = calculator0.add(867154119, 867158169);
        int int30 = calculator0.multiply((-1777146311), (-868085942));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-867154019) + "'", int12 == (-867154019));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867154995 + "'", int15 == 867154995);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-171620238) + "'", int18 == (-171620238));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1323847021 + "'", int24 == 1323847021);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1734312288 + "'", int27 == 1734312288);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1134945146 + "'", int30 == 1134945146);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply((-76), (int) (byte) 100);
        int int18 = calculator0.subtract(100, (-1));
        int int21 = calculator0.multiply((-5), 378379962);
        int int24 = calculator0.add(1520179488, (-1494342816));
        int int27 = calculator0.subtract(870696771, 638350336);
        int int30 = calculator0.divide(1897078486, 9624716);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7600) + "'", int15 == (-7600));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1891899810) + "'", int21 == (-1891899810));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 25836672 + "'", int24 == 25836672);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 232346435 + "'", int27 == 232346435);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 197 + "'", int30 == 197);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
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
        int int36 = calculator0.subtract(96, 0);
        int int39 = calculator0.subtract(780440743, (-206361128));
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 96 + "'", int36 == 96);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 986801871 + "'", int39 == 986801871);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.subtract((-24578), 867133591);
        int int21 = calculator0.divide((-1435799528), 196);
        int int24 = calculator0.subtract(766799182, 692692992);
        int int27 = calculator0.multiply((-152), (-867154019));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-867158169) + "'", int18 == (-867158169));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7325507) + "'", int21 == (-7325507));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 74106190 + "'", int24 == 74106190);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1336575288) + "'", int27 == (-1336575288));
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.subtract(104, (-51023270));
        int int18 = calculator0.add(1049982976, (-1154271480));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 51023374 + "'", int15 == 51023374);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-104288504) + "'", int18 == (-104288504));
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
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
        int int30 = calculator0.multiply(86713344, 791316392);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6992 + "'", int24 == 6992);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 95 + "'", int27 == 95);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 206282752 + "'", int30 == 206282752);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide((-867133439), 9);
        int int12 = calculator0.subtract(0, 867154019);
        int int15 = calculator0.subtract(867154019, (-976));
        int int18 = calculator0.add((-171620289), 51);
        int int21 = calculator0.divide(1269639304, (-1769916127));
        int int24 = calculator0.subtract(86698157, (-1237148864));
        int int27 = calculator0.add(867154119, 867158169);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-867154019) + "'", int12 == (-867154019));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867154995 + "'", int15 == 867154995);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-171620238) + "'", int18 == (-171620238));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1323847021 + "'", int24 == 1323847021);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1734312288 + "'", int27 == 1734312288);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        Calculator calculator0 = new Calculator();
        java.lang.Class<?> wildcardClass1 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.divide((-36), 33);
        int int18 = calculator0.add(1013244357, (-867141020));
        int int21 = calculator0.multiply(804787041, (-172530899));
        int int24 = calculator0.subtract(1237148864, (-1700666664));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 146103337 + "'", int18 == 146103337);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 225504013 + "'", int21 == 225504013);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1357151768) + "'", int24 == (-1357151768));
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide(2243220, (int) '4');
        int int21 = calculator0.add(0, 1900738760);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 43138 + "'", int18 == 43138);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1900738760 + "'", int21 == 1900738760);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = calculator0.multiply((-46), (-152));
        int int27 = calculator0.multiply((-7466), (-867133526));
        int int30 = calculator0.add((-198788080), 0);
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6992 + "'", int24 == 6992);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1503190044 + "'", int27 == 1503190044);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-198788080) + "'", int30 == (-198788080));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.divide((int) 'a', (-207));
        int int21 = calculator0.multiply(0, (-867133440));
        int int24 = calculator0.divide(0, (-442694645));
        int int27 = calculator0.add((-1685150444), 911011581);
        int int30 = calculator0.divide((-1003073195), (-134281536));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-774138863) + "'", int27 == (-774138863));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7 + "'", int30 == 7);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.subtract(20580, (-867133439));
        int int21 = calculator0.divide((-609787), (-31));
        int int24 = calculator0.add((-341775412), (-1057369120));
        int int27 = calculator0.add((-22), (-1687920631));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867154019 + "'", int18 == 867154019);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19670 + "'", int21 == 19670);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1399144532) + "'", int24 == (-1399144532));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1687920653) + "'", int27 == (-1687920653));
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((int) (short) 10, 867133501);
        int int21 = calculator0.add((-3528), (-7567));
        int int24 = calculator0.divide((-346346486), (int) (short) 100);
        int int27 = calculator0.subtract(807706469, (-7325507));
        int int30 = calculator0.add((-1806637), (-826840308));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11095) + "'", int21 == (-11095));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3463464) + "'", int24 == (-3463464));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 815031976 + "'", int27 == 815031976);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-828646945) + "'", int30 == (-828646945));
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.add(98, (int) (byte) 0);
        int int21 = calculator0.multiply((int) (byte) -1, (int) '4');
        int int24 = calculator0.multiply((-867133439), (-68));
        int int27 = calculator0.subtract((-58), (-1497046780));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-52) + "'", int21 == (-52));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1164468292) + "'", int24 == (-1164468292));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1497046722 + "'", int27 == 1497046722);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.add(568480, 110);
        int int15 = calculator0.subtract(1787380221, 86713457);
        int int18 = calculator0.multiply(8671336, (-1481140680));
        int int21 = calculator0.multiply(178159040, (int) (byte) 0);
        int int24 = calculator0.divide(1512046592, (-173436042));
        int int27 = calculator0.add(0, 9347);
        int int30 = calculator0.multiply((-1308624019), (-220));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1700666764 + "'", int15 == 1700666764);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-161052992) + "'", int18 == (-161052992));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-8) + "'", int24 == (-8));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9347 + "'", int27 == 9347);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 134475348 + "'", int30 == 134475348);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.multiply((int) (short) 10, (-685834));
        int int21 = calculator0.divide((-76), (-3528));
        int int24 = calculator0.multiply(114939, (-417546408));
        int int27 = calculator0.multiply(1448299036, 1429923579);
        int int30 = calculator0.multiply(824566, 1134945146);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6858340) + "'", int18 == (-6858340));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-402023608) + "'", int24 == (-402023608));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1902718604) + "'", int27 == (-1902718604));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1834803396) + "'", int30 == (-1834803396));
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide(100, 98);
        int int21 = calculator0.add((-1140394960), (-747731174));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1888126134) + "'", int21 == (-1888126134));
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
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
        int int33 = calculator0.divide((-173426914), 943052700);
        int int36 = calculator0.divide(7955592, (-88956677));
        int int39 = calculator0.add((-1925360682), (-1115015376));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1254591238 + "'", int39 == 1254591238);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((-110), (-68));
        int int9 = calculator0.divide(1756652153, (-867138628));
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(95, 0);
        int int15 = calculator0.multiply(2243220, 1145169864);
        int int18 = calculator0.multiply(1037464303, (-220));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 95 + "'", int12 == 95);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 757944224 + "'", int15 == 757944224);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-608879972) + "'", int18 == (-608879972));
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.add(98, (int) (byte) 0);
        int int21 = calculator0.subtract((-111), (-111));
        int int24 = calculator0.add(197, (-757113551));
        int int27 = calculator0.subtract((-1364644474), 0);
        int int30 = calculator0.divide(0, 867133782);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-757113354) + "'", int24 == (-757113354));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1364644474) + "'", int27 == (-1364644474));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.divide(210, (-976));
        int int21 = calculator0.add((-109415539), (-111));
        int int24 = calculator0.add((-757113551), (-1807123776));
        int int27 = calculator0.add((-1351018341), 1271879224);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-109415650) + "'", int21 == (-109415650));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1730729969 + "'", int24 == 1730729969);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-79139117) + "'", int27 == (-79139117));
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
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
        int int30 = calculator0.add(1794490544, (-314830347));
        int int33 = calculator0.divide((-883384032), (-1772159544));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1520179488 + "'", int24 == 1520179488);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1479660197 + "'", int30 == 1479660197);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide((-867133439), 9);
        int int12 = calculator0.subtract(0, 867154019);
        int int15 = calculator0.subtract(867154019, (-976));
        int int18 = calculator0.add((-171620289), 51);
        int int21 = calculator0.add((-1333062898), (-1145179180));
        int int24 = calculator0.divide(859792975, 351791);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-867154019) + "'", int12 == (-867154019));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867154995 + "'", int15 == 867154995);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-171620238) + "'", int18 == (-171620238));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1816725218 + "'", int21 == 1816725218);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2444 + "'", int24 == 2444);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.divide(51, 109);
        int int18 = calculator0.add(0, (-1919));
        int int21 = calculator0.subtract(1145179044, (-7567));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1919) + "'", int18 == (-1919));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1145186611 + "'", int21 == 1145186611);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.divide((-100), 32);
        int int21 = calculator0.subtract(520297, 51);
        int int24 = calculator0.multiply(757944224, 568590);
        int int27 = calculator0.multiply((-350777344), 0);
        int int30 = calculator0.divide(1252021680, 7010);
        int int33 = calculator0.add(287137963, 1249740532);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 520246 + "'", int21 == 520246);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1807123776) + "'", int24 == (-1807123776));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 178605 + "'", int30 == 178605);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1536878495 + "'", int33 == 1536878495);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.divide(25, (-1923));
        int int12 = calculator0.multiply((-15300), 34);
        int int15 = calculator0.subtract(1152037484, (-109415563));
        int int18 = calculator0.subtract(1525784179, 1691259644);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-520200) + "'", int12 == (-520200));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1261453047 + "'", int15 == 1261453047);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-165475465) + "'", int18 == (-165475465));
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.multiply(0, 210);
        int int18 = calculator0.add((-23318356), 1037464303);
        int int21 = calculator0.subtract(1322286215, 18);
        int int24 = calculator0.subtract((-917640454), (-845157802));
        int int27 = calculator0.subtract(1572558016, 1779063741);
        int int30 = calculator0.subtract(1037464303, (-46566313));
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1014145947 + "'", int18 == 1014145947);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1322286197 + "'", int21 == 1322286197);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-72482652) + "'", int24 == (-72482652));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-206505725) + "'", int27 == (-206505725));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1084030616 + "'", int30 == 1084030616);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.multiply(37489359, 0);
        int int12 = calculator0.subtract(0, (-2033296844));
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2033296844 + "'", int12 == 2033296844);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.multiply((int) (short) 100, (-152));
        int int18 = calculator0.add(20580, (-241122442));
        int int21 = calculator0.multiply((-173426914), (-112));
        int int24 = calculator0.divide((-7600), (-1556003565));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15200) + "'", int15 == (-15200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-241101862) + "'", int18 == (-241101862));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2051022112) + "'", int21 == (-2051022112));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.add(0, (-1010));
        int int21 = calculator0.multiply(2702, (-404066219));
        int int24 = calculator0.add(1202216254, 2085202125);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1010) + "'", int18 == (-1010));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-865230554) + "'", int21 == (-865230554));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1007548917) + "'", int24 == (-1007548917));
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
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
        int int30 = calculator0.divide((-1154271480), 986801871);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867154019 + "'", int18 == 867154019);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19670 + "'", int21 == 19670);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1448314236) + "'", int24 == (-1448314236));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1424737661) + "'", int27 == (-1424737661));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add(101, (-2020));
        int int12 = calculator0.add(0, 1693566793);
        int int15 = calculator0.divide(86713344, (-1336575495));
        int int18 = calculator0.divide(1323847021, 1012025939);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1919) + "'", int9 == (-1919));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1693566793 + "'", int12 == 1693566793);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.subtract((int) (short) 0, 110);
        int int21 = calculator0.multiply((-867133491), (-9280));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-110) + "'", int18 == (-110));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1769916224) + "'", int21 == (-1769916224));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((int) (short) 10, 867133501);
        int int21 = calculator0.divide((-173435032), (-173436074));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.divide((-3), 86713344);
        int int15 = calculator0.subtract((-520200), (-15));
        int int18 = calculator0.subtract((-596556766), (-873633296));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-520185) + "'", int15 == (-520185));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 277076530 + "'", int18 == 277076530);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((-178319437), (-11095));
        int int15 = calculator0.multiply((-1357151768), 520052);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-178330532) + "'", int12 == (-178330532));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1810467552) + "'", int15 == (-1810467552));
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply(0, 0);
        int int18 = calculator0.multiply(867133667, (-97));
        int int21 = calculator0.subtract((-173426797), 9277);
        int int24 = calculator0.subtract((-112879003), 1810186246);
        int int27 = calculator0.add(15, 1269639304);
        int int30 = calculator0.subtract((-7600), 867133420);
        int int33 = calculator0.subtract((-1555994363), 1012025939);
        int int36 = calculator0.divide((-2033296844), 1809614551);
        int int39 = calculator0.multiply(22, (-2027159188));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1787380221 + "'", int18 == 1787380221);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-173436074) + "'", int21 == (-173436074));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1923065249) + "'", int24 == (-1923065249));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1269639319 + "'", int27 == 1269639319);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-867141020) + "'", int30 == (-867141020));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1726946994 + "'", int33 == 1726946994);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1647829176) + "'", int39 == (-1647829176));
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((-110), (-68));
        int int9 = calculator0.divide(1756652153, (-867138628));
        int int12 = calculator0.divide(378379962, (int) (short) 1);
        int int15 = calculator0.add((-867133431), 110);
        int int18 = calculator0.subtract(406425903, 2052218965);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 378379962 + "'", int12 == 378379962);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133321) + "'", int15 == (-867133321));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1645793062) + "'", int18 == (-1645793062));
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract(568590, 20580);
        int int15 = calculator0.divide(1593893681, (-45247));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 548010 + "'", int12 == 548010);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-35226) + "'", int15 == (-35226));
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.multiply((int) (short) -1, 49164339);
        int int12 = calculator0.divide((-1341734912), (-567));
        int int15 = calculator0.multiply(8671336, (-341775412));
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-49164339) + "'", int9 == (-49164339));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2366375 + "'", int12 == 2366375);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1740666144) + "'", int15 == (-1740666144));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(1145179144, 100);
        int int15 = calculator0.divide(0, (-241122442));
        int int18 = calculator0.subtract((-1020111879), 1713901676);
        int int21 = calculator0.subtract((-1848235514), 296448802);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1145179044 + "'", int12 == 1145179044);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1560953741 + "'", int18 == 1560953741);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2144684316) + "'", int21 == (-2144684316));
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(757717952, 867133515);
        int int15 = calculator0.multiply(211766202, (-910738184));
        int int18 = calculator0.add((-868085942), (-20));
        int int21 = calculator0.divide(0, (-745367358));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-109415563) + "'", int12 == (-109415563));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1140394960) + "'", int15 == (-1140394960));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-868085962) + "'", int18 == (-868085962));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.add((-2146806784), 0);
        int int12 = calculator0.subtract(520297, 96);
        int int15 = calculator0.divide(20580, 780440677);
        int int18 = calculator0.multiply((-1820924517), 1497039730);
        int int21 = calculator0.multiply(1323847021, 8939518);
        int int24 = calculator0.divide((-170066666), 1106724648);
        int int27 = calculator0.add((-1740666144), 1908264022);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2146806784) + "'", int9 == (-2146806784));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520201 + "'", int12 == 520201);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-581169146) + "'", int18 == (-581169146));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-477385434) + "'", int21 == (-477385434));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 167597878 + "'", int27 == 167597878);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.subtract(109, (int) (short) 100);
        int int15 = calculator0.subtract((-36), (-31));
        int int18 = calculator0.subtract((int) (byte) 0, 1494342816);
        int int21 = calculator0.divide(1152037536, 37489359);
        int int24 = calculator0.add(910738184, (-1399144532));
        int int27 = calculator0.divide((-745367358), (-636451305));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1494342816) + "'", int18 == (-1494342816));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30 + "'", int21 == 30);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-488406348) + "'", int24 == (-488406348));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.add(98, (int) (byte) 0);
        int int21 = calculator0.multiply((int) (byte) -1, (int) '4');
        int int24 = calculator0.multiply((-867133439), (-68));
        int int27 = calculator0.multiply(86698157, (-867133666));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-52) + "'", int21 == (-52));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1164468292) + "'", int24 == (-1164468292));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2085965638 + "'", int27 == 2085965638);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide((-867133571), (-7600));
        int int21 = calculator0.subtract((-8085940), 757717952);
        int int24 = calculator0.multiply((-328101312), 1047786071);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 114096 + "'", int18 == 114096);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-765803892) + "'", int21 == (-765803892));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-375835712) + "'", int24 == (-375835712));
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((-1459544222), (-867133611));
        int int15 = calculator0.add((-1494342816), (-49164380));
        int int18 = calculator0.divide((-178330532), 1726946994);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1968289463 + "'", int12 == 1968289463);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1543507196) + "'", int15 == (-1543507196));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }
}

