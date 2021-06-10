public class septimo {
    public static void main(String[] args) {
        int numero,aux1=0,aux2=0,aux3=0;
        int contador=0;
       
        while(contador<15){
            numero=(int)(Math.random()*36+1);
            System.out.println("El numero es: "+numero);
            if (numero%2==0){
                aux1++;
                System.out.println("aux1 = "+aux1);
            }else if(numero==0){
                aux2++;
            }else{
                aux3++;
            }
            contador++;

        }
        double aux4=aux1/15*100;
        double aux5=aux2/15*100;
        double aux6=aux3/15*100;
        System.out.println("El porcentaje de numeros pares es de: "+aux4);
        System.out.println("El porcentaje de numeros ceros es de: "+aux5);
        System.out.println("El porcentaje de impares es de: "+aux6);
    }
    
}
