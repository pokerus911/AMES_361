package mainProgram;

import java.util.ArrayList;
import java.util.HashMap;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CharacterImages {
	public ArrayList<Protagonist> charImages;

	public CharacterImages() {
		charImages = new ArrayList<Protagonist>();
		initializeImages();
	}

	private void initializeImages() {
		charImages.add(new Protagonist("Black", "Short", "Mikasa Ackerman", false, new ImageView(new Image(getClass().getResourceAsStream("/images/MikasaAckerman.png")))));
		charImages.add(new Protagonist("Black", "Medium", "Francesca Lucchini", false, new ImageView(new Image(getClass().getResourceAsStream("/images/FrancescaLucchini.jpg")))));
		charImages.add(new Protagonist("Black", "Long", "Homura Akemi", false, new ImageView(new Image(getClass().getResourceAsStream("/images/HomuraAkemiNoGlasses.png")))));
		charImages.add(new Protagonist("Black", "Short", "Asagiri Shiori", true, new ImageView(new Image(getClass().getResourceAsStream("/images/AsagiriShiori.jpg")))));
		charImages.add(new Protagonist("Black", "Medium", "Mayuko", true, new ImageView(new Image(getClass().getResourceAsStream("/images/Mayuko.jpg")))));
		charImages.add(new Protagonist("Black", "Long", "Homura Akemi", true, new ImageView(new Image(getClass().getResourceAsStream("/images/HomuraAkemiGlasses.jpg")))));
		charImages.add(new Protagonist("Blonde", "Short", "Haruna Annaka", false, new ImageView(new Image(getClass().getResourceAsStream("/images/HarunaAnnaka.jpg")))));
		charImages.add(new Protagonist("Blonde", "Medium", "Mami Tomoe", false, new ImageView(new Image(getClass().getResourceAsStream("/images/MamiTomoe.jpg")))));
		charImages.add(new Protagonist("Blonde", "Long", "Shiina Mashiro", false, new ImageView(new Image(getClass().getResourceAsStream("/images/ShiinaMashiro.jpg")))));
		charImages.add(new Protagonist("Blonde", "Short", "Mayura Momouchi", true, new ImageView(new Image(getClass().getResourceAsStream("/images/MayuraMomouchi.jpg")))));
		charImages.add(new Protagonist("Blonde", "Medium", "Aya Oono", true, new ImageView(new Image(getClass().getResourceAsStream("/images/AyaOono.jpeg")))));
		charImages.add(new Protagonist("Blonde", "Long", "Mitsuki Sonoda", true, new ImageView(new Image(getClass().getResourceAsStream("/images/MitsukiSonoda.jpg")))));
		charImages.add(new Protagonist("Blue", "Short", "Miki Sayaka", false, new ImageView(new Image(getClass().getResourceAsStream("/images/MikiSayaka.png")))));
		charImages.add(new Protagonist("Blue", "Medium", "Sakuya Kiryuu", false, new ImageView(new Image(getClass().getResourceAsStream("/images/SakuyaKiryuu.jpg")))));
		charImages.add(new Protagonist("Blue", "Long", "Konata Izumi", false, new ImageView(new Image(getClass().getResourceAsStream("/images/KonataIzumi.gif")))));
		charImages.add(new Protagonist("Blue", "Short", "Shizune Hakamichi", true, new ImageView(new Image(getClass().getResourceAsStream("/images/ShizuneHakamichi.jpg")))));
		charImages.add(new Protagonist("Blue", "Medium", "Tsurumi Chiriko", true, new ImageView(new Image(getClass().getResourceAsStream("/images/TsurumiChiriko.jpg")))));
		charImages.add(new Protagonist("Blue", "Long", "Komachi Machida", true, new ImageView(new Image(getClass().getResourceAsStream("/images/KomachiMachida.jpg")))));
		charImages.add(new Protagonist("Brown", "Short", "Misaka Mikoto", false, new ImageView(new Image(getClass().getResourceAsStream("/images/MisakaMikoto.png")))));
		charImages.add(new Protagonist("Brown", "Medium", "Asuka Langley Soryu", false, new ImageView(new Image(getClass().getResourceAsStream("/images/AsukaLangleySoryu.png")))));
		charImages.add(new Protagonist("Brown", "Long", "Holo", false, new ImageView(new Image(getClass().getResourceAsStream("/images/Holo.jpg")))));
		charImages.add(new Protagonist("Brown", "Short", "Nodoka Manabe", true, new ImageView(new Image(getClass().getResourceAsStream("/images/NodokaManabe.jpg")))));
		charImages.add(new Protagonist("Brown", "Medium", "Rika Shiguma", true, new ImageView(new Image(getClass().getResourceAsStream("/images/RikaShiguma.jpg")))));
		charImages.add(new Protagonist("Brown", "Long", "Yutori Takamagahara", true, new ImageView(new Image(getClass().getResourceAsStream("/images/YutoriTakamagahara.jpg")))));
		charImages.add(new Protagonist("Green", "Short", "Aiko Kudou", false, new ImageView(new Image(getClass().getResourceAsStream("/images/AikoKudou.png")))));
		charImages.add(new Protagonist("Green", "Medium", "Hitomi Shizuki", false, new ImageView(new Image(getClass().getResourceAsStream("/images/HitomiShizuki.jpg")))));
		charImages.add(new Protagonist("Green", "Long", "Hakko", false, new ImageView(new Image(getClass().getResourceAsStream("/images/Hakko.jpg")))));
		charImages.add(new Protagonist("Green", "Short", "Retasu Midorikawa", true, new ImageView(new Image(getClass().getResourceAsStream("/images/RetasuMidorikawa.jpg")))));
		charImages.add(new Protagonist("Green", "Medium", "Ritsuko Kanzaki", true, new ImageView(new Image(getClass().getResourceAsStream("/images/RitsukoKanzaki.jpg")))));
		charImages.add(new Protagonist("Green", "Long", "Rin Asogi", true, new ImageView(new Image(getClass().getResourceAsStream("/images/RinAsogi.jpg")))));
		charImages.add(new Protagonist("Pink", "Short", "Madoka Kaname", false, new ImageView(new Image(getClass().getResourceAsStream("/images/MadokaKaname.png")))));
		charImages.add(new Protagonist("Pink", "Medium", "Nanami Oda", false, new ImageView(new Image(getClass().getResourceAsStream("/images/NanamiOda.png")))));
		charImages.add(new Protagonist("Pink", "Long", "Yuno Gasai", false, new ImageView(new Image(getClass().getResourceAsStream("/images/YunoGasai.jpg")))));
		charImages.add(new Protagonist("Pink", "Short", "Mirai Kuriyama", true, new ImageView(new Image(getClass().getResourceAsStream("/images/MiraiKuriyama.png")))));
		charImages.add(new Protagonist("Pink", "Medium", "Saya Takagi", true, new ImageView(new Image(getClass().getResourceAsStream("/images/SayaTakagi.jpg")))));
		charImages.add(new Protagonist("Pink", "Long", "Miyuki Takara", true, new ImageView(new Image(getClass().getResourceAsStream("/images/MiyukiTakara.jpg")))));
		charImages.add(new Protagonist("Purple", "Short", "Neptune", false, new ImageView(new Image(getClass().getResourceAsStream("/images/Neptune.png")))));
		charImages.add(new Protagonist("Purple", "Medium", "Kotomi Ichinose", false, new ImageView(new Image(getClass().getResourceAsStream("/images/KotomiIchinose.jpg")))));
		charImages.add(new Protagonist("Purple", "Long", "Sasami Sasasegawa", false, new ImageView(new Image(getClass().getResourceAsStream("/images/SasamiSasasegawa.jpg")))));
		charImages.add(new Protagonist("Purple", "Short", "Maya Sawai", true, new ImageView(new Image(getClass().getResourceAsStream("/images/MayaSawai.jpg")))));
		charImages.add(new Protagonist("Purple", "Medium", "Mii Fujibakama", true, new ImageView(new Image(getClass().getResourceAsStream("/images/MiiFujibakama.jpg")))));
		charImages.add(new Protagonist("Purple", "Long", "Madeleine", true, new ImageView(new Image(getClass().getResourceAsStream("/images/Madeleine.jpg")))));
		charImages.add(new Protagonist("Red", "Short", "Aoi Sakurai", false, new ImageView(new Image(getClass().getResourceAsStream("/images/AoiSakurai.jpg")))));
		charImages.add(new Protagonist("Red", "Medium", "Yuiko Enomoto", false, new ImageView(new Image(getClass().getResourceAsStream("/images/YuikoEnomoto.png")))));
		charImages.add(new Protagonist("Red", "Long", "Shana", false, new ImageView(new Image(getClass().getResourceAsStream("/images/Shana.jpg")))));
		charImages.add(new Protagonist("Red", "Short", "Miyoko Noyama", true, new ImageView(new Image(getClass().getResourceAsStream("/images/MiyokoNoyama.jpg")))));
		charImages.add(new Protagonist("Red", "Medium", "Touzaemon Hayami", true, new ImageView(new Image(getClass().getResourceAsStream("/images/TouzaemonHayami.png")))));
		charImages.add(new Protagonist("Red", "Long", "Huang Mingmei", true, new ImageView(new Image(getClass().getResourceAsStream("/images/HuangMingmei.jpg")))));
		charImages.add(new Protagonist("Silver", "Short", "Nozomu Ezomori", false, new ImageView(new Image(getClass().getResourceAsStream("/images/NozomuEzomori.jpg")))));
		charImages.add(new Protagonist("Silver", "Medium", "Hatoko Kushikawa", false, new ImageView(new Image(getClass().getResourceAsStream("/images/HatokoKushikawa.jpg")))));
		charImages.add(new Protagonist("Silver", "Long", "Meiko \"Menma\" Honma", false, new ImageView(new Image(getClass().getResourceAsStream("/images/MeikoMenmaHonma.jpg")))));
		charImages.add(new Protagonist("Silver", "Short", "Miharu Yoshitome", true, new ImageView(new Image(getClass().getResourceAsStream("/images/MiharuYoshitome.png")))));
		charImages.add(new Protagonist("Silver", "Medium", "Reine Murasame", true, new ImageView(new Image(getClass().getResourceAsStream("/images/ReineMurasame.jpg")))));
		charImages.add(new Protagonist("Silver", "Long", "Shiori Shinozaki", true, new ImageView(new Image(getClass().getResourceAsStream("/images/ShioriShinozaki.jpg")))));
	}

	public ImageView getSimilarImage(Protagonist myChar) {
		for(Protagonist protag : charImages){
			if(protag.equals(myChar))
				return protag.getPicture();
		}
		return new ImageView();
	}
}
