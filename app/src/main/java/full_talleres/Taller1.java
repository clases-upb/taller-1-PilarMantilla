/*
 * Este es el primer taller de lógica de programación. Tenga en cuenta la siguiente rúbrica que debe ser  
 * tenida en cuenta para cada ejercicio y se basa en los mandamientos del programador. El taller es una 
 * herramienta para comenzar a preparar la evaluación donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * Al valor que obtenga en la evaluación automática de github, se revisará si cumple con buenas prácticas
 * de acuerdo con la siguiente rúbrica que se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package full_talleres;

public class Taller1 {
    
    public static void main(String[] args) {


    }

    /* 
     2.	Diseñe un algoritmo e implemente la función Convertir_km_seg que: reciba una velocidad entera en Km/seg 
     y la convierta a metros/seg y a metros/hora. Retorne un string del tipo: ### m/s - ### m/h. Si hay error, 
     devuelva el string "Error en la conversion"
    */
    public static String Convertir_km_seg(int velocidad){
        try {
            
            float mets_seg=0;
            float mets_horas=0;
            final float metros= 1000, horas= (float)1/3600;
            mets_seg= velocidad * metros;
            mets_horas = mets_seg / horas; 
            String total  = mets_seg+ " m/s " + "- " + mets_horas+" m/h";
            return total;

        } catch (Exception e) {
            return "Error en la conversion";
        }
    }
    

    /*3. Diseñe un algoritmo e implemente la función Convertir_cm_lt que: reciba una cantidad double expresada en 
    cc (centímetros cúbicos) y devuelva un float con su equivalente en litros. Si hay algún error, retorne 0.
    */
   public static float Convertir_cm_lt(double cantidad){
        try {
            float cm_lit=0;
            final float litros = 1000;
            cm_lit= (float)cantidad / litros;
            return cm_lit;

        } catch (Exception e) {
            return 0;
        }
    }
    
   /*4.	Diseñe un algoritmo e implemente la función Convertir_us_cops que reciba una cantidad entera de dólares 
   y devuelva su equivalente en pesos usando una TRM de $4170 pesos por cada dólar. La función recibe enteros
   y devuelve enteros, pueden ser grandes. Si hay algún error, retorne -1.
   */
   public static int Convertir_us_cops(int cant_dolar){
    try {
        int dolar_pesos=0;
        final int pesos = 4170;
        dolar_pesos = cant_dolar * pesos;
        return dolar_pesos;

    } catch (Exception e) {
        return -1;
    }
   }
    
   /*5.	Diseñe un algoritmo e implemente la función Convertir_cent_far que recibe la temperatura real en grados 
   centígrados y la devuelve en grados Fahrenheit (averiguar la fórmula) F = 32 + ( 9 * C / 5). Si hay algún error, 
   retorne 0.
   */
   public static double Convertir_cent_far(double tem_c){
    try {
        double cen_fah= 0;
        final double tem_f = tem_c*(9/5) + 32;
        cen_fah = tem_f;
        return cen_fah;
    } catch (Exception e) {
        return 0;
    }
   }

   /*6.	Diseñe un algoritmo e implemente la función Calcular_segs que recibirá el número de Días, el número de horas, 
   el número de minutos y número segundos como enteros bytes, positivos y devuelva todo en segundos en un entero. 
   Si hay algún error, devuelva -1.
   */
   public static int Calcular_segs(short  dias, short  horas, short  minutos, short segundos){
    try {
       int tot_seg = 0;
       final int seg_dias= 86400, seg_horas= 3600, seg_minutos= 60;
       tot_seg = dias*seg_dias + horas*seg_horas + minutos*seg_minutos + segundos;
       return tot_seg;

    } catch (Exception e) {
        return -1;
    }
   }

   /*7.	Un usuario tiene un sistema de báscula para pesar camiones. Diseñe un algoritmo e implemente la función 
   Calcular_peso_carga que reciba un float con el peso total del camión cargado en toneladas y otro float con 
   lo que pesa el camión vacío en toneladas, y devuelva el peso neto de la carga en kilos y toneladas 
   en un string del tipo: "### kilos - ### toneladas". 
   Si hay algún error, devuelva en un string "Error en la función Calcular_peso_carga"*/
   public static String Calcular_peso_carga(float peso_tot, float peso_vac){
    try {
        float tot_vac=0;
        float camion_kg=0;
        final float kg = 1000f;
        tot_vac= (float)(peso_tot - peso_vac);
        camion_kg = (float)(tot_vac * kg);
        String total = camion_kg + " kilos" + " - " + tot_vac + " toneladas";
        return total;

    } catch (Exception e) {
        return "Error en la función Calcular_peso_carga";
    }
}
    
   /*8.	Diseñe un algoritmo e implemente la función Calcular_horasxviaje que calcule y devuelva un float con las horas  
   necesarias para alcanzar un destino que es recibido en un string, además de un short con la distancia en kms
   otro dato short que es la velocidad  promedio que alcanzará también el vehículo en kilómetros/hora.  
   Si hay algún error, devuelva -1.
   */
   public static float Calcular_horasxviaje(String destino, short dist_km, short vel_prom){
        try {
            float total=0;
            total= dist_km / vel_prom;
            return  total;
        } catch (Exception e) {
            return -1;
        }
    }

   /*9.	Un avión necesita cargar combustible para cubrir sus rutas programadas en el día. 
   Cada 0.2 toneladas de combustible puede recorrer 60.8 Km en velocidad de crucero. 
   En el despegue el avión consume 1.2 toneladas de combustible y en el aterrizaje consume 0.4 toneladas. 
   
   El piloto desea que sea diseñado un algoritmo e implementado en la función Calcular_combustible, 
   el kilometraje total para cada una de cuatro rutas que son datos enteros, y devuelva un float con la cantidad total 
   de combustible que debe ser cargado en el avión.
   
   Si hay algún error, devuelva -1.*/
   public static float Calcular_combustible(int k1, int k2, int k3, int k4){
    try {
      float total = 0;
      float des_ate=0;
      float tot_k=0;
      final float despegue= 1.2f, aterrizaje=0.4f, gasolina= (float)(0.2/60.8);
      des_ate = (float)(despegue+aterrizaje)*4;
      tot_k= k1+ k2+ k3+ k4;
      total= (float)((tot_k * gasolina)+des_ate);
      return total;

    } catch (Exception e) {
        return -1;
    }
   }

   /*10. Diseñe un algoritmo e implemente la función Calcular_peso_luna que recibe un byte con el peso en la tierra en kilos
   y devuelve un double el equivalente de ese peso en la luna en Newtons. Utilice las siguientes fórmulas.
   peso_tierra_new = peso_kilos * 9.81m/s2
   peso_luna_new = peso_tierra_new * 0.165
   
   Si hay algún error, devuelva 0.
   */
   public static double Calcular_peso_luna(byte peso_kilos){
    try {
        double tot_tierra=0, tot_luna=0;
        final float peso_tierra = 9.81f, peso_luna = 0.165f;
        tot_tierra= peso_kilos*peso_tierra;
        tot_luna= tot_tierra*peso_luna;

        return tot_luna;
    } catch (Exception e) {
        return 0;
    }

   }
   
}
