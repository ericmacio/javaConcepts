class TestFeline {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Tiger tiger = new Tiger();
        WorkOnFeline workOnFeline = new WorkOnFeline();
        workOnFeline.startWork(cat);
        workOnFeline.startWork(tiger);
        System.out.println("----------");
        Feline feline;
        feline = cat;
        feline.isNice();
        feline.run();
        feline = tiger;
        feline.isNice();
        feline.run();
    }
}