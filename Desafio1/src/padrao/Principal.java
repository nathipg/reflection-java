package padrao;

import org.simpleframework.xml.*;
import org.simpleframework.xml.core.*;
import classes.*;
import java.io.File;

/**
 *
 * @author nathipg e laionel lellis
 */
public class Principal {
    public static void main(String[] args) {
        try {
            Serializer serializer = new Persister();
            DesenhoAnimado da = new DesenhoAnimado();
            da.setId(1);
            da.setNome("Gintama");
            da.setGenero("Comédia");
            da.setFaixaEtaria("Shounen");
            da.setAnoLancamento(2006);
            da.setArcos(60);
            da.setTotalEpisodios(353);
            da.setSinopse("Sakata Gintoki é um viciado em doces, um preguiçoso ex-samurai e líder do Yorozuya Gin-chan, uma organização que faz qualquer tipo de trabalho por dinheiro. Esta organização ainda possui outros dois integrantes: Shimura Shinpachi, um garoto otaku e correto que almeja ser um samurai, e Kagura, uma garota comilona que faz parte do clã Yato, o mais poderoso do universo. Os três integrantes do Yorozuya entram em grandes confusões e aceitam qualquer trabalho para fazer do mundo um lugar melhor. Gintama faz paródias de vários animes que tiveram seu mangá publicado na revista japonesa Shounen Jump, e também, faz paródias de celebridades, acontecimentos históricos, etc. Também retrata de uma forma cômica e muitas vezes emocionante os acontecimentos do turbulento fim do Tokugawa Bakufu. Além de trazer muitas paródias e comédia, Gintama também traz arcos repletos de ação e emoção.");

            File result = new File("desenhoanimado.xml");
            serializer.write(da, result);
       } catch (Exception e) {
            e.printStackTrace();
       }
    }
}
