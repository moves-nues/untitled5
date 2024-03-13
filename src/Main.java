public class Main {
    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("Ф.И.О. сщтрудника - " + fullName);
        String unt = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + unt);


        String fullName2 = "Иванов Семён Семёнович";
        String fullName22 = fullName2.replace("ё", "е");
        System.out.println(fullName22);
    }
}