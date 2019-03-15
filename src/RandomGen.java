import java.util.Random;


public class RandomGen {
    int length;

    StringBuilder buffer = new StringBuilder(length);

    public static String generateRandString(Random random, int length){
        return random.ints(48,123)
                .filter(i -> (i<57 || i>65)&&(i<90 || i>97))
                .mapToObj(i -> (char)(i))
                .limit(length)
                .collect(StringBuilder::new, (sb, i) -> sb.append((char) i), StringBuilder::append).toString();
    }

    public static int generateRandInt(int max, int min){
        return ((int)(Math.random()*(max -min)+1) + min);
    }

    public static Employee.tname generateRandTeam(Random random){

        return (Employee.tname.values()[random.nextInt(3)]);

    }

    public static Employee.type generateRandType(Random random){

        return (Employee.type.values()[random.nextInt(3)]);

    }


//    public Employee.type generateType(){
//        return random.ints(1,4)
//                .
//    }
}
