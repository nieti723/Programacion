package tema9;

public class BombillaCasa {
    private static boolean lunaLlena = false, fusibles = true;
    private String habitacion, estado;

    public static boolean isLunaLlena() {
        return lunaLlena;
    }

    public static void setLunaLlena(boolean lunaLlena) {
        BombillaCasa.lunaLlena = lunaLlena;
    }

    public static boolean isFusibles() {
        return fusibles;
    }

    public static void setFusibles(boolean fusibles) {
        BombillaCasa.fusibles = fusibles;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public BombillaCasa(String habitacion, String estado) {
        if (!estado.equals("apagada") && !estado.equals("encendida")) {
            this.estado = "apagada";
        } else {
            this.estado = estado;
        }
        this.habitacion = habitacion;
    }

    @Override
    public String toString() {
        return "La bombilla de la habitación: -" + habitacion + "- está " + estado;
    }

    public static void consultaGeneral(BombillaCasa[] habitaciones) {
        System.out.println("--------------------------------");
        System.out.println("¿Cómo están ahora las bombillas?");
        for (BombillaCasa bombillaCasa : habitaciones) {
            System.out.println(bombillaCasa);
        }
    }

    public void encender() {
        estado = "encendida";
    }

    public void apagar() {
        estado = "apagada";
    }

    public void consulta() {
        if (habitacion.equals("cocina")) {
            System.out.println("¿Cómo está la bombilla de la " + habitacion + "?");
        } else {
            System.out.println("¿Cómo está la bombilla del " + habitacion + "?");
        }
        System.out.println(toString());
    }

    public void entrar(String accion) {
        if (habitacion.equals("cocina")) {
            System.out.println("Voy a la " + habitacion + " " + accion + ".");
        } else {
            System.out.println("Voy al" + habitacion + " " + accion + ".");
        }
        estado = "encendida";
    }

    public void salir() {
        if (habitacion.equals("cocina")) {
            System.out.println("Salgo de la " + habitacion + ".");
        } else {
            System.out.println("Salgo del " + habitacion + ".");
        }
        estado = "apagada";
    }

    public static void lunaLlena(BombillaCasa[] habitaciones) {
        if (lunaLlena) {
            System.out.println("Esta noche hay luna llena, no hace falta tener encendida la luz del portal.");
            for (int i = 0; i < habitaciones.length; i++) {
                if (habitaciones[i].habitacion.equals("portal")) {
                    habitaciones[i].estado = "apagada";
                }
            }
        }
    }

    public static void saltoFusibles(BombillaCasa[] habitaciones) {
        System.out.println("Voy a poner a funcionar el lavaplatos y la lavadora. Dejaré encendida la luz de la cocina. A los 20 minutos...¿Qué ha ocurrido no hay luz? Habrán saltado los fusibles");
        fusibles = false;
        for (BombillaCasa bombillaCasa : habitaciones) {
            System.out.println("Luz de la habitación " + bombillaCasa.habitacion + " se apagó repentinamente");
        }
    }

    public static void reparaFusibles(BombillaCasa[] habitaciones) {
        System.out.println("Iré a reparar los fusibles");
        System.out.println("Ya está. Se hizo la luz");
        fusibles = true;
        for (BombillaCasa bombillaCasa : habitaciones) {
            System.out.println("Antes del apagón la bombilla de la habitación: -" + bombillaCasa.habitacion + " estaba " + bombillaCasa.estado);
        }
    }
}
