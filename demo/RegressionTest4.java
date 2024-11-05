import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.add(32, (-9312));
        int int12 = calculator0.divide(3563280, (-442694645));
        int int15 = calculator0.subtract((-1435799528), (-5));
        int int18 = calculator0.add((-39007237), 1810185237);
        int int21 = calculator0.divide((-110758604), 1054226541);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-9280) + "'", int9 == (-9280));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1435799523) + "'", int15 == (-1435799523));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1771178000 + "'", int18 == 1771178000);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.subtract((-596556766), (-257235584));
        int int21 = calculator0.add((-13), 1923);
        int int24 = calculator0.divide(3491, (-1191511595));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-339321182) + "'", int18 == (-339321182));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1910 + "'", int21 == 1910);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide((-1769916224), (-36));
        int int21 = calculator0.add((-9312), (-121));
        int int24 = calculator0.divide((-220), 1);
        int int27 = calculator0.add((-557732664), (-1985610752));
        int int30 = calculator0.divide((-1214486912), 1616550797);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49164339 + "'", int18 == 49164339);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9433) + "'", int21 == (-9433));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-220) + "'", int24 == (-220));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1751623880 + "'", int27 == 1751623880);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.divide(692692992, (-1010));
        int int21 = calculator0.multiply((-36), (-867133571));
        int int24 = calculator0.divide(101, 9);
        int int27 = calculator0.subtract(101, 0);
        int int30 = calculator0.subtract((int) '#', 1311704960);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-685834) + "'", int18 == (-685834));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1152037484 + "'", int21 == 1152037484);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 101 + "'", int27 == 101);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1311704925) + "'", int30 == (-1311704925));
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide((int) (byte) -1, 69);
        int int21 = calculator0.add(822110308, (-88956677));
        int int24 = calculator0.multiply(1058206889, 1754528448);
        int int27 = calculator0.multiply(202130994, 692692);
        int int30 = calculator0.divide(1501859346, 16142423);
        int int33 = calculator0.add((-757717954), 959314071);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 733153631 + "'", int21 == 733153631);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-164656960) + "'", int24 == (-164656960));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1411353752) + "'", int27 == (-1411353752));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 93 + "'", int30 == 93);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 201596117 + "'", int33 == 201596117);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.divide((int) (short) 1, (int) (short) 100);
        int int15 = calculator0.divide(1794490544, 219343644);
        int int18 = calculator0.multiply(1563220444, 1076983947);
        int int21 = calculator0.add((-992053563), 1288062895);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1351969396 + "'", int18 == 1351969396);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 296009332 + "'", int21 == 296009332);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
        int int39 = calculator0.add((-879833140), 1311704960);
        int int42 = calculator0.divide((-1248191799), (-350777444));
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 431871820 + "'", int39 == 431871820);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.multiply((int) (short) 100, (-152));
        int int18 = calculator0.add((-1685643349), (-1336575288));
        int int21 = calculator0.subtract((-117501512), (-88956770));
        int int24 = calculator0.subtract(0, 1044855915);
        int int27 = calculator0.multiply(3325, 2146806474);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15200) + "'", int15 == (-15200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1272748659 + "'", int18 == 1272748659);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-28544742) + "'", int21 == (-28544742));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1044855915) + "'", int24 == (-1044855915));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-104119902) + "'", int27 == (-104119902));
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        int int30 = calculator0.divide((-1772730154), (-1774098035));
        int int33 = calculator0.subtract(1496220010, (-1040126126));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-976) + "'", int18 == (-976));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3410880) + "'", int21 == (-3410880));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1360351360 + "'", int24 == 1360351360);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 202130994 + "'", int27 == 202130994);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1758621160) + "'", int33 == (-1758621160));
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6858340) + "'", int18 == (-6858340));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-402023608) + "'", int24 == (-402023608));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1902718604) + "'", int27 == (-1902718604));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((-97), 96);
        int int15 = calculator0.multiply(1486954504, 911011581);
        int int18 = calculator0.multiply(2003425405, 867133381);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9312) + "'", int12 == (-9312));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1788602392) + "'", int15 == (-1788602392));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1593893681 + "'", int18 == 1593893681);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.subtract((-7955541), (-867133515));
        int int18 = calculator0.divide((-1726989283), (-2118403245));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 859177974 + "'", int15 == 859177974);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        int int30 = calculator0.add((-1248191799), (-2243610));
        int int33 = calculator0.multiply((-724907020), (-855755070));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49164339 + "'", int18 == 49164339);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 867133667 + "'", int21 == 867133667);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1250435409) + "'", int30 == (-1250435409));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-724826392) + "'", int33 == (-724826392));
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', 1);
        int int15 = calculator0.multiply((-111), (-1919));
        int int18 = calculator0.subtract(1810186246, (-867133329));
        int int21 = calculator0.multiply((-88956701), (-8639589));
        int int24 = calculator0.add((-790863895), 361774682);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 213009 + "'", int15 == 213009);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1617647721) + "'", int18 == (-1617647721));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-702444943) + "'", int21 == (-702444943));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-429089213) + "'", int24 == (-429089213));
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
        int int33 = calculator0.add((-1249812224), 21975739);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1227836485) + "'", int33 == (-1227836485));
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.subtract((-867133537), 0);
        int int15 = calculator0.add((-1469865984), 1734308238);
        int int18 = calculator0.divide(1908264022, (-868085942));
        int int21 = calculator0.add(1506752126, (-737836352));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-867133537) + "'", int12 == (-867133537));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 264442254 + "'", int15 == 264442254);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 768915774 + "'", int21 == 768915774);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
        int int30 = calculator0.multiply((-1678282903), 378379961);
        int int33 = calculator0.add((-1300680656), (-45));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-173426914) + "'", int21 == (-173426914));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 86713475 + "'", int24 == 86713475);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 290738210 + "'", int27 == 290738210);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-815312671) + "'", int30 == (-815312671));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1300680701) + "'", int33 == (-1300680701));
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.add(520297, (-867133611));
        int int18 = calculator0.add((-287587), (-3410880));
        int int21 = calculator0.subtract((-101), (-910738285));
        int int24 = calculator0.divide(1467799090, (-1555995532));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-866613314) + "'", int15 == (-866613314));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3698467) + "'", int18 == (-3698467));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 910738184 + "'", int21 == 910738184);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.subtract(96, 97);
        int int15 = calculator0.multiply((-45), (-23318356));
        int int18 = calculator0.multiply(19670, 0);
        int int21 = calculator0.divide(11, 284903989);
        int int24 = calculator0.divide((-522816736), 47859271);
        int int27 = calculator0.subtract((-164358470), (-102173261));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1049326020 + "'", int15 == 1049326020);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10) + "'", int24 == (-10));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-62185209) + "'", int27 == (-62185209));
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.multiply((-68), 110);
        int int18 = calculator0.add((-86), (-867133440));
        int int21 = calculator0.add(0, 110);
        int int24 = calculator0.divide((-488406348), 1153606083);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7480) + "'", int15 == (-7480));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-867133526) + "'", int18 == (-867133526));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 110 + "'", int21 == 110);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        int int33 = calculator0.add((-1665481486), 0);
        int int36 = calculator0.subtract(181871953, (-1555994363));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1665481486) + "'", int33 == (-1665481486));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1737866316 + "'", int36 == 1737866316);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.add((int) (byte) -1, (int) '4');
        int int21 = calculator0.subtract((int) (byte) 1, 32);
        int int24 = calculator0.add(520297, 1810185236);
        int int27 = calculator0.subtract(1940875760, (-1351018341));
        int int30 = calculator0.multiply((-1435799523), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-31) + "'", int21 == (-31));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1810705533 + "'", int24 == 1810705533);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1003073195) + "'", int27 == (-1003073195));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.subtract((-6), 2);
        int int21 = calculator0.divide(4864, (-307225));
        int int24 = calculator0.divide(34, (-902782633));
        int int27 = calculator0.subtract((-757717954), (-1490574368));
        int int30 = calculator0.add((-1773636032), (-710920554));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 732856414 + "'", int27 == 732856414);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1810410710 + "'", int30 == 1810410710);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide((-867133439), 9);
        int int12 = calculator0.subtract(0, 867154019);
        int int15 = calculator0.subtract(867154019, (-976));
        int int18 = calculator0.divide(2118708574, (-867133440));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-867154019) + "'", int12 == (-867154019));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867154995 + "'", int15 == 867154995);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide((-68), (int) (byte) 100);
        int int12 = calculator0.subtract((-111), (int) (short) 10);
        int int15 = calculator0.divide(745957086, 109);
        int int18 = calculator0.add((-88947591), (-1685150444));
        int int21 = calculator0.divide((-11877700), (-794097642));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-121) + "'", int12 == (-121));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6843642 + "'", int15 == 6843642);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1774098035) + "'", int18 == (-1774098035));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
        int int33 = calculator0.divide((-1538240), 1168096256);
        java.lang.Class<?> wildcardClass34 = calculator0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-110), (int) (short) 0);
        int int12 = calculator0.divide(1769916224, (-86713342));
        int int15 = calculator0.multiply(1145179144, (-607867904));
        int int18 = calculator0.subtract((-1281026853), 541554440);
        int int21 = calculator0.subtract((-867051763), (-488406348));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-110) + "'", int9 == (-110));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-20) + "'", int12 == (-20));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1848991744 + "'", int15 == 1848991744);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1822581293) + "'", int18 == (-1822581293));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-378645415) + "'", int21 == (-378645415));
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (short) -1, 867133491);
        int int12 = calculator0.subtract((-86), (-109415563));
        int int15 = calculator0.add(0, 757944224);
        int int18 = calculator0.add(2, 1152037536);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133491) + "'", int9 == (-867133491));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109415477 + "'", int12 == 109415477);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 757944224 + "'", int15 == 757944224);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1152037538 + "'", int18 == 1152037538);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.subtract((int) (short) 0, 110);
        int int21 = calculator0.multiply((-867133491), (-9280));
        int int24 = calculator0.multiply((int) (short) -1, (-1923));
        int int27 = calculator0.divide((-1286025584), (-879505184));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-110) + "'", int18 == (-110));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1769916224) + "'", int21 == (-1769916224));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1923 + "'", int24 == 1923);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.subtract(109, (int) (short) 100);
        int int15 = calculator0.multiply((-101), (int) (short) 10);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1010) + "'", int15 == (-1010));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.multiply(51023374, (-1720612900));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1076459016 + "'", int18 == 1076459016);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) '#', (-9312));
        int int18 = calculator0.multiply(86713455, 1769916224);
        int int21 = calculator0.subtract((-2), 1154271478);
        int int24 = calculator0.add(1889283420, 1152016958);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9347 + "'", int15 == 9347);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1237148864 + "'", int18 == 1237148864);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1154271480) + "'", int21 == (-1154271480));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1253666918) + "'", int24 == (-1253666918));
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.subtract(20580, (-867133439));
        int int21 = calculator0.divide((-609787), (-31));
        int int24 = calculator0.multiply((-50514530), (-867133666));
        int int27 = calculator0.divide((-3698467), 718097088);
        int int30 = calculator0.divide((-170954984), (-1820924517));
        int int33 = calculator0.add((-76265), (-135309308));
        java.lang.Class<?> wildcardClass34 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867154019 + "'", int18 == 867154019);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19670 + "'", int21 == 19670);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1448314236) + "'", int24 == (-1448314236));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-135385573) + "'", int33 == (-135385573));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.subtract(96, 97);
        int int15 = calculator0.multiply((-45), (-23318356));
        int int18 = calculator0.subtract(232346588, (-844637556));
        int int21 = calculator0.add(915784888, 1713901676);
        int int24 = calculator0.subtract((-976544930), (-737836352));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1049326020 + "'", int15 == 1049326020);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1076984144 + "'", int18 == 1076984144);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1665280732) + "'", int21 == (-1665280732));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-238708578) + "'", int24 == (-238708578));
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.add(568480, 110);
        int int15 = calculator0.subtract(1787380221, 86713457);
        int int18 = calculator0.add((-68), (-2146806784));
        int int21 = calculator0.divide((-1813700023), (-50514530));
        int int24 = calculator0.divide((-1145179180), 4864);
        int int27 = calculator0.subtract((-15300), (-37489334));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1700666764 + "'", int15 == 1700666764);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2146806852) + "'", int18 == (-2146806852));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-235439) + "'", int24 == (-235439));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 37474034 + "'", int27 == 37474034);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.multiply((-68), (int) (short) 1);
        int int18 = calculator0.divide(20, (-109415445));
        int int21 = calculator0.add(210, (-96348159));
        int int24 = calculator0.subtract(902771538, (-1185779371));
        int int27 = calculator0.subtract((-2051022112), (-74540096));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-68) + "'", int15 == (-68));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-96347949) + "'", int21 == (-96347949));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2088550909 + "'", int24 == 2088550909);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1976482016) + "'", int27 == (-1976482016));
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.subtract(20580, (-867133439));
        int int21 = calculator0.add((-1769916224), (-2243320));
        int int24 = calculator0.multiply((int) (short) -1, 0);
        int int27 = calculator0.subtract(1154271539, 33);
        int int30 = calculator0.add(1219996744, 2085202125);
        int int33 = calculator0.subtract((-1285850013), 1525784179);
        int int36 = calculator0.divide(887376352, (-1598963920));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867154019 + "'", int18 == 867154019);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1772159544) + "'", int21 == (-1772159544));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1154271506 + "'", int27 == 1154271506);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-989768427) + "'", int30 == (-989768427));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1483333104 + "'", int33 == 1483333104);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.divide((-2020), (-10));
        int int21 = calculator0.add(1271882624, (-2243320));
        int int24 = calculator0.add((-869367269), (-665254));
        int int27 = calculator0.divide(1081531136, 7656);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 202 + "'", int18 == 202);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1269639304 + "'", int21 == 1269639304);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-870032523) + "'", int24 == (-870032523));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 141265 + "'", int27 == 141265);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide(100, (-867133440));
        int int21 = calculator0.subtract((-1154271480), (-1772730154));
        int int24 = calculator0.subtract((-858032), 859792975);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 618458674 + "'", int21 == 618458674);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-860651007) + "'", int24 == (-860651007));
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((-110), (-68));
        int int9 = calculator0.add(6992, 1152037538);
        int int12 = calculator0.divide((-1887134100), (-96348159));
        int int15 = calculator0.add(214132690, 0);
        int int18 = calculator0.divide(1617242353, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1152044530 + "'", int9 == 1152044530);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 214132690 + "'", int15 == 214132690);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31100814 + "'", int18 == 31100814);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.add(33, (-7600));
        int int21 = calculator0.divide((-173436074), 96);
        int int24 = calculator0.subtract(25, 37489359);
        int int27 = calculator0.add(311465950, (-1146310354));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1806625) + "'", int21 == (-1806625));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-37489334) + "'", int24 == (-37489334));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-834844404) + "'", int27 == (-834844404));
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide((-867133439), 9);
        int int12 = calculator0.subtract(0, 867154019);
        int int15 = calculator0.subtract(867154019, (-976));
        int int18 = calculator0.add((-171620289), 51);
        int int21 = calculator0.divide(1269639304, (-1769916127));
        int int24 = calculator0.divide((-1145179180), (-1951649816));
        int int27 = calculator0.add(1236538979, 910738184);
        int int30 = calculator0.multiply(1516144230, 2024869869);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-867154019) + "'", int12 == (-867154019));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867154995 + "'", int15 == 867154995);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-171620238) + "'", int18 == (-171620238));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147277163 + "'", int27 == 2147277163);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-269982098) + "'", int30 == (-269982098));
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.divide(210, (-976));
        int int21 = calculator0.subtract(0, (-110));
        int int24 = calculator0.multiply((-127900925), 744396232);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 110 + "'", int21 == 110);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 67639640 + "'", int24 == 67639640);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.subtract((-1), 9);
        int int18 = calculator0.subtract((-2243320), 86713381);
        int int21 = calculator0.divide((-2115365052), 1754530371);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-88956701) + "'", int18 == (-88956701));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.multiply(37489359, 0);
        int int12 = calculator0.subtract(0, (-2033296844));
        int int15 = calculator0.subtract(1249740532, 11868326);
        int int18 = calculator0.divide(1494342816, 25529447);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2033296844 + "'", int12 == 2033296844);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1237872206 + "'", int15 == 1237872206);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 58 + "'", int18 == 58);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.subtract(96, 97);
        int int15 = calculator0.multiply((-45), (-23318356));
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1049326020 + "'", int15 == 1049326020);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.add(98, (int) (byte) 0);
        int int21 = calculator0.multiply(97, 0);
        int int24 = calculator0.divide((-1876799488), (-1448314236));
        int int27 = calculator0.divide(1515036992, (-1985611728));
        int int30 = calculator0.divide(1481140680, (-101));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-14664759) + "'", int30 == (-14664759));
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((-866613314), 692692992);
        int int18 = calculator0.add(1693566793, 867154995);
        int int21 = calculator0.add(5, 1581845912);
        int int24 = calculator0.add((-6858340), (-7955541));
        // The following exception was thrown during execution in test generation
        try {
            int int27 = calculator0.divide((-2060147631), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1734245508) + "'", int18 == (-1734245508));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1581845917 + "'", int21 == 1581845917);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-14813881) + "'", int24 == (-14813881));
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide(67686400, (-111));
        int int21 = calculator0.divide((-2093236467), (-2084640));
        int int24 = calculator0.divide(1497039730, (-1057369120));
        int int27 = calculator0.divide(37, 246147833);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-609787) + "'", int18 == (-609787));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1004 + "'", int21 == 1004);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.divide((int) ' ', (-101));
        int int15 = calculator0.multiply((int) (short) 0, 870716441);
        int int18 = calculator0.multiply(1013248472, 1733678745);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1355343336) + "'", int18 == (-1355343336));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.divide((-3), 86713344);
        int int15 = calculator0.multiply(164584658, 870716441);
        int int18 = calculator0.divide((-567), (-1539251552));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1663858818 + "'", int15 == 1663858818);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide((-867133439), 9);
        int int12 = calculator0.subtract(0, 867154019);
        int int15 = calculator0.subtract(867154019, (-976));
        int int18 = calculator0.add((-171620289), 51);
        int int21 = calculator0.divide(1269639304, (-1769916127));
        int int24 = calculator0.add(272082650, 865643461);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-867154019) + "'", int12 == (-867154019));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867154995 + "'", int15 == 867154995);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-171620238) + "'", int18 == (-171620238));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1137726111 + "'", int24 == 1137726111);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.divide(51, 109);
        int int18 = calculator0.add(0, (-1919));
        int int21 = calculator0.add((-1665), (-59));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1919) + "'", int18 == (-1919));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1724) + "'", int21 == (-1724));
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.divide(692692992, (-1010));
        int int21 = calculator0.divide(1249740532, 2125191714);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-685834) + "'", int18 == (-685834));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide((int) (byte) -1, 69);
        int int21 = calculator0.add(822110308, (-88956677));
        int int24 = calculator0.multiply(1058206889, 1754528448);
        int int27 = calculator0.multiply(202130994, 692692);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 733153631 + "'", int21 == 733153631);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-164656960) + "'", int24 == (-164656960));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1411353752) + "'", int27 == (-1411353752));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        int int21 = calculator0.divide((-1010), 86713455);
        int int24 = calculator0.add((-173436074), (int) ' ');
        int int27 = calculator0.subtract(34, (-88956677));
        int int30 = calculator0.add(1108159148, (-867133431));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-173436042) + "'", int24 == (-173436042));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 88956711 + "'", int27 == 88956711);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 241025717 + "'", int30 == 241025717);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.divide((-3), 86713344);
        int int15 = calculator0.divide((-15300), 867133511);
        int int18 = calculator0.add(1152016958, 867142838);
        int int21 = calculator0.divide(0, 570610471);
        int int24 = calculator0.divide((-964732924), 867133491);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2019159796 + "'", int18 == 2019159796);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
        int int30 = calculator0.divide(283674500, (-929987309));
        int int33 = calculator0.add((-1199269321), (-1694055823));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1520179488 + "'", int24 == 1520179488);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1401642152 + "'", int33 == 1401642152);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.divide(0, (-1769916224));
        int int12 = calculator0.add((-9280), 2243220);
        int int15 = calculator0.subtract(1940794770, 1671749932);
        int int18 = calculator0.add(273998385, (-178330532));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2233940 + "'", int12 == 2233940);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 269044838 + "'", int15 == 269044838);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 95667853 + "'", int18 == 95667853);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-110), (int) (short) 0);
        int int12 = calculator0.add(21, (-1408776227));
        int int15 = calculator0.subtract(1987895262, (-20));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-110) + "'", int9 == (-110));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1408776206) + "'", int12 == (-1408776206));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1987895282 + "'", int15 == 1987895282);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
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
        int int30 = calculator0.multiply((-845157802), 1968577402);
        int int33 = calculator0.multiply((-187), (-1010));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-173426797) + "'", int18 == (-173426797));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 153 + "'", int21 == 153);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1481140680) + "'", int24 == (-1481140680));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 282034071 + "'", int27 == 282034071);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-489636100) + "'", int30 == (-489636100));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 188870 + "'", int33 == 188870);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        int int21 = calculator0.divide((-1010), 1152037484);
        int int24 = calculator0.divide(1515036992, 66422468);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 22 + "'", int24 == 22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply((-76), (-7480));
        int int9 = calculator0.add((-1951649816), 1754528448);
        int int12 = calculator0.divide(109415477, (-97));
        int int15 = calculator0.add(119647596, 568480);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 568480 + "'", int6 == 568480);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-197121368) + "'", int9 == (-197121368));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1127994) + "'", int12 == (-1127994));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 120216076 + "'", int15 == 120216076);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
        int int30 = calculator0.multiply(1237147755, (-172530899));
        int int33 = calculator0.divide((-1145651032), 692692);
        int int36 = calculator0.add(0, 791316488);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 346346496 + "'", int18 == 346346496);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1237148864) + "'", int21 == (-1237148864));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 29811430 + "'", int27 == 29811430);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2045750321) + "'", int30 == (-2045750321));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1653) + "'", int33 == (-1653));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 791316488 + "'", int36 == 791316488);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) '#', (-9312));
        int int18 = calculator0.multiply(86713455, 1769916224);
        int int21 = calculator0.subtract((-121), 1503190044);
        int int24 = calculator0.subtract((-127900911), 14);
        int int27 = calculator0.subtract((-127527494), (-14887285));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9347 + "'", int15 == 9347);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1237148864 + "'", int18 == 1237148864);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1503190165) + "'", int21 == (-1503190165));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-127900925) + "'", int24 == (-127900925));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-112640209) + "'", int27 == (-112640209));
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        int int30 = calculator0.multiply(95667853, (-1152037337));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-178319437) + "'", int24 == (-178319437));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 493715456 + "'", int27 == 493715456);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1867303557) + "'", int30 == (-1867303557));
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((int) '#', (int) ' ');
        int int18 = calculator0.add(34, (-1010));
        int int21 = calculator0.multiply(568480, (-6));
        int int24 = calculator0.divide(1237148863, (-1772159544));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-976) + "'", int18 == (-976));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3410880) + "'", int21 == (-3410880));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.add(98, (int) (byte) 0);
        int int21 = calculator0.subtract((-111), (-111));
        int int24 = calculator0.add(197, (-757113551));
        int int27 = calculator0.subtract((-1889283420), 0);
        int int30 = calculator0.multiply((-1992851744), 1486954452);
        int int33 = calculator0.subtract((-701166955), (-685328092));
        int int36 = calculator0.add((-1121825728), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-757113354) + "'", int24 == (-757113354));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1889283420) + "'", int27 == (-1889283420));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 624046464 + "'", int30 == 624046464);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-15838863) + "'", int33 == (-15838863));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1121825728) + "'", int36 == (-1121825728));
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
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
        int int33 = calculator0.add((-586398088), 665);
        int int36 = calculator0.add((-1537712071), 6);
        int int39 = calculator0.subtract((-405121191), 49170244);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-586397423) + "'", int33 == (-586397423));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1537712065) + "'", int36 == (-1537712065));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-454291435) + "'", int39 == (-454291435));
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.subtract(867133420, 1269639304);
        int int21 = calculator0.subtract((-2146806784), (-1359151923));
        int int24 = calculator0.add(17, (-34682070));
        int int27 = calculator0.divide(917629283, 76);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-402505884) + "'", int18 == (-402505884));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-787654861) + "'", int21 == (-787654861));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-34682053) + "'", int24 == (-34682053));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12074069 + "'", int27 == 12074069);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.multiply((-86713457), 692692992);
        int int21 = calculator0.divide(867133667, (int) (byte) 100);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8671336 + "'", int21 == 8671336);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.divide((-3), 86713344);
        int int15 = calculator0.multiply(164584658, 870716441);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1663858818 + "'", int15 == 1663858818);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.add(867133667, (-121));
        int int21 = calculator0.subtract(0, (-1908264058));
        int int24 = calculator0.multiply((-685834), (-78));
        int int27 = calculator0.multiply(502657300, (-380871040));
        int int30 = calculator0.divide((-59149533), (-675399327));
        int int33 = calculator0.add(0, 1978473568);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133546 + "'", int18 == 867133546);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1908264058 + "'", int21 == 1908264058);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 53495052 + "'", int24 == 53495052);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 258859520 + "'", int27 == 258859520);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1978473568 + "'", int33 == 1978473568);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.subtract((-1), 9);
        int int18 = calculator0.multiply(18, (-867138628));
        int int21 = calculator0.subtract((-1486954551), (-178330532));
        int int24 = calculator0.multiply(1137, 7656);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1571373880 + "'", int18 == 1571373880);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1308624019) + "'", int21 == (-1308624019));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8704872 + "'", int24 == 8704872);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide((-1769916224), (-36));
        int int21 = calculator0.add((-9312), (-121));
        int int24 = calculator0.multiply((-934840515), 1525782115);
        int int27 = calculator0.add(859792975, 0);
        int int30 = calculator0.divide(0, (-1279652833));
        int int33 = calculator0.add(1965697075, (-765803892));
        int int36 = calculator0.add((-110), (-1769916123));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49164339 + "'", int18 == 49164339);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9433) + "'", int21 == (-9433));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 99474071 + "'", int24 == 99474071);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 859792975 + "'", int27 == 859792975);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1199893183 + "'", int33 == 1199893183);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1769916233) + "'", int36 == (-1769916233));
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.subtract(76, (-867133439));
        int int18 = calculator0.divide(1219996744, 1219996744);
        int int21 = calculator0.subtract(213009, (-415711797));
        int int24 = calculator0.add(583692980, (-535833709));
        int int27 = calculator0.divide(0, 5419);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133515 + "'", int15 == 867133515);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 415924806 + "'", int21 == 415924806);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 47859271 + "'", int24 == 47859271);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.multiply((-240317368), 1600482450);
        int int18 = calculator0.subtract((-453808581), 887406137);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1715953936 + "'", int15 == 1715953936);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1341214718) + "'", int18 == (-1341214718));
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.subtract(109, (int) (short) 100);
        int int15 = calculator0.subtract((-36), (-31));
        int int18 = calculator0.subtract((int) (byte) 0, 1494342816);
        int int21 = calculator0.add((-1145651066), 1170137828);
        int int24 = calculator0.add(2016961242, 2052218965);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1494342816) + "'", int18 == (-1494342816));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 24486762 + "'", int21 == 24486762);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-225787089) + "'", int24 == (-225787089));
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (short) -1, 867133491);
        int int12 = calculator0.multiply((-111), (-3528));
        int int15 = calculator0.divide(221294303, (-37489334));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133491) + "'", int9 == (-867133491));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 391608 + "'", int12 == 391608);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.divide(30, (-934840515));
        int int21 = calculator0.add(173435032, 1271869877);
        int int24 = calculator0.subtract(1486954504, 50);
        int int27 = calculator0.divide(867153943, 768915774);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1445304909 + "'", int21 == 1445304909);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1486954454 + "'", int24 == 1486954454);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(757717952, 867133515);
        int int15 = calculator0.divide((-1738066976), 866523750);
        int int18 = calculator0.multiply((-867158169), (-1539825345));
        int int21 = calculator0.add(2130112384, 906080874);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-109415563) + "'", int12 == (-109415563));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1184241319) + "'", int18 == (-1184241319));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1258774038) + "'", int21 == (-1258774038));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
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
        int int33 = calculator0.divide(33, (-1448314236));
        int int36 = calculator0.subtract(854334341, 273998385);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 580335956 + "'", int36 == 580335956);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.divide(210, (-976));
        int int21 = calculator0.add((-109415539), (-111));
        int int24 = calculator0.subtract((-6867620), (-341775412));
        int int27 = calculator0.add(891342897, 822099432);
        int int30 = calculator0.subtract((-134281536), (-869367269));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-109415650) + "'", int21 == (-109415650));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 334907792 + "'", int24 == 334907792);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1713442329 + "'", int27 == 1713442329);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 735085733 + "'", int30 == 735085733);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.divide(2233940, (-86713551));
        int int15 = calculator0.divide(365037960, 1497046722);
        int int18 = calculator0.subtract((-846679733), 264442254);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1111121987) + "'", int18 == (-1111121987));
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
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
        int int30 = calculator0.add((-1700666664), (-934840515));
        int int33 = calculator0.divide((-1845536552), (-910738153));
        int int36 = calculator0.multiply(67686496, (-1175891336));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 37489359 + "'", int27 == 37489359);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1659460117 + "'", int30 == 1659460117);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1103074048) + "'", int36 == (-1103074048));
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.divide(25, (-1923));
        int int12 = calculator0.multiply((-15300), 34);
        int int15 = calculator0.subtract(1152037484, (-109415563));
        int int18 = calculator0.divide(1810186246, (-78));
        int int21 = calculator0.divide((int) (short) 100, (-214132468));
        int int24 = calculator0.divide(1269639319, (-382875265));
        int int27 = calculator0.divide(1152016958, 365037960);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-520200) + "'", int12 == (-520200));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1261453047 + "'", int15 == 1261453047);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-23207515) + "'", int18 == (-23207515));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
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
        int int30 = calculator0.multiply(867133591, (-1984132447));
        int int33 = calculator0.divide((-1685643349), (-989528052));
        int int36 = calculator0.divide(0, 735085733);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7955592 + "'", int27 == 7955592);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1382667017) + "'", int30 == (-1382667017));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
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
        int int42 = calculator0.multiply((-1729226194), 887396705);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-388667026) + "'", int42 == (-388667026));
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.multiply((-9312), (-9312));
        int int15 = calculator0.subtract(867133515, (-6));
        int int18 = calculator0.divide((-883378176), 228021803);
        int int21 = calculator0.divide(779500222, 280533860);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713344 + "'", int12 == 86713344);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133521 + "'", int15 == 867133521);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide(692692992, 2);
        int int21 = calculator0.divide(1237148864, (-1));
        int int24 = calculator0.divide((-901948644), 1978473568);
        int int27 = calculator0.add(0, (-1404303256));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 346346496 + "'", int18 == 346346496);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1237148864) + "'", int21 == (-1237148864));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1404303256) + "'", int27 == (-1404303256));
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.subtract(0, 867133515);
        int int18 = calculator0.divide((-1343122304), (-262917126));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133515) + "'", int15 == (-867133515));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.add(520297, (-867133611));
        int int18 = calculator0.subtract(0, 0);
        int int21 = calculator0.subtract((-1984132447), 897879296);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-866613314) + "'", int15 == (-866613314));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1412955553 + "'", int21 == 1412955553);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
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
        int int30 = calculator0.multiply(867133591, (-1984132447));
        int int33 = calculator0.multiply(1618313833, (-1849536748));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7955592 + "'", int27 == 7955592);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1382667017) + "'", int30 == (-1382667017));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 419338036 + "'", int33 == 419338036);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.divide(210, (-976));
        int int21 = calculator0.subtract(0, (-110));
        int int24 = calculator0.divide(213009, (-241122442));
        int int27 = calculator0.divide((-568590), 1495828402);
        int int30 = calculator0.subtract(0, 1237148811);
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 110 + "'", int21 == 110);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1237148811) + "'", int30 == (-1237148811));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(20580, (-685834));
        int int9 = calculator0.subtract(559873741, 1771863899);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-665254) + "'", int6 == (-665254));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1211990158) + "'", int9 == (-1211990158));
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
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
        int int36 = calculator0.subtract(18, 109);
        java.lang.Class<?> wildcardClass37 = calculator0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-91) + "'", int36 == (-91));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.add((-2146806784), 0);
        int int12 = calculator0.subtract(520297, 96);
        int int15 = calculator0.add((-20), (-68));
        int int18 = calculator0.subtract(1497046722, 6992);
        int int21 = calculator0.add(346346496, 1713901676);
        int int24 = calculator0.subtract(84, 1678282987);
        int int27 = calculator0.subtract((-1160010088), 3491);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2146806784) + "'", int9 == (-2146806784));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520201 + "'", int12 == 520201);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-88) + "'", int15 == (-88));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1497039730 + "'", int18 == 1497039730);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2060248172 + "'", int21 == 2060248172);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1678282903) + "'", int24 == (-1678282903));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1160013579) + "'", int27 == (-1160013579));
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide((-68), (int) (byte) 100);
        int int12 = calculator0.subtract((-111), (int) (short) 10);
        int int15 = calculator0.multiply((-7600), (-34));
        int int18 = calculator0.multiply(1527277189, (-2131780436));
        int int21 = calculator0.add(867154019, (-2146806852));
        int int24 = calculator0.add(321805482, 1236538979);
        int int27 = calculator0.divide(1820836164, 4208290);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-121) + "'", int12 == (-121));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 258400 + "'", int15 == 258400);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2118708572 + "'", int18 == 2118708572);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1279652833) + "'", int21 == (-1279652833));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1558344461 + "'", int24 == 1558344461);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 432 + "'", int27 == 432);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.subtract(96, 97);
        int int15 = calculator0.multiply((-45), (-23318356));
        int int18 = calculator0.divide((-1322291616), 25);
        int int21 = calculator0.divide(15, 1323847021);
        int int24 = calculator0.subtract(1152037484, 98);
        int int27 = calculator0.divide(1581845912, (-1685448220));
        int int30 = calculator0.multiply(1237872206, 1444218927);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1049326020 + "'", int15 == 1049326020);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-52891664) + "'", int18 == (-52891664));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1152037386 + "'", int24 == 1152037386);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 262451282 + "'", int30 == 262451282);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.multiply((-68), 110);
        int int18 = calculator0.add(1371450554, (-49164339));
        int int21 = calculator0.multiply((-1964453610), 86713455);
        int int24 = calculator0.add((-207), (-2019171204));
        int int27 = calculator0.add(623809483, (-1503165555));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7480) + "'", int15 == (-7480));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1322286215 + "'", int18 == 1322286215);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2062827382) + "'", int21 == (-2062827382));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2019171411) + "'", int24 == (-2019171411));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-879356072) + "'", int27 == (-879356072));
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.add((int) (byte) -1, (int) '4');
        int int21 = calculator0.divide(101, (-101));
        int int24 = calculator0.add(1810185236, (int) (byte) 1);
        int int27 = calculator0.subtract(867133591, (-2146806852));
        int int30 = calculator0.multiply(441187696, (-867133329));
        int int33 = calculator0.multiply((-545574417), 1126964223);
        int int36 = calculator0.divide(244944630, 1146662145);
        java.lang.Class<?> wildcardClass37 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1810185237 + "'", int24 == 1810185237);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1281026853) + "'", int27 == (-1281026853));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-127048816) + "'", int30 == (-127048816));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1139871215) + "'", int33 == (-1139871215));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.subtract((int) (byte) -1, 0);
        int int21 = calculator0.divide((-9312), 867133515);
        int int24 = calculator0.add(929193984, 1271879224);
        int int27 = calculator0.add((-97460156), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2093894088) + "'", int24 == (-2093894088));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-97460156) + "'", int27 == (-97460156));
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.multiply((int) (short) -1, 49164339);
        int int12 = calculator0.add(86698157, 21975739);
        int int15 = calculator0.add((-346346486), (-1555994242));
        int int18 = calculator0.multiply(0, 365037960);
        int int21 = calculator0.multiply(258400, (-2453011));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-49164339) + "'", int9 == (-49164339));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 108673896 + "'", int12 == 108673896);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1902340728) + "'", int15 == (-1902340728));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1797117408 + "'", int21 == 1797117408);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((-152), (-867154019));
        int int24 = calculator0.divide(1908264058, (-1555994343));
        int int27 = calculator0.multiply(408021504, 5);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1336575288) + "'", int21 == (-1336575288));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2040107520 + "'", int27 == 2040107520);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.subtract(76, (-867133439));
        int int18 = calculator0.subtract((-976), 4213);
        int int21 = calculator0.divide(346346496, (-844637556));
        int int24 = calculator0.multiply((-11095), (-1145179180));
        int int27 = calculator0.subtract(1940875760, 1991566622);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133515 + "'", int15 == 867133515);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-5189) + "'", int18 == (-5189));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1249740532 + "'", int24 == 1249740532);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-50690862) + "'", int27 == (-50690862));
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
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
        int int39 = calculator0.add((-110), 956080105);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 956079995 + "'", int39 == 956079995);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.divide(0, (-1769916224));
        int int12 = calculator0.add((-9280), 2243220);
        int int15 = calculator0.subtract((-23207515), 1357146709);
        int int18 = calculator0.subtract((-867133666), 109411264);
        int int21 = calculator0.multiply(2002932831, (-2144031865));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2233940 + "'", int12 == 2233940);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1380354224) + "'", int15 == (-1380354224));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-976544930) + "'", int18 == (-976544930));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1182921497 + "'", int21 == 1182921497);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.multiply((-587860616), (-322124534));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 589360816 + "'", int18 == 589360816);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
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
        int int30 = calculator0.divide(0, (-4864));
        int int33 = calculator0.subtract((-719722240), (-1136614922));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 416892682 + "'", int33 == 416892682);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.add(32, (-9312));
        int int12 = calculator0.divide(3563280, (-442694645));
        int int15 = calculator0.add((-341775360), (-1556003565));
        int int18 = calculator0.multiply((-228020666), 902777444);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-9280) + "'", int9 == (-9280));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1897778925) + "'", int15 == (-1897778925));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1541295960 + "'", int18 == 1541295960);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
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
        int int36 = calculator0.subtract(352535033, 58);
        int int39 = calculator0.divide(0, (-601961808));
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 352534975 + "'", int36 == 352534975);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
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
        int int33 = calculator0.add((-1982733394), 1676364944);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-306368450) + "'", int33 == (-306368450));
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.divide(210, (-976));
        int int21 = calculator0.add((-109415539), (-111));
        int int24 = calculator0.subtract((-6867620), (-341775412));
        int int27 = calculator0.divide(1700666764, (-1685643349));
        int int30 = calculator0.add(1017529929, 642758100);
        int int33 = calculator0.subtract((-1984132447), (-702203532));
        // The following exception was thrown during execution in test generation
        try {
            int int36 = calculator0.divide(21613, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-109415650) + "'", int21 == (-109415650));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 334907792 + "'", int24 == 334907792);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1660288029 + "'", int30 == 1660288029);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1281928915) + "'", int33 == (-1281928915));
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide((-1769916224), (-36));
        int int21 = calculator0.add((-9312), (-121));
        int int24 = calculator0.multiply((int) (short) -1, 0);
        int int27 = calculator0.add(867133546, (int) '#');
        int int30 = calculator0.add(0, 1367258876);
        int int33 = calculator0.multiply(2064, (-173436074));
        int int36 = calculator0.multiply(452488960, 1702058646);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49164339 + "'", int18 == 49164339);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9433) + "'", int21 == (-9433));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 867133581 + "'", int27 == 867133581);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1367258876 + "'", int30 == 1367258876);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1489771168) + "'", int33 == (-1489771168));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 26675712 + "'", int36 == 26675712);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
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
        int int33 = calculator0.subtract((-781049314), (-79882359));
        int int36 = calculator0.divide((-757113354), (-108673964));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-701166955) + "'", int33 == (-701166955));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 6 + "'", int36 == 6);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.divide(30, (-934840515));
        int int21 = calculator0.add(173435032, 1271869877);
        int int24 = calculator0.subtract(109415477, 4213);
        int int27 = calculator0.add((-206361130), 41650243);
        int int30 = calculator0.subtract((-2019171204), (-1102996576));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1445304909 + "'", int21 == 1445304909);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 109411264 + "'", int24 == 109411264);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-164710887) + "'", int27 == (-164710887));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-916174628) + "'", int30 == (-916174628));
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = calculator0.multiply((-46), (-152));
        int int27 = calculator0.divide(193740192, 3491);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6992 + "'", int24 == 6992);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 55497 + "'", int27 == 55497);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) ' ', (int) (byte) 100);
        int int15 = calculator0.subtract((-207), 86713344);
        int int18 = calculator0.divide((-794097642), 7955592);
        int int21 = calculator0.subtract((-636451253), 188870);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-68) + "'", int12 == (-68));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713551) + "'", int15 == (-86713551));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-99) + "'", int18 == (-99));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-636640123) + "'", int21 == (-636640123));
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
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
        int int30 = calculator0.subtract(2064, 210);
        int int33 = calculator0.subtract(1077000377, (-1359151923));
        int int36 = calculator0.multiply(359594049, 1154271506);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-110) + "'", int18 == (-110));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1769916224) + "'", int21 == (-1769916224));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1923 + "'", int24 == 1923);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1435799528) + "'", int27 == (-1435799528));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1854 + "'", int30 == 1854);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1858814996) + "'", int33 == (-1858814996));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1165722222) + "'", int36 == (-1165722222));
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
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
        int int30 = calculator0.add((-132), 757717952);
        int int33 = calculator0.subtract((-845157802), 7955592);
        int int36 = calculator0.add(867133667, 1258058047);
        int int39 = calculator0.multiply(1935, 827319272);
        java.lang.Class<?> wildcardClass40 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867154019 + "'", int18 == 867154019);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19670 + "'", int21 == 19670);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1448314236) + "'", int24 == (-1448314236));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-56) + "'", int27 == (-56));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 757717820 + "'", int30 == 757717820);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-853113394) + "'", int33 == (-853113394));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2125191714 + "'", int36 == 2125191714);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1160010088) + "'", int39 == (-1160010088));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide((-68), (int) (byte) 100);
        int int12 = calculator0.subtract((-111), (int) (short) 10);
        int int15 = calculator0.multiply((-7600), (-34));
        int int18 = calculator0.multiply(1527277189, (-2131780436));
        int int21 = calculator0.add(867154019, (-2146806852));
        int int24 = calculator0.add(321805482, 1236538979);
        int int27 = calculator0.divide(1421, 1013244259);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-121) + "'", int12 == (-121));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 258400 + "'", int15 == 258400);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2118708572 + "'", int18 == 2118708572);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1279652833) + "'", int21 == (-1279652833));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1558344461 + "'", int24 == 1558344461);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract(9, (-100));
        int int15 = calculator0.divide(76, 692692992);
        int int18 = calculator0.add((int) 'a', (-867133439));
        int int21 = calculator0.add(69, (-3528));
        int int24 = calculator0.subtract(21975739, (-932693954));
        int int27 = calculator0.subtract(275201967, 1427130624);
        int int30 = calculator0.subtract(611584959, 1940794770);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109 + "'", int12 == 109);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-867133342) + "'", int18 == (-867133342));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3459) + "'", int21 == (-3459));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 954669693 + "'", int24 == 954669693);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1151928657) + "'", int27 == (-1151928657));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1329209811) + "'", int30 == (-1329209811));
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', 1);
        int int15 = calculator0.multiply((-111), (-1919));
        int int18 = calculator0.subtract(1810186246, (-867133329));
        int int21 = calculator0.multiply((-88956701), (-8639589));
        int int24 = calculator0.subtract((-917640454), (-11095));
        int int27 = calculator0.divide(689862208, 1691259644);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 213009 + "'", int15 == 213009);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1617647721) + "'", int18 == (-1617647721));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-702444943) + "'", int21 == (-702444943));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-917629359) + "'", int24 == (-917629359));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide(100, (-867133440));
        int int21 = calculator0.multiply((-1769916127), 843);
        int int24 = calculator0.subtract((-935719672), 641961972);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1685643349) + "'", int21 == (-1685643349));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1577681644) + "'", int24 == (-1577681644));
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.subtract((-7955541), (-867133515));
        int int18 = calculator0.add((-867051763), (-1567474935));
        int int21 = calculator0.add((-403723706), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 859177974 + "'", int15 == 859177974);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1860440598 + "'", int18 == 1860440598);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-403723706) + "'", int21 == (-403723706));
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
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
        int int33 = calculator0.subtract(69, (-1110310644));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1110310713 + "'", int33 == 1110310713);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(20580, (-685834));
        int int9 = calculator0.add(1152037536, 2);
        int int12 = calculator0.add(3563280, (-685834));
        int int15 = calculator0.multiply((-170066666), (-1902332367));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-665254) + "'", int6 == (-665254));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1152037538 + "'", int9 == 1152037538);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2877446 + "'", int12 == 2877446);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1734208202) + "'", int15 == (-1734208202));
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
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
        int int30 = calculator0.add((-1248191799), (-2243610));
        int int33 = calculator0.multiply((-45), 393135424);
        int int36 = calculator0.divide((-1788169344), (-1769916123));
        int int39 = calculator0.add(1811098504, 1612493414);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49164339 + "'", int18 == 49164339);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 867133667 + "'", int21 == 867133667);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1250435409) + "'", int30 == (-1250435409));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-511224896) + "'", int33 == (-511224896));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-871375378) + "'", int39 == (-871375378));
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide(67686400, (-111));
        int int21 = calculator0.add((-3528), 109413727);
        int int24 = calculator0.divide(2085202125, (-217396992));
        int int27 = calculator0.add(727845816, (-162592768));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-609787) + "'", int18 == (-609787));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 109410199 + "'", int21 == 109410199);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-9) + "'", int24 == (-9));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 565253048 + "'", int27 == 565253048);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((int) (short) 10, 867133501);
        int int21 = calculator0.add(110, 20);
        int int24 = calculator0.divide(665, 1004);
        int int27 = calculator0.subtract(1580921303, (-1269671715));
        int int30 = calculator0.multiply((-1992851744), 241122652);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 130 + "'", int21 == 130);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1444374278) + "'", int27 == (-1444374278));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-565380992) + "'", int30 == (-565380992));
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-110), (int) (short) 0);
        int int12 = calculator0.divide(1769916224, (-86713342));
        int int15 = calculator0.multiply(1145179144, (-607867904));
        int int18 = calculator0.add(72529, 1618241304);
        int int21 = calculator0.add((-1677273388), (-1577681644));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-110) + "'", int9 == (-110));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-20) + "'", int12 == (-20));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1848991744 + "'", int15 == 1848991744);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1618313833 + "'", int18 == 1618313833);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1040012264 + "'", int21 == 1040012264);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.divide((-58), (int) '#');
        int int12 = calculator0.subtract(1663900812, 0);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1663900812 + "'", int12 == 1663900812);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.divide((int) (short) 1, (int) (short) 100);
        int int15 = calculator0.divide(1794490544, 219343644);
        int int18 = calculator0.multiply(1563220444, 1076983947);
        int int21 = calculator0.add(867154019, 17);
        int int24 = calculator0.divide((-16428397), 1771178000);
        int int27 = calculator0.subtract((-1316560760), 4864);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1351969396 + "'", int18 == 1351969396);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 867154036 + "'", int21 == 867154036);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1316565624) + "'", int27 == (-1316565624));
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (short) -1, 867133491);
        int int12 = calculator0.multiply((-111), (-3528));
        int int15 = calculator0.add((-36), 1908264058);
        int int18 = calculator0.divide(1897078486, 86605184);
        int int21 = calculator0.multiply(1563220444, (-520200));
        int int24 = calculator0.subtract(960198, 1154271574);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133491) + "'", int9 == (-867133491));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 391608 + "'", int12 == 391608);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1908264022 + "'", int15 == 1908264022);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 21 + "'", int18 == 21);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 358019360 + "'", int21 == 358019360);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1153311376) + "'", int24 == (-1153311376));
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
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
        int int33 = calculator0.multiply(520297, (-178319437));
        int int36 = calculator0.add((-1433763485), 0);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 815415403 + "'", int33 == 815415403);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1433763485) + "'", int36 == (-1433763485));
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) ' ', (int) (byte) 100);
        int int15 = calculator0.add(757717952, (-867133491));
        int int18 = calculator0.add(0, 63783449);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-68) + "'", int12 == (-68));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-109415539) + "'", int15 == (-109415539));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 63783449 + "'", int18 == 63783449);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((-110), (-68));
        int int9 = calculator0.add((-97), 8671369);
        int int12 = calculator0.subtract((-1261453047), (-1526391902));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8671272 + "'", int9 == 8671272);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 264938855 + "'", int12 == 264938855);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide(1219996744, 109415572);
        int int21 = calculator0.divide(1769916224, (-24578));
        int int24 = calculator0.subtract(130, (-1145651032));
        int int27 = calculator0.add((-173), (-412970881));
        int int30 = calculator0.subtract((-1152037337), (-660735808));
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-72012) + "'", int21 == (-72012));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1145651162 + "'", int24 == 1145651162);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-412971054) + "'", int27 == (-412971054));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-491301529) + "'", int30 == (-491301529));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.add(33, (-7600));
        int int21 = calculator0.divide((-173436074), 96);
        int int24 = calculator0.divide((-1806625), (-1559826432));
        int int27 = calculator0.multiply((-867133329), (-86));
        int int30 = calculator0.add(151369422, 1838149828);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1806625) + "'", int21 == (-1806625));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1559022262 + "'", int27 == 1559022262);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1989519250 + "'", int30 == 1989519250);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
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
        int int33 = calculator0.add(358019360, (-1293640847));
        int int36 = calculator0.divide(0, (-1546626620));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-935621487) + "'", int33 == (-935621487));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.multiply((int) (short) 100, (-152));
        int int18 = calculator0.add(20580, (-241122442));
        int int21 = calculator0.multiply((-173426914), (-112));
        int int24 = calculator0.subtract(765139659, (-602199867));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15200) + "'", int15 == (-15200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-241101862) + "'", int18 == (-241101862));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2051022112) + "'", int21 == (-2051022112));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1367339526 + "'", int24 == 1367339526);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide(67686400, (-111));
        int int21 = calculator0.divide((-2093236467), (-2084640));
        int int24 = calculator0.divide(2016961242, (int) (short) -1);
        int int27 = calculator0.subtract(1202216254, (-2146806784));
        int int30 = calculator0.subtract(86713457, 8939518);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-609787) + "'", int18 == (-609787));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1004 + "'", int21 == 1004);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2016961242) + "'", int24 == (-2016961242));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-945944258) + "'", int27 == (-945944258));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 77773939 + "'", int30 == 77773939);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-110), (-867133491));
        int int12 = calculator0.multiply(1805776112, 78);
        int int15 = calculator0.add((-596556766), 0);
        int int18 = calculator0.multiply(1481140680, 1075835537);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 867133381 + "'", int9 == 867133381);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-883384032) + "'", int12 == (-883384032));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-596556766) + "'", int15 == (-596556766));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1144715848 + "'", int18 == 1144715848);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((-110), (-68));
        int int9 = calculator0.add(6992, 1152037538);
        int int12 = calculator0.divide((-1887134100), (-96348159));
        int int15 = calculator0.divide((-761355104), 1519650529);
        int int18 = calculator0.divide(0, (-1820924396));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1152044530 + "'", int9 == 1152044530);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide(0, (-2037396585));
        int int12 = calculator0.subtract(0, (-675399327));
        int int15 = calculator0.multiply(1371450554, (-1145179290));
        int int18 = calculator0.subtract(0, 1479660197);
        int int21 = calculator0.divide(238042833, 1174324143);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 675399327 + "'", int12 == 675399327);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-213950436) + "'", int15 == (-213950436));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1479660197) + "'", int18 == (-1479660197));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
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
        int int30 = calculator0.divide(502657300, (-425848194));
        int int33 = calculator0.subtract((-1925360682), 850335808);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1271879224 + "'", int21 == 1271879224);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 287137964 + "'", int24 == 287137964);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1145651032) + "'", int27 == (-1145651032));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1519270806 + "'", int33 == 1519270806);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((-178319437), (-11095));
        int int15 = calculator0.subtract((-1740666144), (-1556003565));
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-178330532) + "'", int12 == (-178330532));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-184662579) + "'", int15 == (-184662579));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.add((int) (byte) -1, (int) '4');
        int int21 = calculator0.divide((-1582342682), (-1919));
        int int24 = calculator0.divide((-1891899810), (-37489334));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 824566 + "'", int21 == 824566);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 50 + "'", int24 == 50);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
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
        int int36 = calculator0.add((-380871040), (-2146806784));
        int int39 = calculator0.add(827624442, 1497091025);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1767289472 + "'", int36 == 1767289472);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1970251829) + "'", int39 == (-1970251829));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        int int21 = calculator0.add((int) (short) 100, 1754528448);
        int int24 = calculator0.divide(236316608, (-1587684236));
        int int27 = calculator0.add(791316392, 96);
        int int30 = calculator0.subtract(1077166696, 86713457);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1754528548 + "'", int21 == 1754528548);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 791316488 + "'", int27 == 791316488);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 990453239 + "'", int30 == 990453239);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.multiply((int) (short) 100, (-152));
        int int18 = calculator0.add((-1685643349), (-1336575288));
        int int21 = calculator0.divide(94, 1493382152);
        int int24 = calculator0.multiply((-88956677), 1611346769);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15200) + "'", int15 == (-15200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1272748659 + "'", int18 == 1272748659);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-211816341) + "'", int24 == (-211816341));
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.add(0, (-1010));
        int int21 = calculator0.multiply(2702, (-404066219));
        int int24 = calculator0.divide((-1870160147), 861507584);
        int int27 = calculator0.subtract(91806, (-1510616912));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1010) + "'", int18 == (-1010));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-865230554) + "'", int21 == (-865230554));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1510708718 + "'", int27 == 1510708718);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.add((int) 'a', (-2020));
        int int15 = calculator0.divide((-15300), (-1964453610));
        int int18 = calculator0.add((-404066219), (-965191816));
        int int21 = calculator0.subtract((-520185), (-1474250605));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1923) + "'", int12 == (-1923));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1369258035) + "'", int18 == (-1369258035));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1473730420 + "'", int21 == 1473730420);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.subtract((-100), 2243220);
        int int21 = calculator0.subtract((-93470713), (-339618546));
        int int24 = calculator0.multiply(1877043160, 1567902008);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2243320) + "'", int18 == (-2243320));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 246147833 + "'", int21 == 246147833);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1170952000 + "'", int24 == 1170952000);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.divide(2233940, (-86713551));
        int int15 = calculator0.divide(365037960, 1497046722);
        int int18 = calculator0.add((-13312), (-1341611195));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1341624507) + "'", int18 == (-1341624507));
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.add((int) (byte) 1, (int) ' ');
        int int15 = calculator0.subtract(754840506, (-1984132447));
        int int18 = calculator0.multiply(1, 94);
        int int21 = calculator0.multiply(1371450554, 2130112384);
        int int24 = calculator0.subtract(1014215205, 1322286197);
        int int27 = calculator0.multiply((-341775360), (-790863593));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1555994343) + "'", int15 == (-1555994343));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 94 + "'", int18 == 94);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1767113472 + "'", int21 == 1767113472);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-308070992) + "'", int24 == (-308070992));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-186567680) + "'", int27 == (-186567680));
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.add((int) (byte) 1, (int) ' ');
        int int15 = calculator0.subtract(754840506, (-1984132447));
        int int18 = calculator0.divide(172635648, 258238464);
        int int21 = calculator0.multiply((-1764515376), 1367339526);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1555994343) + "'", int15 == (-1555994343));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1373869344) + "'", int21 == (-1373869344));
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.divide(1734312288, (-1772161564));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide((-68), (int) (byte) 100);
        int int12 = calculator0.subtract((-111), (int) (short) 10);
        int int15 = calculator0.divide(745957086, 109);
        int int18 = calculator0.divide(1558344461, 66);
        int int21 = calculator0.subtract(94, (-1523011220));
        int int24 = calculator0.multiply((-206361130), (-1891899810));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-121) + "'", int12 == (-121));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6843642 + "'", int15 == 6843642);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 23611279 + "'", int18 == 23611279);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1523011314 + "'", int21 == 1523011314);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1857349484) + "'", int24 == (-1857349484));
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide(100, 98);
        int int21 = calculator0.multiply(3563280, 867133546);
        int int24 = calculator0.subtract(1524237619, 1322286215);
        int int27 = calculator0.add((-147803916), 97);
        int int30 = calculator0.add(241122652, 1624624574);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1494342816 + "'", int21 == 1494342816);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 201951404 + "'", int24 == 201951404);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-147803819) + "'", int27 == (-147803819));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1865747226 + "'", int30 == 1865747226);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((-866613314), 692692992);
        int int18 = calculator0.add((int) (short) -1, (-111));
        int int21 = calculator0.subtract(1269639304, (-1555994343));
        int int24 = calculator0.divide(2130112384, (-7325507));
        int int27 = calculator0.subtract(282034071, (-341775412));
        int int30 = calculator0.add((-587860616), (-443263125));
        int int33 = calculator0.add(1245243118, (-1815930810));
        java.lang.Class<?> wildcardClass34 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-112) + "'", int18 == (-112));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1469333649) + "'", int21 == (-1469333649));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-290) + "'", int24 == (-290));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 623809483 + "'", int27 == 623809483);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1031123741) + "'", int30 == (-1031123741));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-570687692) + "'", int33 == (-570687692));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
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
        int int33 = calculator0.add(1307876110, 1387254556);
        int int36 = calculator0.multiply((-202366966), (-658578700));
        int int39 = calculator0.subtract((-1181548544), (-1251915698));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1599836630) + "'", int33 == (-1599836630));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1265410680) + "'", int36 == (-1265410680));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 70367154 + "'", int39 == 70367154);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide(100, 98);
        int int21 = calculator0.subtract((-86713551), (int) (short) 100);
        int int24 = calculator0.add(867133521, (-1154271480));
        int int27 = calculator0.divide(99474071, 1900738760);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-86713651) + "'", int21 == (-86713651));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-287137959) + "'", int24 == (-287137959));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.add(98, (int) (byte) 0);
        int int21 = calculator0.multiply((int) (byte) -1, (int) '4');
        int int24 = calculator0.subtract((-220794010), (-6858340));
        int int27 = calculator0.divide((-5), (-111));
        int int30 = calculator0.multiply((-297012176), 754840506);
        int int33 = calculator0.add((-857622013), (-2117573600));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-52) + "'", int21 == (-52));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-213935670) + "'", int24 == (-213935670));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-815203616) + "'", int30 == (-815203616));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1319771683 + "'", int33 == 1319771683);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide((-1769916224), (-36));
        int int21 = calculator0.add((-9312), (-121));
        int int24 = calculator0.divide((-220), 1);
        int int27 = calculator0.divide(14, (-335544320));
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
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide((int) (short) 10, (-173426914));
        int int21 = calculator0.add((-109415445), 1145169864);
        int int24 = calculator0.divide(1503190044, 850335808);
        int int27 = calculator0.subtract((-328101312), (-1838369148));
        int int30 = calculator0.multiply((-341775412), 72529);
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1035754419 + "'", int21 == 1035754419);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1510267836 + "'", int27 == 1510267836);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1922375564 + "'", int30 == 1922375564);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
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
        int int30 = calculator0.add(86698157, (-1919));
        int int33 = calculator0.subtract((-1503190165), 346346583);
        int int36 = calculator0.multiply(2085202125, (-885614656));
        int int39 = calculator0.add(380865840, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867154019 + "'", int18 == 867154019);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19670 + "'", int21 == 19670);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1448314236) + "'", int24 == (-1448314236));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1908264017 + "'", int27 == 1908264017);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 86696238 + "'", int30 == 86696238);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1849536748) + "'", int33 == (-1849536748));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-737311552) + "'", int36 == (-737311552));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 380865840 + "'", int39 == 380865840);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.divide((-1237148864), 153);
        int int12 = calculator0.add(164584658, (-853113394));
        int int15 = calculator0.subtract(97, 867133591);
        int int18 = calculator0.divide((-710920554), (-1806637));
        int int21 = calculator0.divide(1145169864, (-1175891336));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8085940) + "'", int9 == (-8085940));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-688528736) + "'", int12 == (-688528736));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133494) + "'", int15 == (-867133494));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 393 + "'", int18 == 393);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
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
        int int33 = calculator0.add((-1879178559), (-7955541));
        int int36 = calculator0.multiply(1262618367, (-1281026853));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1887134100) + "'", int33 == (-1887134100));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1499654181 + "'", int36 == 1499654181);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.subtract(76, (-867133439));
        int int18 = calculator0.multiply(33, 213009);
        int int21 = calculator0.subtract(0, 568590);
        int int24 = calculator0.subtract(93887247, (-1923));
        int int27 = calculator0.add(568590, (-1411233806));
        int int30 = calculator0.multiply(867149079, (-1988260096));
        int int33 = calculator0.multiply(1373379584, 393135424);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133515 + "'", int15 == 867133515);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7029297 + "'", int18 == 7029297);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-568590) + "'", int21 == (-568590));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 93889170 + "'", int24 == 93889170);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1410665216) + "'", int27 == (-1410665216));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 141744384 + "'", int30 == 141744384);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-527237120) + "'", int33 == (-527237120));
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((-866613314), 692692992);
        int int18 = calculator0.add(1693566793, 867154995);
        int int21 = calculator0.add((int) (short) 100, 1429923579);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1734245508) + "'", int18 == (-1734245508));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1429923679 + "'", int21 == 1429923679);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.subtract(76, (-867133439));
        int int18 = calculator0.subtract((-976), 4213);
        int int21 = calculator0.divide(346346496, (-844637556));
        int int24 = calculator0.divide((-1582342682), 26401901);
        int int27 = calculator0.multiply(867133782, (int) (byte) -1);
        int int30 = calculator0.divide((-938163200), 196);
        int int33 = calculator0.divide((-563954720), 1271869877);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133515 + "'", int15 == 867133515);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-5189) + "'", int18 == (-5189));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-59) + "'", int24 == (-59));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-867133782) + "'", int27 == (-867133782));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-4786546) + "'", int30 == (-4786546));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
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
        java.lang.Class<?> wildcardClass34 = calculator0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.add((-867133515), 1154271478);
        int int18 = calculator0.divide(452435152, 867148791);
        int int21 = calculator0.multiply((-2045750321), 1271869877);
        int int24 = calculator0.add(1090656050, 178605);
        int int27 = calculator0.divide((-58), 308359094);
        int int30 = calculator0.divide(1517596387, 351515216);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 287137963 + "'", int15 == 287137963);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1391911003 + "'", int21 == 1391911003);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1090834655 + "'", int24 == 1090834655);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.divide((-36), 33);
        int int18 = calculator0.divide((-207), 33);
        int int21 = calculator0.add((-867133440), 9);
        int int24 = calculator0.divide(650962504, 1544275949);
        int int27 = calculator0.multiply(1838149828, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-867133431) + "'", int21 == (-867133431));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
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
        int int30 = calculator0.add(1058203134, 277224907);
        int int33 = calculator0.divide((-586109830), 1231206848);
        int int36 = calculator0.add((-964732924), (-1410665216));
        java.lang.Class<?> wildcardClass37 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11095) + "'", int21 == (-11095));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3463464) + "'", int24 == (-3463464));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1582342682) + "'", int27 == (-1582342682));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1335428041 + "'", int30 == 1335428041);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1919569156 + "'", int36 == 1919569156);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.add((-346346486), (-1838369148));
        int int21 = calculator0.multiply(1938174875, (-1807123776));
        int int24 = calculator0.subtract((-932694645), 494719770);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2110251662 + "'", int18 == 2110251662);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-328101312) + "'", int21 == (-328101312));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1427414415) + "'", int24 == (-1427414415));
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply((-76), (int) (short) -1);
        int int18 = calculator0.multiply(20580, (-49164339));
        int int21 = calculator0.multiply((-576693300), (int) (short) 1);
        int int24 = calculator0.add(1236538979, (-791214257));
        int int27 = calculator0.subtract((-29), (-34682070));
        int int30 = calculator0.multiply((-1357817017), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 76 + "'", int15 == 76);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1810185236 + "'", int18 == 1810185236);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-576693300) + "'", int21 == (-576693300));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 445324722 + "'", int24 == 445324722);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 34682041 + "'", int27 == 34682041);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide(692692992, 2);
        int int21 = calculator0.divide(3400, (-52));
        int int24 = calculator0.multiply(5419, (-1154271671));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 346346496 + "'", int18 == 346346496);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-65) + "'", int21 == (-65));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1525802173) + "'", int24 == (-1525802173));
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((-7466), 67686400);
        int int18 = calculator0.divide(0, 6992);
        int int21 = calculator0.multiply((-173436074), (int) (short) 0);
        int int24 = calculator0.divide((-52), 1219996744);
        int int27 = calculator0.add((-1136615032), 110);
        int int30 = calculator0.subtract(1145179144, 867154119);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1136614922) + "'", int27 == (-1136614922));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 278025025 + "'", int30 == 278025025);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.add(568480, 110);
        int int15 = calculator0.subtract(1787380221, 86713457);
        int int18 = calculator0.subtract(1271879224, 9347);
        int int21 = calculator0.multiply((-867158093), 520484954);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1700666764 + "'", int15 == 1700666764);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1271869877 + "'", int18 == 1271869877);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1302854894 + "'", int21 == 1302854894);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.divide((int) (short) 1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = calculator0.divide(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.multiply((int) (short) 100, (-152));
        int int18 = calculator0.divide((-1248231612), 1754528548);
        int int21 = calculator0.subtract(1841057792, 1771178000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15200) + "'", int15 == (-15200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 69879792 + "'", int21 == 69879792);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.multiply((int) (short) 100, (-152));
        int int18 = calculator0.multiply(0, (-170066666));
        int int21 = calculator0.add(1122529476, (-1665941363));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15200) + "'", int15 == (-15200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-543411887) + "'", int21 == (-543411887));
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        int int21 = calculator0.subtract(0, (-747485824));
        int int24 = calculator0.divide((-1145651032), 9277);
        int int27 = calculator0.multiply((-1720133280), 400795453);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 747485824 + "'", int21 == 747485824);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-123493) + "'", int24 == (-123493));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-944149536) + "'", int27 == (-944149536));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.subtract(0, 867133515);
        int int18 = calculator0.multiply(0, 568480);
        int int21 = calculator0.add(1154271220, (-869370670));
        int int24 = calculator0.add(1432976652, 0);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133515) + "'", int15 == (-867133515));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 284900550 + "'", int21 == 284900550);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1432976652 + "'", int24 == 1432976652);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.multiply((int) (short) 100, (-152));
        int int18 = calculator0.divide((-1248231612), 1754528548);
        int int21 = calculator0.subtract(1020465408, 0);
        int int24 = calculator0.multiply((-2115365052), (-108673964));
        int int27 = calculator0.divide((-46566313), (-1152038506));
        int int30 = calculator0.multiply(19670, (-658578700));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15200) + "'", int15 == (-15200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1020465408 + "'", int21 == 1020465408);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 351515216 + "'", int24 == 351515216);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-621664264) + "'", int30 == (-621664264));
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
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
        int int33 = calculator0.multiply((-1224898), 791316488);
        int int36 = calculator0.multiply(278045632, 1484018126);
        java.lang.Class<?> wildcardClass37 = calculator0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1940875760 + "'", int33 == 1940875760);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-288390016) + "'", int36 == (-288390016));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.add((int) (byte) 1, (int) ' ');
        int int15 = calculator0.subtract(754840506, (-1984132447));
        int int18 = calculator0.multiply(1, 94);
        int int21 = calculator0.subtract(1248234937, (-1760882346));
        int int24 = calculator0.subtract(1503914342, (-636451305));
        int int27 = calculator0.add((-1232498), (-28544742));
        int int30 = calculator0.multiply((-596419254), (-719722240));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1555994343) + "'", int15 == (-1555994343));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 94 + "'", int18 == 94);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1285850013) + "'", int21 == (-1285850013));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2140365647 + "'", int24 == 2140365647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-29777240) + "'", int27 == (-29777240));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1373480448) + "'", int30 == (-1373480448));
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((-101), (-86));
        int int15 = calculator0.add((-362406912), (-173426797));
        int int18 = calculator0.subtract(2129948464, 1730079900);
        int int21 = calculator0.multiply(180029699, (-934840515));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-15) + "'", int12 == (-15));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-535833709) + "'", int15 == (-535833709));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 399868564 + "'", int18 == 399868564);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1469483703 + "'", int21 == 1469483703);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.subtract((int) (short) 0, 110);
        int int21 = calculator0.divide((-1539251552), (-49164339));
        int int24 = calculator0.divide(0, (-68));
        int int27 = calculator0.subtract((-996), 555609709);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-110) + "'", int18 == (-110));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 31 + "'", int21 == 31);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-555610705) + "'", int27 == (-555610705));
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.multiply((-86713457), 692692992);
        int int21 = calculator0.divide((-513259903), (-93470713));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((-68), (int) (byte) 10);
        int int21 = calculator0.add((-86713551), 94);
        int int24 = calculator0.multiply(67686400, 9277);
        int int27 = calculator0.multiply((-1925982026), (-1497046880));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-86713457) + "'", int21 == (-86713457));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 861507584 + "'", int24 == 861507584);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1923173952) + "'", int27 == (-1923173952));
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.multiply((int) (short) 100, (-152));
        int int18 = calculator0.divide((-1248231612), 1754528548);
        int int21 = calculator0.subtract(1020465408, 0);
        int int24 = calculator0.divide((-1653), (-602199867));
        int int27 = calculator0.divide((-2243610), 1978473568);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15200) + "'", int15 == (-15200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1020465408 + "'", int21 == 1020465408);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) '#', (-9312));
        int int18 = calculator0.divide((-97), (-867138628));
        int int21 = calculator0.multiply((-298772224), 1908264058);
        int int24 = calculator0.subtract(9552800, (-1123990621));
        int int27 = calculator0.multiply((-1687920631), 1497569312);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9347 + "'", int15 == 9347);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 408021504 + "'", int21 == 408021504);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1133543421 + "'", int24 == 1133543421);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 417847584 + "'", int27 == 417847584);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) ' ', (int) (byte) 100);
        int int15 = calculator0.subtract((-207), 86713344);
        int int18 = calculator0.divide((-96348159), 1013244259);
        int int21 = calculator0.multiply((-1802498291), 130);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-68) + "'", int12 == (-68));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713551) + "'", int15 == (-86713551));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1898423450 + "'", int21 == 1898423450);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.subtract((-403723706), (-322124534));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-81599172) + "'", int3 == (-81599172));
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.subtract(109, (int) (short) 100);
        int int15 = calculator0.add(290738210, 1236538979);
        int int18 = calculator0.add((-2201), (-1951882450));
        int int21 = calculator0.subtract((-1697414308), (-1336575288));
        int int24 = calculator0.multiply((-444040511), 44768956);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1527277189 + "'", int15 == 1527277189);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1951884651) + "'", int18 == (-1951884651));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-360839020) + "'", int21 == (-360839020));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 260555708 + "'", int24 == 260555708);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((-97), 96);
        int int15 = calculator0.multiply(1486954504, 911011581);
        int int18 = calculator0.multiply(2003425405, 867133381);
        int int21 = calculator0.divide(1429824755, (-1889283420));
        int int24 = calculator0.multiply((-491301529), 1249740532);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9312) + "'", int12 == (-9312));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1788602392) + "'", int15 == (-1788602392));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1593893681 + "'", int18 == 1593893681);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2034479060) + "'", int24 == (-2034479060));
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.subtract(2, 86713344);
        int int18 = calculator0.multiply(1700666860, (-15200));
        int int21 = calculator0.multiply(866523750, 1693566793);
        int int24 = calculator0.multiply(431871820, 2702);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713342) + "'", int15 == (-86713342));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1271882624 + "'", int18 == 1271882624);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1964453610) + "'", int21 == (-1964453610));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1313446872) + "'", int24 == (-1313446872));
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.add(98, (int) (byte) 0);
        int int21 = calculator0.subtract((int) (short) 100, 98);
        int int24 = calculator0.multiply(10, 0);
        int int27 = calculator0.subtract(95596657, (-1313446872));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1409043529 + "'", int27 == 1409043529);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) ' ', 109415477);
        int int15 = calculator0.subtract(1037464303, (-1469333649));
        int int18 = calculator0.add((-15300), 1935);
        int int21 = calculator0.subtract((-198788080), 493685401);
        int int24 = calculator0.add((-1475972619), 1339770992);
        int int27 = calculator0.multiply((-1140394960), 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-109415445) + "'", int12 == (-109415445));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1788169344) + "'", int15 == (-1788169344));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-13365) + "'", int18 == (-13365));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-692473481) + "'", int21 == (-692473481));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-136201627) + "'", int24 == (-136201627));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1021671984 + "'", int27 == 1021671984);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.subtract(76, (-867133439));
        int int18 = calculator0.subtract((-15200), (int) (short) 100);
        int int21 = calculator0.add(1269639304, (-58));
        int int24 = calculator0.add(867133591, (-866521795));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133515 + "'", int15 == 867133515);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-15300) + "'", int18 == (-15300));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1269639246 + "'", int21 == 1269639246);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 611796 + "'", int24 == 611796);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
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
        int int30 = calculator0.multiply((-1876799379), (-425855760));
        int int33 = calculator0.subtract((-53231142), (-375835712));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-173426914) + "'", int21 == (-173426914));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9552704 + "'", int24 == 9552704);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-112879003) + "'", int27 == (-112879003));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 363612720 + "'", int30 == 363612720);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 322604570 + "'", int33 == 322604570);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.add((-2146806784), 0);
        int int12 = calculator0.subtract(520297, 96);
        int int15 = calculator0.add((-20), (-68));
        int int18 = calculator0.subtract((-161745389), (-1999632499));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2146806784) + "'", int9 == (-2146806784));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520201 + "'", int12 == 520201);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-88) + "'", int15 == (-88));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1837887110 + "'", int18 == 1837887110);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.divide((-36), 33);
        int int18 = calculator0.divide((-207), 33);
        int int21 = calculator0.add((-867133440), 9);
        int int24 = calculator0.multiply(867133511, 98);
        int int27 = calculator0.add(686685688, (-1115015376));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-867133431) + "'", int21 == (-867133431));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-920261842) + "'", int24 == (-920261842));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-428329688) + "'", int27 == (-428329688));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.subtract(109, (int) (short) 100);
        int int15 = calculator0.subtract((-36), (-31));
        int int18 = calculator0.subtract((int) (byte) 0, 1494342816);
        int int21 = calculator0.divide(1152037536, 37489359);
        int int24 = calculator0.add(910738184, (-1399144532));
        int int27 = calculator0.divide((-86713651), 568590);
        int int30 = calculator0.add((-879833140), 225504013);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1494342816) + "'", int18 == (-1494342816));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30 + "'", int21 == 30);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-488406348) + "'", int24 == (-488406348));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-152) + "'", int27 == (-152));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-654329127) + "'", int30 == (-654329127));
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.subtract((-7955541), (-867133515));
        int int18 = calculator0.subtract((-833512721), (-433567285));
        int int21 = calculator0.add((-1249812224), 520484954);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 859177974 + "'", int15 == 859177974);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-399945436) + "'", int18 == (-399945436));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-729327270) + "'", int21 == (-729327270));
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.divide((-2020), (-10));
        int int21 = calculator0.add(1271882624, (-2243320));
        int int24 = calculator0.add((-869367269), (-665254));
        // The following exception was thrown during execution in test generation
        try {
            int int27 = calculator0.divide(219343644, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 202 + "'", int18 == 202);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1269639304 + "'", int21 == 1269639304);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-870032523) + "'", int24 == (-870032523));
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.add((-2146806784), 0);
        int int12 = calculator0.subtract(520297, 96);
        int int15 = calculator0.add((-20), (-68));
        int int18 = calculator0.subtract(1497046722, 6992);
        int int21 = calculator0.multiply(1152037484, (-214452976));
        int int24 = calculator0.add(859177974, 1525782115);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2146806784) + "'", int9 == (-2146806784));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520201 + "'", int12 == 520201);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-88) + "'", int15 == (-88));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1497039730 + "'", int18 == 1497039730);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-737836352) + "'", int21 == (-737836352));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1910007207) + "'", int24 == (-1910007207));
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.multiply((int) (short) 10, (-685834));
        int int21 = calculator0.subtract(867154019, 1925360681);
        int int24 = calculator0.add((-3), 20);
        int int27 = calculator0.divide(1300, (-488406348));
        int int30 = calculator0.multiply((-13312), 282034071);
        int int33 = calculator0.divide(69, (-1076989380));
        int int36 = calculator0.divide(1308413286, 1444218927);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6858340) + "'", int18 == (-6858340));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1058206662) + "'", int21 == (-1058206662));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17 + "'", int24 == 17);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-636136448) + "'", int30 == (-636136448));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (short) -1, 867133491);
        int int12 = calculator0.add(95596657, 334907792);
        int int15 = calculator0.subtract((-88956770), 82877331);
        int int18 = calculator0.divide((-1807123776), 1931212123);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133491) + "'", int9 == (-867133491));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 430504449 + "'", int12 == 430504449);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-171834101) + "'", int15 == (-171834101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (byte) 100, (-1));
        int int12 = calculator0.add(0, 770064344);
        int int15 = calculator0.multiply((-1411233806), 1558344461);
        int int18 = calculator0.multiply(0, 109);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 770064344 + "'", int12 == 770064344);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-596419254) + "'", int15 == (-596419254));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide((-68), (int) (byte) 100);
        int int12 = calculator0.subtract((-111), (int) (short) 10);
        int int15 = calculator0.multiply((-7600), (-34));
        int int18 = calculator0.multiply(1527277189, (-2131780436));
        int int21 = calculator0.add(867154019, (-2146806852));
        int int24 = calculator0.subtract((-29777240), 1236538979);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-121) + "'", int12 == (-121));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 258400 + "'", int15 == 258400);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2118708572 + "'", int18 == 2118708572);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1279652833) + "'", int21 == (-1279652833));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1266316219) + "'", int24 == (-1266316219));
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.add(25, 867133591);
        int int6 = calculator0.add((-1984132447), (-49164407));
        int int9 = calculator0.subtract((-173426797), 1145179044);
        int int12 = calculator0.subtract(23035, 1693871517);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 867133616 + "'", int3 == 867133616);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2033296854) + "'", int6 == (-2033296854));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1318605841) + "'", int9 == (-1318605841));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1693848482) + "'", int12 == (-1693848482));
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.add((int) (byte) 1, (int) ' ');
        int int15 = calculator0.subtract(754840506, (-1984132447));
        int int18 = calculator0.multiply(1, 94);
        int int21 = calculator0.subtract((-1110310644), 1308749824);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1555994343) + "'", int15 == (-1555994343));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 94 + "'", int18 == 94);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1875906828 + "'", int21 == 1875906828);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.add(867133667, (-121));
        int int21 = calculator0.subtract(0, (-1908264058));
        int int24 = calculator0.multiply((-685834), (-78));
        int int27 = calculator0.multiply(502657300, (-380871040));
        int int30 = calculator0.divide((-59149533), (-675399327));
        int int33 = calculator0.multiply((-888123854), 1737431675);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133546 + "'", int18 == 867133546);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1908264058 + "'", int21 == 1908264058);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 53495052 + "'", int24 == 53495052);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 258859520 + "'", int27 == 258859520);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 78947846 + "'", int33 == 78947846);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((-152), (-867154019));
        int int24 = calculator0.add((-6867620), 1152037484);
        int int27 = calculator0.divide(1271869877, 1515036992);
        int int30 = calculator0.add(1536424294, (-1555994363));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1336575288) + "'", int21 == (-1336575288));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1145169864 + "'", int24 == 1145169864);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-19570069) + "'", int30 == (-19570069));
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.subtract((-1), 9);
        int int18 = calculator0.multiply(18, (-867138628));
        int int21 = calculator0.add((-1408776192), (-286008737));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1571373880 + "'", int18 == 1571373880);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1694784929) + "'", int21 == (-1694784929));
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply((-76), (-7480));
        int int9 = calculator0.subtract(984703730, 870696771);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 568480 + "'", int6 == 568480);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 114006959 + "'", int9 == 114006959);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.multiply((int) (short) -1, 49164339);
        int int12 = calculator0.divide((-1341734912), (-567));
        int int15 = calculator0.multiply(8671336, (-341775412));
        int int18 = calculator0.add((-1459544222), (-1870160147));
        int int21 = calculator0.subtract(1429923679, (-1263186959));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-49164339) + "'", int9 == (-49164339));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2366375 + "'", int12 == 2366375);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1740666144) + "'", int15 == (-1740666144));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 965262927 + "'", int18 == 965262927);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1601856658) + "'", int21 == (-1601856658));
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.multiply((int) (short) 10, (-685834));
        int int21 = calculator0.subtract(867154019, 1925360681);
        int int24 = calculator0.multiply(867154119, 2);
        int int27 = calculator0.subtract(1610443202, 2059933671);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6858340) + "'", int18 == (-6858340));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1058206662) + "'", int21 == (-1058206662));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1734308238 + "'", int24 == 1734308238);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-449490469) + "'", int27 == (-449490469));
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.add(33, (-7600));
        int int21 = calculator0.multiply(173200584, (-1555994363));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1951649816) + "'", int21 == (-1951649816));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
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
        int int33 = calculator0.add(1258058047, (-403723706));
        int int36 = calculator0.divide((-1539825345), 361774682);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 854334341 + "'", int33 == 854334341);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-4) + "'", int36 == (-4));
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.divide(692692992, (-1010));
        int int21 = calculator0.add((-241122442), (-757113551));
        int int24 = calculator0.divide((-34682070), (-1121822200));
        int int27 = calculator0.add(0, (-1270709336));
        int int30 = calculator0.subtract((-847911442), (-34829));
        int int33 = calculator0.multiply((-873633296), (-1163139214));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-685834) + "'", int18 == (-685834));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-998235993) + "'", int21 == (-998235993));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1270709336) + "'", int27 == (-1270709336));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-847876613) + "'", int30 == (-847876613));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 765508832 + "'", int33 == 765508832);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', 1);
        int int15 = calculator0.multiply((-111), (-1919));
        int int18 = calculator0.subtract(1810186246, (-867133329));
        int int21 = calculator0.multiply((-88956701), (-8639589));
        int int24 = calculator0.subtract((-917640454), (-11095));
        int int27 = calculator0.divide(97, (-1269639355));
        int int30 = calculator0.add(968765952, (-298751412));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 213009 + "'", int15 == 213009);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1617647721) + "'", int18 == (-1617647721));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-702444943) + "'", int21 == (-702444943));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-917629359) + "'", int24 == (-917629359));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 670014540 + "'", int30 == 670014540);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide((-867133439), 9);
        int int12 = calculator0.multiply((-96348159), (-9280));
        int int15 = calculator0.divide(1272748659, (-2243320));
        int int18 = calculator0.divide(867133581, 128);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 757717952 + "'", int12 == 757717952);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-567) + "'", int15 == (-567));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6774481 + "'", int18 == 6774481);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.divide(25, (-1923));
        int int12 = calculator0.multiply((-15300), 34);
        int int15 = calculator0.subtract(1152037484, (-109415563));
        int int18 = calculator0.divide(1810186246, (-78));
        int int21 = calculator0.divide((int) (short) 100, (-214132468));
        int int24 = calculator0.add((-228949765), 77773939);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-520200) + "'", int12 == (-520200));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1261453047 + "'", int15 == 1261453047);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-23207515) + "'", int18 == (-23207515));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-151175826) + "'", int24 == (-151175826));
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.subtract(76, (-867133439));
        int int18 = calculator0.subtract((-15200), (int) (short) 100);
        int int21 = calculator0.add(1269639304, (-58));
        int int24 = calculator0.subtract(822099412, 251488941);
        int int27 = calculator0.divide((-429089213), (-79882359));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133515 + "'", int15 == 867133515);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-15300) + "'", int18 == (-15300));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1269639246 + "'", int21 == 1269639246);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 570610471 + "'", int24 == 570610471);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((-1357816827), 1810186246);
        int int21 = calculator0.subtract((-1305315316), (-1076989380));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1126964223 + "'", int18 == 1126964223);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-228325936) + "'", int21 == (-228325936));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(757717952, 867133515);
        int int15 = calculator0.divide(10, 6153309);
        int int18 = calculator0.subtract(86713455, 1771863899);
        int int21 = calculator0.add(1237148765, (-1010));
        int int24 = calculator0.subtract(1020465408, 7566);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-109415563) + "'", int12 == (-109415563));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1685150444) + "'", int18 == (-1685150444));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1237147755 + "'", int21 == 1237147755);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1020457842 + "'", int24 == 1020457842);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
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
        int int33 = calculator0.add((-1879178559), (-7955541));
        int int36 = calculator0.add(349302647, (-843168258));
        int int39 = calculator0.multiply((-867133439), 1076984144);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1887134100) + "'", int33 == (-1887134100));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-493865611) + "'", int36 == (-493865611));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1228470608 + "'", int39 == 1228470608);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.divide(692692992, (-1010));
        int int21 = calculator0.multiply((-36), (-867133571));
        int int24 = calculator0.divide(101, 9);
        int int27 = calculator0.subtract(101, 0);
        int int30 = calculator0.divide((-933798035), 707601614);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-685834) + "'", int18 == (-685834));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1152037484 + "'", int21 == 1152037484);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 101 + "'", int27 == 101);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.add(98, (int) (byte) 0);
        int int21 = calculator0.subtract((-111), (-111));
        int int24 = calculator0.multiply((-869367270), 1237148864);
        int int27 = calculator0.multiply(827319272, (-757717954));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-991577216) + "'", int24 == (-991577216));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 22401584 + "'", int27 == 22401584);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
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
        int int33 = calculator0.add((-586398088), 665);
        java.lang.Class<?> wildcardClass34 = calculator0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-586397423) + "'", int33 == (-586397423));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
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
        int int30 = calculator0.subtract(1522336568, (-88));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-173426797) + "'", int18 == (-173426797));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1013244259 + "'", int21 == 1013244259);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-175453037) + "'", int24 == (-175453037));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1522336656 + "'", int30 == 1522336656);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
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
        int int30 = calculator0.subtract(984703730, 766799183);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867154019 + "'", int18 == 867154019);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19670 + "'", int21 == 19670);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1448314236) + "'", int24 == (-1448314236));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1183140366) + "'", int27 == (-1183140366));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 217904547 + "'", int30 == 217904547);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((-866613314), 692692992);
        int int18 = calculator0.add((int) (short) -1, (-111));
        int int21 = calculator0.subtract(1898423450, (-190));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-112) + "'", int18 == (-112));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1898423640 + "'", int21 == 1898423640);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.divide(86698157, 867133515);
        int int24 = calculator0.multiply(0, 897879296);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.subtract((-596556766), (-257235584));
        int int21 = calculator0.add((-13), 1923);
        int int24 = calculator0.subtract(654086037, (-356995307));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-339321182) + "'", int18 == (-339321182));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1910 + "'", int21 == 1910);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1011081344 + "'", int24 == 1011081344);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) ' ', (int) (byte) 100);
        int int15 = calculator0.add(757717952, (-867133491));
        int int18 = calculator0.subtract((-1729226194), 1624624574);
        int int21 = calculator0.add(423222610, (-1902332367));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-68) + "'", int12 == (-68));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-109415539) + "'", int15 == (-109415539));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 941116528 + "'", int18 == 941116528);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1479109757) + "'", int21 == (-1479109757));
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.subtract(2, 86713344);
        int int18 = calculator0.multiply(20, 1154271478);
        int int21 = calculator0.divide((-1606434265), (-121));
        int int24 = calculator0.multiply((-1526379269), (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713342) + "'", int15 == (-86713342));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1610593080 + "'", int18 == 1610593080);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13276316 + "'", int21 == 13276316);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2062310660) + "'", int24 == (-2062310660));
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.multiply((-9312), (-9312));
        int int15 = calculator0.subtract(867133515, (-6));
        int int18 = calculator0.subtract((-1500078914), 2003425405);
        int int21 = calculator0.multiply((-164656960), (-173436042));
        int int24 = calculator0.divide(0, 1615472032);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713344 + "'", int12 == 86713344);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133521 + "'", int15 == 867133521);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 791462977 + "'", int18 == 791462977);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-869316480) + "'", int21 == (-869316480));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.add(51, (int) (short) 1);
        int int15 = calculator0.add((-68), 32);
        int int18 = calculator0.subtract(1810185237, (-2132911612));
        int int21 = calculator0.add((-110758604), 1254594707);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-36) + "'", int15 == (-36));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-351870447) + "'", int18 == (-351870447));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1143836103 + "'", int21 == 1143836103);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
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
        int int30 = calculator0.divide((-1555994389), (-868095375));
        int int33 = calculator0.divide((int) (short) 1, 984703730);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-173426797) + "'", int18 == (-173426797));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 153 + "'", int21 == 153);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1693566793 + "'", int24 == 1693566793);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2064 + "'", int27 == 2064);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide(1219996744, 109415572);
        int int21 = calculator0.divide(1769916224, (-24578));
        int int24 = calculator0.divide(1754530371, (-867133342));
        int int27 = calculator0.add((-976), (-1286025584));
        int int30 = calculator0.divide(2040107520, (-187));
        int int33 = calculator0.subtract((-1434263652), 1635427160);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-72012) + "'", int21 == (-72012));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1286026560) + "'", int27 == (-1286026560));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-10909665) + "'", int30 == (-10909665));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1225276484 + "'", int33 == 1225276484);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide((-214132468), (-49164380));
        int int12 = calculator0.add((-609787), (-867133440));
        int int15 = calculator0.multiply((-867158169), (int) (byte) -1);
        int int18 = calculator0.subtract(214132690, (-56));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-867743227) + "'", int12 == (-867743227));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867158169 + "'", int15 == 867158169);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 214132746 + "'", int18 == 214132746);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.multiply((int) (short) 100, (-152));
        int int18 = calculator0.add((-1685643349), (-1336575288));
        int int21 = calculator0.subtract((-961364332), 43138);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15200) + "'", int15 == (-15200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1272748659 + "'", int18 == 1272748659);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-961407470) + "'", int21 == (-961407470));
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((-132), (-910738153));
        int int21 = calculator0.multiply((-1872794142), (-425855760));
        int int24 = calculator0.add(0, (-451867));
        int int27 = calculator0.divide((-109415563), 1527277179);
        int int30 = calculator0.add((-1556001722), 822102842);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-910738285) + "'", int18 == (-910738285));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1110676512) + "'", int21 == (-1110676512));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-451867) + "'", int24 == (-451867));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-733898880) + "'", int30 == (-733898880));
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.add((-2146806784), 0);
        int int12 = calculator0.subtract(520297, 96);
        int int15 = calculator0.add((-20), (-68));
        int int18 = calculator0.subtract(1497046722, 6992);
        int int21 = calculator0.multiply((-971832620), 1726946994);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2146806784) + "'", int9 == (-2146806784));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520201 + "'", int12 == 520201);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-88) + "'", int15 == (-88));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1497039730 + "'", int18 == 1497039730);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 259575656 + "'", int21 == 259575656);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
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
        int int36 = calculator0.add((-1806625), (-12));
        int int39 = calculator0.divide(391608, (-365802382));
        java.lang.Class<?> wildcardClass40 = calculator0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1806637) + "'", int36 == (-1806637));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
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
        int int30 = calculator0.add((-335544320), 1733781467);
        int int33 = calculator0.subtract(0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-110) + "'", int18 == (-110));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1769916224) + "'", int21 == (-1769916224));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 42260032 + "'", int24 == 42260032);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-322124534) + "'", int27 == (-322124534));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1398237147 + "'", int30 == 1398237147);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.divide((-36), 33);
        int int18 = calculator0.divide((-207), 33);
        int int21 = calculator0.add(67686400, 861507584);
        int int24 = calculator0.subtract((-1007548917), (-555681720));
        int int27 = calculator0.add(151224956, (-857622013));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 929193984 + "'", int21 == 929193984);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-451867197) + "'", int24 == (-451867197));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-706397057) + "'", int27 == (-706397057));
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((-97), 96);
        int int15 = calculator0.divide((-15300), 1693566793);
        int int18 = calculator0.subtract(37489359, (-1237148864));
        int int21 = calculator0.multiply(1076459016, (-1526379168));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9312) + "'", int12 == (-9312));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1274638223 + "'", int18 == 1274638223);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-30102784) + "'", int21 == (-30102784));
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide(0, (-2037396585));
        int int12 = calculator0.subtract(0, (-675399327));
        int int15 = calculator0.multiply(1371450554, (-1145179290));
        int int18 = calculator0.multiply((-14300), (-658578700));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 675399327 + "'", int12 == 675399327);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-213950436) + "'", int15 == (-213950436));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1187870128) + "'", int18 == (-1187870128));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply((-76), (int) (short) -1);
        int int18 = calculator0.add((-10), (-68));
        int int21 = calculator0.add((-346346486), (-96348159));
        int int24 = calculator0.add((-1769916224), 867133591);
        int int27 = calculator0.multiply(6992, 520201);
        int int30 = calculator0.multiply(479308859, 1792924371);
        int int33 = calculator0.add(278203074, (-1988260096));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 76 + "'", int15 == 76);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-78) + "'", int18 == (-78));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-442694645) + "'", int21 == (-442694645));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-902782633) + "'", int24 == (-902782633));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-657721904) + "'", int27 == (-657721904));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1247137119) + "'", int30 == (-1247137119));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1710057022) + "'", int33 == (-1710057022));
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
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
        int int30 = calculator0.divide(0, (-23207515));
        int int33 = calculator0.subtract((-2243610), (-11868326));
        int int36 = calculator0.add((-47078120), 520052);
        int int39 = calculator0.subtract(86605184, (-790863593));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 867133591 + "'", int24 == 867133591);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-576693300) + "'", int27 == (-576693300));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9624716 + "'", int33 == 9624716);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-46558068) + "'", int36 == (-46558068));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 877468777 + "'", int39 == 877468777);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
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
        int int30 = calculator0.add((-1646365056), 1319771683);
        int int33 = calculator0.multiply(1860440728, 86144864);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-31) + "'", int21 == (-31));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 42927 + "'", int24 == 42927);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-956095305) + "'", int27 == (-956095305));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-326593373) + "'", int30 == (-326593373));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 173777152 + "'", int33 == 173777152);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((int) '#', (int) ' ');
        int int18 = calculator0.add(34, (-1010));
        int int21 = calculator0.multiply(568480, (-6));
        int int24 = calculator0.add((-2146806784), 1693566793);
        int int27 = calculator0.add((-1698572449), (-1438030336));
        int int30 = calculator0.multiply(1700666860, (-915919376));
        int int33 = calculator0.subtract(0, (-12792939));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-976) + "'", int18 == (-976));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3410880) + "'", int21 == (-3410880));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-453239991) + "'", int24 == (-453239991));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1158364511 + "'", int27 == 1158364511);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 123636032 + "'", int30 == 123636032);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 12792939 + "'", int33 == 12792939);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.add(32, (-9312));
        int int12 = calculator0.divide(3563280, (-442694645));
        int int15 = calculator0.divide((-1510103384), (-1136614922));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-9280) + "'", int9 == (-9280));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
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
        int int30 = calculator0.add((-16428397), (-1459544222));
        int int33 = calculator0.subtract(867149079, (-96347949));
        int int36 = calculator0.subtract(2110251662, (-1341547376));
        int int39 = calculator0.divide((-1067768846), 496549099);
        int int42 = calculator0.subtract((-917629359), (-94668773));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6858340) + "'", int18 == (-6858340));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1058206662) + "'", int21 == (-1058206662));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17 + "'", int24 == 17);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-868095375) + "'", int27 == (-868095375));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1475972619) + "'", int30 == (-1475972619));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 963497028 + "'", int33 == 963497028);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-843168258) + "'", int36 == (-843168258));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-2) + "'", int39 == (-2));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-822960586) + "'", int42 == (-822960586));
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.divide((int) ' ', (-101));
        int int15 = calculator0.add(1152037484, (-6858340));
        int int18 = calculator0.divide(4213, 867133667);
        int int21 = calculator0.subtract((-4864), (-1357151573));
        int int24 = calculator0.subtract(867154009, 10107303);
        int int27 = calculator0.subtract(1624624574, 175114674);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1145179144 + "'", int15 == 1145179144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1357146709 + "'", int21 == 1357146709);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 857046706 + "'", int24 == 857046706);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1449509900 + "'", int27 == 1449509900);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
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
        int int39 = calculator0.add((-7600), 4);
        int int42 = calculator0.divide((-1720133280), 2133572262);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-7596) + "'", int39 == (-7596));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply((-7567), (int) 'a');
        int int9 = calculator0.subtract(867154019, 76);
        int int12 = calculator0.add(1733781449, 916297905);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-733999) + "'", int6 == (-733999));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 867153943 + "'", int9 == 867153943);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1644887942) + "'", int12 == (-1644887942));
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply((-76), (int) (byte) 100);
        int int18 = calculator0.multiply((-88956701), 568480);
        int int21 = calculator0.multiply((-341775360), (-2019171204));
        int int24 = calculator0.multiply((-58), (-132));
        int int27 = calculator0.add((-558202980), 2019159796);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7600) + "'", int15 == (-7600));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1160441376) + "'", int18 == (-1160441376));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1876799488) + "'", int21 == (-1876799488));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7656 + "'", int24 == 7656);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1460956816 + "'", int27 == 1460956816);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide(1219996744, 109415572);
        int int21 = calculator0.divide(1769916224, (-24578));
        int int24 = calculator0.divide(1754530371, (-867133342));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-72012) + "'", int21 == (-72012));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.add((int) (byte) -1, (int) '4');
        int int21 = calculator0.subtract((int) (byte) 1, 32);
        int int24 = calculator0.add(520297, 1810185236);
        int int27 = calculator0.multiply(164584658, (-1831640666));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-31) + "'", int21 == (-31));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1810705533 + "'", int24 == 1810705533);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 867680812 + "'", int27 == 867680812);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.subtract(2, 86713344);
        int int18 = calculator0.divide(1289275491, 69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713342) + "'", int15 == (-86713342));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18685152 + "'", int18 == 18685152);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
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
        int int30 = calculator0.multiply(867133591, (-1984132447));
        int int33 = calculator0.multiply((-1777481381), (-1404303256));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7955592 + "'", int27 == 7955592);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1382667017) + "'", int30 == (-1382667017));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1323869432 + "'", int33 == 1323869432);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.subtract((int) (byte) -1, 0);
        int int21 = calculator0.divide((-9312), 867133515);
        int int24 = calculator0.subtract(1237148863, 52);
        int int27 = calculator0.multiply(1271882624, 867133501);
        int int30 = calculator0.divide(827360554, 9012);
        int int33 = calculator0.add((-443263150), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1237148811 + "'", int24 == 1237148811);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-715737728) + "'", int27 == (-715737728));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 91806 + "'", int30 == 91806);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-443263150) + "'", int33 == (-443263150));
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.add(568480, 110);
        int int15 = calculator0.subtract(1787380221, 86713457);
        int int18 = calculator0.multiply(8671336, (-1481140680));
        int int21 = calculator0.multiply(178159040, (int) (byte) 0);
        int int24 = calculator0.divide(1512046592, (-173436042));
        int int27 = calculator0.subtract((-3528), 252638956);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1700666764 + "'", int15 == 1700666764);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-161052992) + "'", int18 == (-161052992));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-8) + "'", int24 == (-8));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-252642484) + "'", int27 == (-252642484));
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (short) -1, 867133491);
        int int12 = calculator0.multiply((-111), (-3528));
        int int15 = calculator0.add((-36), 1908264058);
        int int18 = calculator0.subtract(22, 26278408);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133491) + "'", int9 == (-867133491));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 391608 + "'", int12 == 391608);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1908264022 + "'", int15 == 1908264022);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-26278386) + "'", int18 == (-26278386));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.multiply((int) (short) 100, (-152));
        int int18 = calculator0.add(3563280, 867133491);
        int int21 = calculator0.divide((-568590), 1771178000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15200) + "'", int15 == (-15200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 870696771 + "'", int18 == 870696771);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.add((int) (byte) 1, (int) ' ');
        int int15 = calculator0.subtract(754840506, (-1984132447));
        int int18 = calculator0.multiply(1, 94);
        int int21 = calculator0.subtract(1248234937, (-1760882346));
        int int24 = calculator0.subtract(1503914342, (-636451305));
        int int27 = calculator0.multiply((-1145180104), (-1298016164));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1555994343) + "'", int15 == (-1555994343));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 94 + "'", int18 == 94);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1285850013) + "'", int21 == (-1285850013));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2140365647 + "'", int24 == 2140365647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1104571360) + "'", int27 == (-1104571360));
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.divide((-2020), (-10));
        int int21 = calculator0.add(1271882624, (-2243320));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 202 + "'", int18 == 202);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1269639304 + "'", int21 == 1269639304);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-110), (-867133491));
        int int12 = calculator0.multiply(1805776112, 78);
        int int15 = calculator0.add((-596556766), 0);
        int int18 = calculator0.subtract(1542690885, (-351564));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 867133381 + "'", int9 == 867133381);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-883384032) + "'", int12 == (-883384032));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-596556766) + "'", int15 == (-596556766));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1543042449 + "'", int18 == 1543042449);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
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
        int int30 = calculator0.add((-1559826432), 21975629);
        int int33 = calculator0.multiply((-816470980), (-206505725));
        int int36 = calculator0.subtract(1944410221, 665);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-86713457) + "'", int21 == (-86713457));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1700666664) + "'", int24 == (-1700666664));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1537850803) + "'", int30 == (-1537850803));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1744877388) + "'", int33 == (-1744877388));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1944409556 + "'", int36 == 1944409556);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.add(867133667, (-121));
        int int21 = calculator0.multiply((-2020), 867133501);
        int int24 = calculator0.subtract((-867133611), 1);
        int int27 = calculator0.add((-235439), 21975739);
        int int30 = calculator0.add(86713381, (-49173772));
        int int33 = calculator0.divide((-1865879362), 331885888);
        int int36 = calculator0.multiply(1030930688, 1870502511);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133546 + "'", int18 == 867133546);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 736984748 + "'", int21 == 736984748);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-867133612) + "'", int24 == (-867133612));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 21740300 + "'", int27 == 21740300);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 37539609 + "'", int30 == 37539609);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-5) + "'", int33 == (-5));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-371478784) + "'", int36 == (-371478784));
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.multiply((-36), 98);
        int int21 = calculator0.divide(232346588, (-1806625));
        int int24 = calculator0.multiply(18, (-428329688));
        int int27 = calculator0.subtract((-868687826), (-1435799477));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3528) + "'", int18 == (-3528));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-128) + "'", int21 == (-128));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 880000208 + "'", int24 == 880000208);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 567111651 + "'", int27 == 567111651);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((int) '#', (int) (short) -1);
        int int21 = calculator0.multiply((-2025976245), 241025717);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-252448505) + "'", int21 == (-252448505));
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.add(98, (int) (byte) 0);
        int int21 = calculator0.divide((-1140394960), (-8848318));
        int int24 = calculator0.add(52, (-1336575288));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 128 + "'", int21 == 128);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1336575236) + "'", int24 == (-1336575236));
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.subtract(96, 97);
        int int15 = calculator0.multiply((-45), (-23318356));
        int int18 = calculator0.divide((-1322291616), 25);
        int int21 = calculator0.divide(15, 1323847021);
        int int24 = calculator0.multiply((-1433052896), (-791214257));
        int int27 = calculator0.multiply(0, 428644672);
        int int30 = calculator0.multiply(799164324, (-868095506));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1049326020 + "'", int15 == 1049326020);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-52891664) + "'", int18 == (-52891664));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1822007072) + "'", int24 == (-1822007072));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-591995272) + "'", int30 == (-591995272));
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) '#', (-9312));
        int int18 = calculator0.subtract(1908264058, (-94668773));
        int int21 = calculator0.add(1356945246, (-1769916127));
        int int24 = calculator0.divide((-1285850013), (-13));
        int int27 = calculator0.add(151369422, (-405164773));
        int int30 = calculator0.add(167468044, 867154119);
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9347 + "'", int15 == 9347);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2002932831 + "'", int18 == 2002932831);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-412970881) + "'", int21 == (-412970881));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 98911539 + "'", int24 == 98911539);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-253795351) + "'", int27 == (-253795351));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1034622163 + "'", int30 == 1034622163);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide(100, 98);
        int int21 = calculator0.multiply(3563280, 867133546);
        int int24 = calculator0.subtract(86713381, 1730079900);
        int int27 = calculator0.multiply(86713381, (-173436042));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1494342816 + "'", int21 == 1494342816);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1643366519) + "'", int24 == (-1643366519));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1829824526 + "'", int27 == 1829824526);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
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
        int int30 = calculator0.divide((-1154271671), 1090625663);
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1806625) + "'", int21 == (-1806625));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6153309 + "'", int24 == 6153309);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1794490544 + "'", int27 == 1794490544);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.subtract(109, (int) (short) 100);
        int int15 = calculator0.multiply((-101), (int) (short) 10);
        int int18 = calculator0.multiply(86713344, 1700666764);
        int int21 = calculator0.multiply((-433567285), 1908264022);
        int int24 = calculator0.multiply((-757113354), (-173436074));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1010) + "'", int15 == (-1010));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-290738176) + "'", int18 == (-290738176));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2110419406) + "'", int21 == (-2110419406));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1889283420) + "'", int24 == (-1889283420));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.subtract(109, (int) (short) 100);
        int int15 = calculator0.add(290738210, 1236538979);
        int int18 = calculator0.subtract((-675399327), (-417546408));
        int int21 = calculator0.subtract(116, (-867133666));
        int int24 = calculator0.multiply((-1708752832), (-2125062739));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1527277189 + "'", int15 == 1527277189);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-257852919) + "'", int18 == (-257852919));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 867133782 + "'", int21 == 867133782);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-569644224) + "'", int24 == (-569644224));
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.multiply(1474273060, (-867133566));
        int int15 = calculator0.divide(1494342816, (-4864));
        int int18 = calculator0.multiply(1202467776, 859177974);
        int int21 = calculator0.subtract((-1638373376), 1066934297);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-240317368) + "'", int12 == (-240317368));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-307225) + "'", int15 == (-307225));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 244644480 + "'", int18 == 244644480);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1589659623 + "'", int21 == 1589659623);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
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
        int int30 = calculator0.multiply((-1214486912), (-403833));
        int int33 = calculator0.add(4580, 481696220);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-845157802) + "'", int24 == (-845157802));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-858032) + "'", int27 == (-858032));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1012331136) + "'", int30 == (-1012331136));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 481700800 + "'", int33 == 481700800);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.divide((-3), 86713344);
        int int15 = calculator0.subtract((-520200), (-15));
        int int18 = calculator0.subtract((-2020), 1237148765);
        int int21 = calculator0.add(0, 866523750);
        int int24 = calculator0.subtract((-869367269), 1);
        int int27 = calculator0.subtract(0, 2101335786);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-520185) + "'", int15 == (-520185));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1237150785) + "'", int18 == (-1237150785));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 866523750 + "'", int21 == 866523750);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-869367270) + "'", int24 == (-869367270));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2101335786) + "'", int27 == (-2101335786));
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.add(98, (int) (byte) 0);
        int int21 = calculator0.subtract((-111), (-111));
        int int24 = calculator0.add(197, (-757113551));
        int int27 = calculator0.subtract((-1889283420), 0);
        int int30 = calculator0.multiply((-1992851744), 1486954452);
        int int33 = calculator0.add(1810186246, (-1410665216));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-757113354) + "'", int24 == (-757113354));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1889283420) + "'", int27 == (-1889283420));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 624046464 + "'", int30 == 624046464);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 399521030 + "'", int33 == 399521030);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((-290), (-1887134100));
        int int21 = calculator0.subtract((-2051022112), 954669693);
        int int24 = calculator0.multiply(867133782, (-1495629227));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1887133810 + "'", int18 == 1887133810);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1289275491 + "'", int21 == 1289275491);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1275615858) + "'", int24 == (-1275615858));
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) ' ', (int) (byte) 100);
        int int15 = calculator0.subtract((-207), 86713344);
        int int18 = calculator0.divide((-96348159), 1013244259);
        int int21 = calculator0.subtract(461024588, 850335808);
        int int24 = calculator0.add(1612605694, (-15));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-68) + "'", int12 == (-68));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713551) + "'", int15 == (-86713551));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-389311220) + "'", int21 == (-389311220));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1612605679 + "'", int24 == 1612605679);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.add(1503914342, (-8085940));
        int int21 = calculator0.multiply(272082650, 1923);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1495828402 + "'", int18 == 1495828402);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-771074162) + "'", int21 == (-771074162));
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        int int21 = calculator0.divide((-1010), 86713455);
        int int24 = calculator0.add((int) (byte) 10, 867133491);
        int int27 = calculator0.subtract(0, 1759765077);
        int int30 = calculator0.multiply((-1964297059), 1144658859);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 867133501 + "'", int24 == 867133501);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1759765077) + "'", int27 == (-1759765077));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 960148447 + "'", int30 == 960148447);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide((-867133571), (-7600));
        int int21 = calculator0.subtract((-241122442), (-1977300990));
        int int24 = calculator0.add((-636136448), 1797117408);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 114096 + "'", int18 == 114096);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1736178548 + "'", int21 == 1736178548);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1160980960 + "'", int24 == 1160980960);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.multiply(867133511, (-7955431));
        int int15 = calculator0.divide((-1359151923), (-109415445));
        int int18 = calculator0.add((-382875396), 131);
        int int21 = calculator0.divide((-1259396283), 1219996744);
        int int24 = calculator0.subtract(1829561667, (-643593604));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1037464303 + "'", int12 == 1037464303);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-382875265) + "'", int18 == (-382875265));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1821812025) + "'", int24 == (-1821812025));
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
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
        int int33 = calculator0.divide((-1139871215), 656913876);
        int int36 = calculator0.add((int) '4', (-535833709));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-535833657) + "'", int36 == (-535833657));
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((int) (short) 10, 867133501);
        int int21 = calculator0.multiply(2, (-86713457));
        int int24 = calculator0.subtract(867133420, (int) (byte) 0);
        int int27 = calculator0.subtract(846070065, (-2093894088));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-173426914) + "'", int21 == (-173426914));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 867133420 + "'", int24 == 867133420);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1355003143) + "'", int27 == (-1355003143));
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
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
        int int30 = calculator0.subtract(1451815422, (-131));
        int int33 = calculator0.multiply(164584658, 441187696);
        java.lang.Class<?> wildcardClass34 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1700666764 + "'", int15 == 1700666764);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-161052992) + "'", int18 == (-161052992));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-8) + "'", int24 == (-8));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 766799182 + "'", int27 == 766799182);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1451815553 + "'", int30 == 1451815553);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1090902560) + "'", int33 == (-1090902560));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) '#', (-9312));
        int int18 = calculator0.multiply(86713455, 1769916224);
        int int21 = calculator0.subtract((-869367270), 3400);
        int int24 = calculator0.divide(0, (-11935997));
        int int27 = calculator0.divide((-555681720), 311387552);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9347 + "'", int15 == 9347);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1237148864 + "'", int18 == 1237148864);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-869370670) + "'", int21 == (-869370670));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.divide((int) 'a', (-207));
        int int21 = calculator0.multiply((-2243610), (int) '#');
        int int24 = calculator0.add(243351333, 1260801552);
        int int27 = calculator0.subtract(1432976652, (-159043629));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-78526350) + "'", int21 == (-78526350));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1504152885 + "'", int24 == 1504152885);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1592020281 + "'", int27 == 1592020281);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract(9, (-100));
        int int15 = calculator0.divide(76, 692692992);
        int int18 = calculator0.add((int) 'a', (-867133439));
        int int21 = calculator0.add(69, (-3528));
        int int24 = calculator0.subtract(21975739, (-932693954));
        int int27 = calculator0.add(2877446, (-96348159));
        int int30 = calculator0.multiply(2243220, 583692980);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109 + "'", int12 == 109);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-867133342) + "'", int18 == (-867133342));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3459) + "'", int21 == (-3459));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 954669693 + "'", int24 == 954669693);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-93470713) + "'", int27 == (-93470713));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 921638928 + "'", int30 == 921638928);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.subtract((int) (byte) -1, (int) (short) -1);
        int int15 = calculator0.add((-6858340), (-9280));
        int int18 = calculator0.add(1615472032, (-3463464));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6867620) + "'", int15 == (-6867620));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1612008568 + "'", int18 == 1612008568);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
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
        int int30 = calculator0.add((-402023608), (-1822007072));
        int int33 = calculator0.multiply(0, 1429824755);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 96 + "'", int21 == 96);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-867133566) + "'", int24 == (-867133566));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2070936616 + "'", int30 == 2070936616);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.subtract(76, (-867133439));
        int int18 = calculator0.divide(1219996744, 1219996744);
        int int21 = calculator0.subtract((-5), (-257508864));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133515 + "'", int15 == 867133515);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 257508859 + "'", int21 == 257508859);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.add((int) (byte) 1, (int) ' ');
        int int15 = calculator0.subtract(754840506, (-1984132447));
        int int18 = calculator0.multiply(1, 94);
        int int21 = calculator0.subtract(1248234937, (-1760882346));
        int int24 = calculator0.subtract(0, (-581169146));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1555994343) + "'", int15 == (-1555994343));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 94 + "'", int18 == 94);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1285850013) + "'", int21 == (-1285850013));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 581169146 + "'", int24 == 581169146);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply((-76), (int) (byte) 100);
        int int18 = calculator0.subtract((-867133440), 692692992);
        int int21 = calculator0.add(1477466179, (-1803015996));
        int int24 = calculator0.multiply(334907792, 0);
        int int27 = calculator0.add((-513482746), 623809483);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7600) + "'", int15 == (-7600));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1559826432) + "'", int18 == (-1559826432));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-325549817) + "'", int21 == (-325549817));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 110326737 + "'", int27 == 110326737);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide((int) (short) 10, (-173426914));
        int int21 = calculator0.add((-109415445), 1145169864);
        int int24 = calculator0.divide(1503190044, 850335808);
        int int27 = calculator0.subtract(278045632, 1771863899);
        int int30 = calculator0.subtract((-419172035), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1035754419 + "'", int21 == 1035754419);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1493818267) + "'", int27 == (-1493818267));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-419172035) + "'", int30 == (-419172035));
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.multiply((-68), 110);
        int int18 = calculator0.add(1371450554, (-49164339));
        int int21 = calculator0.multiply((-1964453610), 86713455);
        int int24 = calculator0.add(559873741, 1854);
        int int27 = calculator0.add(19, 792371715);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7480) + "'", int15 == (-7480));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1322286215 + "'", int18 == 1322286215);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2062827382) + "'", int21 == (-2062827382));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 559875595 + "'", int24 == 559875595);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 792371734 + "'", int27 == 792371734);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
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
        int int30 = calculator0.add((int) (byte) 100, 1307876110);
        int int33 = calculator0.divide((-213950436), (-586397423));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1271879224 + "'", int21 == 1271879224);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 287137964 + "'", int24 == 287137964);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1145651032) + "'", int27 == (-1145651032));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1307876210 + "'", int30 == 1307876210);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.subtract(1810185236, 1484018126);
        int int15 = calculator0.divide(13952966, (-7955431));
        int int18 = calculator0.multiply(1600482450, 1076459016);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 326167110 + "'", int12 == 326167110);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1634160496) + "'", int18 == (-1634160496));
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.divide((int) ' ', (-101));
        int int15 = calculator0.add(1152037484, (-6858340));
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1145179144 + "'", int15 == 1145179144);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.subtract(96, 97);
        int int15 = calculator0.multiply((-45), (-23318356));
        int int18 = calculator0.subtract(232346588, (-844637556));
        int int21 = calculator0.add(915784888, 1713901676);
        int int24 = calculator0.divide((-1494342816), (-866523730));
        int int27 = calculator0.subtract(822099412, 6992);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1049326020 + "'", int15 == 1049326020);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1076984144 + "'", int18 == 1076984144);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1665280732) + "'", int21 == (-1665280732));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 822092420 + "'", int27 == 822092420);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.subtract((-1), (-97));
        int int21 = calculator0.multiply(173435032, (-755028714));
        int int24 = calculator0.multiply(944516863, 1448299036);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 96 + "'", int18 == 96);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-214452976) + "'", int21 == (-214452976));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 345496036 + "'", int24 == 345496036);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.add(1503914342, (-8085940));
        int int21 = calculator0.add((-1), 1618313833);
        int int24 = calculator0.divide(1560881324, 1248234937);
        int int27 = calculator0.divide((-1408776206), 1813645151);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1495828402 + "'", int18 == 1495828402);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1618313832 + "'", int21 == 1618313832);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply((-76), (-7480));
        int int9 = calculator0.add(10107303, (-555681720));
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 568480 + "'", int6 == 568480);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-545574417) + "'", int9 == (-545574417));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.subtract(76, (-867133439));
        int int18 = calculator0.subtract((-976), 4213);
        int int21 = calculator0.divide(346346496, (-844637556));
        int int24 = calculator0.divide((-1582342682), 26401901);
        int int27 = calculator0.multiply((-1509824394), (-527237120));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133515 + "'", int15 == 867133515);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-5189) + "'", int18 == (-5189));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-59) + "'", int24 == (-59));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1144913920) + "'", int27 == (-1144913920));
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide((-68), (int) (byte) 100);
        int int12 = calculator0.subtract((-111), (int) (short) 10);
        int int15 = calculator0.multiply((-2152868), (-1909030067));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-121) + "'", int12 == (-121));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1177001388 + "'", int15 == 1177001388);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
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
        int int33 = calculator0.subtract((-76265), (-1634160496));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1634084231 + "'", int33 == 1634084231);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.subtract(8704872, (-617192603));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 625897475 + "'", int15 == 625897475);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
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
        int int33 = calculator0.multiply((-1021697043), (-290738176));
        java.lang.Class<?> wildcardClass34 = calculator0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1308749824 + "'", int33 == 1308749824);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(1145179144, 100);
        int int15 = calculator0.subtract(1237148811, (-240317368));
        int int18 = calculator0.multiply(86713457, 1257480666);
        int int21 = calculator0.subtract(0, (-1889283420));
        int int24 = calculator0.multiply(822099412, 1672101496);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1145179044 + "'", int12 == 1145179044);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1477466179 + "'", int15 == 1477466179);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-907339462) + "'", int18 == (-907339462));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1889283420 + "'", int21 == 1889283420);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 299783008 + "'", int24 == 299783008);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add(101, (-2020));
        int int12 = calculator0.subtract(0, (-11868326));
        // The following exception was thrown during execution in test generation
        try {
            int int15 = calculator0.divide(1691259644, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1919) + "'", int9 == (-1919));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11868326 + "'", int12 == 11868326);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.multiply((-86713457), 692692992);
        int int21 = calculator0.subtract(1271882624, 3400);
        int int24 = calculator0.divide(780440677, 867133667);
        int int27 = calculator0.multiply((-321074903), 2115365205);
        int int30 = calculator0.divide((-1769916233), (-257852919));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1271879224 + "'", int21 == 1271879224);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1187126173 + "'", int27 == 1187126173);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6 + "'", int30 == 6);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (short) -1, 867133491);
        int int12 = calculator0.multiply((-111), (-3528));
        int int15 = calculator0.add((-36), 1908264058);
        int int18 = calculator0.multiply(1383615488, 3325);
        int int21 = calculator0.multiply((-1403241466), 3400);
        int int24 = calculator0.divide(827360554, (-2145337780));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133491) + "'", int9 == (-867133491));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 391608 + "'", int12 == 391608);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1908264022 + "'", int15 == 1908264022);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 611523584 + "'", int18 == 611523584);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 687681456 + "'", int21 == 687681456);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.divide((-36), 33);
        int int18 = calculator0.divide((-207), 33);
        int int21 = calculator0.add(67686400, 861507584);
        int int24 = calculator0.add(0, 0);
        int int27 = calculator0.subtract((-867133571), 1455335579);
        int int30 = calculator0.multiply((-2016961242), (-453239991));
        int int33 = calculator0.divide((-706397057), (-228949765));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 929193984 + "'", int21 == 929193984);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1972498146 + "'", int27 == 1972498146);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1323749846 + "'", int30 == 1323749846);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.divide((int) (short) 0, 34);
        int int15 = calculator0.multiply(290738210, (-1336575288));
        int int18 = calculator0.divide((-715737728), (-761355104));
        int int21 = calculator0.subtract(225504013, 867133782);
        int int24 = calculator0.divide(954669693, (-1021697043));
        int int27 = calculator0.subtract(1134921440, 0);
        int int30 = calculator0.multiply((-1442532940), (-1617647721));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1286025584) + "'", int15 == (-1286025584));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-641629769) + "'", int21 == (-641629769));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1134921440 + "'", int27 == 1134921440);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-524206804) + "'", int30 == (-524206804));
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.add(51, (-97));
        int int15 = calculator0.multiply(1978473568, 1810185237);
        int int18 = calculator0.multiply((-211766202), 110);
        int int21 = calculator0.add(380865840, 1567902008);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-46) + "'", int12 == (-46));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1057369120) + "'", int15 == (-1057369120));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1819445740) + "'", int18 == (-1819445740));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1948767848 + "'", int21 == 1948767848);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.multiply((-1923), 2115365205);
        int int12 = calculator0.divide((-2453011), (-822768));
        int int15 = calculator0.add(346346496, 1751623880);
        int int18 = calculator0.divide((-343730176), 1408199649);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-513259903) + "'", int9 == (-513259903));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2097970376 + "'", int15 == 2097970376);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.subtract((-100), 2243220);
        int int21 = calculator0.subtract((-86713342), 0);
        int int24 = calculator0.divide(1236538979, 907339462);
        int int27 = calculator0.multiply(1610443202, (-3600));
        int int30 = calculator0.multiply((-2037396585), 1675555702);
        int int33 = calculator0.divide(1504152885, (-1699047240));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2243320) + "'", int18 == (-2243320));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-86713342) + "'", int21 == (-86713342));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 610322400 + "'", int27 == 610322400);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1987718298 + "'", int30 == 1987718298);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.multiply((int) (short) 100, (-152));
        int int18 = calculator0.divide((-1248231612), 1754528548);
        int int21 = calculator0.multiply((-16428397), 11);
        int int24 = calculator0.subtract((-1475970418), (-272902));
        int int27 = calculator0.subtract((-198788080), 692692);
        int int30 = calculator0.multiply(1037464303, (-1526379269));
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15200) + "'", int15 == (-15200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-180712367) + "'", int21 == (-180712367));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1475697516) + "'", int24 == (-1475697516));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-199480772) + "'", int27 == (-199480772));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1794333611) + "'", int30 == (-1794333611));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide((-68), (int) (byte) 100);
        int int12 = calculator0.subtract((-111), (int) (short) 10);
        int int15 = calculator0.divide((-12), (-1475970418));
        int int18 = calculator0.subtract(2040107520, 870696823);
        int int21 = calculator0.divide((-6832992), (-1462967));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-121) + "'", int12 == (-121));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1169410697 + "'", int18 == 1169410697);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
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
        int int36 = calculator0.divide((-610064315), (-1869161959));
        int int39 = calculator0.subtract(1322291737, 346346583);
        int int42 = calculator0.multiply((-1582342682), 339618637);
        int int45 = calculator0.add((-1003073195), 8671272);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 975945154 + "'", int39 == 975945154);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-868687826) + "'", int42 == (-868687826));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-994401923) + "'", int45 == (-994401923));
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', 1);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
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
        int int30 = calculator0.add((-867133431), 109415477);
        int int33 = calculator0.add((-1559826432), 2133564696);
        int int36 = calculator0.divide(1391530220, 6992);
        int int39 = calculator0.multiply((-481126177), 0);
        int int42 = calculator0.add((-1217368163), (-2145343763));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-68) + "'", int12 == (-68));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713551) + "'", int15 == (-86713551));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 119647579 + "'", int18 == 119647579);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-14) + "'", int21 == (-14));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1612493261) + "'", int24 == (-1612493261));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9552704 + "'", int27 == 9552704);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-757717954) + "'", int30 == (-757717954));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 573738264 + "'", int33 == 573738264);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 199017 + "'", int36 == 199017);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 932255370 + "'", int42 == 932255370);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
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
        int int42 = calculator0.multiply(1931212123, (-1012025939));
        int int45 = calculator0.divide((-706075547), 95);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1378015873) + "'", int42 == (-1378015873));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-7432374) + "'", int45 == (-7432374));
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) ' ', (int) (byte) 100);
        int int15 = calculator0.subtract((-207), 86713344);
        int int18 = calculator0.subtract((-867133491), (-7567));
        int int21 = calculator0.multiply(1154271574, 867154995);
        int int24 = calculator0.multiply((-34682053), 867133581);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-68) + "'", int12 == (-68));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713551) + "'", int15 == (-86713551));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-867125924) + "'", int18 == (-867125924));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-596556766) + "'", int21 == (-596556766));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1922373761) + "'", int24 == (-1922373761));
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = calculator0.divide(72529, 109);
        int int27 = calculator0.subtract(1591253037, 1560033440);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 665 + "'", int24 == 665);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 31219597 + "'", int27 == 31219597);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((-110), (-68));
        int int9 = calculator0.divide(1756652153, (-867138628));
        int int12 = calculator0.divide(378379962, (int) (short) 1);
        int int15 = calculator0.add((-867133431), 110);
        int int18 = calculator0.add(0, (-341775360));
        int int21 = calculator0.add((-1849536748), 2016961242);
        int int24 = calculator0.subtract(286988612, 1648341630);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 378379962 + "'", int12 == 378379962);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133321) + "'", int15 == (-867133321));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-341775360) + "'", int18 == (-341775360));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 167424494 + "'", int21 == 167424494);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1361353018) + "'", int24 == (-1361353018));
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
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
        int int30 = calculator0.divide(1122529476, 2033296844);
        int int33 = calculator0.divide((-382875265), 1576036460);
        int int36 = calculator0.multiply((-1433763485), 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 665305 + "'", int21 == 665305);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1925360681 + "'", int24 == 1925360681);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 780440677 + "'", int27 == 780440677);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1402147690 + "'", int36 == 1402147690);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.multiply(34, (-685834));
        int int21 = calculator0.subtract((-74870788), 0);
        int int24 = calculator0.subtract(887128884, (-685834));
        int int27 = calculator0.multiply(258238464, (-1919));
        int int30 = calculator0.divide((-934840515), 378379962);
        int int33 = calculator0.multiply((-867133439), 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-23318356) + "'", int18 == (-23318356));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-74870788) + "'", int21 == (-74870788));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 887814718 + "'", int24 == 887814718);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1638373376) + "'", int27 == (-1638373376));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2) + "'", int30 == (-2));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 960968797 + "'", int33 == 960968797);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.add(33, (-7600));
        int int21 = calculator0.divide(479308859, (-757944310));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (short) -1, 867133491);
        int int12 = calculator0.multiply((-111), (-3528));
        int int15 = calculator0.add((-36), 1908264058);
        int int18 = calculator0.divide(1897078486, 86605184);
        int int21 = calculator0.add(51, (-13365));
        int int24 = calculator0.divide(417847584, (-1269639346));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133491) + "'", int9 == (-867133491));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 391608 + "'", int12 == 391608);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1908264022 + "'", int15 == 1908264022);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 21 + "'", int18 == 21);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-13314) + "'", int21 == (-13314));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.add(51, (int) (short) 1);
        int int15 = calculator0.add(1700666764, 96);
        int int18 = calculator0.add(96, 67686400);
        int int21 = calculator0.add(65689586, 757717952);
        int int24 = calculator0.add((-1772161564), (-1357151768));
        int int27 = calculator0.divide(1216121472, 824566);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1700666860 + "'", int15 == 1700666860);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 67686496 + "'", int18 == 67686496);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 823407538 + "'", int21 == 823407538);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1165653964 + "'", int24 == 1165653964);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1474 + "'", int27 == 1474);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.add(457755302, (-50514530));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 407240772 + "'", int12 == 407240772);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (short) -1, 867133491);
        int int12 = calculator0.subtract((-86), (-109415563));
        int int15 = calculator0.add((-4967), (-520485000));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133491) + "'", int9 == (-867133491));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109415477 + "'", int12 == 109415477);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-520489967) + "'", int15 == (-520489967));
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.divide((int) (short) 0, 34);
        int int15 = calculator0.divide((-1494342816), (-68));
        int int18 = calculator0.add(216030809, 55497);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 21975629 + "'", int15 == 21975629);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 216086306 + "'", int18 == 216086306);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.multiply(867133511, (-7955431));
        int int15 = calculator0.add((-1248231612), 1700666764);
        int int18 = calculator0.add(272082650, (-1772161564));
        int int21 = calculator0.multiply((-13314), 0);
        int int24 = calculator0.add((-691857708), 932255370);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1037464303 + "'", int12 == 1037464303);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 452435152 + "'", int15 == 452435152);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1500078914) + "'", int18 == (-1500078914));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 240397662 + "'", int24 == 240397662);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) '#', (-9312));
        int int18 = calculator0.divide((-97), (-867138628));
        int int21 = calculator0.divide(1395, (-867125924));
        int int24 = calculator0.add(452435152, 5);
        int int27 = calculator0.divide((-1823775808), 196);
        int int30 = calculator0.multiply(935975073, 277224907);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9347 + "'", int15 == 9347);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 452435157 + "'", int24 == 452435157);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-9304978) + "'", int27 == (-9304978));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1897986901) + "'", int30 == (-1897986901));
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.divide(25, (-1923));
        int int12 = calculator0.multiply((-15300), 34);
        int int15 = calculator0.subtract(1152037484, (-109415563));
        int int18 = calculator0.divide(1810186246, (-78));
        int int21 = calculator0.divide((int) (short) 100, (-214132468));
        int int24 = calculator0.divide(1269639319, (-382875265));
        int int27 = calculator0.divide((-109415539), (-1181548544));
        int int30 = calculator0.multiply(867133782, (-1408776192));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-520200) + "'", int12 == (-520200));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1261453047 + "'", int15 == 1261453047);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-23207515) + "'", int18 == (-23207515));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1281019904) + "'", int30 == (-1281019904));
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide((-68), (int) (byte) 100);
        int int12 = calculator0.divide(0, (-121));
        int int15 = calculator0.multiply(0, 7029297);
        int int18 = calculator0.multiply(0, 0);
        int int21 = calculator0.multiply((-11877700), 1395);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 610477684 + "'", int21 == 610477684);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.divide((-2020), (-10));
        int int21 = calculator0.multiply((-173436074), (-444040511));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 202 + "'", int18 == 202);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 952045526 + "'", int21 == 952045526);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
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
        int int33 = calculator0.subtract((-2146806852), (-1769916123));
        int int36 = calculator0.divide(1090625663, (-1735));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-376890729) + "'", int33 == (-376890729));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-628602) + "'", int36 == (-628602));
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
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
        int int30 = calculator0.add((-867133431), 109415477);
        int int33 = calculator0.add((-1559826432), 2133564696);
        int int36 = calculator0.multiply(0, (-272082615));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-68) + "'", int12 == (-68));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713551) + "'", int15 == (-86713551));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 119647579 + "'", int18 == 119647579);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-14) + "'", int21 == (-14));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1612493261) + "'", int24 == (-1612493261));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9552704 + "'", int27 == 9552704);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-757717954) + "'", int30 == (-757717954));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 573738264 + "'", int33 == 573738264);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.multiply((int) (short) 100, (-152));
        int int18 = calculator0.divide((-1248231612), 1754528548);
        int int21 = calculator0.subtract(1020465408, 0);
        int int24 = calculator0.multiply((-2115365052), (-108673964));
        int int27 = calculator0.divide((-46566313), (-1152038506));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15200) + "'", int15 == (-15200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1020465408 + "'", int21 == 1020465408);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 351515216 + "'", int24 == 351515216);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.subtract(1332193418, (-1351082743));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1611691135) + "'", int18 == (-1611691135));
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.multiply(1322286215, 867133501);
        int int21 = calculator0.add(1001242336, 13276316);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2139980843 + "'", int18 == 2139980843);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1014518652 + "'", int21 == 1014518652);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
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
        int int39 = calculator0.add((-7600), 4);
        int int42 = calculator0.multiply((-8), 675399327);
        java.lang.Class<?> wildcardClass43 = calculator0.getClass();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-7596) + "'", int39 == (-7596));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1108227320) + "'", int42 == (-1108227320));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.divide(51, 109);
        int int18 = calculator0.divide(2233940, (-1155286483));
        int int21 = calculator0.multiply((-425809696), 687681456);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1821033984) + "'", int21 == (-1821033984));
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.add(520297, (-867133611));
        int int18 = calculator0.divide(272082650, 757944224);
        int int21 = calculator0.multiply(2130112384, (-1265410680));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-866613314) + "'", int15 == (-866613314));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1364149248) + "'", int21 == (-1364149248));
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
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
        int int33 = calculator0.subtract(1401642152, 1047786071);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 353856081 + "'", int33 == 353856081);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (short) -1, 867133491);
        int int12 = calculator0.add(95596657, 334907792);
        int int15 = calculator0.divide(1394242624, 1693566793);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133491) + "'", int9 == (-867133491));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 430504449 + "'", int12 == 430504449);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) ' ', (int) (byte) 100);
        int int15 = calculator0.subtract((-207), 86713344);
        int int18 = calculator0.subtract(119647596, 17);
        int int21 = calculator0.multiply((-867133329), (-7955431));
        int int24 = calculator0.subtract((-39007237), (-1275615858));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-68) + "'", int12 == (-68));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713551) + "'", int15 == (-86713551));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 119647579 + "'", int18 == 119647579);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1809614551 + "'", int21 == 1809614551);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1236608621 + "'", int24 == 1236608621);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.add(867133667, (-121));
        int int21 = calculator0.subtract(0, (-1908264058));
        int int24 = calculator0.add(1954118219, 2016961242);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133546 + "'", int18 == 867133546);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1908264058 + "'", int21 == 1908264058);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-323887835) + "'", int24 == (-323887835));
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
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
        int int30 = calculator0.subtract(983083596, 853334016);
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11095) + "'", int21 == (-11095));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3463464) + "'", int24 == (-3463464));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 815031976 + "'", int27 == 815031976);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 129749580 + "'", int30 == 129749580);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((-68), (int) (byte) 10);
        int int21 = calculator0.add((-86713551), 94);
        int int24 = calculator0.multiply(67686400, 9277);
        int int27 = calculator0.multiply(275201967, 1592020281);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-86713457) + "'", int21 == (-86713457));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 861507584 + "'", int24 == 861507584);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1358901001) + "'", int27 == (-1358901001));
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply((-76), (int) (byte) 100);
        int int18 = calculator0.subtract((-867133440), 692692992);
        int int21 = calculator0.add(1477466179, (-1803015996));
        int int24 = calculator0.multiply(0, (-586398088));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7600) + "'", int15 == (-7600));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1559826432) + "'", int18 == (-1559826432));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-325549817) + "'", int21 == (-325549817));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.add(0, (-1010));
        int int21 = calculator0.multiply((-198788080), (-214452976));
        int int24 = calculator0.multiply(1013244259, 359594049);
        int int27 = calculator0.subtract(1850343877, (-588882335));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1010) + "'", int18 == (-1010));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1020465408 + "'", int21 == 1020465408);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 125772323 + "'", int24 == 125772323);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1855741084) + "'", int27 == (-1855741084));
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract(9, (-100));
        int int15 = calculator0.add(1733781449, 18);
        int int18 = calculator0.add((-767), (-1855610599));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109 + "'", int12 == 109);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1733781467 + "'", int15 == 1733781467);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1855611366) + "'", int18 == (-1855611366));
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((-110), (-68));
        int int9 = calculator0.add((-97), 8671369);
        int int12 = calculator0.multiply(37474034, 1931212123);
        int int15 = calculator0.divide(867133581, 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8671272 + "'", int9 == 8671272);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1848235514) + "'", int12 == (-1848235514));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 39415162 + "'", int15 == 39415162);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.subtract(2, 86713344);
        int int18 = calculator0.subtract(757717952, 2877446);
        int int21 = calculator0.subtract(868979689, (-86));
        int int24 = calculator0.add((-867133571), (-868085942));
        int int27 = calculator0.multiply((-1746895405), (-1270709336));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713342) + "'", int15 == (-86713342));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 754840506 + "'", int18 == 754840506);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 868979775 + "'", int21 == 868979775);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1735219513) + "'", int24 == (-1735219513));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1478200184 + "'", int27 == 1478200184);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.subtract((-86713342), 86713455);
        int int21 = calculator0.subtract(1, (-152));
        int int24 = calculator0.add(1606894920, (-847911442));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-173426797) + "'", int18 == (-173426797));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 153 + "'", int21 == 153);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 758983478 + "'", int24 == 758983478);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.add(51, (int) (short) 1);
        int int15 = calculator0.add((-433567285), 26278408);
        int int18 = calculator0.divide((-1746908719), 1170137828);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-407288877) + "'", int15 == (-407288877));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.multiply((int) (short) 10, 0);
        int int12 = calculator0.subtract((-867136765), 1152037484);
        int int15 = calculator0.add(765145078, 1200448611);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2019174249) + "'", int12 == (-2019174249));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1965593689 + "'", int15 == 1965593689);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.multiply(284903989, 21975629);
        int int15 = calculator0.subtract(963497028, 334907792);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1263186959) + "'", int12 == (-1263186959));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 628589236 + "'", int15 == 628589236);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide(1219996744, 109415572);
        int int21 = calculator0.divide(1769916224, (-24578));
        int int24 = calculator0.divide(1754530371, (-867133342));
        int int27 = calculator0.add((-976), (-1286025584));
        int int30 = calculator0.add(0, 1248231440);
        int int33 = calculator0.divide(1751623880, 1477466179);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-72012) + "'", int21 == (-72012));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1286026560) + "'", int27 == (-1286026560));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1248231440 + "'", int30 == 1248231440);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.subtract(96, 97);
        int int15 = calculator0.multiply((-45), (-23318356));
        int int18 = calculator0.divide((-1322291616), 25);
        int int21 = calculator0.subtract(868979689, (-1738066976));
        int int24 = calculator0.add(52, 916297905);
        int int27 = calculator0.divide((-1480882280), 715729368);
        int int30 = calculator0.subtract(1877043160, 12396254);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1049326020 + "'", int15 == 1049326020);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-52891664) + "'", int18 == (-52891664));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1687920631) + "'", int21 == (-1687920631));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 916297957 + "'", int24 == 916297957);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2) + "'", int27 == (-2));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1864646906 + "'", int30 == 1864646906);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((-101), (-86));
        int int15 = calculator0.add((-362406912), (-173426797));
        int int18 = calculator0.subtract(2129948464, 1730079900);
        int int21 = calculator0.add((-18090313), (-917629359));
        int int24 = calculator0.add(1409005073, 284903989);
        int int27 = calculator0.add(0, 815267415);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-15) + "'", int12 == (-15));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-535833709) + "'", int15 == (-535833709));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 399868564 + "'", int18 == 399868564);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-935719672) + "'", int21 == (-935719672));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1693909062 + "'", int24 == 1693909062);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 815267415 + "'", int27 == 815267415);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.divide(30, (-934840515));
        int int21 = calculator0.add(173435032, 1271869877);
        int int24 = calculator0.subtract(109415477, 4213);
        int int27 = calculator0.divide((-322124534), 1495828402);
        int int30 = calculator0.add((-1735219513), (-586109830));
        int int33 = calculator0.multiply(0, (-1494342816));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1445304909 + "'", int21 == 1445304909);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 109411264 + "'", int24 == 109411264);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1973637953 + "'", int30 == 1973637953);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.divide(0, 108673896);
        int int21 = calculator0.divide((-147803916), (-52891664));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.divide(25, (-1923));
        int int12 = calculator0.multiply((-15300), 34);
        int int15 = calculator0.subtract(1152037484, (-109415563));
        int int18 = calculator0.divide(1810186246, (-78));
        int int21 = calculator0.divide((int) (short) 100, (-214132468));
        int int24 = calculator0.divide(1269639319, (-382875265));
        int int27 = calculator0.divide((-109415539), (-1181548544));
        int int30 = calculator0.divide(0, (-46566313));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-520200) + "'", int12 == (-520200));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1261453047 + "'", int15 == 1261453047);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-23207515) + "'", int18 == (-23207515));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide(1219996744, 109415572);
        int int21 = calculator0.divide(1769916224, (-24578));
        int int24 = calculator0.subtract(130, (-1145651032));
        int int27 = calculator0.add((-173), (-412970881));
        int int30 = calculator0.subtract((-1152037337), (-660735808));
        int int33 = calculator0.add((-214452976), 173434997);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-72012) + "'", int21 == (-72012));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1145651162 + "'", int24 == 1145651162);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-412971054) + "'", int27 == (-412971054));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-491301529) + "'", int30 == (-491301529));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-41017979) + "'", int33 == (-41017979));
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((int) '#', (int) ' ');
        int int18 = calculator0.add(34, (-1010));
        int int21 = calculator0.multiply(568480, (-6));
        int int24 = calculator0.add((-2146806784), 1693566793);
        int int27 = calculator0.add(1860699766, (-1815930810));
        int int30 = calculator0.subtract((-23318356), 0);
        int int33 = calculator0.multiply((-47078120), 460697368);
        int int36 = calculator0.subtract(1095947727, (-1638373376));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-976) + "'", int18 == (-976));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3410880) + "'", int21 == (-3410880));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-453239991) + "'", int24 == (-453239991));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 44768956 + "'", int27 == 44768956);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-23318356) + "'", int30 == (-23318356));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1468341696) + "'", int33 == (-1468341696));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1560646193) + "'", int36 == (-1560646193));
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply(0, 1810705533);
        int int24 = calculator0.subtract((-341775360), 52);
        int int27 = calculator0.multiply(1772546271, 88947384);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-341775412) + "'", int24 == (-341775412));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 650962504 + "'", int27 == 650962504);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.subtract(109, (int) (short) 100);
        int int15 = calculator0.subtract((-36), (-31));
        int int18 = calculator0.divide((-1807123776), 110);
        int int21 = calculator0.divide((-111), (-49164339));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-16428397) + "'", int18 == (-16428397));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((int) (short) 10, 867133501);
        int int21 = calculator0.add((-3528), (-7567));
        int int24 = calculator0.divide((-346346486), (int) (short) 100);
        int int27 = calculator0.multiply((-214132678), (-341775360));
        int int30 = calculator0.subtract((-2040839154), 95);
        int int33 = calculator0.divide(1898423640, (-1214133661));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11095) + "'", int21 == (-11095));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3463464) + "'", int24 == (-3463464));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1049982976 + "'", int27 == 1049982976);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2040839249) + "'", int30 == (-2040839249));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.multiply((int) (short) 100, (-152));
        int int18 = calculator0.divide((-1248231612), 1754528548);
        int int21 = calculator0.subtract(1020465408, 0);
        int int24 = calculator0.multiply((-2115365052), (-108673964));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15200) + "'", int15 == (-15200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1020465408 + "'", int21 == 1020465408);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 351515216 + "'", int24 == 351515216);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.add(520297, (-867133611));
        int int18 = calculator0.add((-287587), (-3410880));
        int int21 = calculator0.subtract((-350777344), 170434784);
        int int24 = calculator0.add(1648038772, (-2003687584));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-866613314) + "'", int15 == (-866613314));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3698467) + "'", int18 == (-3698467));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-521212128) + "'", int21 == (-521212128));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-355648812) + "'", int24 == (-355648812));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.multiply((-68), 110);
        int int18 = calculator0.add(1371450554, (-49164339));
        int int21 = calculator0.multiply((-1964453610), 86713455);
        int int24 = calculator0.add((-207), (-2019171204));
        int int27 = calculator0.add(929193984, 1429923579);
        int int30 = calculator0.multiply(805126238, (-1654422440));
        int int33 = calculator0.multiply((-1772730154), 241122652);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7480) + "'", int15 == (-7480));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1322286215 + "'", int18 == 1322286215);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2062827382) + "'", int21 == (-2062827382));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2019171411) + "'", int24 == (-2019171411));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1935849733) + "'", int27 == (-1935849733));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1634166704) + "'", int30 == (-1634166704));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1372007144 + "'", int33 == 1372007144);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
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
        int int33 = calculator0.divide(1559022262, 1812093894);
        int int36 = calculator0.divide((-565380992), (-790863593));
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide((-68), (int) (byte) 100);
        int int12 = calculator0.subtract((-111), (int) (short) 10);
        int int15 = calculator0.divide(745957086, 109);
        int int18 = calculator0.divide(1558344461, 66);
        int int21 = calculator0.subtract(94, (-1523011220));
        int int24 = calculator0.multiply((-2129939117), (-1710057022));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-121) + "'", int12 == (-121));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6843642 + "'", int15 == 6843642);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 23611279 + "'", int18 == 23611279);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1523011314 + "'", int21 == 1523011314);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2014577638 + "'", int24 == 2014577638);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply((-7567), (int) 'a');
        int int9 = calculator0.divide(1013248472, 1613011524);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-733999) + "'", int6 == (-733999));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
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
        int int33 = calculator0.multiply(1503190044, (-1475697516));
        java.lang.Class<?> wildcardClass34 = calculator0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1300680656) + "'", int33 == (-1300680656));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.subtract(76, (-867133439));
        int int18 = calculator0.subtract((-976), 4213);
        int int21 = calculator0.divide(346346496, (-844637556));
        int int24 = calculator0.divide((-1582342682), 26401901);
        int int27 = calculator0.add(1075835744, 0);
        int int30 = calculator0.add((-2020), 991518632);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133515 + "'", int15 == 867133515);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-5189) + "'", int18 == (-5189));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-59) + "'", int24 == (-59));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1075835744 + "'", int27 == 1075835744);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 991516612 + "'", int30 == 991516612);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.multiply(867133511, (-7955431));
        int int15 = calculator0.divide((-1359151923), (-109415445));
        int int18 = calculator0.subtract((-2110419406), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1037464303 + "'", int12 == 1037464303);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2110419406) + "'", int18 == (-2110419406));
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
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
        int int30 = calculator0.add((-737836352), 1532534932);
        int int33 = calculator0.divide(1612605694, (-81599172));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-867154019) + "'", int12 == (-867154019));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867154995 + "'", int15 == 867154995);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-171620238) + "'", int18 == (-171620238));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1323847021 + "'", int24 == 1323847021);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1154271478 + "'", int27 == 1154271478);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 794698580 + "'", int30 == 794698580);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-19) + "'", int33 == (-19));
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
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
        int int36 = calculator0.divide((-610064315), (-1869161959));
        int int39 = calculator0.subtract(1322291737, 346346583);
        int int42 = calculator0.multiply((-1582342682), 339618637);
        int int45 = calculator0.subtract(0, 1237148811);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 975945154 + "'", int39 == 975945154);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-868687826) + "'", int42 == (-868687826));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1237148811) + "'", int45 == (-1237148811));
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.subtract((int) (byte) -1, (int) (short) -1);
        int int15 = calculator0.add((-6858340), (-9280));
        int int18 = calculator0.divide(897963264, 94);
        int int21 = calculator0.divide((-1700666664), (int) (byte) 10);
        int int24 = calculator0.multiply((-171620289), 501219328);
        int int27 = calculator0.subtract((-2243320), 0);
        int int30 = calculator0.divide((-867133782), (-1103074048));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6867620) + "'", int15 == (-6867620));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9552800 + "'", int18 == 9552800);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-170066666) + "'", int21 == (-170066666));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1512046592 + "'", int24 == 1512046592);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2243320) + "'", int27 == (-2243320));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', 1);
        int int15 = calculator0.multiply((-111), (-1919));
        int int18 = calculator0.divide(1212612512, (-513482746));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 213009 + "'", int15 == 213009);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.multiply((int) (short) 100, (-152));
        int int18 = calculator0.add(20580, (-241122442));
        int int21 = calculator0.add(846070065, (-1925360682));
        int int24 = calculator0.divide(86713344, (-1351018341));
        int int27 = calculator0.multiply(0, 273998385);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15200) + "'", int15 == (-15200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-241101862) + "'", int18 == (-241101862));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1079290617) + "'", int21 == (-1079290617));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
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
        int int30 = calculator0.add((-16428397), (-1459544222));
        int int33 = calculator0.add(1486954504, (-52));
        java.lang.Class<?> wildcardClass34 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6858340) + "'", int18 == (-6858340));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1058206662) + "'", int21 == (-1058206662));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17 + "'", int24 == 17);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-868095375) + "'", int27 == (-868095375));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1475972619) + "'", int30 == (-1475972619));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1486954452 + "'", int33 == 1486954452);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.divide((-36), 33);
        int int18 = calculator0.divide((-207), 33);
        int int21 = calculator0.add((-867133440), 9);
        int int24 = calculator0.divide(650962504, 1544275949);
        int int27 = calculator0.subtract((-1201602560), (-971832620));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-867133431) + "'", int21 == (-867133431));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-229769940) + "'", int27 == (-229769940));
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
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
        int int30 = calculator0.multiply(692692992, 1448299036);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49164339 + "'", int18 == 49164339);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9433) + "'", int21 == (-9433));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-220) + "'", int24 == (-220));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1184784384 + "'", int30 == 1184784384);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.divide((-36), 33);
        int int18 = calculator0.add(1322286213, (-26));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1322286187 + "'", int18 == 1322286187);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.add(867133667, (-121));
        int int21 = calculator0.subtract(0, (-1908264058));
        int int24 = calculator0.subtract((-1077354804), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133546 + "'", int18 == 867133546);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1908264058 + "'", int21 == 1908264058);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1077354804) + "'", int24 == (-1077354804));
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
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
        int int33 = calculator0.divide((-1538240), 1168096256);
        int int36 = calculator0.multiply(2924252, (-16498720));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1047321472) + "'", int36 == (-1047321472));
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide(0, (-2037396585));
        int int12 = calculator0.subtract(0, (-675399327));
        int int15 = calculator0.multiply(1168096256, 6596677);
        int int18 = calculator0.subtract((-1435799710), 1925360681);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 675399327 + "'", int12 == 675399327);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 124627968 + "'", int15 == 124627968);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 933806905 + "'", int18 == 933806905);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (short) -1, 867133491);
        int int12 = calculator0.multiply((-111), (-3528));
        int int15 = calculator0.divide(0, (-3));
        int int18 = calculator0.add(1517596387, 1610593080);
        int int21 = calculator0.add(5419, 788607196);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133491) + "'", int9 == (-867133491));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 391608 + "'", int12 == 391608);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1166777829) + "'", int18 == (-1166777829));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 788612615 + "'", int21 == 788612615);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.subtract(20580, (-867133439));
        int int21 = calculator0.multiply(1237148864, (-97));
        int int24 = calculator0.subtract(1938174875, 1458866016);
        int int27 = calculator0.divide(6992, (-29145099));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867154019 + "'", int18 == 867154019);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 255644480 + "'", int21 == 255644480);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 479308859 + "'", int24 == 479308859);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide((-867133439), 9);
        int int12 = calculator0.subtract(0, 867154019);
        int int15 = calculator0.subtract(867154019, (-976));
        int int18 = calculator0.add((-171620289), 51);
        int int21 = calculator0.divide(1269639304, (-1769916127));
        int int24 = calculator0.divide((-1145179180), (-1951649816));
        int int27 = calculator0.add(1236538979, 910738184);
        int int30 = calculator0.add((-288390016), 241122652);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-867154019) + "'", int12 == (-867154019));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867154995 + "'", int15 == 867154995);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-171620238) + "'", int18 == (-171620238));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147277163 + "'", int27 == 2147277163);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-47267364) + "'", int30 == (-47267364));
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.add(568480, 110);
        int int15 = calculator0.subtract(1787380221, 86713457);
        int int18 = calculator0.multiply(8671336, (-1481140680));
        int int21 = calculator0.multiply(178159040, (int) (byte) 0);
        int int24 = calculator0.divide(406425903, (-866613314));
        int int27 = calculator0.multiply((-1359151923), 692692);
        int int30 = calculator0.divide((-1746908719), (-1734168576));
        int int33 = calculator0.subtract((-1214133661), 227);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1700666764 + "'", int15 == 1700666764);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-161052992) + "'", int18 == (-161052992));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 347305668 + "'", int27 == 347305668);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1214133888) + "'", int33 == (-1214133888));
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.divide((int) ' ', (-101));
        int int15 = calculator0.add(1152037484, (-6858340));
        int int18 = calculator0.divide(4213, 867133667);
        int int21 = calculator0.divide((-1123990489), 29811430);
        int int24 = calculator0.subtract(1202216254, 458092924);
        int int27 = calculator0.add(1726946994, 93889170);
        int int30 = calculator0.add((-1328086335), (-1422605012));
        int int33 = calculator0.subtract(492096612, 822092420);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1145179144 + "'", int15 == 1145179144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-37) + "'", int21 == (-37));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 744123330 + "'", int24 == 744123330);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1820836164 + "'", int27 == 1820836164);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1544275949 + "'", int30 == 1544275949);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-329995808) + "'", int33 == (-329995808));
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((int) '#', (int) ' ');
        int int18 = calculator0.add(34, (-1010));
        int int21 = calculator0.add(21975629, (-1777146311));
        int int24 = calculator0.multiply(55497, (-52258851));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-976) + "'", int18 == (-976));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1755170682) + "'", int21 == (-1755170682));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1106529147) + "'", int24 == (-1106529147));
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.multiply((-9312), (-9312));
        int int15 = calculator0.multiply(18, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713344 + "'", int12 == 86713344);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.add((-609787), 1237148765);
        int int18 = calculator0.divide(1289275491, (-290738176));
        int int21 = calculator0.divide((-877756064), 880000208);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1236538978 + "'", int15 == 1236538978);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4) + "'", int18 == (-4));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
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
        int int30 = calculator0.subtract((-724907020), 1371455955);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1806625) + "'", int21 == (-1806625));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6153309 + "'", int24 == 6153309);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1794490544 + "'", int27 == 1794490544);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2096362975) + "'", int30 == (-2096362975));
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
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
        int int30 = calculator0.divide(736984748, (-1556003565));
        int int33 = calculator0.add(0, (-462904064));
        int int36 = calculator0.subtract(1797117408, (-1403241466));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1520179488 + "'", int24 == 1520179488);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-462904064) + "'", int33 == (-462904064));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1094608422) + "'", int36 == (-1094608422));
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
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
        int int33 = calculator0.multiply((-78042088), 853668752);
        int int36 = calculator0.add((-350777344), (-100));
        java.lang.Class<?> wildcardClass37 = calculator0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2015073664 + "'", int33 == 2015073664);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-350777444) + "'", int36 == (-350777444));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
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
        int int33 = calculator0.add((-2062310660), 172635648);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1889675012) + "'", int33 == (-1889675012));
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.subtract(20580, (-867133439));
        int int21 = calculator0.divide((-609787), (-31));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867154019 + "'", int18 == 867154019);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19670 + "'", int21 == 19670);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply((-76), (int) (byte) 100);
        int int18 = calculator0.subtract((-867133440), 692692992);
        int int21 = calculator0.add(1769916224, (-101));
        int int24 = calculator0.multiply(2033296844, (-7600));
        int int27 = calculator0.divide((-74870788), 2146806474);
        int int30 = calculator0.subtract((-49164372), 0);
        int int33 = calculator0.multiply((-1214486912), (-1908264058));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7600) + "'", int15 == (-7600));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1559826432) + "'", int18 == (-1559826432));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1769916123 + "'", int21 == 1769916123);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 236316608 + "'", int24 == 236316608);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-49164372) + "'", int30 == (-49164372));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1320605952) + "'", int33 == (-1320605952));
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.subtract((-24578), 867133591);
        int int21 = calculator0.divide((-1435799528), 196);
        int int24 = calculator0.add(66, (-726422597));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-867158169) + "'", int18 == (-867158169));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7325507) + "'", int21 == (-7325507));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-726422531) + "'", int24 == (-726422531));
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.add((int) 'a', (-2020));
        int int15 = calculator0.divide((-15300), (-1964453610));
        int int18 = calculator0.multiply((-790863895), (-88));
        int int21 = calculator0.add((-1555994343), (-1723187));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1923) + "'", int12 == (-1923));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 876546024 + "'", int18 == 876546024);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1557717530) + "'", int21 == (-1557717530));
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.divide((-1237148864), 153);
        int int12 = calculator0.add(164584658, (-853113394));
        int int15 = calculator0.divide((-356995307), (-8848318));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8085940) + "'", int9 == (-8085940));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-688528736) + "'", int12 == (-688528736));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 40 + "'", int15 == 40);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(1145179144, 100);
        int int15 = calculator0.add((-6), (-287587));
        int int18 = calculator0.divide((-8), 656913876);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1145179044 + "'", int12 == 1145179044);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-287593) + "'", int15 == (-287593));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide((-1769916224), (-36));
        int int21 = calculator0.add((-9312), (-121));
        int int24 = calculator0.multiply((int) (short) -1, 0);
        int int27 = calculator0.multiply((-917640454), 0);
        int int30 = calculator0.multiply(21, (-867154019));
        int int33 = calculator0.multiply(339618637, (-1985611728));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49164339 + "'", int18 == 49164339);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9433) + "'", int21 == (-9433));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1030365215) + "'", int30 == (-1030365215));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 591115888 + "'", int33 == 591115888);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.multiply((-1923), 2115365205);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-513259903) + "'", int9 == (-513259903));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.subtract(2, 86713344);
        int int18 = calculator0.subtract(757717952, 2877446);
        int int21 = calculator0.subtract(868979689, (-86));
        int int24 = calculator0.add((-867133571), (-868085942));
        int int27 = calculator0.subtract((-579176885), (-2033296854));
        // The following exception was thrown during execution in test generation
        try {
            int int30 = calculator0.divide((-3459), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713342) + "'", int15 == (-86713342));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 754840506 + "'", int18 == 754840506);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 868979775 + "'", int21 == 868979775);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1735219513) + "'", int24 == (-1735219513));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1454119969 + "'", int27 == 1454119969);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.divide(4213, (-7567));
        int int21 = calculator0.divide(1597614332, (-1269639355));
        int int24 = calculator0.add(93, 238042740);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 238042833 + "'", int24 == 238042833);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.divide(51, 109);
        int int18 = calculator0.divide(2233940, (-1155286483));
        int int21 = calculator0.divide((-371478784), 1395);
        int int24 = calculator0.multiply(167468044, (-1435799523));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-266293) + "'", int21 == (-266293));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1966953124) + "'", int24 == (-1966953124));
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
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
        int int30 = calculator0.divide((-846497378), (-34682070));
        int int33 = calculator0.multiply((-938101088), (-3528));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7955592 + "'", int27 == 7955592);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 24 + "'", int30 == 24);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1799146752) + "'", int33 == (-1799146752));
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply(0, 1810705533);
        int int24 = calculator0.divide((-1248231612), 32);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-39007237) + "'", int24 == (-39007237));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        int int21 = calculator0.divide((-1010), 1152037484);
        int int24 = calculator0.divide(1515036992, 66422468);
        int int27 = calculator0.multiply((-1606434250), 2019159796);
        int int30 = calculator0.subtract((-872792064), 827072948);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 22 + "'", int24 == 22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-669429896) + "'", int27 == (-669429896));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1699865012) + "'", int30 == (-1699865012));
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((-97), 96);
        int int15 = calculator0.add(1925360681, 244543876);
        int int18 = calculator0.divide((-935621487), 822099432);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9312) + "'", int12 == (-9312));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2125062739) + "'", int15 == (-2125062739));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide(100, (-867133440));
        int int21 = calculator0.multiply((-1769916127), 843);
        int int24 = calculator0.divide((-14887285), (-675399327));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1685643349) + "'", int21 == (-1685643349));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.add(51, (-97));
        int int15 = calculator0.divide(9, 867133591);
        int int18 = calculator0.subtract(9, (-109415563));
        int int21 = calculator0.subtract(43138, (-848730488));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-46) + "'", int12 == (-46));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 109415572 + "'", int18 == 109415572);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 848773626 + "'", int21 == 848773626);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.add(33, (-7600));
        int int21 = calculator0.multiply(867133381, 1693566793);
        int int24 = calculator0.subtract((-15), 662488290);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1155286483) + "'", int21 == (-1155286483));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-662488305) + "'", int24 == (-662488305));
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(95, 0);
        int int15 = calculator0.multiply((-867138628), (-15200));
        int int18 = calculator0.multiply(100, 34);
        int int21 = calculator0.add((-49173772), (-171620238));
        int int24 = calculator0.divide((-1555994343), (-845157802));
        int int27 = calculator0.add((-992053563), 0);
        int int30 = calculator0.divide((-178319437), (-39007237));
        int int33 = calculator0.multiply(1152016958, (-1480882280));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 95 + "'", int12 == 95);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-747485824) + "'", int15 == (-747485824));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3400 + "'", int18 == 3400);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-220794010) + "'", int21 == (-220794010));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-992053563) + "'", int27 == (-992053563));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-733804848) + "'", int33 == (-733804848));
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
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
        int int30 = calculator0.add((-1559826432), 21975629);
        int int33 = calculator0.divide(902771538, (-520185));
        int int36 = calculator0.subtract(1877043160, 1012025939);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-86713457) + "'", int21 == (-86713457));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1700666664) + "'", int24 == (-1700666664));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1537850803) + "'", int30 == (-1537850803));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1735) + "'", int33 == (-1735));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 865017221 + "'", int36 == 865017221);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        int int21 = calculator0.multiply((-4967), (-1032010672));
        int int24 = calculator0.add(502867168, (-1936630653));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2101023696 + "'", int21 == 2101023696);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1433763485) + "'", int24 == (-1433763485));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.divide((int) ' ', (-101));
        int int15 = calculator0.add(1152037484, (-6858340));
        int int18 = calculator0.divide(4213, 867133667);
        int int21 = calculator0.divide((-1123990489), 29811430);
        int int24 = calculator0.subtract(1202216254, 458092924);
        int int27 = calculator0.multiply(1002376880, (-1598963920));
        int int30 = calculator0.subtract(216086306, (-3459));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1145179144 + "'", int15 == 1145179144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-37) + "'", int21 == (-37));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 744123330 + "'", int24 == 744123330);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-411561728) + "'", int27 == (-411561728));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 216089765 + "'", int30 == 216089765);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply((-76), (int) (short) -1);
        int int18 = calculator0.add((-10), (-68));
        int int21 = calculator0.add((-346346486), (-96348159));
        int int24 = calculator0.add((-1769916224), 867133591);
        int int27 = calculator0.add(870696771, 19670);
        int int30 = calculator0.divide(0, (-425848194));
        int int33 = calculator0.multiply(1580921300, 1517596387);
        int int36 = calculator0.subtract(0, (-314830347));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 76 + "'", int15 == 76);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-78) + "'", int18 == (-78));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-442694645) + "'", int21 == (-442694645));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-902782633) + "'", int24 == (-902782633));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 870716441 + "'", int27 == 870716441);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1162705156) + "'", int33 == (-1162705156));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 314830347 + "'", int36 == 314830347);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-110), (int) (short) 0);
        int int12 = calculator0.divide(1769916224, (-86713342));
        int int15 = calculator0.divide(21975629, 258238464);
        int int18 = calculator0.add((-867158169), 654653753);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-110) + "'", int9 == (-110));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-20) + "'", int12 == (-20));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-212504416) + "'", int18 == (-212504416));
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.add(51, (-97));
        int int15 = calculator0.divide(9, 867133591);
        int int18 = calculator0.subtract(9, (-109415563));
        int int21 = calculator0.add((-1769916127), 859177974);
        int int24 = calculator0.add((-917824345), 2008450008);
        int int27 = calculator0.multiply((-15), (-1433052896));
        int int30 = calculator0.multiply(638350336, 827360554);
        int int33 = calculator0.add((-729327270), 280533860);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-46) + "'", int12 == (-46));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 109415572 + "'", int18 == 109415572);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-910738153) + "'", int21 == (-910738153));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1090625663 + "'", int24 == 1090625663);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20956960 + "'", int27 == 20956960);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-162592768) + "'", int30 == (-162592768));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-448793410) + "'", int33 == (-448793410));
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.subtract(109, (int) (short) 100);
        int int15 = calculator0.add(290738210, 1236538979);
        int int18 = calculator0.add(1771178000, (-2115365052));
        int int21 = calculator0.subtract(887406137, (-1262618369));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1527277189 + "'", int15 == 1527277189);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-344187052) + "'", int18 == (-344187052));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2144942790) + "'", int21 == (-2144942790));
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.subtract(0, 867133515);
        int int18 = calculator0.multiply(0, 568480);
        int int21 = calculator0.multiply((-1076989380), (-1110310644));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133515) + "'", int15 == (-867133515));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-849897776) + "'", int21 == (-849897776));
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) '#', (-9312));
        int int18 = calculator0.subtract(1908264058, (-94668773));
        int int21 = calculator0.add(1356945246, (-1769916127));
        int int24 = calculator0.divide(278045632, (-707525376));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9347 + "'", int15 == 9347);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2002932831 + "'", int18 == 2002932831);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-412970881) + "'", int21 == (-412970881));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((-7466), 67686400);
        int int18 = calculator0.divide(0, 6992);
        int int21 = calculator0.multiply((-31), (-346346486));
        int int24 = calculator0.divide(1678282987, 21975629);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2146806474 + "'", int21 == 2146806474);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 76 + "'", int24 == 76);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((-68), (int) (byte) 10);
        int int21 = calculator0.divide(96, (-68));
        int int24 = calculator0.divide((-15300), (-520200));
        int int27 = calculator0.subtract(0, (-866613314));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 866613314 + "'", int27 == 866613314);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((-68), (int) (byte) 10);
        int int21 = calculator0.divide(96, (-68));
        int int24 = calculator0.divide((-15300), (-520200));
        int int27 = calculator0.divide((-853113394), (-1815930810));
        int int30 = calculator0.multiply((-266293), 266702322);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 617774310 + "'", int30 == 617774310);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.divide((int) ' ', (-101));
        int int15 = calculator0.add(1152037484, (-6858340));
        int int18 = calculator0.divide(4213, 867133667);
        int int21 = calculator0.subtract((-4864), (-1357151573));
        int int24 = calculator0.multiply(1512046592, 1970219360);
        int int27 = calculator0.multiply((-2095602842), 954669693);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1145179144 + "'", int15 == 1145179144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1357146709 + "'", int21 == 1357146709);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-335544320) + "'", int24 == (-335544320));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 707601614 + "'", int27 == 707601614);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.subtract((-1), 9);
        int int18 = calculator0.add((-1951882450), (-88956701));
        int int21 = calculator0.divide((-1311704925), (-1772159544));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2040839151) + "'", int18 == (-2040839151));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.subtract(2877446, (-1481140680));
        int int9 = calculator0.subtract((-8), 0);
        int int12 = calculator0.subtract(240397662, (-846679733));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1484018126 + "'", int6 == 1484018126);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1087077395 + "'", int12 == 1087077395);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide(692692992, 2);
        int int21 = calculator0.divide(1237148864, (-1));
        int int24 = calculator0.divide((-901948644), 1978473568);
        int int27 = calculator0.divide(1467799090, (-1251915698));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 346346496 + "'", int18 == 346346496);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1237148864) + "'", int21 == (-1237148864));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) '#', (-9312));
        int int18 = calculator0.multiply(86713455, 1769916224);
        int int21 = calculator0.subtract((-121), 1503190044);
        int int24 = calculator0.subtract((-127900911), 14);
        int int27 = calculator0.add(1720133304, (-16498720));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9347 + "'", int15 == 9347);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1237148864 + "'", int18 == 1237148864);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1503190165) + "'", int21 == (-1503190165));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-127900925) + "'", int24 == (-127900925));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1703634584 + "'", int27 == 1703634584);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.subtract(109, (int) (short) 100);
        int int15 = calculator0.multiply((-101), (int) (short) 10);
        int int18 = calculator0.divide((int) 'a', 196);
        int int21 = calculator0.add(745957086, 1771863899);
        int int24 = calculator0.divide((-555681721), (-216614656));
        int int27 = calculator0.divide((-1110310644), 131);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1010) + "'", int15 == (-1010));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1777146311) + "'", int21 == (-1777146311));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-8475653) + "'", int27 == (-8475653));
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((int) '#', (int) ' ');
        int int18 = calculator0.add(34, (-1010));
        int int21 = calculator0.add(21975629, (-1777146311));
        int int24 = calculator0.divide(110, (-86713342));
        int int27 = calculator0.divide((-86067781), (-1690836096));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-976) + "'", int18 == (-976));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1755170682) + "'", int21 == (-1755170682));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
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
        int int30 = calculator0.add((-16428397), (-1459544222));
        int int33 = calculator0.multiply(1702058646, 37539609);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6858340) + "'", int18 == (-6858340));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1058206662) + "'", int21 == (-1058206662));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17 + "'", int24 == 17);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-868095375) + "'", int27 == (-868095375));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1475972619) + "'", int30 == (-1475972619));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1783946586) + "'", int33 == (-1783946586));
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((int) '#', (int) ' ');
        int int18 = calculator0.divide(991516612, 623809483);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.subtract((int) (byte) -1, 100);
        int int12 = calculator0.add((-9433), (-341775360));
        int int15 = calculator0.add(1154271539, (-1879178559));
        int int18 = calculator0.add(0, 1542690885);
        int int21 = calculator0.multiply((-1380352289), (-389311220));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-101) + "'", int9 == (-101));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-341784793) + "'", int12 == (-341784793));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-724907020) + "'", int15 == (-724907020));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1542690885 + "'", int18 == 1542690885);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-832651916) + "'", int21 == (-832651916));
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        int int21 = calculator0.divide((-1010), 86713455);
        int int24 = calculator0.multiply(1779063741, 1671243464);
        int int27 = calculator0.subtract(1477466179, 1495828402);
        int int30 = calculator0.subtract(1112369434, 146103337);
        int int33 = calculator0.add((-976549230), 1420823156);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1147225688) + "'", int24 == (-1147225688));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-18362223) + "'", int27 == (-18362223));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 966266097 + "'", int30 == 966266097);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 444273926 + "'", int33 == 444273926);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.subtract(867133420, 1269639304);
        int int21 = calculator0.divide((-152), (-1555994363));
        int int24 = calculator0.multiply((-989528052), (-7600));
        int int27 = calculator0.add(1736178548, (-1090902560));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-402505884) + "'", int18 == (-402505884));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-74540096) + "'", int24 == (-74540096));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 645275988 + "'", int27 == 645275988);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.subtract((int) (short) 0, 110);
        int int21 = calculator0.multiply((-867133491), (-9280));
        int int24 = calculator0.multiply((int) (short) -1, (-1923));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-110) + "'", int18 == (-110));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1769916224) + "'", int21 == (-1769916224));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1923 + "'", int24 == 1923);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.divide(51, 109);
        int int18 = calculator0.subtract(0, 206361130);
        int int21 = calculator0.divide(1715953936, (-46));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-206361130) + "'", int18 == (-206361130));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-37303346) + "'", int21 == (-37303346));
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) '#', (-9312));
        int int18 = calculator0.multiply(86713455, 1769916224);
        int int21 = calculator0.multiply(1383615488, 120);
        int int24 = calculator0.subtract((-1985712785), 610477684);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9347 + "'", int15 == 9347);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1237148864 + "'", int18 == 1237148864);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1469865984) + "'", int21 == (-1469865984));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1698776827 + "'", int24 == 1698776827);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.add(568480, 110);
        int int15 = calculator0.subtract((-867154019), 67686496);
        int int18 = calculator0.multiply((-171614306), 7656);
        int int21 = calculator0.divide((-1644887942), (-351564));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-934840515) + "'", int15 == (-934840515));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 380865840 + "'", int18 == 380865840);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4678 + "'", int21 == 4678);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
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
        int int33 = calculator0.divide((-171614306), (-1545650944));
        int int36 = calculator0.add((-1606434250), 0);
        int int39 = calculator0.multiply(1011081344, 757944224);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1606434250) + "'", int36 == (-1606434250));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1825320960) + "'", int39 == (-1825320960));
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.multiply(37489359, 0);
        int int12 = calculator0.divide(1323749846, 1437790045);
        int int15 = calculator0.divide(1497091025, (-1822581293));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply((-76), (-7480));
        int int9 = calculator0.subtract((-86713457), 2243220);
        int int12 = calculator0.divide((-7480), 1944410221);
        int int15 = calculator0.subtract((-1687920631), (-1123990489));
        int int18 = calculator0.multiply(1237872206, (-1827707776));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 568480 + "'", int6 == 568480);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-88956677) + "'", int9 == (-88956677));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-563930142) + "'", int15 == (-563930142));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1876926208 + "'", int18 == 1876926208);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1144658859 + "'", int30 == 1144658859);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.subtract((int) (byte) -1, 100);
        int int12 = calculator0.divide(153, 21975629);
        int int15 = calculator0.add(815415403, 236472665);
        int int18 = calculator0.divide(0, 1512046592);
        int int21 = calculator0.subtract((-1263873927), 151224956);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-101) + "'", int9 == (-101));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1051888068 + "'", int15 == 1051888068);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1415098883) + "'", int21 == (-1415098883));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.divide(692692992, (-1010));
        int int21 = calculator0.add((-241122442), (-757113551));
        int int24 = calculator0.divide((-34682070), (-1121822200));
        int int27 = calculator0.add(0, (-1270709336));
        int int30 = calculator0.subtract((-847911442), (-34829));
        int int33 = calculator0.subtract(1339770992, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-685834) + "'", int18 == (-685834));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-998235993) + "'", int21 == (-998235993));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1270709336) + "'", int27 == (-1270709336));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-847876613) + "'", int30 == (-847876613));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1339770992 + "'", int33 == 1339770992);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply(0, 0);
        int int18 = calculator0.multiply(867133667, (-97));
        int int21 = calculator0.divide(34, (-1923));
        int int24 = calculator0.multiply((-1452481693), 110326737);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1787380221 + "'", int18 == 1787380221);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 535043283 + "'", int24 == 535043283);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.multiply((-36), 98);
        int int21 = calculator0.divide(232346588, (-1806625));
        int int24 = calculator0.multiply(18, (-428329688));
        int int27 = calculator0.multiply(1432706328, (-39007237));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3528) + "'", int18 == (-3528));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-128) + "'", int21 == (-128));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 880000208 + "'", int24 == 880000208);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1599360648 + "'", int27 == 1599360648);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
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
        int int33 = calculator0.add((-1685643349), (-1632794629));
        int int36 = calculator0.subtract((-1935849733), 0);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 976529318 + "'", int33 == 976529318);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1935849733) + "'", int36 == (-1935849733));
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.add(568480, 110);
        int int15 = calculator0.subtract(1787380221, 86713457);
        int int18 = calculator0.multiply(9347, 815415403);
        int int21 = calculator0.subtract((-59149533), 94);
        int int24 = calculator0.multiply(2015870317, (-395780744));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1700666764 + "'", int15 == 1700666764);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1879178559) + "'", int18 == (-1879178559));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-59149627) + "'", int21 == (-59149627));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1567613976 + "'", int24 == 1567613976);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply((-76), (int) (byte) 100);
        int int18 = calculator0.subtract(100, (-1));
        int int21 = calculator0.divide(0, 1897078486);
        int int24 = calculator0.subtract(1519745012, 178159040);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7600) + "'", int15 == (-7600));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1341585972 + "'", int24 == 1341585972);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
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
        int int30 = calculator0.add(21182511, (-1271895989));
        int int33 = calculator0.divide(157410086, (-180712367));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 96 + "'", int21 == 96);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-867133566) + "'", int24 == (-867133566));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1897078486 + "'", int27 == 1897078486);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1250713478) + "'", int30 == (-1250713478));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.divide((-1897778925), (-1305701658));
        int int24 = calculator0.multiply((-328101312), 1238032199);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 677728192 + "'", int24 == 677728192);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract(9, (-100));
        int int15 = calculator0.divide((-402023608), 1238032199);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = calculator0.divide(201951404, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109 + "'", int12 == 109);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(95, 0);
        int int15 = calculator0.multiply((-867138628), (-15200));
        int int18 = calculator0.add(1897078486, (-26411181));
        int int21 = calculator0.multiply((-1408776192), (-27649121));
        int int24 = calculator0.add(1486954504, (-1475970418));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 95 + "'", int12 == 95);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-747485824) + "'", int15 == (-747485824));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1870667305 + "'", int18 == 1870667305);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-85116928) + "'", int21 == (-85116928));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10984086 + "'", int24 == 10984086);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((-1357816827), 1810186246);
        int int21 = calculator0.divide(1536878495, 735085733);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1126964223 + "'", int18 == 1126964223);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.subtract(67686400, (-52891664));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 120578064 + "'", int15 == 120578064);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.subtract(2, 86713344);
        int int18 = calculator0.multiply(1700666860, (-15200));
        int int21 = calculator0.multiply(866523750, 1693566793);
        int int24 = calculator0.divide(347305668, (-18912600));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713342) + "'", int15 == (-86713342));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1271882624 + "'", int18 == 1271882624);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1964453610) + "'", int21 == (-1964453610));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-18) + "'", int24 == (-18));
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
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
        int int30 = calculator0.divide((-887064863), (-428329688));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 96 + "'", int21 == 96);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-867133566) + "'", int24 == (-867133566));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1897078486 + "'", int27 == 1897078486);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (byte) 1, 96);
        int int24 = calculator0.add((-1643366519), 1322291616);
        int int27 = calculator0.multiply((-654086169), 1002899992);
        int int30 = calculator0.divide((-596556766), (-6858340));
        int int33 = calculator0.subtract((-1166777829), (-1690836096));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 96 + "'", int21 == 96);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-321074903) + "'", int24 == (-321074903));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1270709336) + "'", int27 == (-1270709336));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 86 + "'", int30 == 86);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 524058267 + "'", int33 == 524058267);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
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
        int int30 = calculator0.subtract((-675399327), 1759764986);
        int int33 = calculator0.add((-49164407), 1486954452);
        int int36 = calculator0.divide((-1694055823), (-581169146));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-520200) + "'", int21 == (-520200));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-443263150) + "'", int24 == (-443263150));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 49170244 + "'", int27 == 49170244);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1859802983 + "'", int30 == 1859802983);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1437790045 + "'", int33 == 1437790045);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply((-76), (int) (byte) 100);
        int int18 = calculator0.subtract((-867133440), 692692992);
        int int21 = calculator0.add(26401901, (-123493));
        int int24 = calculator0.multiply((-1806637), 1228470608);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7600) + "'", int15 == (-7600));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1559826432) + "'", int18 == (-1559826432));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 26278408 + "'", int21 == 26278408);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1873421072) + "'", int24 == (-1873421072));
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((-7466), 67686400);
        int int18 = calculator0.divide(0, 6992);
        int int21 = calculator0.multiply((-31), (-346346486));
        int int24 = calculator0.multiply(1486954504, (-88956701));
        int int27 = calculator0.add(1351969396, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2146806474 + "'", int21 == 2146806474);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1618241304 + "'", int24 == 1618241304);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1351969396 + "'", int27 == 1351969396);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.subtract((-757113354), (-2084640));
        int int21 = calculator0.divide(1726946994, (-1145179180));
        int int24 = calculator0.subtract(352535033, (-1359151923));
        int int27 = calculator0.multiply(1037464303, 618458674);
        int int30 = calculator0.multiply((-1145179290), 1216121472);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-755028714) + "'", int18 == (-755028714));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1711686956 + "'", int24 == 1711686956);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-736058194) + "'", int27 == (-736058194));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-644436224) + "'", int30 == (-644436224));
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        int int21 = calculator0.divide((-206361130), (-2));
        int int24 = calculator0.subtract(9, (-26261823));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 103180565 + "'", int21 == 103180565);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 26261832 + "'", int24 == 26261832);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide(100, (-867133440));
        int int21 = calculator0.subtract((-1154271480), (-1772730154));
        int int24 = calculator0.divide(1581845917, 1700666764);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 618458674 + "'", int21 == 618458674);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.add((-2146806784), 0);
        int int12 = calculator0.subtract(520297, 96);
        int int15 = calculator0.add((-20), (-68));
        int int18 = calculator0.multiply(0, (-791214257));
        int int21 = calculator0.add(791316392, 623809281);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2146806784) + "'", int9 == (-2146806784));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520201 + "'", int12 == 520201);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-88) + "'", int15 == (-88));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1415125673 + "'", int21 == 1415125673);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.multiply((int) (short) 100, (-152));
        int int18 = calculator0.add(20580, (-241122442));
        int int21 = calculator0.add(846070065, (-1925360682));
        int int24 = calculator0.divide(86713344, (-1351018341));
        int int27 = calculator0.add(30418, 1090625632);
        int int30 = calculator0.add((-993135319), (-1155286483));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15200) + "'", int15 == (-15200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-241101862) + "'", int18 == (-241101862));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1079290617) + "'", int21 == (-1079290617));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1090656050 + "'", int27 == 1090656050);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2146545494 + "'", int30 == 2146545494);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(95, 0);
        int int15 = calculator0.multiply((-867138628), (-15200));
        int int18 = calculator0.add(1897078486, (-26411181));
        int int21 = calculator0.multiply((-1408776192), (-27649121));
        int int24 = calculator0.divide((-111), (-480147815));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 95 + "'", int12 == 95);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-747485824) + "'", int15 == (-747485824));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1870667305 + "'", int18 == 1870667305);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-85116928) + "'", int21 == (-85116928));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
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
        int int33 = calculator0.multiply((-719686784), (-1632794629));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-245907840) + "'", int33 == (-245907840));
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.subtract(20580, (-867133439));
        int int21 = calculator0.divide((-609787), (-31));
        int int24 = calculator0.multiply((-50514530), (-867133666));
        int int27 = calculator0.divide((-3698467), 718097088);
        int int30 = calculator0.divide((-170954984), (-1820924517));
        int int33 = calculator0.add((-1183140366), 1020465408);
        int int36 = calculator0.subtract(1122529476, (-2104668974));
        int int39 = calculator0.multiply((-406927436), 1669504623);
        int int42 = calculator0.add(334907792, 867148791);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867154019 + "'", int18 == 867154019);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19670 + "'", int21 == 19670);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1448314236) + "'", int24 == (-1448314236));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-162674958) + "'", int33 == (-162674958));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1067768846) + "'", int36 == (-1067768846));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1080143628 + "'", int39 == 1080143628);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1202056583 + "'", int42 == 1202056583);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide((-68), (int) (byte) 100);
        int int12 = calculator0.divide(0, (-121));
        int int15 = calculator0.multiply(0, 7029297);
        int int18 = calculator0.multiply(0, 0);
        int int21 = calculator0.divide(1165653964, (-1870160147));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) ' ', (int) (byte) 100);
        int int15 = calculator0.subtract((-207), 86713344);
        int int18 = calculator0.subtract(119647596, 17);
        int int21 = calculator0.add((-110), 96);
        int int24 = calculator0.subtract(1925360681, (-757113354));
        int int27 = calculator0.subtract(211766202, 870696823);
        int int30 = calculator0.multiply(337463607, (-520200));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-68) + "'", int12 == (-68));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713551) + "'", int15 == (-86713551));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 119647579 + "'", int18 == 119647579);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-14) + "'", int21 == (-14));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1612493261) + "'", int24 == (-1612493261));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-658930621) + "'", int27 == (-658930621));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-370071992) + "'", int30 == (-370071992));
    }
}

