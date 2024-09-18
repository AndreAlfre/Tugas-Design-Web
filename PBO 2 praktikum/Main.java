public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Andre", 20, "Jagakarsa");
        person1.displayInfo();

        person1.setName("Andre Alfre");
        person1.setAge(20);
        person1.setAddress("Jakarta");

        System.out.println("Sudah diubah");
        person1.displayInfo();
    }
}
