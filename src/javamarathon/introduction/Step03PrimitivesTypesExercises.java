package javamarathon.introduction;

public class Step03PrimitivesTypesExercises {
    public static void main(String[] args) {
        String name = "Thiago Ferreira";
        String address = "Rua de Exemplo 37";
        double salary = 2500.86;
        String dateOfPayment = "01/01/1986";

        String reportMessage = "I " + name + ", living at "+ address +", confirm that I received the salary of $"+ salary +", on "+ dateOfPayment +".";

        System.out.println(reportMessage);
    }
}
