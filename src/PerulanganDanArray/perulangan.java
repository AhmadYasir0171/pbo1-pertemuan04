package PerulanganDanArray;

  public class perulangan {
    public static void main(String[] args) {
        int koin = 0;
        int ekor = 0;
        int kepala = 0;

        do{
            koin = (int)(Math.random() * 2);
            if(koin == 1){
                System.out.println("Ekor");
                ekor++;
                kepala =0;
            }else{
                System.out.println("Kepala");
                kepala++;
                ekor =0;
            }

        }while (ekor != 3 && kepala != 3);
        System.out.println("Program Berhenti");
    }
}