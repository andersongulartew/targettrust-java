public class Testes {
    public static void main(String[] args) {


        // erro em empo da compilação
        //procurarusuarioPorEmail("emailo@email.com")

        try {
            // codigo que pode lançar exception personalizada
            procurarUsuarioPorEmail("emailo@email.com");
        } catch (UsuarioExistenteException e) {
            System.out.println("excecao personalizada " + e.getMessage());
        }
    }
        public static void procurarUsuarioPorEmail(String email) {

            // procurar no banco de dados....
            boolean existe = true;

                // se encontar ,lança exception
            if(existe){
                throw new UsuarioExistenteException("email");
            }
        }
    }

