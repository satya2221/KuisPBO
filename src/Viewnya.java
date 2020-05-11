import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Viewnya {
    private String username;
    Font font_judul = new Font("SanSerif", Font.PLAIN, 22);
    Font font_penting = new Font("SanSerif", Font.BOLD, 16);
    Font font_isi = new Font("SanSerif", Font.PLAIN, 14);

    JFrame frame = new JFrame("New Aslab & Admin");

    JLabel labLolos = new JLabel("Penilaian");

    JLabel labNama = new JLabel("Nama");
    JLabel labNim = new JLabel("NIM");
    JLabel labNilaiTulis = new JLabel("Nilai Tes tertulis");
    JLabel labNilaiCoding = new JLabel("Nilai Tes Coding");
    JLabel labNilaiWawancara = new JLabel("Nilai Wawancara");
    JLabel labNilaiMicro_or_jar = new JLabel("");

    JLabel LabelNilai = new JLabel("Nilai rata2");
    JLabel rata = new JLabel("");
    JLabel LabStatus = new JLabel("Statusnya");
    JLabel status = new JLabel("");

    JLabel namaHitung = new JLabel("");
    JLabel nimHitung = new JLabel("");
    JLabel tulis = new JLabel("Tertulis");
    JLabel coding = new JLabel("Coding");
    JLabel wawancara = new JLabel("Wawancara");
    JLabel MorJ = new JLabel("");

    JLabel lnilaiT = new JLabel("");
    JLabel lnilaiC = new JLabel("");
    JLabel lnilaiW = new JLabel("");
    JLabel lnilaiMorJ = new JLabel("");

    private JTextField nama = new JTextField();
    private JTextField nim = new JTextField();
    private JTextField nilaiTulis = new JTextField();
    private JTextField nilaiCoding = new JTextField();
    private JTextField nilaiWawancara = new JTextField();
    private JTextField nilaiMicro_or_Jar = new JTextField();

    ButtonGroup btn_group=new ButtonGroup();
    JRadioButton asistenLab = new JRadioButton("Aslab");
    JRadioButton adminLab = new JRadioButton("Admin");

    JButton b_hitung = new JButton("Hitung");
    JButton b_reset = new JButton("Reset");

    public Viewnya() {
        frame.setLayout(null);
        frame.setTitle("Film");
        frame.setSize(900,600);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation (EXIT_ON_CLOSE);


        frame.add(labLolos);
        labLolos.setFont(font_judul);
        labLolos.setBounds(400, 20, 145, 25);

        frame.add(labNama);
        labNama.setFont(font_isi);
        labNama.setBounds(25, 50, 55, 25);
        frame.add(nama);
        nama.setBounds(20,80,380,25);

        frame.add(labNim);
        labNim.setFont(font_isi);
        labNim.setBounds(25, 120, 55, 25);
        frame.add(nim);
        nim.setBounds(20,150,380,25);

        btn_group.add(asistenLab);
        btn_group.add(adminLab);
        frame.add(asistenLab);
        frame.add(adminLab);
        asistenLab.setBounds(50,190,60,25);
        adminLab.setBounds(150,190,60,25);

        frame.add(labNilaiTulis);
        labNilaiTulis.setFont(font_isi);
        labNilaiTulis.setBounds(25, 220, 120, 25);
        frame.add(nilaiTulis);
        nilaiTulis.setBounds(20,250,380,25);

        frame.add(labNilaiCoding);
        labNilaiCoding.setFont(font_isi);
        labNilaiCoding.setBounds(25, 290, 120, 25);
        frame.add(nilaiCoding);
        nilaiCoding.setBounds(20,320,380,25);

        frame.add(labNilaiWawancara);
        labNilaiWawancara.setFont(font_isi);
        labNilaiWawancara.setBounds(25, 360, 120, 25);
        frame.add(nilaiWawancara);
        nilaiWawancara.setBounds(20,390,380,25);

        frame.add(labNilaiMicro_or_jar);
        labNilaiMicro_or_jar.setFont(font_isi);
        labNilaiMicro_or_jar.setBounds(25, 430, 120, 25);
        frame.add(nilaiMicro_or_Jar);
        nilaiMicro_or_Jar.setBounds(20,460,380,25);

        frame.add(b_hitung);
        b_hitung.setBounds(150,510,80,25);

        frame.add(namaHitung);
        namaHitung.setFont(font_penting);
        namaHitung.setBounds(620, 80, 200, 25);

        frame.add(nimHitung);
        nimHitung.setFont(font_penting);
        nimHitung.setBounds(620, 120, 200, 25);

        frame.add(tulis);
        tulis.setFont(font_penting);
        tulis.setBounds(630, 160, 200, 25);
        frame.add(lnilaiT);
        lnilaiT.setFont(font_isi);
        lnilaiT.setBounds(650, 180, 200, 25);

        frame.add(coding);
        coding.setFont(font_penting);
        coding.setBounds(630, 220, 200, 25);
        frame.add(lnilaiC);
        lnilaiC.setFont(font_isi);
        lnilaiC.setBounds(650, 240, 200, 25);

        frame.add(wawancara);
        wawancara.setFont(font_penting);
        wawancara.setBounds(620, 280, 200, 25);
        frame.add(lnilaiW);
        lnilaiW.setFont(font_isi);
        lnilaiW.setBounds(650, 300, 200, 25);

        frame.add(MorJ);
        MorJ.setFont(font_penting);
        MorJ.setBounds(610, 340, 200, 25);
        frame.add(lnilaiMorJ);
        lnilaiMorJ.setFont(font_isi);
        lnilaiMorJ.setBounds(650, 360, 200, 25);

        frame.add(LabelNilai);
        LabelNilai.setFont(font_penting);
        LabelNilai.setBounds(630, 400, 120, 25);
        frame.add(rata);
        rata.setFont(font_isi);
        rata.setBounds(650,420,380,25);

        frame.add(LabStatus);
        LabStatus.setFont(font_penting);
        LabStatus.setBounds(630,460,120,25);
        frame.add(status);
        status.setFont(font_isi);
        status.setBounds(650,480,150,25);

        frame.add(b_reset);
        b_reset.setBounds(650,510,80,25);
    }

//    public static void main(String[] args) {
//        new Viewnya();
//    }

    public String getNama() {
        return nama.getText();
    }
    public void setNama(String nama){this.nama.setText(nama);}
    public String getNim() {
        return nim.getText();
    }
    public void setNim(String nim){this.nim.setText(nim);}
    public String getNilaiTulis() {
        return nilaiTulis.getText();
    }
    public void setNilaiT(String nilaiT){this.nilaiTulis.setText(nilaiT);}
    public String getNilaiCoding() {
        return nilaiCoding.getText();
    }
    public void setNilaiC(String nilaiC){this.nilaiCoding.setText(nilaiC);}
    public String getNilaiWawancara() {
        return nilaiWawancara.getText();
    }
    public void setNilaiW(String nilaiW){this.nilaiWawancara.setText(nilaiW);}
    public String getNilaiMicro_or_Jar() {
        return nilaiMicro_or_Jar.getText();
    }
    public void setNilaiMorJ(String nilaiMorJ){this.nilaiMicro_or_Jar.setText(nilaiMorJ);}
}
