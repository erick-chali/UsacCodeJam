import java.text.DecimalFormat;


public class Football {
	//ESTE LO ESTABA DOCUMENTANDO PORQUE ES UN DESMADRE, POR SI TE PREGUNTAS PORQ HAY NOTAS EVERYWHERE.
	public static double v,angulo;
	public static void main(String[] args) {
		//Como se reciben parametros se asume que el usario sabe lo que esta metiendo.
		System.out.println("Numeros de un rango");
		v = Double.parseDouble(args[0].toString());
		angulo = Double.parseDouble(args[1].toString());
//		v = 30;
//		angulo = 60;
		Calcular(v,angulo);
	}

	private static void Calcular(double v, double angulo) {
		//t=-VoSenß/-g
		double tiempo,angy,angx,dist,ttotal,rad;
		/***la variable rad es para convertir el angulo a radianes porque los 
		 * parametros de sin y cos deben estar en radianes.
		***/
		//converti a radianes la variable angulo
		rad = (angulo*Math.PI)/180;
		angy = Math.sin(rad);
		angx = Math.cos(rad);
		//los resultados en radianes los converti a grados por el SI.
		Math.toDegrees(angx);
		Math.toDegrees(angy);
		//tiempo de medio viaje.
		tiempo = (v*angy)/9.8;
		ttotal = 2*tiempo;

		dist = v*angx*ttotal;
		//Esto es solo para darle estilo, esta bien, un amigo me dijo como hacerlo
		DecimalFormat formato = new DecimalFormat("#.###");
		System.out.println("El tiempo de vuelo es: " + formato.format(ttotal) + " segundos.");
		System.out.println("La distancia recorrida por el balon es: " + formato.format(dist) + " metros.");
	}
	

}
