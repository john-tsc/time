public class Time1Test {
    public static void main(String args[]) {
        Time1 time1 = new Time1();

        diplayTime("After create object Time", time1);
        System.out.println();

        //depois de alterar a data/hora
        time1.setTime(4, 54, 32);
        diplayTime("After calling setTime", time1);
        System.out.println();

        //tentando definir data/hora incorreta.
        try {
            time1.setTime(99, 99, 99);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: "+e.getMessage());
            System.out.println();
        }
    }

    private static void diplayTime(String header, Time1 t) {
        System.out.printf(" %s%n Universal time: %s%nStandard time: %s%n",
                header, t.toUniversalString(), t.toString());
    }
}
