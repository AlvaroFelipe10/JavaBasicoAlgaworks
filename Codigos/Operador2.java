public class Operador2 {
    public static void main(String[] args){
        int total = 10;
        total = total + 3; // aquiv fazemos a somo de TOTAL + 3 e podemos usar outro jeito que vamos fazer abaixo
        System.out.println(total); // imprime 13
        total -= 2; // aqui temos a subtraçao ao inves de usar TOTAL - 3, usei -= chega ao mesmo resultado
        System.out.println(total); // imprime 11 
        total *= 3;
        System.out.println(total); //imprime 33
        total /= 3;
        System.out.println(total); // imprime 11
        total %= 3;
        System.out.println(total); //imprime 1
    }
}