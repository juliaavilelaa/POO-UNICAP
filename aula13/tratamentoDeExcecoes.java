package aula13;

public class tratamentoDeExcecoes {
    public static void main(String[] args) {
        try {
            //int numero = 10/0;

            //int arr[] = new int[10];
            //arr[11] = 3;

            String teste = null;
            teste.charAt(0);

        } catch (ArithmeticException error) {
            System.out.println("Não é possível dividir por zero.");
        } catch (IndexOutOfBoundsException error) {
            System.out.println("Excedeu o limite.");
        } catch (Exception error) {
            System.out.println("Erro desconhecido.");
        } finally {
            System.out.println("Sempre executa esse bloco.");
        }
    }
}
