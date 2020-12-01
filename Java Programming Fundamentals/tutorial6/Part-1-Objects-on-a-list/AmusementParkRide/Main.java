public class Main {
    public static void main(String[] args) {
        Person matti = new Person("Matti");
        matti.setWeight(86);
        matti.setHeight(180);

        Person juhana = new Person("Juhana");
        juhana.setWeight(34);
        juhana.setHeight(132);

        Person awak = new Person("Awak");
        awak.setWeight(60);
        awak.setHeight(187);

        AmusementParkRide hurjakuru = new AmusementParkRide("Hurjakuru", 140);
        System.out.println(hurjakuru);

        System.out.println();

        if (hurjakuru.isAllowedOn(matti)) {
            System.out.println(matti.getName() + " is allowed on the ride");
        } else {
            System.out.println(matti.getName() + " is not allowed on the ride");
        }

        if (hurjakuru.isAllowedOn(juhana)) {
            System.out.println(juhana.getName() + " is allowed on the ride");
        } else {
            System.out.println(juhana.getName() + " is not allowed on the ride");
        }

        if (hurjakuru.isAllowedOn(awak)) {
            System.out.println(awak.getName() + " is allowed on the ride");
        } else {
            System.out.println(awak.getName() + " is not allowed on the ride");
        }

        System.out.println(hurjakuru);
        System.out.println("Average Height: " + hurjakuru.averageHeightOfPeopleOnRide());

        System.out.println();
        System.out.println(hurjakuru.getTallest().getName());
        Person tallest = hurjakuru.getTallest();
        System.out.println(tallest.getName());
    }

}
