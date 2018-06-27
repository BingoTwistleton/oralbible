package oralbible.kairos.com.oralbible;

public class MainActivity extends android.support.v7.app.AppCompatActivity {

    public static final String FILETITLE = "oralbible.kairos.com.oralbible.FILETITLE";
    public static final String AUDIO_FILE = "oralbible.kairos.com.oralbible.AUDIO_FILE";

    @Override
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the user taps the Send button
     */
    public void sendMessage(android.view.View view) {

        android.content.Intent intent = new android.content.Intent(this, PlaySound.class);

        /*
        script process.pl to generate else/if sequence and buttons in activity_main.xml
                 is in /home/brad/kairosrecordings
        */


        if (view.getId() == R.id.button01) {
            String message = "Creation";
            String filename = "a01_creation_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button02){
            String message = "Adam and Eve";
            String filename = "a02_adamandeve_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }

        else if (view.getId() == R.id.button03){
            String message = "The Fall";
            String filename = "a03_fall_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button04){
            String message = "Cain and Abel";
            String filename = "a04_cainabel_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button05){
            String message = "The Spirit World";
            String filename = "a05_spiritworld_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button06){
            String message = "Noah";
            String filename = "a06_noah_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button07){
            String message = "Abraham";
            String filename = "a07_abraham_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button08){
            String message = "Abraham and Isaac";
            String filename = "a08_abeisaac_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button09){
            String message = "Jacob and the Blessing";
            String filename = "a09_jacobblessing_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button10){
            String message = "Jacob and Easau Reconcile";
            String filename = "a10_jacobeasaureconcile_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button11){
            String message = "Joseph's Dreams";
            String filename = "a11_josephdreams_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button12){
            String message = "Joseph Rules";
            String filename = "a12_josephrules_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button13){
            String message = "Joseph Reunited";
            String filename = "a13_josephreunited_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button14){
            String message = "The Burning Bush";
            String filename = "a14_burningbush_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button15){
            String message = "Passover";
            String filename = "a15_passover_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button16){
            String message = "The Ten Commandments";
            String filename = "a16_tencommandments_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button17){
            String message = "The Spies";
            String filename = "a17_spies_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button18){
            String message = "Joshua at Jericho";
            String filename = "a18_joshuajericho_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button19){
            String message = "David and Goliath";
            String filename = "a19_davidgoliath_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button20){
            String message = "Elijah";
            String filename = "a20_elijah_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button21){
            String message = "Jonah";
            String filename = "a21_jonah_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button22){
            String message = "Josiah";
            String filename = "a22_josiah_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button23){
            String message = "Daniel";
            String filename = "a23_daniel_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button24){
            String message = "Shadrach";
            String filename = "a24_shadrach_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button25){
            String message = "Nehemiah";
            String filename = "a25_nehemiah_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button26){
            String message = "Jesus' Birth";
            String filename = "a26_jesusbirth_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button27){
            String message = "Jesus' Baptism";
            String filename = "a27_jesusbaptism_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button28){
            String message = "The Paralytic";
            String filename = "a28_paralytic_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button29){
            String message = "The Man With a Withered Hand";
            String filename = "a29_withered_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button30){
            String message = "Jesus Calms the Storm";
            String filename = "a30_calmsstorm_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button31){
            String message = "Nicodemus";
            String filename = "a31_nicodemus_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button32){
            String message = "The Woman at the Well";
            String filename = "a32_womanatwell_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button33){
            String message = "The Good Samaritan";
            String filename = "a33_goodsam_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button34){
            String message = "Hypocrisy";
            String filename = "a34_hypocrisy_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button35){
            String message = "Feeding 5000";
            String filename = "a35_feeding5000_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button37){
            String message = "Mary and Martha";
            String filename = "a37_marymartha_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button38){
            String message = "The Prodigal Son";
            String filename = "a38_prodigal_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button39){
            String message = "Lazarus and the Rich Man";
            String filename = "a39_lazarusrichman_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button40){
            String message = "The Tax Collector";
            String filename = "a40_taxcollector_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button41){
            String message = "Raising Lazarus";
            String filename = "a41_raisinglazarus_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button42){
            String message = "The Rich Ruler";
            String filename = "a42_richruler_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button43){
            String message = "Zaccheus";
            String filename = "a43_zaccheus_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button44){
            String message = "Bartimaeus";
            String filename = "a44_bartimaeus_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button45){
            String message = "The Triumphal Entry";
            String filename = "a45_triumphalentry_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button46){
            String message = "Mary Anoints Jesus";
            String filename = "a46_maryanointsjesus_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button47){
            String message = "The Last Supper";
            String filename = "a47_lastsupper_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button48){
            String message = "Jesus' Arrest";
            String filename = "a48_jesusarrest_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button49){
            String message = "The Crucifixion";
            String filename = "a49_crucifixion_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button50){
            String message = "The Resurrection";
            String filename = "a50_resurrection_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button51){
            String message = "Pentecost";
            String filename = "a51_pentecost_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button52){
            String message = "Beautiful Gate";
            String filename = "a52_beautifulgate_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button53){
            String message = "Peter and John on Trial";
            String filename = "a53_peterjohntrial_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button54){
            String message = "Ananias and Saffira";
            String filename = "a54_ananiassaffira_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button55){
            String message = "Stephen";
            String filename = "a55_stephen_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button56){
            String message = "Simon the Magician";
            String filename = "a56_simonmagician_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button57){
            String message = "Peter and Cornelius";
            String filename = "a57_petercornelius_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button58){
            String message = "The Philippian Jailer";
            String filename = "a58_philippianjailer_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button59){
            String message = "The Unknown God";
            String filename = "a59_unknowngod_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button60){
            String message = "Paul in Ephesus";
            String filename = "a60_paulinephesus_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


        else if (view.getId() == R.id.button61){
            String message = "Revelation";
            String filename = "a61_revelation_mandingo_en_2011";
            intent.putExtra(FILETITLE, message);
            intent.putExtra(AUDIO_FILE, filename);
            startActivity(intent);
        }


    }
}
