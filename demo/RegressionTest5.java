import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
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
        int int30 = calculator0.multiply((-858032), 21975628);
        int int33 = calculator0.multiply(0, (-1193026219));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-86) + "'", int21 == (-86));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-433567285) + "'", int24 == (-433567285));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2146806852) + "'", int27 == (-2146806852));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-885614656) + "'", int30 == (-885614656));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.subtract(109, (int) (short) 100);
        int int15 = calculator0.subtract(1395, 95);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1300 + "'", int15 == 1300);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.subtract(867133420, 1269639304);
        int int21 = calculator0.subtract((-2146806784), (-1359151923));
        int int24 = calculator0.divide((-1802498291), 29811430);
        int int27 = calculator0.add(173435032, (-35));
        int int30 = calculator0.add((-1020111879), 754840506);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-402505884) + "'", int18 == (-402505884));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-787654861) + "'", int21 == (-787654861));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-60) + "'", int24 == (-60));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 173434997 + "'", int27 == 173434997);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-265271373) + "'", int30 == (-265271373));
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
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
        int int36 = calculator0.multiply(481696220, (-307225));
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1728038524) + "'", int36 == (-1728038524));
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
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
        int int39 = calculator0.divide(3400, 84);
        int int42 = calculator0.divide(822099432, 58);
        int int45 = calculator0.subtract(116, (-867133491));
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 40 + "'", int39 == 40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 14174128 + "'", int42 == 14174128);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 867133607 + "'", int45 == 867133607);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide(0, (-2037396585));
        int int12 = calculator0.subtract(0, (-675399327));
        int int15 = calculator0.multiply(1168096256, 6596677);
        int int18 = calculator0.subtract((-1587684236), (-1475970418));
        int int21 = calculator0.multiply(0, (-2015078631));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 675399327 + "'", int12 == 675399327);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 124627968 + "'", int15 == 124627968);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-111713818) + "'", int18 == (-111713818));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
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
        int int30 = calculator0.multiply((-161052992), (-589030208));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6858340) + "'", int18 == (-6858340));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1058206662) + "'", int21 == (-1058206662));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17 + "'", int24 == 17);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-868095375) + "'", int27 == (-868095375));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 111284224 + "'", int30 == 111284224);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((int) (short) 10, 867133501);
        int int21 = calculator0.add((-3528), (-7567));
        int int24 = calculator0.divide(0, (-1802498291));
        int int27 = calculator0.subtract(257508859, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11095) + "'", int21 == (-11095));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 257508859 + "'", int27 == 257508859);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
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
        int int30 = calculator0.add((-2033296854), (int) (short) 10);
        int int33 = calculator0.multiply(792269490, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7955592 + "'", int27 == 7955592);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2033296844) + "'", int30 == (-2033296844));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.subtract((-1), (-97));
        int int21 = calculator0.add((-97), 98);
        int int24 = calculator0.divide(178159040, (-867158093));
        int int27 = calculator0.divide((-152), (-45247));
        int int30 = calculator0.multiply(1527277189, 867150782);
        int int33 = calculator0.add(2085965638, (-866613314));
        int int36 = calculator0.subtract(1759764986, 1236608621);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 96 + "'", int18 == 96);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1063129674) + "'", int30 == (-1063129674));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1219352324 + "'", int33 == 1219352324);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 523156365 + "'", int36 == 523156365);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.subtract((int) (byte) -1, 100);
        int int12 = calculator0.divide(153, 21975629);
        int int15 = calculator0.add(815415403, 236472665);
        int int18 = calculator0.divide((-1872319616), 258400);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-101) + "'", int9 == (-101));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1051888068 + "'", int15 == 1051888068);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7245) + "'", int18 == (-7245));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
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
        int int30 = calculator0.add((-27669), (-1673719027));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1145179144 + "'", int15 == 1145179144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-37) + "'", int21 == (-37));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 744123330 + "'", int24 == 744123330);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-411561728) + "'", int27 == (-411561728));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1673746696) + "'", int30 == (-1673746696));
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
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
        int int30 = calculator0.add(1635427160, 86605184);
        int int33 = calculator0.subtract((-1593893682), 2005196322);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1787380221 + "'", int18 == 1787380221);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 72529 + "'", int24 == 72529);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1076453360) + "'", int27 == (-1076453360));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1722032344 + "'", int30 == 1722032344);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 695877292 + "'", int33 == 695877292);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        int int21 = calculator0.divide((-1010), 1152037484);
        int int24 = calculator0.divide(1515036992, 66422468);
        int int27 = calculator0.subtract(0, (-2104616068));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 22 + "'", int24 == 22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2104616068 + "'", int27 == 2104616068);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.subtract((-100), 2243220);
        int int21 = calculator0.subtract((-86713342), 0);
        int int24 = calculator0.add((-86713651), (-755028714));
        int int27 = calculator0.subtract((-1814802130), (-781049314));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2243320) + "'", int18 == (-2243320));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-86713342) + "'", int21 == (-86713342));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-841742365) + "'", int24 == (-841742365));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1033752816) + "'", int27 == (-1033752816));
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.subtract((-86713342), 86713455);
        int int21 = calculator0.subtract(1, (-152));
        int int24 = calculator0.divide(9552800, 1391530220);
        int int27 = calculator0.subtract(321072930, 1170137828);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-173426797) + "'", int18 == (-173426797));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 153 + "'", int21 == 153);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-849064898) + "'", int27 == (-849064898));
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
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
        int int30 = calculator0.divide((-1194654462), 2146806474);
        int int33 = calculator0.add(1560225913, 1252021680);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1503914342 + "'", int21 == 1503914342);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-380871040) + "'", int27 == (-380871040));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1482719703) + "'", int33 == (-1482719703));
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.divide((int) ' ', (-101));
        int int15 = calculator0.add(1152037484, (-6858340));
        int int18 = calculator0.divide(4213, 867133667);
        int int21 = calculator0.subtract((-173426914), 1810705533);
        int int24 = calculator0.subtract((-173436042), 67686400);
        int int27 = calculator0.divide(470134236, (-136201627));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1145179144 + "'", int15 == 1145179144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1984132447) + "'", int21 == (-1984132447));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-241122442) + "'", int24 == (-241122442));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3) + "'", int27 == (-3));
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide((-867133439), 9);
        int int12 = calculator0.subtract(0, 867154019);
        int int15 = calculator0.subtract(867154019, (-976));
        int int18 = calculator0.add((-171620289), 51);
        int int21 = calculator0.multiply((-1769916224), (-76265));
        int int24 = calculator0.subtract((-15300), (-15300));
        int int27 = calculator0.divide((-867133321), (-109415539));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-867154019) + "'", int12 == (-867154019));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867154995 + "'", int15 == 867154995);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-171620238) + "'", int18 == (-171620238));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 428644672 + "'", int21 == 428644672);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7 + "'", int27 == 7);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
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
        int int30 = calculator0.subtract(43138, 1248234937);
        int int33 = calculator0.subtract((-660735808), (-1526379269));
        int int36 = calculator0.multiply((-1983450103), (-1429824747));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1271879224 + "'", int21 == 1271879224);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 287137964 + "'", int24 == 287137964);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1532796050 + "'", int27 == 1532796050);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1248191799) + "'", int30 == (-1248191799));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 865643461 + "'", int33 == 865643461);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2080995261 + "'", int36 == 2080995261);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.subtract((-1), 9);
        int int18 = calculator0.multiply(18, (-867138628));
        int int21 = calculator0.subtract((-180712367), (-74870788));
        int int24 = calculator0.divide(1520179488, 30418);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1571373880 + "'", int18 == 1571373880);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-105841579) + "'", int21 == (-105841579));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 49976 + "'", int24 == 49976);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.subtract(96, 97);
        int int15 = calculator0.multiply((-45), (-23318356));
        int int18 = calculator0.add(1040012264, (-688528736));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1049326020 + "'", int15 == 1049326020);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 351483528 + "'", int18 == 351483528);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.subtract((int) (byte) -1, 100);
        int int12 = calculator0.divide(153, 21975629);
        int int15 = calculator0.add(815415403, 236472665);
        int int18 = calculator0.divide(0, 1512046592);
        int int21 = calculator0.multiply(1532796050, 1076983947);
        int int24 = calculator0.divide((-1495629227), (-491301529));
        int int27 = calculator0.divide((-929987309), 288080076);
        int int30 = calculator0.subtract((-515112200), (-1341734912));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-101) + "'", int9 == (-101));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1051888068 + "'", int15 == 1051888068);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2090824518 + "'", int21 == 2090824518);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3) + "'", int27 == (-3));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 826622712 + "'", int30 == 826622712);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.multiply((-86713457), 692692992);
        int int21 = calculator0.subtract(1271882624, 3400);
        int int24 = calculator0.add(287137963, 1);
        int int27 = calculator0.add((-97), 520149);
        int int30 = calculator0.multiply((-757113551), 1437790045);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1271879224 + "'", int21 == 1271879224);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 287137964 + "'", int24 == 287137964);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 520052 + "'", int27 == 520052);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 876059085 + "'", int30 == 876059085);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.add(33, (-7600));
        int int21 = calculator0.divide((-173436074), 96);
        int int24 = calculator0.subtract(25, 37489359);
        int int27 = calculator0.subtract(1077166696, (-887064863));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1806625) + "'", int21 == (-1806625));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-37489334) + "'", int24 == (-37489334));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1964231559 + "'", int27 == 1964231559);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide(100, 98);
        int int21 = calculator0.multiply((-976), (-1887134100));
        int int24 = calculator0.multiply(244543876, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-698088384) + "'", int21 == (-698088384));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.add((-2146806784), 0);
        int int12 = calculator0.subtract(520297, 96);
        int int15 = calculator0.divide(20580, 780440677);
        int int18 = calculator0.multiply((-1820924517), 1497039730);
        int int21 = calculator0.divide(2020, 65689586);
        int int24 = calculator0.divide((-869367269), (-1145651032));
        int int27 = calculator0.add((-1936630653), 440742595);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2146806784) + "'", int9 == (-2146806784));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520201 + "'", int12 == 520201);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-581169146) + "'", int18 == (-581169146));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1495888058) + "'", int27 == (-1495888058));
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.subtract((int) (byte) -1, 0);
        int int21 = calculator0.multiply((-1152034604), (-934840515));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1838369148) + "'", int21 == (-1838369148));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
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
        int int30 = calculator0.multiply(8, (-1879178559));
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-31) + "'", int21 == (-31));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1810705533 + "'", int24 == 1810705533);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 850335808 + "'", int27 == 850335808);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2146440712 + "'", int30 == 2146440712);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.divide((-3), 86713344);
        int int15 = calculator0.divide((-15300), 867133511);
        int int18 = calculator0.divide((-76265), 11);
        int int21 = calculator0.add(2115365205, (-170954984));
        int int24 = calculator0.divide((-867133439), 1077166696);
        int int27 = calculator0.add((-1250435409), 868979689);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6933) + "'", int18 == (-6933));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1944410221 + "'", int21 == 1944410221);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-381455720) + "'", int27 == (-381455720));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
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
        int int36 = calculator0.multiply((-1404303256), 765139659);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1206044040) + "'", int36 == (-1206044040));
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide(100, (-867133440));
        int int21 = calculator0.multiply((-1769916127), 843);
        int int24 = calculator0.multiply(524058267, (-1237148811));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1685643349) + "'", int21 == (-1685643349));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1119636009) + "'", int24 == (-1119636009));
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
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
        int int30 = calculator0.add((-1708752832), 326167110);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9347 + "'", int15 == 9347);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 452435157 + "'", int24 == 452435157);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-9304978) + "'", int27 == (-9304978));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1382585722) + "'", int30 == (-1382585722));
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.multiply((-86713457), 692692992);
        int int21 = calculator0.subtract(1271882624, 3400);
        int int24 = calculator0.divide(780440677, 867133667);
        int int27 = calculator0.divide(0, (-1722169251));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1271879224 + "'", int21 == 1271879224);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
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
        int int30 = calculator0.add((-1772161564), (-321074903));
        int int33 = calculator0.add(1252021680, 727168);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 897963264 + "'", int24 == 897963264);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-34) + "'", int27 == (-34));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2093236467) + "'", int30 == (-2093236467));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1252748848 + "'", int33 == 1252748848);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide(76, 692692992);
        int int21 = calculator0.divide((-13365), (-7955541));
        int int24 = calculator0.multiply((-287587), (-1341547376));
        // The following exception was thrown during execution in test generation
        try {
            int int27 = calculator0.divide((-1665481486), 0);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1032010672) + "'", int24 == (-1032010672));
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.multiply((int) (short) 100, (-152));
        int int18 = calculator0.multiply((-1526379168), (-1286026560));
        int int21 = calculator0.add((-836495182), 1751623880);
        int int24 = calculator0.add((-216614656), 611523584);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15200) + "'", int15 == (-15200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1408776192) + "'", int18 == (-1408776192));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 915128698 + "'", int21 == 915128698);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 394908928 + "'", int24 == 394908928);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide((-1769916224), (-36));
        int int21 = calculator0.add((-9312), (-121));
        int int24 = calculator0.divide((-220), 1);
        int int27 = calculator0.subtract((-865230554), 1816725218);
        int int30 = calculator0.multiply(1838369239, (-1263186959));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49164339 + "'", int18 == 49164339);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9433) + "'", int21 == (-9433));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-220) + "'", int24 == (-220));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1613011524 + "'", int27 == 1613011524);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1353875353) + "'", int30 == (-1353875353));
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.subtract((int) (byte) -1, 0);
        int int21 = calculator0.subtract((-211766202), 757944224);
        int int24 = calculator0.divide((-476610528), 1189271234);
        int int27 = calculator0.add((int) (byte) 100, 1892558148);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-969710426) + "'", int21 == (-969710426));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1892558248 + "'", int27 == 1892558248);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.multiply((-86713457), (-2146806784));
        int int18 = calculator0.divide(109411264, (-1102996576));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-341775360) + "'", int15 == (-341775360));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.add(568480, 110);
        int int15 = calculator0.subtract((-867154019), 67686496);
        int int18 = calculator0.add((-214452976), (-1838369148));
        int int21 = calculator0.add(568590, 0);
        int int24 = calculator0.subtract(911011581, (-121133424));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-934840515) + "'", int15 == (-934840515));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2052822124) + "'", int18 == (-2052822124));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 568590 + "'", int21 == 568590);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1032145005 + "'", int24 == 1032145005);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(1145179144, 100);
        int int15 = calculator0.subtract(1237148811, (-240317368));
        int int18 = calculator0.multiply(86713457, 1257480666);
        int int21 = calculator0.subtract((-961364332), (-719722240));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1145179044 + "'", int12 == 1145179044);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1477466179 + "'", int15 == 1477466179);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-907339462) + "'", int18 == (-907339462));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-241642092) + "'", int21 == (-241642092));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.subtract((-86713342), 86713455);
        int int21 = calculator0.add((-173426914), 1734308238);
        int int24 = calculator0.multiply((-1537850803), (-774138863));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-173426797) + "'", int18 == (-173426797));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1560881324 + "'", int21 == 1560881324);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1559096093 + "'", int24 == 1559096093);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
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
        int int33 = calculator0.add((-124878848), 867150782);
        int int36 = calculator0.divide(0, 1736520782);
        int int39 = calculator0.add((-13365), 1467812455);
        int int42 = calculator0.divide((-355648812), 13167513);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 742271934 + "'", int33 == 742271934);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1467799090 + "'", int39 == 1467799090);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-27) + "'", int42 == (-27));
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.subtract(1925360681, 1672101496);
        int int12 = calculator0.add((-197121368), 940146681);
        int int15 = calculator0.multiply(49164439, 1371450554);
        int int18 = calculator0.subtract((-4967), 2015073664);
        int int21 = calculator0.subtract(98022601, 943039388);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 253259185 + "'", int9 == 253259185);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 743025313 + "'", int12 == 743025313);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 13025718 + "'", int15 == 13025718);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2015078631) + "'", int18 == (-2015078631));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-845016787) + "'", int21 == (-845016787));
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((-290), (-1887134100));
        int int21 = calculator0.subtract((-2051022112), 954669693);
        int int24 = calculator0.subtract(1536878495, 799164324);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1887133810 + "'", int18 == 1887133810);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1289275491 + "'", int21 == 1289275491);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 737714171 + "'", int24 == 737714171);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.multiply((-68), 110);
        int int18 = calculator0.subtract(86713457, 76);
        int int21 = calculator0.add((-307225), (-7955541));
        int int24 = calculator0.multiply(1968577402, (-1665941363));
        int int27 = calculator0.divide((-26730), (-733898880));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7480) + "'", int15 == (-7480));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 86713381 + "'", int18 == 86713381);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8262766) + "'", int21 == (-8262766));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1017732558) + "'", int24 == (-1017732558));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
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
        int int33 = calculator0.divide(287137964, (-1316565624));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
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
        int int33 = calculator0.subtract(1539825347, 0);
        int int36 = calculator0.add(0, (-1985062742));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1539825347 + "'", int33 == 1539825347);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1985062742) + "'", int36 == (-1985062742));
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(1145179144, 100);
        int int15 = calculator0.divide(42, (-665227));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1145179044 + "'", int12 == 1145179044);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
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
        int int30 = calculator0.subtract((-867133537), (-1077925731));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-867154019) + "'", int12 == (-867154019));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867154995 + "'", int15 == 867154995);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-171620238) + "'", int18 == (-171620238));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1323847021 + "'", int24 == 1323847021);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1154271478 + "'", int27 == 1154271478);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 210792194 + "'", int30 == 210792194);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
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
        int int33 = calculator0.add(1248231440, 495726313);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1743957753 + "'", int33 == 1743957753);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((int) (short) 10, 867133501);
        int int21 = calculator0.add(110, 20);
        int int24 = calculator0.divide(665, 1004);
        int int27 = calculator0.multiply(500167, 150954219);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 130 + "'", int21 == 130);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1088758189 + "'", int27 == 1088758189);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.subtract(2, 86713344);
        int int18 = calculator0.divide((-1738066976), 49164297);
        int int21 = calculator0.multiply((-442694645), (-521212128));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713342) + "'", int15 == (-86713342));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-35) + "'", int18 == (-35));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1398749600) + "'", int21 == (-1398749600));
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
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
        int int30 = calculator0.subtract((-1541928208), 1800497276);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133546 + "'", int18 == 867133546);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 736984748 + "'", int21 == 736984748);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-867133612) + "'", int24 == (-867133612));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 21740300 + "'", int27 == 21740300);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 952541812 + "'", int30 == 952541812);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.add((int) (byte) -1, (int) '4');
        int int21 = calculator0.divide(101, (-101));
        int int24 = calculator0.subtract((int) (short) 1, (int) (short) -1);
        int int27 = calculator0.divide((-91), (-2066162688));
        int int30 = calculator0.divide((-339618546), 736984748);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide(0, (-2037396585));
        int int12 = calculator0.subtract(0, (-675399327));
        int int15 = calculator0.multiply(1371450554, (-1145179290));
        int int18 = calculator0.subtract(0, 1479660197);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 675399327 + "'", int12 == 675399327);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-213950436) + "'", int15 == (-213950436));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1479660197) + "'", int18 == (-1479660197));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.add((-2146806784), 0);
        int int12 = calculator0.subtract(520297, 96);
        int int15 = calculator0.add((-20), (-68));
        int int18 = calculator0.subtract(1497046722, 6992);
        int int21 = calculator0.add(346346496, 1713901676);
        int int24 = calculator0.subtract(84, 1678282987);
        int int27 = calculator0.add((-1913872923), 72992237);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2146806784) + "'", int9 == (-2146806784));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520201 + "'", int12 == 520201);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-88) + "'", int15 == (-88));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1497039730 + "'", int18 == 1497039730);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2060248172 + "'", int21 == 2060248172);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1678282903) + "'", int24 == (-1678282903));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1840880686) + "'", int27 == (-1840880686));
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.add((int) (byte) -1, (int) '4');
        int int21 = calculator0.subtract((int) (byte) 1, 32);
        int int24 = calculator0.add(520297, 1810185236);
        int int27 = calculator0.divide((-1475970418), 1391530220);
        int int30 = calculator0.add((-415203), 151369422);
        int int33 = calculator0.divide(416892682, 665305);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-31) + "'", int21 == (-31));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1810705533 + "'", int24 == 1810705533);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 150954219 + "'", int30 == 150954219);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 626 + "'", int33 == 626);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide(76, 692692992);
        int int21 = calculator0.divide((-13365), (-7955541));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
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
        int int36 = calculator0.add((-86713376), 0);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-86713376) + "'", int36 == (-86713376));
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((-132), (-910738153));
        int int21 = calculator0.multiply((-1872794142), (-425855760));
        int int24 = calculator0.add(0, (-451867));
        int int27 = calculator0.multiply(2020, (-1236696666));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-910738285) + "'", int18 == (-910738285));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1110676512) + "'", int21 == (-1110676512));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-451867) + "'", int24 == (-451867));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1543700952 + "'", int27 == 1543700952);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
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
        int int33 = calculator0.divide((-88956770), 1663858818);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.divide(30, (-934840515));
        int int21 = calculator0.add(173435032, 1271869877);
        int int24 = calculator0.divide((-1644887942), (-29145099));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1445304909 + "'", int21 == 1445304909);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 56 + "'", int24 == 56);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.subtract(258400, 1481140680);
        int int9 = calculator0.subtract((-1758329162), 867133511);
        int int12 = calculator0.add(49976, (-868687826));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1480882280) + "'", int6 == (-1480882280));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1669504623 + "'", int9 == 1669504623);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-868637850) + "'", int12 == (-868637850));
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
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
        int int36 = calculator0.multiply(351352461, 1152044530);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1571390902) + "'", int36 == (-1571390902));
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.add(0, 897706770);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 897706770 + "'", int18 == 897706770);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
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
        int int30 = calculator0.subtract(1002376880, 1542690885);
        int int33 = calculator0.multiply((-1567474935), (-7466));
        int int36 = calculator0.add((-346346486), (-846679733));
        int int39 = calculator0.divide((-9433), 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1020111879) + "'", int27 == (-1020111879));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-540314005) + "'", int30 == (-540314005));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1018016890) + "'", int33 == (-1018016890));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1193026219) + "'", int36 == (-1193026219));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-314) + "'", int39 == (-314));
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.subtract(96, 97);
        int int15 = calculator0.multiply((-45), (-23318356));
        int int18 = calculator0.multiply(19670, 0);
        int int21 = calculator0.divide(11, 284903989);
        int int24 = calculator0.divide((-522816736), 47859271);
        int int27 = calculator0.add((-1838369148), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1049326020 + "'", int15 == 1049326020);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10) + "'", int24 == (-10));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1838369148) + "'", int27 == (-1838369148));
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(95, 0);
        int int15 = calculator0.multiply((-867138628), (-15200));
        int int18 = calculator0.multiply(100, 34);
        int int21 = calculator0.add((-49173772), (-171620238));
        int int24 = calculator0.multiply(1506752126, (-453239991));
        int int27 = calculator0.divide((-1966953124), 15005);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 95 + "'", int12 == 95);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-747485824) + "'", int15 == (-747485824));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3400 + "'", int18 == 3400);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-220794010) + "'", int21 == (-220794010));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1390269422 + "'", int24 == 1390269422);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-131086) + "'", int27 == (-131086));
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.subtract(76, (-867133439));
        int int18 = calculator0.multiply(33, 213009);
        int int21 = calculator0.subtract(0, 568590);
        int int24 = calculator0.add(866613314, 0);
        int int27 = calculator0.divide((-1341734912), 255644480);
        int int30 = calculator0.multiply((-628602), (-1593893682));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133515 + "'", int15 == 867133515);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7029297 + "'", int18 == 7029297);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-568590) + "'", int21 == (-568590));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 866613314 + "'", int24 == 866613314);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-5) + "'", int27 == (-5));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-919551020) + "'", int30 == (-919551020));
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) ' ', (int) (byte) 100);
        int int15 = calculator0.subtract((-207), 86713344);
        int int18 = calculator0.subtract(119647596, 17);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-68) + "'", int12 == (-68));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713551) + "'", int15 == (-86713551));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 119647579 + "'", int18 == 119647579);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
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
        int int33 = calculator0.subtract((-347884823), 1144658859);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1492543682) + "'", int33 == (-1492543682));
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply((-76), (int) (byte) 100);
        int int18 = calculator0.multiply((-88956701), 568480);
        int int21 = calculator0.multiply((-341775360), (-2019171204));
        int int24 = calculator0.subtract((-1153311376), (-2112964781));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7600) + "'", int15 == (-7600));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1160441376) + "'", int18 == (-1160441376));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1876799488) + "'", int21 == (-1876799488));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 959653405 + "'", int24 == 959653405);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.multiply((int) (short) 10, (-685834));
        int int21 = calculator0.divide((-76), (-3528));
        int int24 = calculator0.multiply(114939, (-417546408));
        int int27 = calculator0.add((-235439), 0);
        int int30 = calculator0.subtract((-558202980), (-1328086335));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6858340) + "'", int18 == (-6858340));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-402023608) + "'", int24 == (-402023608));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-235439) + "'", int27 == (-235439));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 769883355 + "'", int30 == 769883355);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide(76, 692692992);
        int int21 = calculator0.divide(29811430, (-72482652));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((int) '#', (int) ' ');
        int int18 = calculator0.add(34, (-1010));
        int int21 = calculator0.add(21975629, (-1777146311));
        int int24 = calculator0.divide(110, (-86713342));
        int int27 = calculator0.add((-1480882280), (-297012176));
        int int30 = calculator0.subtract(8939518, 915784888);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-976) + "'", int18 == (-976));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1755170682) + "'", int21 == (-1755170682));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1777894456) + "'", int27 == (-1777894456));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-906845370) + "'", int30 == (-906845370));
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (byte) 100, (-1));
        int int12 = calculator0.add(0, 770064344);
        int int15 = calculator0.divide((-6933), (-1889283385));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 770064344 + "'", int12 == 770064344);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(1944409556, 1600482450);
        int int9 = calculator0.divide(1360351360, 693717859);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-750075290) + "'", int6 == (-750075290));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.subtract(109, (int) (short) 100);
        int int15 = calculator0.subtract((-36), (-31));
        int int18 = calculator0.subtract((int) (byte) 0, 1494342816);
        int int21 = calculator0.multiply((-45), (-31));
        int int24 = calculator0.multiply(1591253037, (-146367728));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1494342816) + "'", int18 == (-1494342816));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1395 + "'", int21 == 1395);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 419086800 + "'", int24 == 419086800);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide((-68), (int) (byte) 100);
        int int12 = calculator0.subtract((-111), (int) (short) 10);
        int int15 = calculator0.multiply(108673896, (-111));
        int int18 = calculator0.divide(727168, (-1424737661));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-121) + "'", int12 == (-121));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 822099432 + "'", int15 == 822099432);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide(0, (-2037396585));
        int int12 = calculator0.divide((-453239991), 236316608);
        int int15 = calculator0.divide(0, (-860651007));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
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
        int int33 = calculator0.divide(822099412, 228021803);
        int int36 = calculator0.add((-1355343336), (-2015078631));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 924545329 + "'", int36 == 924545329);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (short) -1, 867133491);
        int int12 = calculator0.subtract((-86), (-109415563));
        int int15 = calculator0.subtract((-6858340), (-173436042));
        int int18 = calculator0.divide(1829824526, (-65093));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133491) + "'", int9 == (-867133491));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109415477 + "'", int12 == 109415477);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 166577702 + "'", int15 == 166577702);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-28110) + "'", int18 == (-28110));
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (short) -1, 867133491);
        int int12 = calculator0.multiply((-111), (-3528));
        int int15 = calculator0.add((-36), 1908264058);
        int int18 = calculator0.multiply(0, (-867133537));
        int int21 = calculator0.add((-1357816827), 1739617460);
        int int24 = calculator0.subtract((-1355003143), (-1269639346));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133491) + "'", int9 == (-867133491));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 391608 + "'", int12 == 391608);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1908264022 + "'", int15 == 1908264022);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 381800633 + "'", int21 == 381800633);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-85363797) + "'", int24 == (-85363797));
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.subtract((int) (byte) -1, 100);
        int int12 = calculator0.divide(153, 21975629);
        int int15 = calculator0.add(815415403, 236472665);
        int int18 = calculator0.multiply(1357146709, (-214132468));
        int int21 = calculator0.add((-97460156), (-1735));
        int int24 = calculator0.add((-415711797), (-1201602560));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-101) + "'", int9 == (-101));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1051888068 + "'", int15 == 1051888068);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-382875396) + "'", int18 == (-382875396));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-97461891) + "'", int21 == (-97461891));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1617314357) + "'", int24 == (-1617314357));
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', 1);
        int int15 = calculator0.multiply((-111), (-1919));
        int int18 = calculator0.subtract((-2), (-1262618369));
        int int21 = calculator0.divide((-1555994251), 1020457842);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 213009 + "'", int15 == 213009);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1262618367 + "'", int18 == 1262618367);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.multiply((-36), 98);
        int int21 = calculator0.divide((-7480), 34);
        int int24 = calculator0.subtract((-1494342816), (-747485824));
        int int27 = calculator0.add(8671272, 1855425755);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3528) + "'", int18 == (-3528));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-220) + "'", int21 == (-220));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-746856992) + "'", int24 == (-746856992));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1864097027 + "'", int27 == 1864097027);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
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
        int int30 = calculator0.subtract((-1908264058), (-1587684236));
        int int33 = calculator0.divide(1001242336, (-402023608));
        int int36 = calculator0.subtract(791316488, 6843642);
        int int39 = calculator0.divide((-1849536748), (-1160010088));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 346346496 + "'", int18 == 346346496);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1237148864) + "'", int21 == (-1237148864));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2003427328) + "'", int27 == (-2003427328));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-320579822) + "'", int30 == (-320579822));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-2) + "'", int33 == (-2));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 784472846 + "'", int36 == 784472846);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.multiply((-68), 110);
        int int18 = calculator0.add(1371450554, (-49164339));
        int int21 = calculator0.add(1152037331, (-867133342));
        int int24 = calculator0.divide((-20), (-8));
        int int27 = calculator0.multiply((-235439), 1144658859);
        int int30 = calculator0.divide(2139980843, 929193984);
        int int33 = calculator0.subtract(1236538978, (-409511314));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7480) + "'", int15 == (-7480));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1322286215 + "'", int18 == 1322286215);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 284903989 + "'", int21 == 284903989);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1024181989) + "'", int27 == (-1024181989));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1646050292 + "'", int33 == 1646050292);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.subtract(109, (int) (short) 100);
        int int15 = calculator0.multiply((-101), (int) (short) 10);
        int int18 = calculator0.divide((int) 'a', 196);
        int int21 = calculator0.subtract(114939, 42260032);
        int int24 = calculator0.add((-128), 1252021680);
        int int27 = calculator0.divide(1733832295, (-2095602842));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1010) + "'", int15 == (-1010));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-42145093) + "'", int21 == (-42145093));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1252021552 + "'", int24 == 1252021552);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
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
        int int33 = calculator0.add(867133546, (-78526350));
        int int36 = calculator0.multiply(897963264, (-1110676512));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 788607196 + "'", int33 == 788607196);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-2128519168) + "'", int36 == (-2128519168));
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
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
        int int30 = calculator0.add((-1917940425), 1307876110);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = calculator0.divide(334907774, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1049326020 + "'", int15 == 1049326020);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-52891664) + "'", int18 == (-52891664));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1822007072) + "'", int24 == (-1822007072));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-610064315) + "'", int30 == (-610064315));
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.divide((int) ' ', (-101));
        int int15 = calculator0.add(1152037484, (-6858340));
        int int18 = calculator0.multiply((-31), 9277);
        int int21 = calculator0.subtract((-88956701), 273998385);
        int int24 = calculator0.multiply((-791214257), 0);
        int int27 = calculator0.multiply((-915919376), (-1855610599));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1145179144 + "'", int15 == 1145179144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-287587) + "'", int18 == (-287587));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-362955086) + "'", int21 == (-362955086));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1069575280 + "'", int27 == 1069575280);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.add(51, (-97));
        int int15 = calculator0.divide(9, 867133591);
        int int18 = calculator0.subtract(9, (-109415563));
        int int21 = calculator0.subtract((-917629359), 206361130);
        int int24 = calculator0.divide(2016961242, (-2201));
        int int27 = calculator0.subtract(1589, 11868326);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-46) + "'", int12 == (-46));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 109415572 + "'", int18 == 109415572);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1123990489) + "'", int21 == (-1123990489));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-916384) + "'", int24 == (-916384));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-11866737) + "'", int27 == (-11866737));
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
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
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-110) + "'", int18 == (-110));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1769916224) + "'", int21 == (-1769916224));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1923 + "'", int24 == 1923);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1435799528) + "'", int27 == (-1435799528));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide(1219996744, 109415572);
        int int21 = calculator0.subtract(1497046722, (-6867620));
        int int24 = calculator0.divide((-223539911), 1660288029);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1503914342 + "'", int21 == 1503914342);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.subtract((int) (byte) -1, (int) (short) -1);
        int int15 = calculator0.add((-6858340), (-9280));
        int int18 = calculator0.divide(897963264, 94);
        int int21 = calculator0.subtract((-86713342), (-1380354224));
        int int24 = calculator0.subtract((-745367358), (-127527494));
        int int27 = calculator0.subtract((-314), 1244998712);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6867620) + "'", int15 == (-6867620));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9552800 + "'", int18 == 9552800);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1293640882 + "'", int21 == 1293640882);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-617839864) + "'", int24 == (-617839864));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1244999026) + "'", int27 == (-1244999026));
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract(9, (-100));
        int int15 = calculator0.divide(76, 692692992);
        int int18 = calculator0.add((int) 'a', (-867133439));
        int int21 = calculator0.subtract(1724755534, (-1237148864));
        int int24 = calculator0.divide((-467290489), (-1336575495));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109 + "'", int12 == 109);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-867133342) + "'", int18 == (-867133342));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1333062898) + "'", int21 == (-1333062898));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide(2243220, (int) '4');
        int int21 = calculator0.subtract((-902782633), 1678282987);
        int int24 = calculator0.subtract(960968797, (-74870788));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 43138 + "'", int18 == 43138);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1713901676 + "'", int21 == 1713901676);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1035839585 + "'", int24 == 1035839585);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.divide((-100), 32);
        int int21 = calculator0.multiply((int) (byte) -1, (-8));
        int int24 = calculator0.subtract(32, 520052);
        int int27 = calculator0.divide((-1475970418), 1978473568);
        int int30 = calculator0.multiply((-152), (-1007395635));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-520020) + "'", int24 == (-520020));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1494686136) + "'", int30 == (-1494686136));
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.add(33, (-7600));
        int int21 = calculator0.divide((-173436074), 96);
        int int24 = calculator0.divide((-1806625), (-1559826432));
        int int27 = calculator0.multiply((-1271895989), 151369422);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1806625) + "'", int21 == (-1806625));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 361774682 + "'", int27 == 361774682);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
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
        int int36 = calculator0.multiply(1612605694, 1606894920);
        java.lang.Class<?> wildcardClass37 = calculator0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 441187696 + "'", int36 == 441187696);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(95, 0);
        int int15 = calculator0.multiply((-867138628), (-15200));
        int int18 = calculator0.multiply(100, 34);
        int int21 = calculator0.add((-49173772), (-171620238));
        int int24 = calculator0.divide((-1555994343), (-845157802));
        int int27 = calculator0.add(7029297, (-100));
        int int30 = calculator0.divide((-70), (-1988260096));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 95 + "'", int12 == 95);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-747485824) + "'", int15 == (-747485824));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3400 + "'", int18 == 3400);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-220794010) + "'", int21 == (-220794010));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7029197 + "'", int27 == 7029197);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.divide((int) (short) 0, 34);
        int int15 = calculator0.multiply(290738210, (-1336575288));
        int int18 = calculator0.divide((-715737728), (-761355104));
        int int21 = calculator0.subtract(225504013, 867133782);
        int int24 = calculator0.subtract(278045632, 1875857755);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1286025584) + "'", int15 == (-1286025584));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-641629769) + "'", int21 == (-641629769));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1597812123) + "'", int24 == (-1597812123));
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.add((-609787), 1237148765);
        int int18 = calculator0.multiply(1539825347, (-816470980));
        int int21 = calculator0.multiply((-7567), (-136201627));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1236538978 + "'", int15 == 1236538978);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 827072948 + "'", int18 == 827072948);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-154439531) + "'", int21 == (-154439531));
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.subtract(96, 97);
        int int15 = calculator0.multiply((-45), (-23318356));
        int int18 = calculator0.subtract(232346588, (-844637556));
        int int21 = calculator0.multiply((-2027159188), (-88947591));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1049326020 + "'", int15 == 1049326020);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1076984144 + "'", int18 == 1076984144);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 167468044 + "'", int21 == 167468044);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
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
        int int39 = calculator0.subtract((-380871040), (-213950436));
        java.lang.Class<?> wildcardClass40 = calculator0.getClass();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-166920604) + "'", int39 == (-166920604));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide((int) (byte) -1, 69);
        int int21 = calculator0.add(822110308, (-88956677));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 733153631 + "'", int21 == 733153631);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, (-49164339));
        int int9 = calculator0.multiply((-1717387524), 146103337);
        int int12 = calculator0.multiply(1152037538, 265563723);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-49164339) + "'", int6 == (-49164339));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2152868) + "'", int9 == (-2152868));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 910389622 + "'", int12 == 910389622);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
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
        int int39 = calculator0.multiply(916297957, 380865840);
        int int42 = calculator0.subtract((-628602), 1254594707);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1595814928) + "'", int39 == (-1595814928));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1255223309) + "'", int42 == (-1255223309));
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.add((-867133515), 1154271478);
        int int18 = calculator0.divide(452435152, 867148791);
        int int21 = calculator0.multiply((-2045750321), 1271869877);
        int int24 = calculator0.add(408021504, (-396271647));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 287137963 + "'", int15 == 287137963);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1391911003 + "'", int21 == 1391911003);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11749857 + "'", int24 == 11749857);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
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
        int int33 = calculator0.add(326167110, 0);
        int int36 = calculator0.add(1809614551, 426572344);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 326167110 + "'", int33 == 326167110);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-2058780401) + "'", int36 == (-2058780401));
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.multiply((-10923885), (-708211210));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 597648450 + "'", int18 == 597648450);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.multiply((-68), (int) (short) 1);
        int int18 = calculator0.divide(20, (-109415445));
        int int21 = calculator0.subtract((-3410880), 757944224);
        int int24 = calculator0.multiply(49164339, (-1077925731));
        int int27 = calculator0.divide(766799183, (-1439965725));
        int int30 = calculator0.multiply((-27669), 25529447);
        int int33 = calculator0.subtract((-8), (-1569541339));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-68) + "'", int15 == (-68));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-761355104) + "'", int21 == (-761355104));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 920356679 + "'", int24 == 920356679);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1999632499) + "'", int30 == (-1999632499));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1569541331 + "'", int33 == 1569541331);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
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
        int int30 = calculator0.multiply((-1359151923), 19);
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133515 + "'", int15 == 867133515);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7029297 + "'", int18 == 7029297);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-568590) + "'", int21 == (-568590));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 93889170 + "'", int24 == 93889170);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1410665216) + "'", int27 == (-1410665216));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-54082761) + "'", int30 == (-54082761));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
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
        int int33 = calculator0.multiply(444273926, 197);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1622617502 + "'", int33 == 1622617502);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-110), (int) (short) 0);
        int int12 = calculator0.divide(1769916224, (-86713342));
        int int15 = calculator0.add((-902256731), (-876691332));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-110) + "'", int9 == (-110));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-20) + "'", int12 == (-20));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1778948063) + "'", int15 == (-1778948063));
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        int int21 = calculator0.divide((-1010), 86713455);
        int int24 = calculator0.add((int) (byte) 10, 867133491);
        int int27 = calculator0.multiply((-1772730154), 910344616);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 867133501 + "'", int24 == 867133501);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1598741904) + "'", int27 == (-1598741904));
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.subtract(20580, (-867133439));
        int int21 = calculator0.subtract(611523584, 0);
        int int24 = calculator0.multiply((-1152038506), (-135309308));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867154019 + "'", int18 == 867154019);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 611523584 + "'", int21 == 611523584);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1414875560) + "'", int24 == (-1414875560));
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
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
        int int30 = calculator0.subtract((-1897986901), (-97460156));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-110) + "'", int18 == (-110));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1769916224) + "'", int21 == (-1769916224));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 42260032 + "'", int24 == 42260032);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-322124534) + "'", int27 == (-322124534));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1800526745) + "'", int30 == (-1800526745));
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.subtract((int) (byte) -1, 0);
        int int21 = calculator0.add(0, (-520200));
        int int24 = calculator0.subtract((-443263125), 25);
        int int27 = calculator0.subtract(843, (-1734208202));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-520200) + "'", int21 == (-520200));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-443263150) + "'", int24 == (-443263150));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1734209045 + "'", int27 == 1734209045);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = calculator0.add((-76), (-76));
        int int27 = calculator0.subtract(39511578, 316808288);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-152) + "'", int24 == (-152));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-277296710) + "'", int27 == (-277296710));
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.subtract(867133420, 1269639304);
        int int21 = calculator0.divide((-188865526), 1497039730);
        int int24 = calculator0.subtract(23035, 1252748848);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-402505884) + "'", int18 == (-402505884));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1252725813) + "'", int24 == (-1252725813));
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.multiply((-86713457), 692692992);
        int int21 = calculator0.subtract(1271882624, 3400);
        int int24 = calculator0.add(287137963, 1);
        int int27 = calculator0.multiply((-2033296844), 1191511467);
        int int30 = calculator0.subtract((-1048810252), 13167513);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1271879224 + "'", int21 == 1271879224);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 287137964 + "'", int24 == 287137964);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1117603004 + "'", int27 == 1117603004);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1061977765) + "'", int30 == (-1061977765));
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
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
        int int30 = calculator0.divide((-1985611728), (-1025747029));
        int int33 = calculator0.multiply((-848730488), (-1951884651));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 96 + "'", int18 == 96);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 390495528 + "'", int33 == 390495528);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.divide((-36), 33);
        int int18 = calculator0.divide((-207), 33);
        int int21 = calculator0.add(67686400, 861507584);
        int int24 = calculator0.divide(2033296844, 1248234937);
        int int27 = calculator0.divide((int) (byte) 1, (-1503190165));
        int int30 = calculator0.multiply(1448383714, (-18912600));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 929193984 + "'", int21 == 929193984);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1710929840) + "'", int30 == (-1710929840));
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.subtract(96, 97);
        int int15 = calculator0.multiply((-45), (-23318356));
        int int18 = calculator0.subtract(232346588, (-844637556));
        int int21 = calculator0.multiply((-2027159188), (-88947591));
        int int24 = calculator0.multiply(452435152, (-1638373376));
        int int27 = calculator0.multiply(2033296844, 120578064);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1049326020 + "'", int15 == 1049326020);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1076984144 + "'", int18 == 1076984144);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 167468044 + "'", int21 == 167468044);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-550207488) + "'", int24 == (-550207488));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 144760000 + "'", int27 == 144760000);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
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
        int int30 = calculator0.subtract(378379962, 88947384);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 96 + "'", int21 == 96);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-867133566) + "'", int24 == (-867133566));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 289432578 + "'", int30 == 289432578);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
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
        int int33 = calculator0.multiply(49976, (-846679733));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 351463784 + "'", int33 == 351463784);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.divide((int) ' ', (-101));
        int int15 = calculator0.add(1152037484, (-6858340));
        int int18 = calculator0.divide(4213, 867133667);
        int int21 = calculator0.subtract((-4864), (-1357151573));
        int int24 = calculator0.subtract(867154009, 10107303);
        int int27 = calculator0.subtract((-547417792), 692692992);
        int int30 = calculator0.subtract((-867158169), 757717820);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1145179144 + "'", int15 == 1145179144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1357146709 + "'", int21 == 1357146709);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 857046706 + "'", int24 == 857046706);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1240110784) + "'", int27 == (-1240110784));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1624875989) + "'", int30 == (-1624875989));
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.multiply((int) (short) 100, (-152));
        int int18 = calculator0.multiply(0, (-170066666));
        int int21 = calculator0.subtract((-976617459), (-164358480));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15200) + "'", int15 == (-15200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-812258979) + "'", int21 == (-812258979));
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.subtract((-1), (-97));
        int int21 = calculator0.add((-97), 98);
        int int24 = calculator0.divide(178159040, (-867158093));
        int int27 = calculator0.divide((-152), (-45247));
        int int30 = calculator0.multiply(1527277189, 867150782);
        int int33 = calculator0.add(2085965638, (-866613314));
        int int36 = calculator0.divide((-2243610), 1421);
        int int39 = calculator0.add((int) '#', (-867051763));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 96 + "'", int18 == 96);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1063129674) + "'", int30 == (-1063129674));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1219352324 + "'", int33 == 1219352324);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1578) + "'", int36 == (-1578));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-867051728) + "'", int39 == (-867051728));
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.subtract(96, 97);
        int int15 = calculator0.multiply((-45), (-23318356));
        int int18 = calculator0.subtract(232346588, (-844637556));
        int int21 = calculator0.add(915784888, 1713901676);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1049326020 + "'", int15 == 1049326020);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1076984144 + "'", int18 == 1076984144);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1665280732) + "'", int21 == (-1665280732));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.multiply((-68), 110);
        int int18 = calculator0.add((-86), (-867133440));
        int int21 = calculator0.add(88956711, (-1687920631));
        int int24 = calculator0.divide((-1772730154), 415924806);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7480) + "'", int15 == (-7480));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-867133526) + "'", int18 == (-867133526));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1598963920) + "'", int21 == (-1598963920));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) '#', (-9312));
        int int18 = calculator0.subtract(1908264058, (-94668773));
        int int21 = calculator0.divide((-917629359), 2016961242);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9347 + "'", int15 == 9347);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2002932831 + "'", int18 == 2002932831);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (short) -1, 867133491);
        int int12 = calculator0.divide((-934840515), 1154271478);
        int int15 = calculator0.subtract((-848730488), 915784888);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = calculator0.divide((-1119636009), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133491) + "'", int9 == (-867133491));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1764515376) + "'", int15 == (-1764515376));
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
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
        int int30 = calculator0.divide((-407288877), 1497569312);
        int int33 = calculator0.subtract((-791837445), (-56));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1806625) + "'", int21 == (-1806625));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1738066976) + "'", int24 == (-1738066976));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-791837389) + "'", int33 == (-791837389));
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) ' ', (int) (byte) 100);
        int int15 = calculator0.subtract((-207), 86713344);
        int int18 = calculator0.divide((-96348159), 1013244259);
        int int21 = calculator0.add(2227920, 428644672);
        int int24 = calculator0.add((-88956677), 1965593689);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-68) + "'", int12 == (-68));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713551) + "'", int15 == (-86713551));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 430872592 + "'", int21 == 430872592);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1876637012 + "'", int24 == 1876637012);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
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
        int int33 = calculator0.divide(780440642, 206361130);
        int int36 = calculator0.subtract((-86713551), 1539825347);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1626538898) + "'", int36 == (-1626538898));
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
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
        int int30 = calculator0.subtract((-1908264058), (-1587684236));
        int int33 = calculator0.divide(1001242336, (-402023608));
        int int36 = calculator0.subtract(791316488, 6843642);
        int int39 = calculator0.subtract(9398835, (-15));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 346346496 + "'", int18 == 346346496);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1237148864) + "'", int21 == (-1237148864));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2003427328) + "'", int27 == (-2003427328));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-320579822) + "'", int30 == (-320579822));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-2) + "'", int33 == (-2));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 784472846 + "'", int36 == 784472846);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9398850 + "'", int39 == 9398850);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide(100, 98);
        int int21 = calculator0.subtract((-86713551), (int) (short) 100);
        int int24 = calculator0.add((-214132468), (-1526379269));
        int int27 = calculator0.add(1730079900, (-213935670));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-86713651) + "'", int21 == (-86713651));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1740511737) + "'", int24 == (-1740511737));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1516144230 + "'", int27 == 1516144230);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((-97), 96);
        int int15 = calculator0.multiply(1486954504, 911011581);
        int int18 = calculator0.multiply(2003425405, 867133381);
        int int21 = calculator0.multiply((-1976888653), 1612493414);
        int int24 = calculator0.subtract((-206359991), (-1879178559));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9312) + "'", int12 == (-9312));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1788602392) + "'", int15 == (-1788602392));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1593893681 + "'", int18 == 1593893681);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 733866322 + "'", int21 == 733866322);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1672818568 + "'", int24 == 1672818568);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((-1459544222), (-867133611));
        int int15 = calculator0.add((-1494342816), (-49164380));
        int int18 = calculator0.subtract(0, (-339618637));
        int int21 = calculator0.multiply((-59149533), (-1269639355));
        int int24 = calculator0.add((-1913870722), (-2201));
        int int27 = calculator0.subtract(1197227428, 9347);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1968289463 + "'", int12 == 1968289463);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1543507196) + "'", int15 == (-1543507196));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 339618637 + "'", int18 == 339618637);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1985712785) + "'", int21 == (-1985712785));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1913872923) + "'", int24 == (-1913872923));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1197218081 + "'", int27 == 1197218081);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) ' ', (int) (byte) 100);
        int int15 = calculator0.subtract((-207), 86713344);
        int int18 = calculator0.subtract(119647596, 17);
        int int21 = calculator0.add((-110), 96);
        int int24 = calculator0.multiply(867153943, (-1643366519));
        int int27 = calculator0.divide(8671272, (-111));
        int int30 = calculator0.add((-1497046780), 1864983544);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-68) + "'", int12 == (-68));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713551) + "'", int15 == (-86713551));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 119647579 + "'", int18 == 119647579);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-14) + "'", int21 == (-14));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1017804111 + "'", int24 == 1017804111);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-78119) + "'", int27 == (-78119));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 367936764 + "'", int30 == 367936764);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
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
        int int33 = calculator0.subtract(1967350207, 74540096);
        int int36 = calculator0.add(273998385, 1659460117);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1892810111 + "'", int33 == 1892810111);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1933458502 + "'", int36 == 1933458502);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.multiply((-23318356), 0);
        int int15 = calculator0.subtract((-346303569), (-1872794142));
        int int18 = calculator0.multiply(866613314, 42260132);
        int int21 = calculator0.add((-1030365215), 324289668);
        int int24 = calculator0.multiply(0, 1875906828);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1526490573 + "'", int15 == 1526490573);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1680329144) + "'", int18 == (-1680329144));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-706075547) + "'", int21 == (-706075547));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
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
        java.lang.Class<?> wildcardClass34 = calculator0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide((int) (short) 10, (-173426914));
        int int21 = calculator0.multiply((-46566313), (-1951649816));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1877043160 + "'", int21 == 1877043160);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
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
        java.lang.Class<?> wildcardClass37 = calculator0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.divide((int) 'a', (-207));
        int int21 = calculator0.multiply(0, (-867133440));
        int int24 = calculator0.divide(0, (-442694645));
        int int27 = calculator0.multiply((-1133620480), (-733804848));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1754624000 + "'", int27 == 1754624000);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.multiply((-86713457), 692692992);
        int int21 = calculator0.subtract(1271882624, 3400);
        int int24 = calculator0.divide(780440677, 867133667);
        int int27 = calculator0.add(67686582, (-1164468292));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1271879224 + "'", int21 == 1271879224);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1096781710) + "'", int27 == (-1096781710));
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        int int21 = calculator0.divide((-1010), 86713455);
        int int24 = calculator0.multiply(1779063741, 1671243464);
        int int27 = calculator0.subtract((-1007464220), (-1735219513));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1147225688) + "'", int24 == (-1147225688));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 727755293 + "'", int27 == 727755293);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply(0, 0);
        int int18 = calculator0.divide(19670, (-76));
        int int21 = calculator0.subtract((int) (short) -1, 1925360681);
        int int24 = calculator0.divide((-175453037), 93887247);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-258) + "'", int18 == (-258));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1925360682) + "'", int21 == (-1925360682));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (short) -1, 867133491);
        int int12 = calculator0.subtract((-86), (-109415563));
        int int15 = calculator0.add(0, 757944224);
        int int18 = calculator0.add(2, 1152037536);
        int int21 = calculator0.add(548010, (-1985610752));
        int int24 = calculator0.multiply(173200584, (-932693954));
        int int27 = calculator0.subtract((-1382585722), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133491) + "'", int9 == (-867133491));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109415477 + "'", int12 == 109415477);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 757944224 + "'", int15 == 757944224);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1152037538 + "'", int18 == 1152037538);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1985062742) + "'", int21 == (-1985062742));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1339770992 + "'", int24 == 1339770992);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1382585722) + "'", int27 == (-1382585722));
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
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
        int int33 = calculator0.divide(0, 2127453534);
        int int36 = calculator0.divide((-2131780436), (-685834));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3108 + "'", int36 == 3108);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
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
        int int33 = calculator0.divide((-557732664), (-1526391902));
        int int36 = calculator0.divide(0, (-1237148864));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.divide((-100), 32);
        int int21 = calculator0.divide((-1357151573), (-20));
        int int24 = calculator0.divide((-867133329), (-867133515));
        int int27 = calculator0.add((-1984132447), 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 67857578 + "'", int21 == 67857578);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1984132426) + "'", int27 == (-1984132426));
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.add((-2146806784), 0);
        int int12 = calculator0.subtract(520297, 96);
        int int15 = calculator0.add((-20), (-68));
        int int18 = calculator0.subtract(1497046722, 6992);
        int int21 = calculator0.multiply(1152037484, (-214452976));
        int int24 = calculator0.add((-2125598352), 2110282080);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2146806784) + "'", int9 == (-2146806784));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520201 + "'", int12 == 520201);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-88) + "'", int15 == (-88));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1497039730 + "'", int18 == 1497039730);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-737836352) + "'", int21 == (-737836352));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-15316272) + "'", int24 == (-15316272));
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.multiply((-68), 110);
        int int18 = calculator0.add((-86), (-867133440));
        int int21 = calculator0.add(0, 110);
        int int24 = calculator0.add(1322291616, (-1126964223));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7480) + "'", int15 == (-7480));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-867133526) + "'", int18 == (-867133526));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 110 + "'", int21 == 110);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 195327393 + "'", int24 == 195327393);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((int) '#', (int) ' ');
        int int18 = calculator0.add(34, (-1010));
        int int21 = calculator0.multiply(568480, (-6));
        int int24 = calculator0.add(568590, 391608);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-976) + "'", int18 == (-976));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3410880) + "'", int21 == (-3410880));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 960198 + "'", int24 == 960198);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
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
        int int30 = calculator0.subtract((-1874677642), (-1556003565));
        int int33 = calculator0.multiply(1524237619, (-1587684178));
        int int36 = calculator0.subtract((-520200), (-493712131));
        int int39 = calculator0.divide((-1555995532), 757717820);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-72012) + "'", int21 == (-72012));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-607867904) + "'", int27 == (-607867904));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-318674077) + "'", int30 == (-318674077));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 321805482 + "'", int33 == 321805482);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 493191931 + "'", int36 == 493191931);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-2) + "'", int39 == (-2));
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.add(1733678745, (-1740511737));
        int int18 = calculator0.multiply((-563954720), 1610593080);
        int int21 = calculator0.divide(419086800, (-547417792));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6832992) + "'", int15 == (-6832992));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-216614656) + "'", int18 == (-216614656));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(757717952, 867133515);
        int int15 = calculator0.divide(10, 6153309);
        int int18 = calculator0.subtract((-173426914), (-1772159544));
        int int21 = calculator0.multiply((-109415445), 49164439);
        int int24 = calculator0.divide(1938174875, 2075617054);
        int int27 = calculator0.add(1197218081, 1713442329);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-109415563) + "'", int12 == (-109415563));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1598732630 + "'", int18 == 1598732630);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1217368163) + "'", int21 == (-1217368163));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1384306886) + "'", int27 == (-1384306886));
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.add((int) (byte) -1, (int) '4');
        int int21 = calculator0.divide(101, (-101));
        int int24 = calculator0.add(1810185236, (int) (byte) 1);
        int int27 = calculator0.add((-1984132447), 1395);
        int int30 = calculator0.add(984703730, (-1059177584));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1810185237 + "'", int24 == 1810185237);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1984131052) + "'", int27 == (-1984131052));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-74473854) + "'", int30 == (-74473854));
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((-7466), 67686400);
        int int18 = calculator0.divide(0, 6992);
        int int21 = calculator0.multiply((-31), (-346346486));
        int int24 = calculator0.divide(743025313, (-1448314236));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2146806474 + "'", int21 == 2146806474);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.subtract(2, 86713344);
        int int18 = calculator0.multiply(20, 1154271478);
        int int21 = calculator0.divide(173200584, 49164439);
        int int24 = calculator0.multiply((-1007548917), (-1729226194));
        int int27 = calculator0.multiply((-376890729), 1436206848);
        int int30 = calculator0.subtract((-350777344), 223595);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713342) + "'", int15 == (-86713342));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1610593080 + "'", int18 == 1610593080);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-262917126) + "'", int24 == (-262917126));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1249812224) + "'", int27 == (-1249812224));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-351000939) + "'", int30 == (-351000939));
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide(76, 692692992);
        int int21 = calculator0.subtract(51, (-665254));
        int int24 = calculator0.multiply(131, 867133667);
        int int27 = calculator0.subtract((-757944339), (-1772159544));
        int int30 = calculator0.subtract((-1985610752), 0);
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 665305 + "'", int21 == 665305);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1925360681 + "'", int24 == 1925360681);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1014215205 + "'", int27 == 1014215205);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1985610752) + "'", int30 == (-1985610752));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
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
        int int30 = calculator0.multiply((-175453037), (-1893793792));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1700666764 + "'", int15 == 1700666764);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-161052992) + "'", int18 == (-161052992));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-8) + "'", int24 == (-8));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9347 + "'", int27 == 9347);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-489881600) + "'", int30 == (-489881600));
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
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
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((-866613314), 692692992);
        int int18 = calculator0.add(1693566793, 867154995);
        int int21 = calculator0.add(5, 1581845912);
        int int24 = calculator0.multiply(2110282080, 1676364944);
        int int27 = calculator0.multiply(38, (-1777894456));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1734245508) + "'", int18 == (-1734245508));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1581845917 + "'", int21 == 1581845917);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1717224960 + "'", int24 == 1717224960);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1159487408 + "'", int27 == 1159487408);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract(10, 346346496);
        int int18 = calculator0.add((-866613314), 665305);
        int int21 = calculator0.add(452546306, 74540096);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-346346486) + "'", int15 == (-346346486));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-865948009) + "'", int18 == (-865948009));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 527086402 + "'", int21 == 527086402);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract(10, 346346496);
        int int18 = calculator0.add(1001242336, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-346346486) + "'", int15 == (-346346486));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1001242336 + "'", int18 == 1001242336);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
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
        int int33 = calculator0.divide((-111), 952045526);
        java.lang.Class<?> wildcardClass34 = calculator0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.divide(0, (-1769916224));
        int int12 = calculator0.add((-9280), 2243220);
        int int15 = calculator0.add((-685328092), 86144864);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2233940 + "'", int12 == 2233940);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-599183228) + "'", int15 == (-599183228));
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add(1, (-867133440));
        int int18 = calculator0.divide((-101), (-1923));
        int int21 = calculator0.divide(3400, 520201);
        int int24 = calculator0.divide((-417546408), 1076984144);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133439) + "'", int15 == (-867133439));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(20580, (-685834));
        int int9 = calculator0.add(1152037536, 2);
        int int12 = calculator0.add(3563280, (-685834));
        int int15 = calculator0.multiply((-72482652), (-685328092));
        int int18 = calculator0.add((-867133431), 2118708574);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-665254) + "'", int6 == (-665254));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1152037538 + "'", int9 == 1152037538);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2877446 + "'", int12 == 2877446);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-146367728) + "'", int15 == (-146367728));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1251575143 + "'", int18 == 1251575143);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
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
        int int30 = calculator0.subtract(43138, 1248234937);
        int int33 = calculator0.divide((-964732924), (-1524500671));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1271879224 + "'", int21 == 1271879224);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 287137964 + "'", int24 == 287137964);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1532796050 + "'", int27 == 1532796050);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1248191799) + "'", int30 == (-1248191799));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.subtract((int) (byte) -1, (int) (short) -1);
        int int15 = calculator0.add((-6858340), (-9280));
        int int18 = calculator0.divide(897963264, 94);
        int int21 = calculator0.multiply(1877043160, (-1468341696));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6867620) + "'", int15 == (-6867620));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9552800 + "'", int18 == 9552800);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 855025152 + "'", int21 == 855025152);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.multiply((-9312), (-9312));
        int int15 = calculator0.subtract(867133515, (-6));
        int int18 = calculator0.divide((-883378176), 228021803);
        int int21 = calculator0.add((-1823775808), 1965697075);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713344 + "'", int12 == 86713344);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133521 + "'", int15 == 867133521);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 141921267 + "'", int21 == 141921267);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
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
        int int39 = calculator0.divide(737714171, 1386323417);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
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
        int int36 = calculator0.divide(1864983544, (-935719672));
        int int39 = calculator0.subtract((-1316565624), 1617645568);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1360756104 + "'", int39 == 1360756104);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.add((int) (byte) 1, (int) ' ');
        int int15 = calculator0.subtract(1560953741, (-1816189210));
        int int18 = calculator0.subtract(1527277189, (int) (byte) 10);
        int int21 = calculator0.subtract(1792924371, (-7596));
        int int24 = calculator0.divide((-1710929840), (-1810467552));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-917824345) + "'", int15 == (-917824345));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1527277179 + "'", int18 == 1527277179);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1792931967 + "'", int21 == 1792931967);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
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
        java.lang.Class<?> wildcardClass34 = calculator0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.add((int) (byte) -1, (int) '4');
        int int21 = calculator0.divide((-1582342682), (-1919));
        int int24 = calculator0.divide((-1891899810), (-37489334));
        int int27 = calculator0.subtract((-307225), (-1732654817));
        int int30 = calculator0.subtract(947747342, 201951404);
        int int33 = calculator0.subtract(1322286213, 1994097769);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 824566 + "'", int21 == 824566);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 50 + "'", int24 == 50);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1732347592 + "'", int27 == 1732347592);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 745795938 + "'", int30 == 745795938);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-671811556) + "'", int33 == (-671811556));
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-110), (int) (short) 0);
        int int12 = calculator0.divide(1769916224, (-86713342));
        int int15 = calculator0.multiply(1145179144, (-607867904));
        int int18 = calculator0.add(72529, 1618241304);
        int int21 = calculator0.multiply((-935621487), 1819092031);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-110) + "'", int9 == (-110));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-20) + "'", int12 == (-20));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1848991744 + "'", int15 == 1848991744);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1618313833 + "'", int18 == 1618313833);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1406600273) + "'", int21 == (-1406600273));
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
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
        int int30 = calculator0.multiply(139625737, 2000341604);
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-110) + "'", int18 == (-110));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1769916224) + "'", int21 == (-1769916224));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20580 + "'", int24 == 20580);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1276937488 + "'", int27 == 1276937488);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1338044028) + "'", int30 == (-1338044028));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((-290), (-1887134100));
        int int21 = calculator0.subtract((-2051022112), 954669693);
        int int24 = calculator0.add(867133607, (-1364149248));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1887133810 + "'", int18 == 1887133810);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1289275491 + "'", int21 == 1289275491);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-497015641) + "'", int24 == (-497015641));
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.divide(692692992, (-1010));
        int int21 = calculator0.add((-241122442), (-757113551));
        int int24 = calculator0.divide((-34682070), (-1121822200));
        int int27 = calculator0.divide((-1247137119), (-96792576));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-685834) + "'", int18 == (-685834));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-998235993) + "'", int21 == (-998235993));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12 + "'", int27 == 12);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply((-76), (int) (byte) 100);
        int int18 = calculator0.subtract((-867133440), 692692992);
        int int21 = calculator0.add(1769916224, (-101));
        int int24 = calculator0.multiply(2033296844, (-7600));
        int int27 = calculator0.divide(109, 6153309);
        int int30 = calculator0.subtract((-1341611195), (-46));
        int int33 = calculator0.multiply(1892558248, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7600) + "'", int15 == (-7600));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1559826432) + "'", int18 == (-1559826432));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1769916123 + "'", int21 == 1769916123);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 236316608 + "'", int24 == 236316608);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1341611149) + "'", int30 == (-1341611149));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) ' ', (int) (byte) 100);
        int int15 = calculator0.subtract((-207), 86713344);
        int int18 = calculator0.subtract(119647596, 17);
        int int21 = calculator0.add((-110), 96);
        int int24 = calculator0.add(331885888, (-1769916224));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-68) + "'", int12 == (-68));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713551) + "'", int15 == (-86713551));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 119647579 + "'", int18 == 119647579);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-14) + "'", int21 == (-14));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1438030336) + "'", int24 == (-1438030336));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.add(568480, 110);
        int int15 = calculator0.subtract((-867154019), 67686496);
        int int18 = calculator0.add((-214452976), (-1838369148));
        int int21 = calculator0.add(568590, 0);
        int int24 = calculator0.divide((-88947591), (-2033296844));
        int int27 = calculator0.multiply(1084030616, 767600052);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-934840515) + "'", int15 == (-934840515));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2052822124) + "'", int18 == (-2052822124));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 568590 + "'", int21 == 568590);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1216019168 + "'", int27 == 1216019168);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
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
        int int33 = calculator0.multiply(0, 445324722);
        int int36 = calculator0.divide(211766202, (-1582342682));
        int int39 = calculator0.divide((-1777481381), (-1494342816));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide(2243220, (int) '4');
        int int21 = calculator0.subtract((-902782633), 1678282987);
        int int24 = calculator0.subtract((-24578), (-1519675107));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 43138 + "'", int18 == 43138);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1713901676 + "'", int21 == 1713901676);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1519650529 + "'", int24 == 1519650529);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.divide((int) ' ', (-101));
        int int15 = calculator0.add(1152037484, (-6858340));
        int int18 = calculator0.divide(4213, 867133667);
        int int21 = calculator0.multiply((-9433), 346346496);
        int int24 = calculator0.multiply((-96792576), 867133509);
        int int27 = calculator0.add(1080143628, 859170407);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1145179144 + "'", int15 == 1145179144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1383615488 + "'", int21 == 1383615488);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1617645568 + "'", int24 == 1617645568);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1939314035 + "'", int27 == 1939314035);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
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
        int int30 = calculator0.add(1733678745, (-1685150444));
        int int33 = calculator0.add((-1247137119), (-329995808));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-647254446) + "'", int27 == (-647254446));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 48528301 + "'", int30 == 48528301);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1577132927) + "'", int33 == (-1577132927));
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide(692692992, 2);
        int int21 = calculator0.add((-1), 0);
        int int24 = calculator0.subtract((-1873421072), 436688816);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 346346496 + "'", int18 == 346346496);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1984857408 + "'", int24 == 1984857408);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply((-76), (int) (short) -1);
        int int18 = calculator0.multiply(20580, (-49164339));
        int int21 = calculator0.add((-2003427328), (-171620238));
        int int24 = calculator0.add((-109415539), 1170137828);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 76 + "'", int15 == 76);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1810185236 + "'", int18 == 1810185236);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2119919730 + "'", int21 == 2119919730);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1060722289 + "'", int24 == 1060722289);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide((int) (short) 10, (-173426914));
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
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.divide((-2004844816), 1145179044);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((-866613314), 692692992);
        int int18 = calculator0.multiply((-1925360682), (-1503190165));
        int int21 = calculator0.add((-1435799523), (-187));
        int int24 = calculator0.subtract(770064344, 461024588);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-365802382) + "'", int18 == (-365802382));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1435799710) + "'", int21 == (-1435799710));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 309039756 + "'", int24 == 309039756);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) '#', (-9312));
        int int18 = calculator0.multiply(86713455, 1769916224);
        int int21 = calculator0.subtract((-2), 1154271478);
        int int24 = calculator0.multiply((-1094608422), 910738184);
        int int27 = calculator0.subtract(1197218081, 210792194);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9347 + "'", int15 == 9347);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1237148864 + "'", int18 == 1237148864);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1154271480) + "'", int21 == (-1154271480));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1349657392) + "'", int24 == (-1349657392));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 986425887 + "'", int27 == 986425887);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.multiply((int) (short) 10, (-685834));
        int int21 = calculator0.subtract(867154019, 1925360681);
        int int24 = calculator0.multiply(100, 0);
        int int27 = calculator0.subtract(227, (-1058206662));
        int int30 = calculator0.divide((-458491822), (-563954720));
        int int33 = calculator0.add((-1161211809), 1503914342);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6858340) + "'", int18 == (-6858340));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1058206662) + "'", int21 == (-1058206662));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1058206889 + "'", int27 == 1058206889);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 342702533 + "'", int33 == 342702533);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
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
        int int30 = calculator0.subtract(867133607, (-59));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-72012) + "'", int21 == (-72012));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1723187) + "'", int27 == (-1723187));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 867133666 + "'", int30 == 867133666);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        int int21 = calculator0.multiply(1269639246, 1037464303);
        int int24 = calculator0.multiply((-867158169), (int) (byte) 100);
        int int27 = calculator0.divide(25, (-290738176));
        int int30 = calculator0.multiply(18002567, (-841742365));
        int int33 = calculator0.add(2877446, (-178330532));
        int int36 = calculator0.subtract(104, (-402023608));
        int int39 = calculator0.divide(859177974, (-360839020));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 164584658 + "'", int21 == 164584658);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-816470980) + "'", int24 == (-816470980));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1765932725 + "'", int30 == 1765932725);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-175453086) + "'", int33 == (-175453086));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 402023712 + "'", int36 == 402023712);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-2) + "'", int39 == (-2));
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply((-76), (int) (byte) 100);
        int int18 = calculator0.multiply(109, 20580);
        int int21 = calculator0.divide((-111), 1075835744);
        int int24 = calculator0.multiply(1308749824, 581169146);
        int int27 = calculator0.add(86605184, (-1357816827));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7600) + "'", int15 == (-7600));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2243220 + "'", int18 == 2243220);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-856399872) + "'", int24 == (-856399872));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1271211643) + "'", int27 == (-1271211643));
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
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
        int int33 = calculator0.subtract((-1872319616), (-865948009));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1006371607) + "'", int33 == (-1006371607));
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
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
        int int39 = calculator0.multiply((-362406912), (-362406912));
        int int42 = calculator0.add((-1202696310), (-576693300));
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1393557504 + "'", int39 == 1393557504);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1779389610) + "'", int42 == (-1779389610));
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) ' ', (int) (byte) 100);
        int int15 = calculator0.subtract((-207), 86713344);
        int int18 = calculator0.divide((-96348159), 1013244259);
        int int21 = calculator0.add((-1889283420), 35);
        int int24 = calculator0.subtract(1597676684, (-1154271480));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-68) + "'", int12 == (-68));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713551) + "'", int15 == (-86713551));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1889283385) + "'", int21 == (-1889283385));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1543019132) + "'", int24 == (-1543019132));
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
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
        int int30 = calculator0.multiply((-2453011), (-1732654817));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-102) + "'", int24 == (-102));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2132911612) + "'", int27 == (-2132911612));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1001406285) + "'", int30 == (-1001406285));
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract(1237147755, 1017804111);
        int int15 = calculator0.subtract(212293092, 929193984);
        int int18 = calculator0.add((-867133491), (-1545650944));
        int int21 = calculator0.multiply(0, (-915919376));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 219343644 + "'", int12 == 219343644);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-716900892) + "'", int15 == (-716900892));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1882182861 + "'", int18 == 1882182861);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract(1237147755, 1017804111);
        int int15 = calculator0.subtract(212293092, 929193984);
        int int18 = calculator0.add((-867133491), (-1545650944));
        int int21 = calculator0.divide(1274638223, 109);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 219343644 + "'", int12 == 219343644);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-716900892) + "'", int15 == (-716900892));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1882182861 + "'", int18 == 1882182861);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11693928 + "'", int21 == 11693928);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.add(568480, 110);
        int int15 = calculator0.subtract(1787380221, 86713457);
        int int18 = calculator0.add((-68), (-2146806784));
        int int21 = calculator0.divide((-1813700023), (-50514530));
        int int24 = calculator0.divide((-1145179180), 4864);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1700666764 + "'", int15 == 1700666764);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2146806852) + "'", int18 == (-2146806852));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-235439) + "'", int24 == (-235439));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.subtract((int) (byte) -1, 100);
        int int12 = calculator0.divide(153, 21975629);
        int int15 = calculator0.add(815415403, 236472665);
        int int18 = calculator0.multiply(1357146709, (-214132468));
        int int21 = calculator0.multiply((-2132911612), (-1380354224));
        int int24 = calculator0.divide(1948767848, (-1359151923));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-101) + "'", int9 == (-101));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1051888068 + "'", int15 == 1051888068);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-382875396) + "'", int18 == (-382875396));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1647836480 + "'", int21 == 1647836480);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.multiply((-1923), 2115365205);
        int int12 = calculator0.divide(1269639246, (-433567285));
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-513259903) + "'", int9 == (-513259903));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-110), (int) (short) 0);
        int int12 = calculator0.divide(1769916224, (-86713342));
        int int15 = calculator0.divide((-1102996576), (-1617647721));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-110) + "'", int9 == (-110));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-20) + "'", int12 == (-20));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
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
        int int39 = calculator0.add((-1720133280), 1145186611);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-574946669) + "'", int39 == (-574946669));
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) '#', (-9312));
        int int18 = calculator0.multiply(86713455, 1769916224);
        int int21 = calculator0.subtract((-121), 1503190044);
        int int24 = calculator0.multiply(11, 1687835691);
        int int27 = calculator0.divide((-2058780401), (-1160010088));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9347 + "'", int15 == 9347);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1237148864 + "'", int18 == 1237148864);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1503190165) + "'", int21 == (-1503190165));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1386323417 + "'", int24 == 1386323417);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.multiply((int) (short) -1, 49164339);
        int int12 = calculator0.divide((-1341734912), (-567));
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-49164339) + "'", int9 == (-49164339));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2366375 + "'", int12 == 2366375);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide((-68), (int) (byte) 100);
        int int12 = calculator0.subtract((-111), (int) (short) 10);
        int int15 = calculator0.multiply((-7600), (-34));
        int int18 = calculator0.multiply(1527277189, (-2131780436));
        int int21 = calculator0.add(867154019, (-2146806852));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-121) + "'", int12 == (-121));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 258400 + "'", int15 == 258400);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2118708572 + "'", int18 == 2118708572);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1279652833) + "'", int21 == (-1279652833));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.divide(30, (-934840515));
        int int21 = calculator0.add(173435032, 1271869877);
        int int24 = calculator0.subtract(1486954504, 50);
        int int27 = calculator0.divide(954669693, 1398237147);
        int int30 = calculator0.subtract(887396705, (-9432));
        int int33 = calculator0.multiply(638350336, 677728192);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1445304909 + "'", int21 == 1445304909);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1486954454 + "'", int24 == 1486954454);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 887406137 + "'", int30 == 887406137);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 623050752 + "'", int33 == 623050752);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.subtract((int) (byte) -1, (int) (short) -1);
        int int15 = calculator0.add((-6858340), (-9280));
        int int18 = calculator0.divide(897963264, 94);
        int int21 = calculator0.divide((-1700666664), (int) (byte) 10);
        int int24 = calculator0.divide((-6832992), (-1050892990));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6867620) + "'", int15 == (-6867620));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9552800 + "'", int18 == 9552800);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-170066666) + "'", int21 == (-170066666));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
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
        int int30 = calculator0.subtract((-1248191773), 1630105472);
        int int33 = calculator0.add((-932694645), (-1033752816));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867154019 + "'", int18 == 867154019);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19670 + "'", int21 == 19670);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1448314236) + "'", int24 == (-1448314236));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1416670051 + "'", int30 == 1416670051);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1966447461) + "'", int33 == (-1966447461));
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((-101), (-86));
        int int15 = calculator0.add((-362406912), (-173426797));
        int int18 = calculator0.subtract(2129948464, 1730079900);
        int int21 = calculator0.add((-18090313), (-917629359));
        int int24 = calculator0.subtract((-1850343988), (-828646945));
        int int27 = calculator0.multiply(440742595, (-654191323));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-15) + "'", int12 == (-15));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-535833709) + "'", int15 == (-535833709));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 399868564 + "'", int18 == 399868564);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-935719672) + "'", int21 == (-935719672));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1021697043) + "'", int24 == (-1021697043));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-587229905) + "'", int27 == (-587229905));
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.subtract((int) (byte) -1, (int) (short) -1);
        int int15 = calculator0.add((-6858340), (-9280));
        int int18 = calculator0.divide(897963264, 94);
        int int21 = calculator0.divide((-1700666664), (int) (byte) 10);
        int int24 = calculator0.multiply((-171620289), 501219328);
        int int27 = calculator0.divide((-346346486), (-587860616));
        int int30 = calculator0.multiply(743025313, 916297905);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6867620) + "'", int15 == (-6867620));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9552800 + "'", int18 == 9552800);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-170066666) + "'", int21 == (-170066666));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1512046592 + "'", int24 == 1512046592);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-151285423) + "'", int30 == (-151285423));
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.subtract((int) (byte) -1, (int) (short) -1);
        int int15 = calculator0.add((-6858340), (-9280));
        int int18 = calculator0.add(1615472032, (-3463464));
        int int21 = calculator0.divide(104749, (-462757624));
        int int24 = calculator0.subtract((-240317368), (-2003427328));
        int int27 = calculator0.subtract((-1408776206), (-5189));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6867620) + "'", int15 == (-6867620));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1612008568 + "'", int18 == 1612008568);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1763109960 + "'", int24 == 1763109960);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1408771017) + "'", int27 == (-1408771017));
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
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
        int int30 = calculator0.multiply(0, (-688528736));
        int int33 = calculator0.add(1451815553, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 96 + "'", int18 == 96);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-867133571) + "'", int21 == (-867133571));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-88947591) + "'", int27 == (-88947591));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1451815553 + "'", int33 == 1451815553);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.add(867133667, (-121));
        int int21 = calculator0.subtract(0, (-1908264058));
        int int24 = calculator0.add((-10), (-1));
        int int27 = calculator0.multiply(1302854894, 431551980);
        int int30 = calculator0.subtract(1956517073, 351515216);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133546 + "'", int18 == 867133546);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1908264058 + "'", int21 == 1908264058);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-11) + "'", int24 == (-11));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1694298472 + "'", int27 == 1694298472);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1605001857 + "'", int30 == 1605001857);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.subtract((-100), 2243220);
        int int21 = calculator0.subtract((-86713342), 0);
        int int24 = calculator0.multiply((-1734245508), (-1469333649));
        int int27 = calculator0.subtract((-1187870128), 587875439);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2243320) + "'", int18 == (-2243320));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-86713342) + "'", int21 == (-86713342));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 66422468 + "'", int24 == 66422468);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1775745567) + "'", int27 == (-1775745567));
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply((-76), (int) (short) -1);
        int int18 = calculator0.add((-10), (-68));
        int int21 = calculator0.multiply(765145078, 399868564);
        int int24 = calculator0.subtract((-1935849733), (-356995307));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 76 + "'", int15 == 76);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-78) + "'", int18 == (-78));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 767600184 + "'", int21 == 767600184);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1578854426) + "'", int24 == (-1578854426));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.add((int) (byte) -1, (int) '4');
        int int21 = calculator0.divide(101, (-101));
        int int24 = calculator0.add(1810185236, (int) (byte) 1);
        int int27 = calculator0.add((-1984132447), 1395);
        int int30 = calculator0.multiply((-1281928915), 7029197);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1810185237 + "'", int24 == 1810185237);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1984131052) + "'", int27 == (-1984131052));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 697789961 + "'", int30 == 697789961);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
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
        int int30 = calculator0.multiply(780440743, 2079419585);
        int int33 = calculator0.subtract((-2661528), 9398850);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7955592 + "'", int27 == 7955592);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 786531815 + "'", int30 == 786531815);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-12060378) + "'", int33 == (-12060378));
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((-178319437), (-11095));
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-178330532) + "'", int12 == (-178330532));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.divide((int) ' ', (-101));
        int int15 = calculator0.add(1152037484, (-6858340));
        int int18 = calculator0.multiply(867148791, 66422468);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1145179144 + "'", int15 == 1145179144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1387254556 + "'", int18 == 1387254556);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (byte) 1, 96);
        int int24 = calculator0.divide((-1869161959), 4);
        int int27 = calculator0.divide(10, 2877446);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 96 + "'", int21 == 96);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-467290489) + "'", int24 == (-467290489));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.divide(692692992, (-1010));
        int int21 = calculator0.multiply((-36), (-867133571));
        int int24 = calculator0.divide((-2020), 241122679);
        int int27 = calculator0.subtract((-341784793), 18);
        int int30 = calculator0.subtract(12, (-214132678));
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-685834) + "'", int18 == (-685834));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1152037484 + "'", int21 == 1152037484);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-341784811) + "'", int27 == (-341784811));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 214132690 + "'", int30 == 214132690);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (byte) 1, 96);
        int int24 = calculator0.subtract(25, 867133591);
        int int27 = calculator0.subtract(1987895262, (-1152034604));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 96 + "'", int21 == 96);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-867133566) + "'", int24 == (-867133566));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1155037430) + "'", int27 == (-1155037430));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
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
        int int30 = calculator0.add(867153933, (-173436074));
        int int33 = calculator0.divide(2118708574, (-1115015376));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-31) + "'", int21 == (-31));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1810705533 + "'", int24 == 1810705533);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1003073195) + "'", int27 == (-1003073195));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 693717859 + "'", int30 == 693717859);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.divide(692692992, (-1010));
        int int21 = calculator0.multiply((-36), (-867133571));
        int int24 = calculator0.divide((-2020), 241122679);
        int int27 = calculator0.subtract((-341784793), 18);
        int int30 = calculator0.subtract(12, (-214132678));
        int int33 = calculator0.multiply(780440743, (-1539825345));
        int int36 = calculator0.add((-1481140680), 877468777);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-685834) + "'", int18 == (-685834));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1152037484 + "'", int21 == 1152037484);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-341784811) + "'", int27 == (-341784811));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 214132690 + "'", int30 == 214132690);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 173153305 + "'", int33 == 173153305);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-603671903) + "'", int36 == (-603671903));
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
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
        int int33 = calculator0.multiply((-1322291616), 428644672);
        int int36 = calculator0.add((-52), (-1555995480));
        int int39 = calculator0.subtract((-1293640847), (-1872319616));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1632827392 + "'", int33 == 1632827392);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1555995532) + "'", int36 == (-1555995532));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 578678769 + "'", int39 == 578678769);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.subtract((-100), 2243220);
        int int21 = calculator0.subtract((-86713342), 0);
        int int24 = calculator0.divide(1236538979, 907339462);
        int int27 = calculator0.subtract((-476865382), (-2133659645));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2243320) + "'", int18 == (-2243320));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-86713342) + "'", int21 == (-86713342));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1656794263 + "'", int27 == 1656794263);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.multiply((-36), 98);
        int int21 = calculator0.divide(232346588, (-1806625));
        int int24 = calculator0.multiply(18, (-428329688));
        int int27 = calculator0.multiply((-198788048), (-1543475278));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3528) + "'", int18 == (-3528));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-128) + "'", int21 == (-128));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 880000208 + "'", int24 == 880000208);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1317513568 + "'", int27 == 1317513568);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(95, 0);
        int int15 = calculator0.multiply((-867138628), (-15200));
        int int18 = calculator0.multiply(100, 34);
        int int21 = calculator0.add((-49173772), (-171620238));
        int int24 = calculator0.divide((-1555994343), (-845157802));
        int int27 = calculator0.add((-867133566), 1152037538);
        int int30 = calculator0.multiply(1242147097, 582296876);
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 95 + "'", int12 == 95);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-747485824) + "'", int15 == (-747485824));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3400 + "'", int18 == 3400);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-220794010) + "'", int21 == (-220794010));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 284903972 + "'", int27 == 284903972);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-3756724) + "'", int30 == (-3756724));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide((-867133439), 9);
        int int12 = calculator0.divide((-2146806852), 1145179044);
        int int15 = calculator0.add((-1546626620), 1539825347);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6801273) + "'", int15 == (-6801273));
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.add(51, (int) (short) 1);
        int int15 = calculator0.add((-68), 32);
        int int18 = calculator0.subtract(1810185237, (-2132911612));
        int int21 = calculator0.multiply(867138284, (-88));
        int int24 = calculator0.subtract((-1816189210), (-1887134100));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-36) + "'", int15 == (-36));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-351870447) + "'", int18 == (-351870447));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1001242336 + "'", int21 == 1001242336);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 70944890 + "'", int24 == 70944890);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.divide(210, (-976));
        int int21 = calculator0.add((-109415539), (-111));
        int int24 = calculator0.subtract(1820836164, 1469483703);
        int int27 = calculator0.multiply(0, (-9432));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-109415650) + "'", int21 == (-109415650));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 351352461 + "'", int24 == 351352461);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.add((int) (byte) 1, (int) ' ');
        int int15 = calculator0.subtract(754840506, (-1984132447));
        int int18 = calculator0.divide(172635648, 258238464);
        int int21 = calculator0.multiply(991518632, 120216076);
        int int24 = calculator0.divide(1950041167, (-65467569));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1555994343) + "'", int15 == (-1555994343));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-94270496) + "'", int21 == (-94270496));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-29) + "'", int24 == (-29));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply((-76), (-7480));
        int int9 = calculator0.subtract(1610593080, 1258058047);
        int int12 = calculator0.subtract(2, 206361130);
        int int15 = calculator0.divide(1810185264, (-3459));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 568480 + "'", int6 == 568480);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 352535033 + "'", int9 == 352535033);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-206361128) + "'", int12 == (-206361128));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-523326) + "'", int15 == (-523326));
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
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
        int int42 = calculator0.add(1373662594, 949005184);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1972299518) + "'", int42 == (-1972299518));
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.subtract(109, (int) (short) 100);
        int int15 = calculator0.multiply((-101), (int) (short) 10);
        int int18 = calculator0.divide((int) 'a', 196);
        int int21 = calculator0.subtract(114939, 42260032);
        int int24 = calculator0.divide((-172530899), (-59));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1010) + "'", int15 == (-1010));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-42145093) + "'", int21 == (-42145093));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2924252 + "'", int24 == 2924252);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
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
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-152) + "'", int24 == (-152));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1441521995) + "'", int27 == (-1441521995));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.divide((int) ' ', (-101));
        int int15 = calculator0.subtract((-1448314236), (-105841579));
        int int18 = calculator0.subtract((-402505884), (-49164372));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1342472657) + "'", int15 == (-1342472657));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-353341512) + "'", int18 == (-353341512));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply((-76), (int) (short) -1);
        int int18 = calculator0.add((-10), (-68));
        int int21 = calculator0.add((-346346486), (-96348159));
        int int24 = calculator0.divide((-290), (-647254446));
        int int27 = calculator0.multiply((-867133666), (-1708752832));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 76 + "'", int15 == 76);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-78) + "'", int18 == (-78));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-442694645) + "'", int21 == (-442694645));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-634861696) + "'", int27 == (-634861696));
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide((-867133439), 9);
        int int12 = calculator0.subtract(0, 867154019);
        int int15 = calculator0.divide((-30722500), (-2243610));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-867154019) + "'", int12 == (-867154019));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 13 + "'", int15 == 13);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.divide(51, 109);
        int int18 = calculator0.add(0, (-1919));
        int int21 = calculator0.divide(867133511, 1497046722);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1919) + "'", int18 == (-1919));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
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
        int int30 = calculator0.divide((-19), (-563930142));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49164339 + "'", int18 == 49164339);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 867133667 + "'", int21 == 867133667);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
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
        int int36 = calculator0.divide(1510267836, 867150782);
        int int39 = calculator0.subtract((-212504416), 1087077395);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1299581811) + "'", int39 == (-1299581811));
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((-178319437), (-11095));
        int int15 = calculator0.subtract((-1740666144), (-1556003565));
        int int18 = calculator0.subtract(124627968, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-178330532) + "'", int12 == (-178330532));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-184662579) + "'", int15 == (-184662579));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 124627963 + "'", int18 == 124627963);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide(67686400, (-111));
        int int21 = calculator0.multiply(2110251662, 153);
        int int24 = calculator0.multiply(870696823, 1497046722);
        int int27 = calculator0.subtract((-220794010), (-1688606465));
        int int30 = calculator0.multiply(757717820, 1090656050);
        int int33 = calculator0.add(1884872288, 2015073664);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-609787) + "'", int18 == (-609787));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 745957086 + "'", int21 == 745957086);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1729226194) + "'", int24 == (-1729226194));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1467812455 + "'", int27 == 1467812455);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2024327752) + "'", int30 == (-2024327752));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-395021344) + "'", int33 == (-395021344));
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        int int21 = calculator0.add((int) (byte) 100, 20);
        int int24 = calculator0.add(921638928, 1288062895);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 120 + "'", int21 == 120);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2085265473) + "'", int24 == (-2085265473));
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
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
        int int30 = calculator0.subtract(287137963, (-867133611));
        int int33 = calculator0.add(47859271, (-7567));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 37489359 + "'", int27 == 37489359);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1154271574 + "'", int30 == 1154271574);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 47851704 + "'", int33 == 47851704);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
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
        int int33 = calculator0.multiply(76, 823407538);
        int int36 = calculator0.multiply((-702203532), (-2027159188));
        int int39 = calculator0.subtract(86713457, (-1322291616));
        int int42 = calculator0.multiply(1754600977, 260555708);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1845536552) + "'", int33 == (-1845536552));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1998737168) + "'", int36 == (-1998737168));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1409005073 + "'", int39 == 1409005073);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-12441732) + "'", int42 == (-12441732));
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.add((-867133515), 1154271478);
        int int18 = calculator0.divide(452435152, 867148791);
        int int21 = calculator0.multiply((-2045750321), 1271869877);
        int int24 = calculator0.add((-1364149248), 1134921440);
        int int27 = calculator0.divide((-1919), (-72012));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 287137963 + "'", int15 == 287137963);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1391911003 + "'", int21 == 1391911003);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-229227808) + "'", int24 == (-229227808));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.divide((-100), 32);
        int int21 = calculator0.subtract(520297, 51);
        int int24 = calculator0.multiply(757944224, 568590);
        int int27 = calculator0.subtract(0, 910738184);
        int int30 = calculator0.multiply(1520179488, (-12792939));
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 520246 + "'", int21 == 520246);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1807123776) + "'", int24 == (-1807123776));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-910738184) + "'", int27 == (-910738184));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1212612512 + "'", int30 == 1212612512);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.subtract(109, (int) (short) 100);
        int int15 = calculator0.subtract((-36), (-31));
        int int18 = calculator0.divide((-1807123776), 110);
        int int21 = calculator0.divide((-111), (-49164339));
        int int24 = calculator0.subtract((-848730488), 1954118219);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-16428397) + "'", int18 == (-16428397));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1492118589 + "'", int24 == 1492118589);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide(867133546, (-442694645));
        int int21 = calculator0.add((-1925982026), (-867125924));
        int int24 = calculator0.multiply((-2066733827), (-134281536));
        int int27 = calculator0.add((-726422531), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1501859346 + "'", int21 == 1501859346);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1878830016 + "'", int24 == 1878830016);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-726422531) + "'", int27 == (-726422531));
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
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
        int int33 = calculator0.multiply((-2020), (-2040839151));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-673519140) + "'", int33 == (-673519140));
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (byte) 100, (-1));
        int int12 = calculator0.subtract(1152037484, 153);
        int int15 = calculator0.multiply(95, 35);
        int int18 = calculator0.divide((-867133329), (-97));
        int int21 = calculator0.divide((-866523730), (-1439965725));
        int int24 = calculator0.subtract((-7325507), 1066934297);
        int int27 = calculator0.add((-37489334), 265563723);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1152037331 + "'", int12 == 1152037331);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3325 + "'", int15 == 3325);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8939518 + "'", int18 == 8939518);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1074259804) + "'", int24 == (-1074259804));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 228074389 + "'", int27 == 228074389);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.add((-867133515), 1154271478);
        int int18 = calculator0.divide(452435152, 867148791);
        int int21 = calculator0.multiply((-382875265), (-9433));
        int int24 = calculator0.subtract(44849745, (-929987309));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 287137963 + "'", int15 == 287137963);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-405121191) + "'", int21 == (-405121191));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 974837054 + "'", int24 == 974837054);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.add(51, (-97));
        int int15 = calculator0.divide(9, 867133591);
        int int18 = calculator0.subtract(9, (-109415563));
        int int21 = calculator0.subtract((-917629359), 206361130);
        int int24 = calculator0.divide(2016961242, (-2201));
        int int27 = calculator0.subtract((-574946669), 920356679);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-46) + "'", int12 == (-46));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 109415572 + "'", int18 == 109415572);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1123990489) + "'", int21 == (-1123990489));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-916384) + "'", int24 == (-916384));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1495303348) + "'", int27 == (-1495303348));
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.subtract(96, 97);
        int int15 = calculator0.multiply((-45), (-23318356));
        int int18 = calculator0.subtract(232346588, (-844637556));
        int int21 = calculator0.multiply((-2027159188), (-88947591));
        int int24 = calculator0.multiply(452435152, (-1638373376));
        int int27 = calculator0.add(1189271234, (-127900911));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1049326020 + "'", int15 == 1049326020);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1076984144 + "'", int18 == 1076984144);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 167468044 + "'", int21 == 167468044);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-550207488) + "'", int24 == (-550207488));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1061370323 + "'", int27 == 1061370323);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
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
        int int30 = calculator0.divide((-11), 625897475);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 733153631 + "'", int21 == 733153631);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-164656960) + "'", int24 == (-164656960));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1411353752) + "'", int27 == (-1411353752));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
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
        int int33 = calculator0.multiply(100205648, 0);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.multiply(1474273060, (-867133566));
        int int15 = calculator0.divide(0, 178159040);
        int int18 = calculator0.subtract((-214452976), (-1951884651));
        int int21 = calculator0.add((-1160010088), 815031976);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-240317368) + "'", int12 == (-240317368));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1737431675 + "'", int18 == 1737431675);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-344978112) + "'", int21 == (-344978112));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) '#', (-9312));
        int int18 = calculator0.subtract(1908264058, (-94668773));
        int int21 = calculator0.multiply(259575656, (-1617314357));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9347 + "'", int15 == 9347);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2002932831 + "'", int18 == 2002932831);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 51658616 + "'", int21 == 51658616);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.multiply(37489359, 0);
        int int12 = calculator0.subtract(0, (-2033296844));
        int int15 = calculator0.add(109415572, (-956095305));
        int int18 = calculator0.add((-1475697516), (-1269671715));
        int int21 = calculator0.add((-211766202), 1520179488);
        int int24 = calculator0.subtract((-675399327), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2033296844 + "'", int12 == 2033296844);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-846679733) + "'", int15 == (-846679733));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1549598065 + "'", int18 == 1549598065);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1308413286 + "'", int21 == 1308413286);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-675399327) + "'", int24 == (-675399327));
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide(76, 692692992);
        int int21 = calculator0.subtract(51, (-665254));
        int int24 = calculator0.add(520201, 0);
        int int27 = calculator0.divide((-774138863), (int) '4');
        int int30 = calculator0.multiply(0, (-596419254));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 665305 + "'", int21 == 665305);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 520201 + "'", int24 == 520201);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-14887285) + "'", int27 == (-14887285));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.subtract((int) (byte) -1, (int) (short) -1);
        int int15 = calculator0.add((-6858340), (-9280));
        int int18 = calculator0.multiply((-1359151923), (-557732664));
        int int21 = calculator0.divide(37489359, 6596677);
        int int24 = calculator0.subtract((-162488033), 353856081);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6867620) + "'", int15 == (-6867620));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 202128424 + "'", int18 == 202128424);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-516344114) + "'", int24 == (-516344114));
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.subtract(96, 97);
        int int15 = calculator0.multiply((-45), (-23318356));
        int int18 = calculator0.multiply(19670, 0);
        int int21 = calculator0.divide(11, 284903989);
        int int24 = calculator0.divide((-522816736), 47859271);
        int int27 = calculator0.add(1887669524, 100205648);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1049326020 + "'", int15 == 1049326020);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10) + "'", int24 == (-10));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1987875172 + "'", int27 == 1987875172);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
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
        int int30 = calculator0.multiply((-1694277209), (-858032));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-52) + "'", int21 == (-52));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-213935670) + "'", int24 == (-213935670));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 711711792 + "'", int30 == 711711792);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
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
        int int33 = calculator0.subtract((-1771315913), (-1777146311));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5830398 + "'", int33 == 5830398);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((-97), 96);
        int int15 = calculator0.multiply(1486954504, 911011581);
        int int18 = calculator0.multiply(2003425405, 867133381);
        int int21 = calculator0.multiply(949005184, 1532796050);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9312) + "'", int12 == (-9312));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1788602392) + "'", int15 == (-1788602392));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1593893681 + "'", int18 == 1593893681);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1929130240) + "'", int21 == (-1929130240));
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
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
        int int30 = calculator0.add((-511224896), 1954118219);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-173426797) + "'", int18 == (-173426797));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1013244259 + "'", int21 == 1013244259);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1145169847 + "'", int27 == 1145169847);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1442893323 + "'", int30 == 1442893323);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
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
        int int36 = calculator0.subtract((-787654861), 929193984);
        int int39 = calculator0.add((-10909665), 2014577638);
        int int42 = calculator0.subtract((-1199269321), (-1888931218));
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1716848845) + "'", int36 == (-1716848845));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2003667973 + "'", int39 == 2003667973);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 689661897 + "'", int42 == 689661897);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
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
        int int36 = calculator0.subtract(1870667305, 974837054);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 895830251 + "'", int36 == 895830251);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.divide(4213, (-7567));
        int int21 = calculator0.subtract((-1643366519), (-2125062739));
        int int24 = calculator0.subtract(1219996744, (-121));
        int int27 = calculator0.multiply(1245243118, 2075617088);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 481696220 + "'", int21 == 481696220);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1219996865 + "'", int24 == 1219996865);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-515539584) + "'", int27 == (-515539584));
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
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
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9347 + "'", int15 == 9347);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2002932831 + "'", int18 == 2002932831);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-412970881) + "'", int21 == (-412970881));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 98911539 + "'", int24 == 98911539);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-253795351) + "'", int27 == (-253795351));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((-1459544222), (-867133611));
        int int15 = calculator0.add((-1494342816), (-49164380));
        int int18 = calculator0.divide((-178330532), 1726946994);
        int int21 = calculator0.subtract((-15328878), 1924910159);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1968289463 + "'", int12 == 1968289463);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1543507196) + "'", int15 == (-1543507196));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1940239037) + "'", int21 == (-1940239037));
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide(2243220, (int) '4');
        int int21 = calculator0.subtract(0, 867154019);
        int int24 = calculator0.divide((-1769916127), 665);
        int int27 = calculator0.add((-1940239037), 206361130);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 43138 + "'", int18 == 43138);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-867154019) + "'", int21 == (-867154019));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2661528) + "'", int24 == (-2661528));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1733877907) + "'", int27 == (-1733877907));
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide(100, 98);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.add(51, (-97));
        int int15 = calculator0.divide(9, 867133591);
        int int18 = calculator0.add(1357146709, 1271879224);
        int int21 = calculator0.divide((-755028714), (-917640454));
        int int24 = calculator0.multiply(1451887434, 1084030616);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-46) + "'", int12 == (-46));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1665941363) + "'", int18 == (-1665941363));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1170071568) + "'", int24 == (-1170071568));
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add(101, (-2020));
        int int12 = calculator0.add(0, 1693566793);
        int int15 = calculator0.divide(86713344, (-1336575495));
        int int18 = calculator0.subtract(253259185, 954669693);
        int int21 = calculator0.divide(0, 952541812);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1919) + "'", int9 == (-1919));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1693566793 + "'", int12 == 1693566793);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-701410508) + "'", int18 == (-701410508));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.divide(1771863899, 827072948);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = calculator0.divide((-1951884651), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
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
        int int33 = calculator0.divide(391608, (-609789));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
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
        int int30 = calculator0.subtract((-104699111), (-1316560760));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11095) + "'", int21 == (-11095));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3463464) + "'", int24 == (-3463464));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 815031976 + "'", int27 == 815031976);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1211861649 + "'", int30 == 1211861649);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
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
        int int33 = calculator0.subtract(1145179144, (-341775360));
        int int36 = calculator0.subtract((-1424737661), 3563280);
        int int39 = calculator0.subtract((-353341512), (-1410665216));
        java.lang.Class<?> wildcardClass40 = calculator0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1486954504 + "'", int33 == 1486954504);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1428300941) + "'", int36 == (-1428300941));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1057323704 + "'", int39 == 1057323704);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.add(98, (int) (byte) 0);
        int int21 = calculator0.subtract((int) (short) 100, 98);
        int int24 = calculator0.multiply(10, 0);
        int int27 = calculator0.divide(74106190, (-46566313));
        int int30 = calculator0.multiply(0, (-1214133888));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
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
        int int30 = calculator0.add((-1864654464), (-1224898));
        int int33 = calculator0.divide(1984857408, 1322286187);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1700666764 + "'", int15 == 1700666764);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-161052992) + "'", int18 == (-161052992));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-8) + "'", int24 == (-8));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9347 + "'", int27 == 9347);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1865879362) + "'", int30 == (-1865879362));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide(2243220, (int) '4');
        int int21 = calculator0.subtract((-902782633), 1678282987);
        int int24 = calculator0.multiply(867133501, (-3528));
        int int27 = calculator0.multiply((-1300680656), 49164297);
        int int30 = calculator0.multiply(1968289463, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 43138 + "'", int18 == 43138);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1713901676 + "'", int21 == 1713901676);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1230276776) + "'", int24 == (-1230276776));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 736866736 + "'", int27 == 736866736);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.subtract((int) (short) 0, 110);
        int int21 = calculator0.multiply((-867133491), (-9280));
        int int24 = calculator0.multiply((-1769916224), (-173426797));
        int int27 = calculator0.add(568590, 1165653964);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-110) + "'", int18 == (-110));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1769916224) + "'", int21 == (-1769916224));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 42260032 + "'", int24 == 42260032);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1166222554 + "'", int27 == 1166222554);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(757717952, 867133515);
        int int15 = calculator0.divide(10, 6153309);
        int int18 = calculator0.subtract(1671243464, (-858032));
        int int21 = calculator0.subtract(21975628, (-869367269));
        int int24 = calculator0.multiply(1700666860, (-596556766));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-109415563) + "'", int12 == (-109415563));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1672101496 + "'", int18 == 1672101496);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 891342897 + "'", int21 == 891342897);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2073995608 + "'", int24 == 2073995608);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.multiply((-1025747029), (-865230554));
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 396791394 + "'", int15 == 396791394);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.subtract(0, 1322291616);
        int int18 = calculator0.add((-665227), 2085965638);
        int int21 = calculator0.divide((-1730079900), (-3459));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1322291616) + "'", int15 == (-1322291616));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2085300411 + "'", int18 == 2085300411);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 500167 + "'", int21 == 500167);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
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
        int int30 = calculator0.multiply((-1063129674), (-1106529147));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 67857578 + "'", int21 == 67857578);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-659322) + "'", int27 == (-659322));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 974550926 + "'", int30 == 974550926);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
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
        int int33 = calculator0.subtract(17, 532588224);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-532588207) + "'", int33 == (-532588207));
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
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
        int int30 = calculator0.add((-867133342), (-2060147631));
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1271879224 + "'", int21 == 1271879224);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 287137964 + "'", int24 == 287137964);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1145651032) + "'", int27 == (-1145651032));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1367686323 + "'", int30 == 1367686323);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.divide((int) ' ', (-101));
        int int15 = calculator0.add(1152037484, (-6858340));
        int int18 = calculator0.divide(4213, 867133667);
        int int21 = calculator0.divide((-1123990489), 29811430);
        int int24 = calculator0.subtract(1202216254, 458092924);
        int int27 = calculator0.divide((-389311220), (-1556003565));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1145179144 + "'", int15 == 1145179144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-37) + "'", int21 == (-37));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 744123330 + "'", int24 == 744123330);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        int int21 = calculator0.add((int) (short) 100, 1754528448);
        int int24 = calculator0.subtract(975945154, 1524237619);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1754528548 + "'", int21 == 1754528548);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-548292465) + "'", int24 == (-548292465));
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
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
        int int33 = calculator0.add(943052700, (-13312));
        int int36 = calculator0.add(481700800, (-27649121));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 943039388 + "'", int33 == 943039388);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 454051679 + "'", int36 == 454051679);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
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
        int int30 = calculator0.subtract((int) 'a', (-520200));
        int int33 = calculator0.subtract((-1984132426), (-1495828293));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 867133591 + "'", int24 == 867133591);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9277 + "'", int27 == 9277);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 520297 + "'", int30 == 520297);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-488304133) + "'", int33 == (-488304133));
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
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
        int int30 = calculator0.multiply((-1497046780), 1717522949);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1494342816 + "'", int21 == 1494342816);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1643366519) + "'", int24 == (-1643366519));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 86144901 + "'", int27 == 86144901);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1785179412 + "'", int30 == 1785179412);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) ' ', (int) (byte) 100);
        int int15 = calculator0.subtract((-207), 86713344);
        int int18 = calculator0.divide((-96348159), 1013244259);
        int int21 = calculator0.add(2227920, 428644672);
        int int24 = calculator0.multiply(0, (-1821035562));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-68) + "'", int12 == (-68));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713551) + "'", int15 == (-86713551));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 430872592 + "'", int21 == 430872592);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.add(1503914342, (-8085940));
        int int21 = calculator0.multiply(870716441, (-1300680656));
        int int24 = calculator0.divide(1978473568, 120216076);
        int int27 = calculator0.multiply(42260132, 770079900);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1495828402 + "'", int18 == 1495828402);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1061587792) + "'", int21 == (-1061587792));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16 + "'", int24 == 16);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1941816336) + "'", int27 == (-1941816336));
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.add(33, (-7600));
        int int21 = calculator0.add(4864, 867133420);
        int int24 = calculator0.add((-1429), (-362955086));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 867138284 + "'", int21 == 867138284);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-362956515) + "'", int24 == (-362956515));
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.multiply((-1923), 2115365205);
        int int12 = calculator0.divide((-2453011), (-822768));
        int int15 = calculator0.subtract((-7), 1001242336);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-513259903) + "'", int9 == (-513259903));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1001242343) + "'", int15 == (-1001242343));
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.multiply(37489359, 0);
        int int12 = calculator0.subtract(0, (-2033296844));
        int int15 = calculator0.subtract(1249740532, 11868326);
        int int18 = calculator0.divide(1494342816, 25529447);
        int int21 = calculator0.add((-180712367), (-190));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2033296844 + "'", int12 == 2033296844);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1237872206 + "'", int15 == 1237872206);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 58 + "'", int18 == 58);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-180712557) + "'", int21 == (-180712557));
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply((-7567), (int) 'a');
        int int9 = calculator0.divide(49164339, (-1183140366));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-733999) + "'", int6 == (-733999));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.subtract((int) (byte) -1, 100);
        int int12 = calculator0.add((-9433), (-341775360));
        int int15 = calculator0.add(1493382152, (-417546408));
        int int18 = calculator0.subtract(97, (-346346486));
        int int21 = calculator0.divide(1356945246, (-8848318));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-101) + "'", int9 == (-101));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-341784793) + "'", int12 == (-341784793));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1075835744 + "'", int15 == 1075835744);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 346346583 + "'", int18 == 346346583);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-153) + "'", int21 == (-153));
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.subtract((int) (byte) -1, 100);
        int int12 = calculator0.divide(153, 21975629);
        int int15 = calculator0.add(815415403, 236472665);
        int int18 = calculator0.divide(0, 1512046592);
        int int21 = calculator0.multiply(1532796050, 1076983947);
        int int24 = calculator0.divide((-1495629227), (-491301529));
        int int27 = calculator0.multiply((-6832992), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-101) + "'", int9 == (-101));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1051888068 + "'", int15 == 1051888068);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2090824518 + "'", int21 == 2090824518);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
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
        int int36 = calculator0.add(0, 1202467929);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1202467929 + "'", int36 == 1202467929);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide((-867133439), 9);
        int int12 = calculator0.subtract(0, 867154019);
        int int15 = calculator0.subtract(210, (-241122442));
        int int18 = calculator0.divide((-65), 109410199);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-867154019) + "'", int12 == (-867154019));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 241122652 + "'", int15 == 241122652);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.divide(0, 108673896);
        int int21 = calculator0.add(86713455, (-1582342682));
        int int24 = calculator0.add((-1879178559), 537567364);
        int int27 = calculator0.add((-9433), (int) (byte) 1);
        int int30 = calculator0.divide(27, 120);
        int int33 = calculator0.add(2045209946, 391608);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1495629227) + "'", int21 == (-1495629227));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1341611195) + "'", int24 == (-1341611195));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-9432) + "'", int27 == (-9432));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2045601554 + "'", int33 == 2045601554);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (short) -1, 867133491);
        int int12 = calculator0.subtract((-86), (-109415563));
        int int15 = calculator0.add(0, 757944224);
        int int18 = calculator0.add(2, 1152037536);
        int int21 = calculator0.add(548010, (-1985610752));
        int int24 = calculator0.subtract(37500454, 1477466179);
        int int27 = calculator0.add(624046464, (-117501512));
        int int30 = calculator0.multiply(594233224, (-701410508));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133491) + "'", int9 == (-867133491));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109415477 + "'", int12 == 109415477);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 757944224 + "'", int15 == 757944224);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1152037538 + "'", int18 == 1152037538);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1985062742) + "'", int21 == (-1985062742));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1439965725) + "'", int24 == (-1439965725));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 506544952 + "'", int27 == 506544952);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1526964128 + "'", int30 == 1526964128);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide((-867133571), (-7600));
        int int21 = calculator0.add(9552800, (-701410508));
        int int24 = calculator0.multiply(461024588, 1075835537);
        int int27 = calculator0.multiply((-1281026853), (-1998750842));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 114096 + "'", int18 == 114096);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-691857708) + "'", int21 == (-691857708));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2071855092) + "'", int24 == (-2071855092));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1300421726) + "'", int27 == (-1300421726));
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.divide(25, (-1923));
        int int12 = calculator0.multiply((-15300), 34);
        int int15 = calculator0.subtract(1152037484, (-109415563));
        int int18 = calculator0.divide(1810186246, (-78));
        int int21 = calculator0.subtract(1076984144, 197);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-520200) + "'", int12 == (-520200));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1261453047 + "'", int15 == 1261453047);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-23207515) + "'", int18 == (-23207515));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1076983947 + "'", int21 == 1076983947);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.add(98, (int) (byte) 0);
        int int21 = calculator0.divide((-1140394960), (-8848318));
        int int24 = calculator0.add((-879833140), (-1761452469));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 128 + "'", int21 == 128);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1653681687 + "'", int24 == 1653681687);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
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
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1049326020 + "'", int15 == 1049326020);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-52891664) + "'", int18 == (-52891664));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1822007072) + "'", int24 == (-1822007072));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
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
        int int30 = calculator0.subtract(1581845917, 0);
        int int33 = calculator0.subtract(0, (-314830347));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-102) + "'", int24 == (-102));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-26411181) + "'", int27 == (-26411181));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1581845917 + "'", int30 == 1581845917);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 314830347 + "'", int33 == 314830347);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
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
        int int30 = calculator0.multiply(4864, (-23207515));
        int int33 = calculator0.add(1189271234, 1058206889);
        int int36 = calculator0.add(1693589828, 824566);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-173426797) + "'", int18 == (-173426797));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1013244259 + "'", int21 == 1013244259);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-175453037) + "'", int24 == (-175453037));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1212203264) + "'", int30 == (-1212203264));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-2047489173) + "'", int33 == (-2047489173));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1694414394 + "'", int36 == 1694414394);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply((-1733877907), (-8085940));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1043765852 + "'", int15 == 1043765852);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply((-76), (-7480));
        int int9 = calculator0.add((-1951649816), 1754528448);
        int int12 = calculator0.divide(109415477, (-97));
        int int15 = calculator0.add((-1776380879), (-476610528));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 568480 + "'", int6 == 568480);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-197121368) + "'", int9 == (-197121368));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1127994) + "'", int12 == (-1127994));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2041975889 + "'", int15 == 2041975889);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.divide((-36), 33);
        int int18 = calculator0.divide((-207), 33);
        int int21 = calculator0.add((-867133440), 9);
        int int24 = calculator0.divide(650962504, 1544275949);
        int int27 = calculator0.subtract(2126380082, 859177974);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-867133431) + "'", int21 == (-867133431));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1267202108 + "'", int27 == 1267202108);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.multiply((int) (short) 10, (-685834));
        int int21 = calculator0.subtract(867154019, 1925360681);
        int int24 = calculator0.multiply(1730079900, 2227920);
        int int27 = calculator0.add((-206361128), (-4967));
        int int30 = calculator0.add(1237148765, (-1358364837));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6858340) + "'", int18 == (-6858340));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1058206662) + "'", int21 == (-1058206662));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-134281536) + "'", int24 == (-134281536));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-206366095) + "'", int27 == (-206366095));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-121216072) + "'", int30 == (-121216072));
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.multiply((-68), (int) (short) 1);
        int int18 = calculator0.divide(20, (-109415445));
        int int21 = calculator0.subtract((-3410880), 757944224);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-68) + "'", int15 == (-68));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-761355104) + "'", int21 == (-761355104));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
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
        int int30 = calculator0.multiply(952045526, 1810410710);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49164339 + "'", int18 == 49164339);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9433) + "'", int21 == (-9433));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 867133581 + "'", int27 == 867133581);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1706359580) + "'", int30 == (-1706359580));
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
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
        int int33 = calculator0.divide(1486954504, (-2047489173));
        int int36 = calculator0.divide((-1011901335), 284903972);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-3) + "'", int36 == (-3));
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.add(568480, 110);
        int int15 = calculator0.subtract(1787380221, 86713457);
        int int18 = calculator0.multiply(9347, 815415403);
        int int21 = calculator0.multiply((-411561728), (-8848353));
        int int24 = calculator0.divide((-417546408), 1955142987);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1700666764 + "'", int15 == 1700666764);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1879178559) + "'", int18 == (-1879178559));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 809897728 + "'", int21 == 809897728);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.divide((int) 'a', (-207));
        int int21 = calculator0.multiply((-2243610), (int) '#');
        int int24 = calculator0.add(243351333, 1260801552);
        int int27 = calculator0.add(11309050, 1446103386);
        int int30 = calculator0.divide((-173), (-1058206662));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-78526350) + "'", int21 == (-78526350));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1504152885 + "'", int24 == 1504152885);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1457412436 + "'", int27 == 1457412436);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide(100, (-867133440));
        int int21 = calculator0.subtract(1154271478, 349159852);
        int int24 = calculator0.add((-1815930810), 0);
        int int27 = calculator0.subtract((-1263873927), 1503190044);
        int int30 = calculator0.multiply(0, 347305668);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 805111626 + "'", int21 == 805111626);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1815930810) + "'", int24 == (-1815930810));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1527903325 + "'", int27 == 1527903325);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
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
        int int33 = calculator0.add((-568590), (-306368450));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-306937040) + "'", int33 == (-306937040));
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide(692692992, 2);
        int int21 = calculator0.subtract((-1448314236), 29811430);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 346346496 + "'", int18 == 346346496);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1478125666) + "'", int21 == (-1478125666));
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        int int21 = calculator0.divide((-1010), 86713455);
        int int24 = calculator0.multiply(1779063741, 1671243464);
        int int27 = calculator0.subtract(1357146709, (-88956677));
        int int30 = calculator0.subtract(381800633, 5983);
        int int33 = calculator0.divide(1660288029, 164584658);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1147225688) + "'", int24 == (-1147225688));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1446103386 + "'", int27 == 1446103386);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 381794650 + "'", int30 == 381794650);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-110), (-867133491));
        int int12 = calculator0.multiply(1805776112, 78);
        int int15 = calculator0.add((-596556766), 0);
        int int18 = calculator0.subtract((-1726989283), 1328074676);
        int int21 = calculator0.add(1469483703, 1467812455);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 867133381 + "'", int9 == 867133381);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-883384032) + "'", int12 == (-883384032));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-596556766) + "'", int15 == (-596556766));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1239903337 + "'", int18 == 1239903337);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1357671138) + "'", int21 == (-1357671138));
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
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
        int int33 = calculator0.divide(506959828, 1925360681);
        int int36 = calculator0.divide((-111), 426708041);
        int int39 = calculator0.subtract(1711686956, 202);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1711686754 + "'", int39 == 1711686754);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.subtract(867133420, 1269639304);
        int int21 = calculator0.subtract((-2146806784), (-1359151923));
        int int24 = calculator0.add(17, (-34682070));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-402505884) + "'", int18 == (-402505884));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-787654861) + "'", int21 == (-787654861));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-34682053) + "'", int24 == (-34682053));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.subtract((int) (byte) -1, 100);
        int int12 = calculator0.add((-9433), (-341775360));
        int int15 = calculator0.multiply(131, (-609789));
        int int18 = calculator0.subtract(1154271574, 35);
        int int21 = calculator0.multiply((-207), 1367258876);
        int int24 = calculator0.subtract(86605184, (-50514530));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-101) + "'", int9 == (-101));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-341784793) + "'", int12 == (-341784793));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-79882359) + "'", int15 == (-79882359));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1154271539 + "'", int18 == 1154271539);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 445254204 + "'", int21 == 445254204);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 137119714 + "'", int24 == 137119714);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.subtract((int) (byte) -1, (int) (short) -1);
        int int15 = calculator0.add((-6858340), (-9280));
        int int18 = calculator0.divide(897963264, 94);
        int int21 = calculator0.divide((-1700666664), (int) (byte) 10);
        int int24 = calculator0.multiply((-1076453360), 0);
        int int27 = calculator0.multiply((-608879972), (-49164380));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6867620) + "'", int15 == (-6867620));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9552800 + "'", int18 == 9552800);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-170066666) + "'", int21 == (-170066666));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1524215792 + "'", int27 == 1524215792);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
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
        int int36 = calculator0.add((-1494342816), (-1262618369));
        int int39 = calculator0.multiply((-597524597), (-164656960));
        int int42 = calculator0.subtract(114939, (-355648812));
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1538006111 + "'", int36 == 1538006111);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1708752832) + "'", int39 == (-1708752832));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 355763751 + "'", int42 == 355763751);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
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
        int int33 = calculator0.add((-351564), 1600482450);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1600130886 + "'", int33 == 1600130886);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
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
        int int36 = calculator0.divide(129903974, 943039388);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
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
        int int33 = calculator0.subtract((-1077925731), (-780440677));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-297485054) + "'", int33 == (-297485054));
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((-7466), 67686400);
        int int18 = calculator0.divide(0, 6992);
        int int21 = calculator0.multiply((-31), (-346346486));
        int int24 = calculator0.divide(236316608, (-8085940));
        int int27 = calculator0.divide(109413727, 867154036);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2146806474 + "'", int21 == 2146806474);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-29) + "'", int24 == (-29));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.multiply((int) (short) 100, (-152));
        int int18 = calculator0.divide((-1248231612), 1754528548);
        int int21 = calculator0.subtract(1020465408, 0);
        int int24 = calculator0.multiply(21, (-520185));
        int int27 = calculator0.divide(921638928, 1973637953);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15200) + "'", int15 == (-15200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1020465408 + "'", int21 == 1020465408);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10923885) + "'", int24 == (-10923885));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide(134475348, (-389311220));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
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
        int int36 = calculator0.add((-1687920631), (-15316272));
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1703236903) + "'", int36 == (-1703236903));
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.multiply((int) (short) 100, (-152));
        int int18 = calculator0.add(20580, (-241122442));
        int int21 = calculator0.add(846070065, (-1925360682));
        int int24 = calculator0.subtract((-1015476224), 0);
        int int27 = calculator0.subtract((-1462967), 582296876);
        int int30 = calculator0.add(36927547, 1497091025);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15200) + "'", int15 == (-15200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-241101862) + "'", int18 == (-241101862));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1079290617) + "'", int21 == (-1079290617));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1015476224) + "'", int24 == (-1015476224));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-583759843) + "'", int27 == (-583759843));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1534018572 + "'", int30 == 1534018572);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.subtract((-1700666664), (-241122442));
        int int18 = calculator0.divide((-105841579), 1454119969);
        int int21 = calculator0.divide(853349558, (-520489967));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1459544222) + "'", int15 == (-1459544222));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.add(51, (int) (short) 1);
        int int15 = calculator0.add(1700666764, 96);
        int int18 = calculator0.add(96, 67686400);
        int int21 = calculator0.add(65689586, 757717952);
        int int24 = calculator0.divide((-325549817), 9347);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1700666860 + "'", int15 == 1700666860);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 67686496 + "'", int18 == 67686496);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 823407538 + "'", int21 == 823407538);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-34829) + "'", int24 == (-34829));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide(100, 98);
        int int21 = calculator0.multiply(897963264, 109415477);
        int int24 = calculator0.add(20636113, (-867133491));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-298772224) + "'", int21 == (-298772224));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-846497378) + "'", int24 == (-846497378));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
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
        int int30 = calculator0.multiply(0, 1235754784);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6858340) + "'", int18 == (-6858340));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-402023608) + "'", int24 == (-402023608));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-67513152) + "'", int27 == (-67513152));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.add(9552800, (-298751412));
        int int21 = calculator0.multiply((-1587684178), 66);
        int int24 = calculator0.subtract((-85363797), (-1217368163));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-289198612) + "'", int18 == (-289198612));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1707940644) + "'", int21 == (-1707940644));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1132004366 + "'", int24 == 1132004366);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) '#', (-9312));
        int int18 = calculator0.subtract(1908264058, (-94668773));
        int int21 = calculator0.multiply((-1813700023), (-8639589));
        int int24 = calculator0.multiply(2233940, 2016961242);
        int int27 = calculator0.subtract((-207), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9347 + "'", int15 == 9347);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2002932831 + "'", int18 == 2002932831);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1524237619 + "'", int21 == 1524237619);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1811098504 + "'", int24 == 1811098504);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-207) + "'", int27 == (-207));
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.divide(86713381, (-3528));
        int int12 = calculator0.multiply(1923, (-1469333649));
        int int15 = calculator0.add(206361130, (-1403241466));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-24578) + "'", int9 == (-24578));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 559873741 + "'", int12 == 559873741);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1196880336) + "'", int15 == (-1196880336));
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
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
        int int30 = calculator0.add(1269639246, 1878830016);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133515 + "'", int15 == 867133515);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7029297 + "'", int18 == 7029297);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-568590) + "'", int21 == (-568590));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 93889170 + "'", int24 == 93889170);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1410665216) + "'", int27 == (-1410665216));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1146498034) + "'", int30 == (-1146498034));
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
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
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1145179180) + "'", int21 == (-1145179180));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) '#', (-9312));
        int int18 = calculator0.multiply(86713455, 1769916224);
        int int21 = calculator0.subtract((-121), 1503190044);
        int int24 = calculator0.multiply(11, 1687835691);
        int int27 = calculator0.multiply(799164324, 20636113);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9347 + "'", int15 == 9347);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1237148864 + "'", int18 == 1237148864);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1503190165) + "'", int21 == (-1503190165));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1386323417 + "'", int24 == 1386323417);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1671143652 + "'", int27 == 1671143652);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.subtract(109, (int) (short) 100);
        int int15 = calculator0.add(290738210, 1236538979);
        int int18 = calculator0.add(1771178000, (-2115365052));
        int int21 = calculator0.add(1737866316, 580335956);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1527277189 + "'", int15 == 1527277189);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-344187052) + "'", int18 == (-344187052));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1976765024) + "'", int21 == (-1976765024));
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide(100, (-867133440));
        int int21 = calculator0.subtract(1154271478, 349159852);
        int int24 = calculator0.subtract(1732347592, (-11496));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 805111626 + "'", int21 == 805111626);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1732359088 + "'", int24 == 1732359088);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
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
        int int36 = calculator0.divide(1663858818, 1649726146);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide((-867133439), 9);
        int int12 = calculator0.multiply((-96348159), (-9280));
        int int15 = calculator0.divide((-5), 202);
        int int18 = calculator0.divide(110, 853334016);
        int int21 = calculator0.divide(67686496, 867154995);
        int int24 = calculator0.multiply((-2117573600), (-989528052));
        int int27 = calculator0.multiply(867133581, (-1096781710));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 757717952 + "'", int12 == 757717952);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1442532992) + "'", int24 == (-1442532992));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1074118966) + "'", int27 == (-1074118966));
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply((-76), (int) (byte) 100);
        int int18 = calculator0.subtract(100, (-1));
        int int21 = calculator0.divide((-430278180), (-844636552));
        int int24 = calculator0.divide((-1048810252), 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7600) + "'", int15 == (-7600));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-61694720) + "'", int24 == (-61694720));
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((int) '#', (int) (short) -1);
        int int21 = calculator0.subtract((-76), (int) (byte) 10);
        int int24 = calculator0.multiply((-5), 86713457);
        int int27 = calculator0.multiply(867133616, (-415711797));
        int int30 = calculator0.multiply(1769916123, 0);
        int int33 = calculator0.multiply((-173426797), (-211766202));
        int int36 = calculator0.subtract(991518632, 1322291737);
        int int39 = calculator0.subtract((-1364644474), 910389622);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-86) + "'", int21 == (-86));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-433567285) + "'", int24 == (-433567285));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 853668752 + "'", int27 == 853668752);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-509899214) + "'", int33 == (-509899214));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-330773105) + "'", int36 == (-330773105));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2019933200 + "'", int39 == 2019933200);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (byte) 1, 96);
        int int24 = calculator0.add((-1643366519), 1322291616);
        int int27 = calculator0.add((-1063129674), (-14378));
        int int30 = calculator0.add(0, (-1187870128));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 96 + "'", int21 == 96);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-321074903) + "'", int24 == (-321074903));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1063144052) + "'", int27 == (-1063144052));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1187870128) + "'", int30 == (-1187870128));
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.multiply((-36), 98);
        int int21 = calculator0.divide(1571373880, (-520200));
        int int24 = calculator0.add(1503914342, 408021504);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3528) + "'", int18 == (-3528));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3020) + "'", int21 == (-3020));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1911935846 + "'", int24 == 1911935846);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.add(51, (-97));
        int int15 = calculator0.divide(9, 867133591);
        int int18 = calculator0.subtract(9, (-109415563));
        int int21 = calculator0.add((-1769916127), 859177974);
        int int24 = calculator0.multiply(1890678640, (-1385028472));
        int int27 = calculator0.add(1032145005, 173200584);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-46) + "'", int12 == (-46));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 109415572 + "'", int18 == 109415572);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-910738153) + "'", int21 == (-910738153));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1292684416) + "'", int24 == (-1292684416));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1205345589 + "'", int27 == 1205345589);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.divide((-36), 33);
        int int18 = calculator0.divide((-207), 33);
        int int21 = calculator0.divide((-296335505), 1222015232);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.subtract((int) (byte) -1, 100);
        int int12 = calculator0.divide(153, 21975629);
        int int15 = calculator0.add(815415403, 236472665);
        int int18 = calculator0.multiply(1357146709, (-214132468));
        int int21 = calculator0.multiply((-2132911612), (-1380354224));
        int int24 = calculator0.divide((-1834803396), (-117501512));
        int int27 = calculator0.add((-1429824747), 1595702206);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-101) + "'", int9 == (-101));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1051888068 + "'", int15 == 1051888068);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-382875396) + "'", int18 == (-382875396));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1647836480 + "'", int21 == 1647836480);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15 + "'", int24 == 15);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 165877459 + "'", int27 == 165877459);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
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
        int int30 = calculator0.add(417154016, 65689586);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-39007237) + "'", int24 == (-39007237));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1687835691 + "'", int27 == 1687835691);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 482843602 + "'", int30 == 482843602);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
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
        int int33 = calculator0.subtract((int) (short) -1, 1523011314);
        java.lang.Class<?> wildcardClass34 = calculator0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1523011315) + "'", int33 == (-1523011315));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.add((-2146806784), 0);
        int int12 = calculator0.subtract(520297, 96);
        int int15 = calculator0.add((-20), (-68));
        int int18 = calculator0.subtract((-1406600273), (-1827888062));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2146806784) + "'", int9 == (-2146806784));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520201 + "'", int12 == 520201);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-88) + "'", int15 == (-88));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 421287789 + "'", int18 == 421287789);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract(9, (-100));
        int int15 = calculator0.divide(76, 692692992);
        int int18 = calculator0.add((int) 'a', (-867133439));
        int int21 = calculator0.subtract((-1849536748), (-1486954551));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109 + "'", int12 == 109);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-867133342) + "'", int18 == (-867133342));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-362582197) + "'", int21 == (-362582197));
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
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
        int int30 = calculator0.multiply((-1827707776), 1175730682);
        int int33 = calculator0.divide((-293074587), (-306368450));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-462904064) + "'", int30 == (-462904064));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((int) '#', (int) (short) -1);
        int int21 = calculator0.subtract((-76), (int) (byte) 10);
        int int24 = calculator0.multiply((-5), 86713457);
        int int27 = calculator0.add(2014577638, (-6858340));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-86) + "'", int21 == (-86));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-433567285) + "'", int24 == (-433567285));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2007719298 + "'", int27 == 2007719298);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.divide(51, 109);
        int int18 = calculator0.add(0, (-1919));
        int int21 = calculator0.divide(757717952, 9277);
        int int24 = calculator0.subtract(867153933, 59447464);
        int int27 = calculator0.multiply((-371478784), 114006959);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1919) + "'", int18 == (-1919));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 81677 + "'", int21 == 81677);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 807706469 + "'", int24 == 807706469);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1524522752) + "'", int27 == (-1524522752));
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.multiply((-9312), (-9312));
        int int15 = calculator0.divide((-100), 1152037484);
        int int18 = calculator0.multiply(1591253037, (-307225));
        int int21 = calculator0.add((-858032), 273998385);
        int int24 = calculator0.add(426572344, (-702444943));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713344 + "'", int12 == 86713344);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1938174875 + "'", int18 == 1938174875);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 273140353 + "'", int21 == 273140353);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-275872599) + "'", int24 == (-275872599));
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.subtract(109, (int) (short) 100);
        int int15 = calculator0.add(290738210, 1236538979);
        int int18 = calculator0.add((-2201), (-1951882450));
        int int21 = calculator0.add(867133546, 1126964223);
        int int24 = calculator0.add(108673896, 26401901);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1527277189 + "'", int15 == 1527277189);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1951884651) + "'", int18 == (-1951884651));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1994097769 + "'", int21 == 1994097769);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 135075797 + "'", int24 == 135075797);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.subtract((int) (byte) -1, (int) (short) -1);
        int int15 = calculator0.add((-6858340), (-9280));
        int int18 = calculator0.multiply((-1382667017), 0);
        int int21 = calculator0.multiply(1645239338, (-563954720));
        int int24 = calculator0.add((-1270709336), 1058206889);
        int int27 = calculator0.subtract((-2025976245), 1830385152);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6867620) + "'", int15 == (-6867620));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1974948544 + "'", int21 == 1974948544);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-212502447) + "'", int24 == (-212502447));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 438605899 + "'", int27 == 438605899);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.subtract((-555681720), (int) (short) 1);
        int int21 = calculator0.divide(2085965638, 49164439);
        int int24 = calculator0.divide((-286658120), 127295488);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-555681721) + "'", int18 == (-555681721));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 42 + "'", int21 == 42);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.multiply(34, (-685834));
        int int21 = calculator0.subtract((-74870788), 0);
        int int24 = calculator0.subtract(887128884, (-685834));
        int int27 = calculator0.add(0, 65689586);
        int int30 = calculator0.divide(715729368, (-4818454));
        int int33 = calculator0.add((-1670233441), (-555610705));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-23318356) + "'", int18 == (-23318356));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-74870788) + "'", int21 == (-74870788));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 887814718 + "'", int24 == 887814718);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 65689586 + "'", int27 == 65689586);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-148) + "'", int30 == (-148));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2069123150 + "'", int33 == 2069123150);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
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
        int int36 = calculator0.add((-1494342816), (-1262618369));
        int int39 = calculator0.multiply((-597524597), (-164656960));
        int int42 = calculator0.add(1145179144, 50);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1538006111 + "'", int36 == 1538006111);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1708752832) + "'", int39 == (-1708752832));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1145179194 + "'", int42 == 1145179194);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
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
        int int30 = calculator0.add(1678282987, (-397900692));
        int int33 = calculator0.multiply(0, 1288062895);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 929193984 + "'", int21 == 929193984);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1972498146 + "'", int27 == 1972498146);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1280382295 + "'", int30 == 1280382295);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.divide((-3), 86713344);
        int int15 = calculator0.subtract((-520200), (-15));
        int int18 = calculator0.subtract((-2020), 1237148765);
        int int21 = calculator0.multiply(20580, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-520185) + "'", int15 == (-520185));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1237150785) + "'", int18 == (-1237150785));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.subtract((int) (short) 0, 110);
        int int21 = calculator0.multiply((-867133491), (-9280));
        int int24 = calculator0.multiply((-1769916224), (-173426797));
        int int27 = calculator0.subtract((-110), (-49164407));
        int int30 = calculator0.multiply(770064344, (-1166777829));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-110) + "'", int18 == (-110));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1769916224) + "'", int21 == (-1769916224));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 42260032 + "'", int24 == 42260032);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 49164297 + "'", int27 == 49164297);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-644256824) + "'", int30 == (-644256824));
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.subtract(76, (-867133439));
        int int18 = calculator0.divide(1219996744, 1219996744);
        int int21 = calculator0.subtract(213009, (-415711797));
        int int24 = calculator0.multiply((-791619978), 2122411021);
        int int27 = calculator0.divide((int) (byte) 0, 60635266);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133515 + "'", int15 == 867133515);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 415924806 + "'", int21 == 415924806);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-628446210) + "'", int24 == (-628446210));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.multiply((-86713457), 692692992);
        int int21 = calculator0.divide(867133667, (int) (byte) 100);
        int int24 = calculator0.add(960968797, 1688608273);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8671336 + "'", int21 == 8671336);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1645390226) + "'", int24 == (-1645390226));
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply((-76), (int) (byte) 100);
        int int18 = calculator0.divide(86713475, (-1897778925));
        int int21 = calculator0.multiply(324289668, (-1539251552));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7600) + "'", int15 == (-7600));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 707222144 + "'", int21 == 707222144);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.subtract((-757113354), (-2084640));
        int int21 = calculator0.divide(1726946994, (-1145179180));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-755028714) + "'", int18 == (-755028714));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add(1, (-867133440));
        int int18 = calculator0.divide((-101), (-1923));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133439) + "'", int15 == (-867133439));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.divide(4213, (-7567));
        int int21 = calculator0.subtract((-1643366519), (-2125062739));
        int int24 = calculator0.subtract(1219996744, (-121));
        int int27 = calculator0.divide((-1920623863), (-2132911612));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 481696220 + "'", int21 == 481696220);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1219996865 + "'", int24 == 1219996865);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.add(0, (-1010));
        int int21 = calculator0.add((-815203616), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1010) + "'", int18 == (-1010));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-815203617) + "'", int21 == (-815203617));
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.divide((int) ' ', (-101));
        int int15 = calculator0.add(1152037484, (-6858340));
        int int18 = calculator0.multiply((-31), 9277);
        int int21 = calculator0.subtract((-88956701), 273998385);
        int int24 = calculator0.multiply((-1475970418), 1739617460);
        int int27 = calculator0.divide(1769444996, (-272082615));
        int int30 = calculator0.multiply((-1057369120), (-1919));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1145179144 + "'", int15 == 1145179144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-287587) + "'", int18 == (-287587));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-362955086) + "'", int21 == (-362955086));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2008450008 + "'", int24 == 2008450008);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-6) + "'", int27 == (-6));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1866777568 + "'", int30 == 1866777568);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.multiply((-46788126), (-867133342));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1208940412) + "'", int9 == (-1208940412));
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((-1357816827), 1810186246);
        int int21 = calculator0.divide(0, (-1010));
        int int24 = calculator0.add((-1816189210), (-596556766));
        int int27 = calculator0.multiply((-2114022421), 1722032344);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1126964223 + "'", int18 == 1126964223);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1882221320 + "'", int24 == 1882221320);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-438948280) + "'", int27 == (-438948280));
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
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
        int int36 = calculator0.multiply((-934840507), 870696823);
        int int39 = calculator0.multiply((-307225), 15);
        int int42 = calculator0.subtract((-307808122), 1244998712);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 380113939 + "'", int36 == 380113939);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-4608375) + "'", int39 == (-4608375));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1552806834) + "'", int42 == (-1552806834));
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide(2243220, (int) '4');
        int int21 = calculator0.subtract(0, 867154019);
        int int24 = calculator0.divide((-1769916127), 665);
        int int27 = calculator0.subtract(742271934, (-2129939117));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 43138 + "'", int18 == 43138);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-867154019) + "'", int21 == (-867154019));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2661528) + "'", int24 == (-2661528));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1422756245) + "'", int27 == (-1422756245));
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
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
        int int30 = calculator0.divide((-7600), (-867154019));
        int int33 = calculator0.subtract(86713342, (-781049314));
        int int36 = calculator0.multiply(119647596, (-1913872923));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1271879224 + "'", int21 == 1271879224);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 287137964 + "'", int24 == 287137964);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1532796050 + "'", int27 == 1532796050);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 867762656 + "'", int33 == 867762656);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1678466460 + "'", int36 == 1678466460);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.add(1152037484, (int) '4');
        int int15 = calculator0.subtract((-173426914), (-1806625));
        int int18 = calculator0.add((-1810467552), (-1057369120));
        int int21 = calculator0.subtract(0, 2067161028);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1152037536 + "'", int12 == 1152037536);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-171620289) + "'", int15 == (-171620289));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1427130624 + "'", int18 == 1427130624);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2067161028) + "'", int21 == (-2067161028));
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
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
        int int30 = calculator0.divide((-7600), (-867154019));
        int int33 = calculator0.multiply(265563723, (-929987309));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1271879224 + "'", int21 == 1271879224);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 287137964 + "'", int24 == 287137964);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1532796050 + "'", int27 == 1532796050);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 960980625 + "'", int33 == 960980625);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
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
        int int36 = calculator0.add((-1577132927), 173200584);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1403932343) + "'", int36 == (-1403932343));
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.add(98, (int) (byte) 0);
        int int21 = calculator0.multiply((int) (byte) -1, (int) '4');
        int int24 = calculator0.subtract((-935882675), 415924806);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-52) + "'", int21 == (-52));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1351807481) + "'", int24 == (-1351807481));
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.subtract(20580, (-867133439));
        int int21 = calculator0.add((-1769916224), (-2243320));
        int int24 = calculator0.add(767600052, 482843602);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867154019 + "'", int18 == 867154019);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1772159544) + "'", int21 == (-1772159544));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1250443654 + "'", int24 == 1250443654);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.subtract(109, (int) (short) 100);
        int int15 = calculator0.multiply((-101), (int) (short) 10);
        int int18 = calculator0.divide((int) 'a', 196);
        int int21 = calculator0.multiply(91806, 876546024);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1010) + "'", int15 == (-1010));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1677021488 + "'", int21 == 1677021488);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-110), (int) (short) 0);
        int int12 = calculator0.divide(1769916224, (-86713342));
        int int15 = calculator0.multiply(1145179144, (-607867904));
        int int18 = calculator0.add(1272748659, 0);
        int int21 = calculator0.multiply(1457893376, (-17839671));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-110) + "'", int9 == (-110));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-20) + "'", int12 == (-20));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1848991744 + "'", int15 == 1848991744);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1272748659 + "'", int18 == 1272748659);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-511234048) + "'", int21 == (-511234048));
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.subtract(1152037536, (-815312671));
        int int15 = calculator0.add((-736058194), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1967350207 + "'", int12 == 1967350207);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-736058194) + "'", int15 == (-736058194));
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide(67686400, (-111));
        int int21 = calculator0.add((-3528), 109413727);
        int int24 = calculator0.divide(2085202125, (-217396992));
        int int27 = calculator0.divide(2105898810, 2075617182);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-609787) + "'", int18 == (-609787));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 109410199 + "'", int21 == 109410199);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-9) + "'", int24 == (-9));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.multiply(867133511, (-7955431));
        int int15 = calculator0.add((-1248231612), 1700666764);
        int int18 = calculator0.add(272082650, (-1772161564));
        int int21 = calculator0.multiply((-13314), 0);
        int int24 = calculator0.subtract((-97460156), 178159040);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1037464303 + "'", int12 == 1037464303);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 452435152 + "'", int15 == 452435152);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1500078914) + "'", int18 == (-1500078914));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-275619196) + "'", int24 == (-275619196));
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
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
        int int33 = calculator0.add((-415203), (-720040191));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-720455394) + "'", int33 == (-720455394));
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(95, 0);
        int int15 = calculator0.multiply((-867138628), (-15200));
        int int18 = calculator0.multiply(1090625663, 665);
        int int21 = calculator0.add((-6), 21613);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 95 + "'", int12 == 95);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-747485824) + "'", int15 == (-747485824));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-583407129) + "'", int18 == (-583407129));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 21607 + "'", int21 == 21607);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.multiply((int) (short) 10, (-685834));
        int int21 = calculator0.subtract(867154019, 1925360681);
        int int24 = calculator0.subtract(1145179044, (-112879003));
        int int27 = calculator0.divide(1612605679, (-1127994));
        int int30 = calculator0.divide((-173426797), (-1494342816));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6858340) + "'", int18 == (-6858340));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1058206662) + "'", int21 == (-1058206662));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1258058047 + "'", int24 == 1258058047);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1429) + "'", int27 == (-1429));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.multiply((-86713457), 692692992);
        int int21 = calculator0.subtract(1271882624, 3400);
        int int24 = calculator0.divide(780440677, 867133667);
        int int27 = calculator0.subtract((-39007237), (-1494342816));
        int int30 = calculator0.divide((-543411887), (-240317368));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1271879224 + "'", int21 == 1271879224);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1455335579 + "'", int27 == 1455335579);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        int int21 = calculator0.multiply(1269639246, 1037464303);
        int int24 = calculator0.multiply((-867158169), (int) (byte) 100);
        int int27 = calculator0.divide(25, (-290738176));
        int int30 = calculator0.multiply(18002567, (-841742365));
        int int33 = calculator0.add(2877446, (-178330532));
        int int36 = calculator0.subtract(104, (-402023608));
        int int39 = calculator0.add((-1706359580), 1322286187);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 164584658 + "'", int21 == 164584658);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-816470980) + "'", int24 == (-816470980));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1765932725 + "'", int30 == 1765932725);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-175453086) + "'", int33 == (-175453086));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 402023712 + "'", int36 == 402023712);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-384073393) + "'", int39 == (-384073393));
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((-97), 96);
        int int15 = calculator0.multiply(1486954504, 911011581);
        int int18 = calculator0.multiply(228021803, 395484846);
        int int21 = calculator0.add((-1074118966), (-846679733));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9312) + "'", int12 == (-9312));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1788602392) + "'", int15 == (-1788602392));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1517216966) + "'", int18 == (-1517216966));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1920798699) + "'", int21 == (-1920798699));
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
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
        int int30 = calculator0.add(2090824518, 358019360);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9347 + "'", int15 == 9347);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 408021504 + "'", int21 == 408021504);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1133543421 + "'", int24 == 1133543421);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 417847584 + "'", int27 == 417847584);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1846123418) + "'", int30 == (-1846123418));
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.divide(86713381, (-3528));
        int int12 = calculator0.multiply(1923, (-1469333649));
        int int15 = calculator0.multiply((-1636781857), 736984748);
        int int18 = calculator0.divide((-88956701), (-1740666144));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-24578) + "'", int9 == (-24578));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 559873741 + "'", int12 == 559873741);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 506959828 + "'", int15 == 506959828);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.multiply(0, 210);
        int int18 = calculator0.subtract(1810185236, 1810185237);
        int int21 = calculator0.subtract(13432946, 1159487408);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1146054462) + "'", int21 == (-1146054462));
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = calculator0.divide((-52), (-2243320));
        int int27 = calculator0.multiply((-1772730154), 457755302);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1617160508) + "'", int27 == (-1617160508));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide(100, 98);
        int int21 = calculator0.multiply(3563280, 867133546);
        int int24 = calculator0.subtract(86713381, 1730079900);
        int int27 = calculator0.divide((-846679733), 98);
        int int30 = calculator0.multiply(86713475, (-351870447));
        int int33 = calculator0.subtract(583692980, 1451887434);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1494342816 + "'", int21 == 1494342816);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1643366519) + "'", int24 == (-1643366519));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-8639589) + "'", int27 == (-8639589));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1976888653) + "'", int30 == (-1976888653));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-868194454) + "'", int33 == (-868194454));
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.divide((-36), 33);
        int int18 = calculator0.subtract((-609787), (-867133537));
        int int21 = calculator0.multiply(1323869432, (-636451305));
        int int24 = calculator0.multiply((-867133431), (-131));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 866523750 + "'", int18 == 866523750);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1556128328 + "'", int21 == 1556128328);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1925329765 + "'", int24 == 1925329765);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
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
        int int33 = calculator0.multiply(154541860, (-938163200));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-22573056) + "'", int33 == (-22573056));
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.subtract((-6), 2);
        int int21 = calculator0.divide(4864, (-307225));
        int int24 = calculator0.add(1512046592, 1289275491);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1493645213) + "'", int24 == (-1493645213));
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.subtract(109, (int) (short) 100);
        int int15 = calculator0.subtract((-36), (-31));
        int int18 = calculator0.subtract((int) (byte) 0, 1494342816);
        int int21 = calculator0.multiply((-45), (-31));
        int int24 = calculator0.subtract(37500454, (-94230841));
        int int27 = calculator0.subtract((-1896831404), (-522816736));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1494342816) + "'", int18 == (-1494342816));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1395 + "'", int21 == 1395);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 131731295 + "'", int24 == 131731295);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1374014668) + "'", int27 == (-1374014668));
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
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
        int int30 = calculator0.divide(1503914342, (-520020));
        int int33 = calculator0.add(1497091025, (-128));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6992 + "'", int24 == 6992);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1503190044 + "'", int27 == 1503190044);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2892) + "'", int30 == (-2892));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1497090897 + "'", int33 == 1497090897);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.subtract(1925360681, 1672101496);
        int int12 = calculator0.add((-197121368), 940146681);
        int int15 = calculator0.multiply(49164439, 1371450554);
        int int18 = calculator0.subtract(262451282, (-1537850803));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 253259185 + "'", int9 == 253259185);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 743025313 + "'", int12 == 743025313);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 13025718 + "'", int15 == 13025718);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1800302085 + "'", int18 == 1800302085);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide((int) (byte) -1, 69);
        int int21 = calculator0.add(6992, 2020);
        int int24 = calculator0.add((-1864681194), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9012 + "'", int21 == 9012);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1864681194) + "'", int24 == (-1864681194));
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
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
        int int33 = calculator0.add(1612493414, (-492456360));
        int int36 = calculator0.multiply((-891584), (-3020));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1120037054 + "'", int33 == 1120037054);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1602383616) + "'", int36 == (-1602383616));
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.add((int) (byte) 1, (int) ' ');
        int int15 = calculator0.subtract(754840506, (-1984132447));
        int int18 = calculator0.multiply(1, 94);
        int int21 = calculator0.multiply(1371450554, 2130112384);
        int int24 = calculator0.add((-3528), (-1917936897));
        int int27 = calculator0.subtract(568480, 373040344);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1555994343) + "'", int15 == (-1555994343));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 94 + "'", int18 == 94);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1767113472 + "'", int21 == 1767113472);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1917940425) + "'", int24 == (-1917940425));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-372471864) + "'", int27 == (-372471864));
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((-110), (-68));
        int int9 = calculator0.add(6992, 1152037538);
        int int12 = calculator0.multiply((-1341734912), 6596677);
        int int15 = calculator0.multiply((-881407829), 1526490573);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1152044530 + "'", int9 == 1152044530);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-539901952) + "'", int12 == (-539901952));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1906190319 + "'", int15 == 1906190319);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add(101, (-2020));
        int int12 = calculator0.add(0, 1693566793);
        int int15 = calculator0.divide(86713344, (-1336575495));
        int int18 = calculator0.divide(1323847021, 1012025939);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = calculator0.divide((-871375378), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1919) + "'", int9 == (-1919));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1693566793 + "'", int12 == 1693566793);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
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
        int int36 = calculator0.multiply(93887247, (-1263236043));
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 804277787 + "'", int36 == 804277787);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.subtract(2, 86713344);
        int int18 = calculator0.multiply(20, 1154271478);
        int int21 = calculator0.divide(173200584, 49164439);
        int int24 = calculator0.multiply((-1007548917), (-1729226194));
        int int27 = calculator0.multiply((-376890729), 1436206848);
        int int30 = calculator0.add((-766927733), 651619911);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713342) + "'", int15 == (-86713342));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1610593080 + "'", int18 == 1610593080);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-262917126) + "'", int24 == (-262917126));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1249812224) + "'", int27 == (-1249812224));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-115307822) + "'", int30 == (-115307822));
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply((-76), (int) (byte) 100);
        int int18 = calculator0.subtract((-867133440), 692692992);
        int int21 = calculator0.add(26401901, (-123493));
        int int24 = calculator0.multiply((-10923885), 1373662594);
        int int27 = calculator0.multiply(1013244259, 86713381);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7600) + "'", int15 == (-7600));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1559826432) + "'", int18 == (-1559826432));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 26278408 + "'", int21 == 26278408);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1236696666) + "'", int24 == (-1236696666));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1259897009) + "'", int27 == (-1259897009));
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide(0, (-2037396585));
        int int12 = calculator0.subtract(0, (-675399327));
        int int15 = calculator0.multiply(1168096256, 6596677);
        int int18 = calculator0.subtract(2075617054, (-128));
        int int21 = calculator0.subtract((-868085962), 953847167);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 675399327 + "'", int12 == 675399327);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 124627968 + "'", int15 == 124627968);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2075617182 + "'", int18 == 2075617182);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1821933129) + "'", int21 == (-1821933129));
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.add(757944224, (-85512160));
        int int21 = calculator0.divide((-241122442), 1254594707);
        int int24 = calculator0.divide(1159487408, (-945944258));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 672432064 + "'", int18 == 672432064);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        int int21 = calculator0.divide((-1010), 86713455);
        int int24 = calculator0.add((-173436074), (int) ' ');
        int int27 = calculator0.add(21975629, 110);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-173436042) + "'", int24 == (-173436042));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 21975739 + "'", int27 == 21975739);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
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
        int int36 = calculator0.add((-899384640), (-1541928208));
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1853654448 + "'", int36 == 1853654448);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
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
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
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
        java.lang.Class<?> wildcardClass34 = calculator0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) '#', (-9312));
        int int18 = calculator0.divide((-97), (-867138628));
        int int21 = calculator0.divide(1395, (-867125924));
        int int24 = calculator0.add(452435152, 5);
        int int27 = calculator0.multiply(2026755423, (-187));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9347 + "'", int15 == 9347);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 452435157 + "'", int24 == 452435157);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1046142053) + "'", int27 == (-1046142053));
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.subtract((int) (byte) -1, (int) (short) -1);
        int int15 = calculator0.add((-6858340), (-9280));
        int int18 = calculator0.divide(897963264, 94);
        int int21 = calculator0.multiply(32, 867133667);
        int int24 = calculator0.divide(1271882624, (-757944310));
        int int27 = calculator0.subtract((-934840507), 2444);
        int int30 = calculator0.subtract(408021504, (-1285850013));
        int int33 = calculator0.divide((-2118403245), 13276316);
        int int36 = calculator0.subtract((-917629359), 1675555702);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6867620) + "'", int15 == (-6867620));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9552800 + "'", int18 == 9552800);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1978473568 + "'", int21 == 1978473568);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-934842951) + "'", int27 == (-934842951));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1693871517 + "'", int30 == 1693871517);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-159) + "'", int33 == (-159));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1701782235 + "'", int36 == 1701782235);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.subtract((-1), (-97));
        int int21 = calculator0.multiply(0, 287137963);
        int int24 = calculator0.add(0, (-1171728053));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 96 + "'", int18 == 96);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1171728053) + "'", int24 == (-1171728053));
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
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
        int int36 = calculator0.add(859177974, (-1495629227));
        int int39 = calculator0.subtract((-415711797), 1732347592);
        int int42 = calculator0.divide((-1152037337), (-326593373));
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-636451253) + "'", int36 == (-636451253));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2146907907 + "'", int39 == 2146907907);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide((-1769916224), (-36));
        int int21 = calculator0.add((-9312), (-121));
        int int24 = calculator0.multiply((int) (short) -1, 0);
        int int27 = calculator0.subtract(1, 1616550797);
        int int30 = calculator0.subtract((-1849536748), 110);
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49164339 + "'", int18 == 49164339);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9433) + "'", int21 == (-9433));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1616550796) + "'", int27 == (-1616550796));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1849536858) + "'", int30 == (-1849536858));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.multiply((-86713457), 692692992);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.add(33, (-7600));
        int int21 = calculator0.divide((-60), (-13365));
        int int24 = calculator0.divide((-1755170682), 1409043529);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
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
        int int33 = calculator0.divide(1693871517, (-275619196));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-6) + "'", int33 == (-6));
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
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
        int int36 = calculator0.add(859177974, (-1495629227));
        int int39 = calculator0.subtract((-415711797), 1732347592);
        int int42 = calculator0.subtract(1454119969, 1526490573);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-636451253) + "'", int36 == (-636451253));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2146907907 + "'", int39 == 2146907907);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-72370604) + "'", int42 == (-72370604));
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.add(51, (-97));
        int int15 = calculator0.multiply(1978473568, 1810185237);
        int int18 = calculator0.divide((-402505884), (-173426797));
        int int21 = calculator0.divide(0, 867133515);
        int int24 = calculator0.multiply(114096, 2139980843);
        int int27 = calculator0.divide((-15200), (-733999));
        int int30 = calculator0.divide(109415572, 1013244357);
        int int33 = calculator0.multiply(867153943, 867154009);
        int int36 = calculator0.add(0, 15677);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-46) + "'", int12 == (-46));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1057369120) + "'", int15 == (-1057369120));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1341547376) + "'", int24 == (-1341547376));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1323268097) + "'", int33 == (-1323268097));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 15677 + "'", int36 == 15677);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
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
        int int30 = calculator0.subtract(1021671984, 11693928);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-910738285) + "'", int18 == (-910738285));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1110676512) + "'", int21 == (-1110676512));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-451867) + "'", int24 == (-451867));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1009978056 + "'", int30 == 1009978056);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
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
        int int30 = calculator0.add((-1864654464), (-1224898));
        int int33 = calculator0.subtract(2025060192, 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1700666764 + "'", int15 == 1700666764);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-161052992) + "'", int18 == (-161052992));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-8) + "'", int24 == (-8));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9347 + "'", int27 == 9347);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1865879362) + "'", int30 == (-1865879362));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2025060168 + "'", int33 == 2025060168);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide((-68), (int) (byte) 100);
        int int12 = calculator0.subtract((-111), (int) (short) 10);
        int int15 = calculator0.multiply((-7600), (-34));
        int int18 = calculator0.multiply(1527277189, (-2131780436));
        int int21 = calculator0.add(867154019, (-2146806852));
        int int24 = calculator0.add(321805482, 1236538979);
        int int27 = calculator0.subtract(1523011314, (-1399144532));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-121) + "'", int12 == (-121));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 258400 + "'", int15 == 258400);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2118708572 + "'", int18 == 2118708572);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1279652833) + "'", int21 == (-1279652833));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1558344461 + "'", int24 == 1558344461);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1372811450) + "'", int27 == (-1372811450));
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        int int21 = calculator0.divide((-1010), 1152037484);
        int int24 = calculator0.divide((-86713457), (-109415445));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.add(25836672, (-307225));
        int int21 = calculator0.multiply(1454119969, 1323869432);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 25529447 + "'", int18 == 25529447);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-995597320) + "'", int21 == (-995597320));
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.divide((-3), 86713344);
        int int15 = calculator0.multiply((-596556766), (-493712131));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1399394918) + "'", int15 == (-1399394918));
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.multiply(34, (-685834));
        int int21 = calculator0.subtract((-74870788), 0);
        int int24 = calculator0.subtract(887128884, (-685834));
        int int27 = calculator0.add(0, 65689586);
        int int30 = calculator0.divide(1737431675, 206282752);
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-23318356) + "'", int18 == (-23318356));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-74870788) + "'", int21 == (-74870788));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 887814718 + "'", int24 == 887814718);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 65689586 + "'", int27 == 65689586);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8 + "'", int30 == 8);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
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
        int int30 = calculator0.add(1597614332, 9012);
        int int33 = calculator0.add(1202467776, 47859271);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-110) + "'", int18 == (-110));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1769916224) + "'", int21 == (-1769916224));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 42260032 + "'", int24 == 42260032);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-322124534) + "'", int27 == (-322124534));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1597623344 + "'", int30 == 1597623344);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1250327047 + "'", int33 == 1250327047);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
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
        int int30 = calculator0.add(1013248472, (-28544742));
        int int33 = calculator0.subtract(853349558, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1147225688) + "'", int24 == (-1147225688));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-18362223) + "'", int27 == (-18362223));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 984703730 + "'", int30 == 984703730);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 853349558 + "'", int33 == 853349558);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply(0, 0);
        int int18 = calculator0.multiply(1002899992, 1090625632);
        int int21 = calculator0.multiply((-1003175496), (-79882359));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-217396992) + "'", int18 == (-217396992));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1316696952 + "'", int21 == 1316696952);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.divide((int) (short) 1, (int) (short) 100);
        int int15 = calculator0.add((int) (byte) -1, (-111));
        int int18 = calculator0.divide(110, (-1526379168));
        int int21 = calculator0.add((-685834), (-1687920631));
        int int24 = calculator0.multiply(21975628, (-403723706));
        int int27 = calculator0.subtract(88820567, (-1061977765));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-112) + "'", int15 == (-112));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1688606465) + "'", int21 == (-1688606465));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1900738760 + "'", int24 == 1900738760);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1150798332 + "'", int27 == 1150798332);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.divide(272082650, (-1510616912));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((int) '#', (int) (short) -1);
        int int21 = calculator0.subtract((-76), (int) (byte) 10);
        int int24 = calculator0.multiply((-5), 86713457);
        int int27 = calculator0.multiply(867133616, (-415711797));
        int int30 = calculator0.multiply(1769916123, 0);
        int int33 = calculator0.multiply((-173426797), (-211766202));
        int int36 = calculator0.subtract(991518632, 1322291737);
        int int39 = calculator0.subtract(949005184, 316808288);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-86) + "'", int21 == (-86));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-433567285) + "'", int24 == (-433567285));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 853668752 + "'", int27 == 853668752);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-509899214) + "'", int33 == (-509899214));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-330773105) + "'", int36 == (-330773105));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 632196896 + "'", int39 == 632196896);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.subtract(20580, (-867133439));
        int int21 = calculator0.divide((-609787), (-31));
        int int24 = calculator0.subtract((-1248191799), 672432064);
        int int27 = calculator0.subtract((-879833140), 1574689);
        int int30 = calculator0.divide(334907792, 1235754784);
        int int33 = calculator0.divide(1657697900, 1201199132);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867154019 + "'", int18 == 867154019);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19670 + "'", int21 == 19670);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1920623863) + "'", int24 == (-1920623863));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-881407829) + "'", int27 == (-881407829));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        int int21 = calculator0.multiply(1269639246, 1037464303);
        int int24 = calculator0.multiply((-867158169), (int) (byte) 100);
        int int27 = calculator0.divide(25, (-290738176));
        int int30 = calculator0.multiply(18002567, (-841742365));
        int int33 = calculator0.multiply((-1435233664), 7029297);
        int int36 = calculator0.subtract((-1380247540), 1713901676);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 164584658 + "'", int21 == 164584658);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-816470980) + "'", int24 == (-816470980));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1765932725 + "'", int30 == 1765932725);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1216121472 + "'", int33 == 1216121472);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1200818080 + "'", int36 == 1200818080);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.subtract((int) (byte) -1, 0);
        int int21 = calculator0.add(887061504, 14174128);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 901235632 + "'", int21 == 901235632);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract(9, (-100));
        int int15 = calculator0.add(1733781449, 18);
        int int18 = calculator0.divide(1898423450, (-135309308));
        int int21 = calculator0.multiply(766799183, (-493712131));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109 + "'", int12 == 109);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1733781467 + "'", int15 == 1733781467);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-14) + "'", int18 == (-14));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-333104365) + "'", int21 == (-333104365));
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply((-76), (int) (byte) 100);
        int int18 = calculator0.subtract(100, (-1));
        int int21 = calculator0.multiply((-5), 378379962);
        int int24 = calculator0.add((-161745389), (-887064863));
        int int27 = calculator0.multiply((-1366555528), (-1764515376));
        int int30 = calculator0.multiply(0, 1271869877);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7600) + "'", int15 == (-7600));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1891899810) + "'", int21 == (-1891899810));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1048810252) + "'", int24 == (-1048810252));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-545580672) + "'", int27 == (-545580672));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (byte) 1, 96);
        int int24 = calculator0.multiply(2, (-1010));
        int int27 = calculator0.subtract((-7955541), (-110));
        int int30 = calculator0.subtract(1137726111, 792269490);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 96 + "'", int21 == 96);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2020) + "'", int24 == (-2020));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-7955431) + "'", int27 == (-7955431));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 345456621 + "'", int30 == 345456621);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.add(867133667, (-121));
        int int21 = calculator0.subtract(0, (-1908264058));
        int int24 = calculator0.multiply((-685834), (-78));
        int int27 = calculator0.subtract((-1237148864), (-1819445740));
        int int30 = calculator0.multiply(675399327, 1908264058);
        int int33 = calculator0.divide(2877358, 631533728);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133546 + "'", int18 == 867133546);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1908264058 + "'", int21 == 1908264058);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 53495052 + "'", int24 == 53495052);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 582296876 + "'", int27 == 582296876);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1812093894 + "'", int30 == 1812093894);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
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
        int int36 = calculator0.divide(1510267836, 867150782);
        int int39 = calculator0.subtract(86713342, 419338036);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-332624694) + "'", int39 == (-332624694));
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.subtract(2, 86713344);
        int int18 = calculator0.multiply(20, 1154271478);
        int int21 = calculator0.divide((-1606434265), (-121));
        int int24 = calculator0.divide(95293332, (-100641636));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713342) + "'", int15 == (-86713342));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1610593080 + "'", int18 == 1610593080);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13276316 + "'", int21 == 13276316);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(1145179144, 100);
        int int15 = calculator0.add((-6), (-287587));
        int int18 = calculator0.multiply(69879792, (-1435799477));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1145179044 + "'", int12 == 1145179044);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-287593) + "'", int15 == (-287593));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 690754384 + "'", int18 == 690754384);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.multiply((int) (short) 10, (-685834));
        int int21 = calculator0.subtract(867154019, 1925360681);
        int int24 = calculator0.multiply(100, 0);
        int int27 = calculator0.subtract(227, (-1058206662));
        int int30 = calculator0.divide((-458491822), (-563954720));
        int int33 = calculator0.add(306354380, 0);
        int int36 = calculator0.multiply(380113939, 21740300);
        java.lang.Class<?> wildcardClass37 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6858340) + "'", int18 == (-6858340));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1058206662) + "'", int21 == (-1058206662));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1058206889 + "'", int27 == 1058206889);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 306354380 + "'", int33 == 306354380);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-887369244) + "'", int36 == (-887369244));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.subtract(1152037536, (-815312671));
        int int15 = calculator0.add(1820836164, 1216019168);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1967350207 + "'", int12 == 1967350207);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1258111964) + "'", int15 == (-1258111964));
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.divide((int) ' ', (-101));
        int int15 = calculator0.add(1152037484, (-6858340));
        int int18 = calculator0.multiply((-1845536552), 968765952);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1145179144 + "'", int15 == 1145179144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-408276992) + "'", int18 == (-408276992));
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
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
        int int36 = calculator0.add((-7955541), (-2062310660));
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-2070266201) + "'", int36 == (-2070266201));
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((int) (short) 10, 867133501);
        int int21 = calculator0.add((-3528), (-7567));
        int int24 = calculator0.divide(0, (-1802498291));
        int int27 = calculator0.subtract(975945154, (-217396992));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11095) + "'", int21 == (-11095));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1193342146 + "'", int27 == 1193342146);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.add((int) (byte) 1, (int) ' ');
        int int15 = calculator0.subtract(1560953741, (-1816189210));
        int int18 = calculator0.divide(287137963, (-1048810252));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-917824345) + "'", int15 == (-917824345));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.subtract((int) (short) 0, 110);
        int int21 = calculator0.multiply((-867133491), (-9280));
        int int24 = calculator0.multiply((int) (short) -1, (-1923));
        int int27 = calculator0.multiply(0, 1923);
        int int30 = calculator0.divide((-654191323), (-1595814928));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-110) + "'", int18 == (-110));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1769916224) + "'", int21 == (-1769916224));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1923 + "'", int24 == 1923);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.add(51, (-97));
        int int15 = calculator0.divide(9, 867133591);
        int int18 = calculator0.add(1237147755, (-1759765077));
        int int21 = calculator0.add((-412970881), 1261453047);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-46) + "'", int12 == (-46));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-522617322) + "'", int18 == (-522617322));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 848482166 + "'", int21 == 848482166);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.multiply((int) (short) 100, (-152));
        int int18 = calculator0.divide((-1248231612), 1754528548);
        int int21 = calculator0.divide(290738210, (-7600));
        int int24 = calculator0.multiply(395484846, 1522336568);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15200) + "'", int15 == (-15200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-38255) + "'", int21 == (-38255));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 845463568 + "'", int24 == 845463568);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
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
        int int30 = calculator0.divide(1051888068, (-139044816));
        int int33 = calculator0.divide((-1475970418), 153);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1336575288) + "'", int21 == (-1336575288));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1043243661) + "'", int24 == (-1043243661));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 907339462 + "'", int27 == 907339462);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-7) + "'", int30 == (-7));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-9646865) + "'", int33 == (-9646865));
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
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
        int int33 = calculator0.add((-1869161959), (-293627777));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2132177560 + "'", int33 == 2132177560);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
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
        int int30 = calculator0.divide((-729128684), (-1459544222));
        int int33 = calculator0.subtract((-1311704925), (-356995307));
        int int36 = calculator0.subtract((-915919376), 86);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1445304909 + "'", int21 == 1445304909);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 109411264 + "'", int24 == 109411264);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-954709618) + "'", int33 == (-954709618));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-915919462) + "'", int36 == (-915919462));
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
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
        int int36 = calculator0.add(677728192, (-13314));
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 677714878 + "'", int36 == 677714878);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.multiply((-68), 110);
        int int18 = calculator0.subtract(86713457, 76);
        int int21 = calculator0.add((-2243320), (-290));
        int int24 = calculator0.add(520052, (-477385434));
        int int27 = calculator0.subtract((-14813881), (-180712367));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7480) + "'", int15 == (-7480));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 86713381 + "'", int18 == 86713381);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2243610) + "'", int21 == (-2243610));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-476865382) + "'", int24 == (-476865382));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 165898486 + "'", int27 == 165898486);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.add((-2146806784), 0);
        int int12 = calculator0.subtract(520297, 96);
        int int15 = calculator0.multiply(736984748, (-290738176));
        int int18 = calculator0.multiply((-1966953124), (-1435799710));
        int int21 = calculator0.divide(2146545494, 1261453047);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2146806784) + "'", int9 == (-2146806784));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520201 + "'", int12 == 520201);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-872792064) + "'", int15 == (-872792064));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 354763064 + "'", int18 == 354763064);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
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
        int int30 = calculator0.divide((int) (short) 100, (-1559826432));
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
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.add(51, (int) (short) 1);
        int int15 = calculator0.add((-68), 32);
        int int18 = calculator0.subtract(1810185237, (-2132911612));
        int int21 = calculator0.add(853668752, 84);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-36) + "'", int15 == (-36));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-351870447) + "'", int18 == (-351870447));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 853668836 + "'", int21 == 853668836);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.multiply(867133511, (-7955431));
        int int15 = calculator0.add((-1248231612), 1700666764);
        int int18 = calculator0.divide((-726422531), 1458866016);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1037464303 + "'", int12 == 1037464303);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 452435152 + "'", int15 == 452435152);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
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
        int int30 = calculator0.add(361774682, (int) (byte) 100);
        int int33 = calculator0.multiply(173435032, 55497);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11095) + "'", int21 == (-11095));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3463464) + "'", int24 == (-3463464));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-757113551) + "'", int27 == (-757113551));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 361774782 + "'", int30 == 361774782);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 102260568 + "'", int33 == 102260568);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.divide((int) (byte) 0, 568480);
        int int21 = calculator0.multiply((-26730), 81677);
        int int24 = calculator0.subtract((-1090902560), (-1998750842));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2111741086 + "'", int21 == 2111741086);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 907848282 + "'", int24 == 907848282);
    }
}

