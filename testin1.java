//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] angka = {22,67,31,11,5};
        int hasil = hitungTotal(angka);
        System.out.println(" hasilnya adalah : " +hasil);

    }

    public static int hitungTotal(int[] array){
        int hasil = 0;
        for(int i = 0; i<array.length; i++){
            hasil+=array[i];

        }
        return hasil;
    }
}