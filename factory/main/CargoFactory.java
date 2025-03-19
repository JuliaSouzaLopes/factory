package factory.main;

public class CargoFactory {

    public static ICargo obterCargo(String Cargo) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("factory.main.Cargo" + cargo);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Cargo inexistente");
        }
        if (!(objeto instanceof ICargo)) {
            throw new IllegalArgumentException("Cargo inválido");
        }
        return (ICergo) objeto;
    }
}