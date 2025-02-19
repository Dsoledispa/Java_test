class Main {
    public static void main (String[] args){
        User joven = new User();

        youngerUser.name = "Paquito";
        youngerUser.birthDay = LocalDate.parse("1995-01-31");

        System.out.printf("%s nacio en %s", youngerUser.name, youngerUser.birthDay.toString());
    }
}