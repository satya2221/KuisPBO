import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controllernya implements Hitung {
    Viewnya viewNya;
    public Controllernya(Viewnya viewNya) {
        this.viewNya = viewNya;
        viewNya.asistenLab.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewNya.labNilaiMicro_or_jar.setText("Nilai Microteach");
                viewNya.MorJ.setText("Microteach (Aslab)");
            }
        });
        viewNya.adminLab.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewNya.labNilaiMicro_or_jar.setText("Nilai Jaringan");
                viewNya.MorJ.setText("Jaringan (Admin)");
            }
        });
        viewNya.b_hitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (viewNya.getNama().equals("")||viewNya.getNim().equals("")||viewNya.getNilaiTulis().equals("")||viewNya.getNilaiCoding().equals("")||
                        viewNya.getNilaiWawancara().equals("")||viewNya.getNilaiMicro_or_Jar().equals("")||viewNya.labNilaiMicro_or_jar.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Ada yang kosong");
                }
                else{
                    try{
                        int nilaiTulis =Integer.parseInt(viewNya.getNilaiTulis());
                        int nilaiCoding =Integer.parseInt(viewNya.getNilaiCoding());
                        int nilaiWawancara =Integer.parseInt(viewNya.getNilaiWawancara());
                        int nilaiM_or_J =Integer.parseInt(viewNya.getNilaiMicro_or_Jar());
                        int cek =0;
                        int[] dataAngka = {nilaiTulis, nilaiCoding, nilaiWawancara,nilaiM_or_J};
                        for (int i = 0; i < 4; i++) {
                            if (cekAngka(dataAngka[i])) {
                                cek++;
                            }
                        }
                        if (cek!=4) {
                            throw new IllegalArgumentException("Nilai angka harus 0-100");
                        }
                        else{
                            int total = nilaiTulis+nilaiCoding+nilaiWawancara+nilaiM_or_J;
                            viewNya.rata.setText(Double.toString(hitung(total)));
                            if (hitung(total)>85){
                                viewNya.status.setText("Lolos");
                            }
                            else
                                viewNya.status.setText("gagal");
                        }
                        viewNya.namaHitung.setText(viewNya.getNama());
                        viewNya.nimHitung.setText(viewNya.getNim());
                        viewNya.lnilaiT.setText(viewNya.getNilaiTulis());
                        viewNya.lnilaiC.setText(viewNya.getNilaiCoding());
                        viewNya.lnilaiW.setText(viewNya.getNilaiWawancara());
                        viewNya.lnilaiMorJ.setText(viewNya.getNilaiMicro_or_Jar());
                    } catch (IllegalArgumentException error){
                        JOptionPane.showMessageDialog(null,error.getMessage() );
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                        JOptionPane.showMessageDialog(null, "Input nilai harus integer");
                    }
                }
            }
        });
        viewNya.b_reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewNya.namaHitung.setText("");
                viewNya.nimHitung.setText("");
                viewNya.lnilaiT.setText("");
                viewNya.lnilaiC.setText("");
                viewNya.lnilaiW.setText("");
                viewNya.lnilaiMorJ.setText("");
                viewNya.asistenLab.setSelected(false);
                viewNya.adminLab.setSelected(false);
                viewNya.labNilaiMicro_or_jar.setText("");
                viewNya.MorJ.setText("");
                viewNya.rata.setText("");
                viewNya.status.setText("");
                viewNya.setNama("");
                viewNya.setNim("");
                viewNya.setNilaiT("");
                viewNya.setNilaiC("");
                viewNya.setNilaiW("");
                viewNya.setNilaiMorJ("");
            }
        });
    }
    public boolean cekAngka(int angka){
        if (angka >=0 && angka <=100) {
            return true;
        }
        return false;
    }
    @Override
    public double hitung(int angka) {
    return angka/4;
    }
}
