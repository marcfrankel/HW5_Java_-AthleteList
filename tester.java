public class tester {

     public static void main(String[] args) throws Exception {

        Athlete billy = new Athlete("Billy", 16, 15);

        System.out.println(billy.toString());
        billy.train();



        AthleteList test_list = new AthleteList();
        test_list.add(billy);
        Athlete temp = test_list.get(0);
        System.out.println(temp.toString());
        System.out.println(test_list.size());
        test_list.remove(0);

        System.out.println(test_list.size());

     }
}