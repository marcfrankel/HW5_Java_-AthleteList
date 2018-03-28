public class tester {

     public static void main(String[] args) throws Exception {


        AthleteList test_list = new AthleteList();
        Athlete billy = new Athlete("Billy", 16, 15);
        Athlete Tom = new Athlete("Tom", 2, 2);
        Athlete Marc = new Athlete("Marc", 200, 2);
        Athlete billy2 = new Athlete("Billy2", 16, 15);
        Athlete Tom2 = new Athlete("Tom2", 2, 2);
        Athlete Marc2 = new Athlete("Marc2", 200, 2);
        Athlete billy3 = new Athlete("Billy3", 16, 15);
        Athlete Tom3 = new Athlete("Tom3", 2, 2);
        Athlete Marc3 = new Athlete("Marc3", 200, 2);
        Athlete Marc4 = new Athlete("Marc4", 200, 2);
        Athlete MrEleven = new Athlete("MrEleven", 200, 2);
        Athlete Mr12 = new Athlete("MrEleven", 200, 2);



        test_list.add(billy);
        test_list.add(Tom);
        test_list.add(Marc);
        test_list.add(billy2);
        test_list.add(Tom2);
        test_list.add(Marc2);
        test_list.add(billy3);
        test_list.add(Tom3);
        test_list.add(Marc3);
        test_list.add(Marc4);
        test_list.add(MrEleven);
        test_list.add(Mr12);
        test_list.add(Mr12);




        Athlete temp = test_list.get(2);
        //System.out.println(temp.toString());
        System.out.println(test_list.size());
        test_list.remove(1);
        System.out.println(test_list.size());


        Athlete temp2 = test_list.get(8);
        System.out.println(temp2.toString());

        System.out.print(test_list.asArray());

     }
}