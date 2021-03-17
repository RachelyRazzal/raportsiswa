/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampilan;
import java.awt.HeadlessException;
import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import koneksi.koneksi;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class nilaiuas extends javax.swing.JFrame {
    private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;
    

    /**
     * Creates new form nilaiuas
     */
    public nilaiuas() {
        initComponents();
        aktif();
        kosong();
        datatable();
        tampil_comboguru();
    }
    
    void aktif() {
        tnoinduk.requestFocus();
    }
    
    void kosong(){
        tnoinduk.setText("");
        tnama_murid.setText("");
        ckelas_ajaran.setSelectedIndex(0);
        csemester.setSelectedIndex(0);
        cid_guru.setSelectedIndex(0);
        tnama_guru.setText("");
        tpagama.setText("");
        tkagama.setText("");
        tppkn.setText("");
        tkpkn.setText("");
        tpindo.setText("");
        tkindo.setText("");
        tpmtk.setText("");
        tkmtk.setText("");
        tpipa.setText("");
        tkipa.setText("");
        tpips.setText("");
        tkips.setText("");
        tpseni.setText("");
        tkseni.setText("");
        tpjas.setText("");
        tkjas.setText("");
        tpsunda.setText("");
        tksunda.setText("");
        tjump.setText("");
        tjumk.setText("");
        tratap.setText("");
        tratak.setText("");
        tprep.setText("");
        tprek.setText("");
        tket.setText("");
        tcari.setText("");
    }
    
     protected void datatable() {
        Object [] baris = {"Nomor Induk Siswa","Nama Siswa","Kelas/Tahun Ajaran","Semester","ID Walas","Nama Walas","P_Agama","K_Agama","P_Pkn","K_Pkn","P_B.Indo","K_B.Indo","P_Mtk","K_Mtk","P_IPA","K_IPA","P_IPS","K_IPS","P_Seni","K_Seni","P_Jasmani","K_Jasmani","P_B.Sun","K_B.Sun","P_Jumlah","K_Jumlah","P_Rata-rata","K_Rata-Rata","P_Predikat","K_Predikat","Keterangan"};
        tabmode = new DefaultTableModel(null, baris);
        tabeluas.setModel(tabmode);
        String sql = "select * from uas";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
               String a = hasil.getString("id_murid");
               String b = hasil.getString("nama_murid");
               String c = hasil.getString("kelas_ajaran");
               String d = hasil.getString("semester");
               String e = hasil.getString("id_guru");
               String f = hasil.getString("nama_guru");
               String g = hasil.getString("p_agama");
               String h = hasil.getString("k_agama");
               String i = hasil.getString("p_pkn");
               String j = hasil.getString("k_pkn");
               String k = hasil.getString("p_indo");
               String l = hasil.getString("k_indo");
               String m = hasil.getString("p_mtk");
               String n = hasil.getString("k_mtk");
               String o = hasil.getString("p_ipa");
               String p = hasil.getString("k_ipa");
               String q = hasil.getString("p_ips");
               String r = hasil.getString("k_ips");
               String s = hasil.getString("p_seni");
               String t = hasil.getString("k_seni");
               String u = hasil.getString("p_jas");
               String v = hasil.getString("k_jas");
               String w = hasil.getString("p_sunda");
               String x = hasil.getString("k_sunda");
               String y = hasil.getString("p_jumlah");
               String z = hasil.getString("k_jumlah");
               String aa = hasil.getString("p_rata");
               String ab = hasil.getString("k_rata");
               String ac = hasil.getString("p_pre");
               String ad = hasil.getString("k_pre");
               String ae = hasil.getString("ket");
               
               String [] data = {a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,aa,ab,ac,ad,ae};
               tabmode.addRow(data); 
            }
        } catch (Exception e) {}
     }

     void tampil_comboguru() {
        String sql = "select id from guru order by id asc";
        
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                Object [] obj = new Object [1];
                obj[0] = hasil.getString("id");
                cid_guru.addItem((String) obj[0]);
            }
        }catch (Exception e) {}
    }
    
     void tampil_guru() {
        String sql = "select nama from guru where id='"+cid_guru.getSelectedItem()+"'";
        
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                Object [] obj = new Object [1];
                obj[0] = hasil.getString("nama");
                
                tnama_guru.setText((String)obj[0]);
            }
        }catch (Exception e) {}
    }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tnoinduk = new javax.swing.JTextField();
        tnama_murid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ckelas_ajaran = new javax.swing.JComboBox<>();
        csemester = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tnama_guru = new javax.swing.JTextField();
        cid_guru = new javax.swing.JComboBox<>();
        bcari_murid = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jTextField49 = new javax.swing.JTextField();
        jTextField50 = new javax.swing.JTextField();
        jPanel34 = new javax.swing.JPanel();
        jTextField51 = new javax.swing.JTextField();
        jTextField52 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        tpagama = new javax.swing.JTextField();
        tkagama = new javax.swing.JTextField();
        tkpkn = new javax.swing.JTextField();
        tppkn = new javax.swing.JTextField();
        tpmtk = new javax.swing.JTextField();
        tkindo = new javax.swing.JTextField();
        tkmtk = new javax.swing.JTextField();
        tpindo = new javax.swing.JTextField();
        tpipa = new javax.swing.JTextField();
        tkipa = new javax.swing.JTextField();
        tpips = new javax.swing.JTextField();
        tkips = new javax.swing.JTextField();
        tpseni = new javax.swing.JTextField();
        tkseni = new javax.swing.JTextField();
        tpjas = new javax.swing.JTextField();
        tkjas = new javax.swing.JTextField();
        tpsunda = new javax.swing.JTextField();
        tksunda = new javax.swing.JTextField();
        bsave = new javax.swing.JButton();
        bedit = new javax.swing.JButton();
        bclear = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        tcari = new javax.swing.JTextField();
        bcari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeluas = new javax.swing.JTable();
        jPanel19 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        bdel = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tket = new javax.swing.JTextField();
        tjump = new javax.swing.JTextField();
        tjumk = new javax.swing.JTextField();
        tratap = new javax.swing.JTextField();
        tratak = new javax.swing.JTextField();
        tprep = new javax.swing.JTextField();
        tprek = new javax.swing.JTextField();
        bhitung = new javax.swing.JButton();
        bprint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel2.setText("Nama Murid");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel3.setText("Nomor Induk Murid");

        tnoinduk.setBackground(new java.awt.Color(204, 255, 204));
        tnoinduk.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        tnama_murid.setBackground(new java.awt.Color(204, 255, 204));
        tnama_murid.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel4.setText("Kelas / Tahun Ajaran");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel5.setText("Semester");

        ckelas_ajaran.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        ckelas_ajaran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "I/2014-2015", "II/2015-2016", "III/2016-2017", "IV/2017-2018", "V/2018-2019", "VI/2019-2020" }));

        csemester.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        csemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GANJIL", "GENAP" }));

        jLabel32.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel32.setText("ID Guru");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel7.setText("Nama Guru");

        tnama_guru.setBackground(new java.awt.Color(204, 255, 204));
        tnama_guru.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        cid_guru.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        cid_guru.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ">PILIH ID GURU<" }));
        cid_guru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cid_guruActionPerformed(evt);
            }
        });

        bcari_murid.setBackground(new java.awt.Color(0, 255, 0));
        bcari_murid.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        bcari_murid.setText("CARI");
        bcari_murid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcari_muridActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(42, 42, 42)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tnoinduk, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                    .addComponent(tnama_murid))
                .addGap(36, 36, 36)
                .addComponent(bcari_murid)
                .addGap(57, 57, 57)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(40, 40, 40)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ckelas_ajaran, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(csemester, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cid_guru, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tnama_guru, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ckelas_ajaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tnoinduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(cid_guru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcari_murid)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(csemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tnama_murid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(tnama_guru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel9.setText("PENGETAHUAN DAN KETERAMPILAN");

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel10.setText("(KKM SATUAN PENDIDIKAN = 68)");

        jPanel14.setBackground(new java.awt.Color(0, 255, 0));
        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel11.setText("Muatan Pelajaran");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel11)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(24, 24, 24))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setPreferredSize(new java.awt.Dimension(2, 50));

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel18.setText("Bahasa Indonesia");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(20, 20, 20))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setPreferredSize(new java.awt.Dimension(2, 50));

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel19.setText("Pendidikan Agama dan Budi Pekerti");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(20, 20, 20))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setPreferredSize(new java.awt.Dimension(2, 50));

        jLabel21.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel21.setText("Matematika");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(20, 20, 20))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setPreferredSize(new java.awt.Dimension(2, 50));

        jLabel22.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel22.setText("Ilmu Pengetahuan Alam");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(20, 20, 20))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.setPreferredSize(new java.awt.Dimension(2, 50));

        jLabel23.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel23.setText("Ilmu Pengetahuan Sosial");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(20, 20, 20))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.setPreferredSize(new java.awt.Dimension(2, 50));

        jLabel24.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel24.setText("Seni Budaya dan Prakarya");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(20, 20, 20))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel13.setPreferredSize(new java.awt.Dimension(2, 50));

        jLabel25.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel25.setText("Pend. Jasmani, Olahraga, dan Kesehatan");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addGap(20, 20, 20))
        );

        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel17.setPreferredSize(new java.awt.Dimension(2, 50));

        jLabel26.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel26.setText("Bahasa Sunda");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addGap(20, 20, 20))
        );

        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel18.setPreferredSize(new java.awt.Dimension(2, 50));

        jLabel27.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel27.setText("Pend. Pancasila dan Kewarganegaraan");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addGap(20, 20, 20))
        );

        jPanel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel33.setPreferredSize(new java.awt.Dimension(2, 50));

        jTextField49.setBackground(new java.awt.Color(204, 255, 204));
        jTextField49.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        jTextField50.setBackground(new java.awt.Color(204, 255, 204));
        jTextField50.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel34.setPreferredSize(new java.awt.Dimension(2, 50));

        jTextField51.setBackground(new java.awt.Color(204, 255, 204));
        jTextField51.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        jTextField52.setBackground(new java.awt.Color(204, 255, 204));
        jTextField52.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 255, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel14.setText("TOTAL");

        jPanel46.setBackground(new java.awt.Color(0, 255, 0));
        jPanel46.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel12.setText("Pengetahuan");

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 255, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel13.setText("Keterampilan");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        tpagama.setBackground(new java.awt.Color(204, 255, 204));
        tpagama.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tpagama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tpagamaKeyPressed(evt);
            }
        });

        tkagama.setBackground(new java.awt.Color(204, 255, 204));
        tkagama.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tkagama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tkagamaKeyPressed(evt);
            }
        });

        tkpkn.setBackground(new java.awt.Color(204, 255, 204));
        tkpkn.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tkpkn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tkpknKeyPressed(evt);
            }
        });

        tppkn.setBackground(new java.awt.Color(204, 255, 204));
        tppkn.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tppkn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tppknKeyPressed(evt);
            }
        });

        tpmtk.setBackground(new java.awt.Color(204, 255, 204));
        tpmtk.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tpmtk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tpmtkKeyPressed(evt);
            }
        });

        tkindo.setBackground(new java.awt.Color(204, 255, 204));
        tkindo.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tkindo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tkindoKeyPressed(evt);
            }
        });

        tkmtk.setBackground(new java.awt.Color(204, 255, 204));
        tkmtk.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tkmtk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tkmtkKeyPressed(evt);
            }
        });

        tpindo.setBackground(new java.awt.Color(204, 255, 204));
        tpindo.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tpindo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tpindoKeyPressed(evt);
            }
        });

        tpipa.setBackground(new java.awt.Color(204, 255, 204));
        tpipa.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tpipa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tpipaKeyPressed(evt);
            }
        });

        tkipa.setBackground(new java.awt.Color(204, 255, 204));
        tkipa.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tkipa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tkipaKeyPressed(evt);
            }
        });

        tpips.setBackground(new java.awt.Color(204, 255, 204));
        tpips.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tpips.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tpipsKeyPressed(evt);
            }
        });

        tkips.setBackground(new java.awt.Color(204, 255, 204));
        tkips.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tkips.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tkipsKeyPressed(evt);
            }
        });

        tpseni.setBackground(new java.awt.Color(204, 255, 204));
        tpseni.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tpseni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tpseniKeyPressed(evt);
            }
        });

        tkseni.setBackground(new java.awt.Color(204, 255, 204));
        tkseni.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tkseni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tkseniKeyPressed(evt);
            }
        });

        tpjas.setBackground(new java.awt.Color(204, 255, 204));
        tpjas.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tpjas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tpjasKeyPressed(evt);
            }
        });

        tkjas.setBackground(new java.awt.Color(204, 255, 204));
        tkjas.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tkjas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tkjasKeyPressed(evt);
            }
        });

        tpsunda.setBackground(new java.awt.Color(204, 255, 204));
        tpsunda.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tpsunda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tpsundaKeyPressed(evt);
            }
        });

        tksunda.setBackground(new java.awt.Color(204, 255, 204));
        tksunda.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tksunda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tksundaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 106, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(tpsunda, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tksunda, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(tpjas, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tkjas, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(tpseni, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tkseni, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(tpips, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tkips, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(tpipa, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tkipa, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(tpmtk, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tkmtk, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(tpagama, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(14, 14, 14)
                            .addComponent(tkagama, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(tppkn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tkpkn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(tpindo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tkindo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tpagama, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tkagama, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tppkn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tkpkn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tpindo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tkindo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tpmtk, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tkmtk, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tkipa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tpipa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tkips, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tpips, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tkseni, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tpseni, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tpjas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tkjas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tksunda, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tpsunda, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(774, 774, 774)
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bsave.setBackground(new java.awt.Color(0, 255, 0));
        bsave.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        bsave.setText("SAVE");
        bsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsaveActionPerformed(evt);
            }
        });

        bedit.setBackground(new java.awt.Color(0, 255, 0));
        bedit.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        bedit.setText("EDIT");
        bedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beditActionPerformed(evt);
            }
        });

        bclear.setBackground(new java.awt.Color(0, 255, 0));
        bclear.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        bclear.setText("CLEAR");
        bclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bclearActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel31.setText("Kata Kunci Pencarian");

        tcari.setBackground(new java.awt.Color(204, 255, 204));
        tcari.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        bcari.setBackground(new java.awt.Color(0, 255, 0));
        bcari.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        bcari.setText("CARI");
        bcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcariActionPerformed(evt);
            }
        });

        tabeluas.setBackground(new java.awt.Color(204, 255, 204));
        tabeluas.setFont(new java.awt.Font("Trebuchet MS", 0, 10)); // NOI18N
        tabeluas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabeluas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeluasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeluas);

        jPanel19.setBackground(new java.awt.Color(0, 255, 0));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel1.setText("NILAI UAS");

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/back.png"))); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(585, 585, 585)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(back))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bdel.setBackground(new java.awt.Color(0, 255, 0));
        bdel.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        bdel.setText("DELETE");
        bdel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdelActionPerformed(evt);
            }
        });

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel15.setText("OUTPUT");

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel16.setText("PENGETAHUAN");

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("JUMLAH");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(33, 33, 33))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jLabel8))
        );

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel17.setText("KETERAMPILAN");

        jPanel23.setBackground(new java.awt.Color(0, 0, 0));
        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel29.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("RATA-RATA");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel29)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jLabel29))
        );

        jPanel24.setBackground(new java.awt.Color(0, 0, 0));
        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel30.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("PREDIKAT");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel30)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel30))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel6.setText("KETERANGAN :");

        tket.setBackground(new java.awt.Color(204, 255, 204));
        tket.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tket, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tjump.setBackground(new java.awt.Color(204, 255, 204));
        tjump.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N

        tjumk.setBackground(new java.awt.Color(204, 255, 204));
        tjumk.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N

        tratap.setBackground(new java.awt.Color(204, 255, 204));
        tratap.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N

        tratak.setBackground(new java.awt.Color(204, 255, 204));
        tratak.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N

        tprep.setBackground(new java.awt.Color(204, 255, 204));
        tprep.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N

        tprek.setBackground(new java.awt.Color(204, 255, 204));
        tprek.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N

        bhitung.setBackground(new java.awt.Color(0, 255, 0));
        bhitung.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        bhitung.setText("HITUNG");
        bhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhitungActionPerformed(evt);
            }
        });
        bhitung.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bhitungKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tjump)
                    .addComponent(tratap)
                    .addComponent(tprep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(tratak, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tprek, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(96, 96, 96))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(tjumk, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bhitung))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(201, 201, 201))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGap(11, 11, 11)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tjump, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tjumk, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bhitung)))
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tratap, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tratak, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tprep, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tprek, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bprint.setBackground(new java.awt.Color(0, 204, 204));
        bprint.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        bprint.setText("PRINT");
        bprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bprintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addGap(26, 26, 26)
                                .addComponent(tcari, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(bcari))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bsave)
                                .addGap(18, 18, 18)
                                .addComponent(bedit)
                                .addGap(19, 19, 19)
                                .addComponent(bdel)
                                .addGap(18, 18, 18)
                                .addComponent(bclear)
                                .addGap(26, 26, 26)
                                .addComponent(bprint)))
                        .addGap(46, 46, 46))))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bsave)
                            .addComponent(bedit)
                            .addComponent(bdel)
                            .addComponent(bclear)
                            .addComponent(bprint))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31)
                            .addComponent(bcari))
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bcari_muridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcari_muridActionPerformed
        // TODO add your handling code here:
        String sql = "select * from murid where noinduk = '"+tnoinduk.getText()+"'";
        
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String a = hasil.getString("nama");
                
                tnama_murid.setText(a);
                
                tnama_murid.setEnabled(false);
            }
        } catch (Exception e) {}
    }//GEN-LAST:event_bcari_muridActionPerformed

    private void cid_guruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cid_guruActionPerformed
        // TODO add your handling code here:
        tampil_guru();
    }//GEN-LAST:event_cid_guruActionPerformed

    private void tpagamaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tpagamaKeyPressed
        // TODO add your handling code here:
        int kode=evt.getKeyCode();
                   if(kode==evt.VK_ENTER)
                       tppkn.requestFocus();
    }//GEN-LAST:event_tpagamaKeyPressed

    private void tppknKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tppknKeyPressed
        // TODO add your handling code here:
        int kode=evt.getKeyCode();
                   if(kode==evt.VK_ENTER)
                       tpindo.requestFocus();
    }//GEN-LAST:event_tppknKeyPressed

    private void tpindoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tpindoKeyPressed
        // TODO add your handling code here:
        int kode=evt.getKeyCode();
                   if(kode==evt.VK_ENTER)
                       tpmtk.requestFocus();
    }//GEN-LAST:event_tpindoKeyPressed

    private void tpmtkKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tpmtkKeyPressed
        // TODO add your handling code here:
        int kode=evt.getKeyCode();
                   if(kode==evt.VK_ENTER)
                       tpipa.requestFocus();
    }//GEN-LAST:event_tpmtkKeyPressed

    private void tpipaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tpipaKeyPressed
        // TODO add your handling code here:
        int kode=evt.getKeyCode();
                   if(kode==evt.VK_ENTER)
                       tpips.requestFocus();
    }//GEN-LAST:event_tpipaKeyPressed

    private void tpipsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tpipsKeyPressed
        // TODO add your handling code here:
        int kode=evt.getKeyCode();
                   if(kode==evt.VK_ENTER)
                       tpseni.requestFocus();
    }//GEN-LAST:event_tpipsKeyPressed

    private void tpseniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tpseniKeyPressed
        // TODO add your handling code here:
        int kode=evt.getKeyCode();
                   if(kode==evt.VK_ENTER)
                       tpjas.requestFocus();
    }//GEN-LAST:event_tpseniKeyPressed

    private void tpjasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tpjasKeyPressed
        // TODO add your handling code here:
        int kode=evt.getKeyCode();
                   if(kode==evt.VK_ENTER)
                       tpsunda.requestFocus();
    }//GEN-LAST:event_tpjasKeyPressed

    private void tpsundaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tpsundaKeyPressed
        // TODO add your handling code here:
        int kode=evt.getKeyCode();
                   if(kode==evt.VK_ENTER)
                       tkagama.requestFocus();
    }//GEN-LAST:event_tpsundaKeyPressed

    private void tkagamaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tkagamaKeyPressed
        // TODO add your handling code here:
        int kode=evt.getKeyCode();
                   if(kode==evt.VK_ENTER)
                       tkpkn.requestFocus();
    }//GEN-LAST:event_tkagamaKeyPressed

    private void tkpknKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tkpknKeyPressed
        // TODO add your handling code here:
        int kode=evt.getKeyCode();
                   if(kode==evt.VK_ENTER)
                       tkindo.requestFocus();
    }//GEN-LAST:event_tkpknKeyPressed

    private void tkindoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tkindoKeyPressed
        // TODO add your handling code here:
        int kode=evt.getKeyCode();
                   if(kode==evt.VK_ENTER)
                       tkmtk.requestFocus();
    }//GEN-LAST:event_tkindoKeyPressed

    private void tkmtkKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tkmtkKeyPressed
        // TODO add your handling code here:
        int kode=evt.getKeyCode();
                   if(kode==evt.VK_ENTER)
                       tkipa.requestFocus();
    }//GEN-LAST:event_tkmtkKeyPressed

    private void tkipaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tkipaKeyPressed
        // TODO add your handling code here:
        int kode=evt.getKeyCode();
                   if(kode==evt.VK_ENTER)
                       tkips.requestFocus();
    }//GEN-LAST:event_tkipaKeyPressed

    private void tkipsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tkipsKeyPressed
        // TODO add your handling code here:
        int kode=evt.getKeyCode();
                   if(kode==evt.VK_ENTER)
                       tkseni.requestFocus();
    }//GEN-LAST:event_tkipsKeyPressed

    private void tkseniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tkseniKeyPressed
        // TODO add your handling code here:
        int kode=evt.getKeyCode();
                   if(kode==evt.VK_ENTER)
                       tkjas.requestFocus();
    }//GEN-LAST:event_tkseniKeyPressed

    private void tkjasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tkjasKeyPressed
        // TODO add your handling code here:
        int kode=evt.getKeyCode();
                   if(kode==evt.VK_ENTER)
                       tksunda.requestFocus();
    }//GEN-LAST:event_tkjasKeyPressed

    private void tksundaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tksundaKeyPressed
        // TODO add your handling code here:
        int kode=evt.getKeyCode();
                   if(kode==evt.VK_ENTER)
                       bhitung.requestFocus();
    }//GEN-LAST:event_tksundaKeyPressed

    private void bhitungKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bhitungKeyPressed
        // TODO add your handling code here:
        int kode=evt.getKeyCode();
            if(kode==evt.VK_ENTER) {
        int agama = Integer.parseInt(tpagama.getText());
        int pkn =  Integer.parseInt(tppkn.getText());
        int indo = Integer.parseInt(tpindo.getText());
        int mtk =  Integer.parseInt(tpmtk.getText());
        int ipa =  Integer.parseInt(tpipa.getText());
        int ips = Integer.parseInt(tpips.getText());
        int seni =  Integer.parseInt(tpseni.getText());
        int jas =  Integer.parseInt(tpjas.getText());
        int sunda =  Integer.parseInt(tpsunda.getText());
        
        int k_agama = Integer.parseInt(tkagama.getText());
        int k_pkn =  Integer.parseInt(tkpkn.getText());
        int k_indo = Integer.parseInt(tkindo.getText());
        int k_mtk =  Integer.parseInt(tkmtk.getText());
        int k_ipa =  Integer.parseInt(tkipa.getText());
        int k_ips = Integer.parseInt(tkips.getText());
        int k_seni =  Integer.parseInt(tkseni.getText());
        int k_jas =  Integer.parseInt(tkjas.getText());
        int k_sunda =  Integer.parseInt(tksunda.getText());
        

        int p_jumlah = agama + pkn + indo + mtk + ipa + ips + seni + jas + sunda;
        tjump.setText("" + p_jumlah);
        
        int k_jumlah = k_agama + k_pkn + k_indo + k_mtk + k_ipa + k_ips + k_seni + k_jas + k_sunda;
        tjumk.setText("" + k_jumlah);
        
        int p_rata = ( Integer.parseInt(tjump.getText()))/9;
        tratap.setText("" + p_rata);
        
        int k_rata = ( Integer.parseInt(tjumk.getText()))/9;
        tratak.setText("" + k_rata);
        
        int a = Integer.parseInt(tratap.getText());
        char p_predikat = ' ';
        if (a == 100 && a>=86) {
            p_predikat = 'A';
            tprep.setText("" + p_predikat);
        }
        else if (a <=85 && a>=71) {
            p_predikat = 'B';
            tprep.setText("" + p_predikat);
        }
        else if (a <=70 && a>=56) {
            p_predikat = 'C';
            tprep.setText("" + p_predikat);
        }
        else if (a <=55 && a>=41) {
            p_predikat = 'D';
            tprep.setText("" + p_predikat);
        }
        else {
            p_predikat = 'E';
            tprep.setText("" + p_predikat);
        }
        
        int b = Integer.parseInt(tratak.getText());
        char k_predikat = ' ';
        if (b == 100 && b>=86) {
            k_predikat = 'A';
            tprek.setText("" + k_predikat);
        }
        else if (b <=85 && b>=71) {
            k_predikat = 'B';
            tprek.setText("" + k_predikat);
        }
        else if (b <=70 && b>=56) {
            k_predikat = 'C';
            tprek.setText("" + k_predikat);
        }
        else if (b <=55 && b>=41) {
            k_predikat = 'D';
            tprek.setText("" + k_predikat);
        }
        else {
            k_predikat = 'E';
            tprek.setText("" + k_predikat);
        }
        
        if (agama <=41 && pkn <=41 && indo <=41 && mtk <=41 && ipa <=41 && ips <=41 && seni <=41 && jas <=41 && sunda <=41 &&
               k_agama <=41 && k_pkn <=41 && k_indo <=41 && k_mtk <=41 && k_ipa <=41 && k_ips <=41 && k_seni <=41 && k_jas <=41 && k_sunda <=41 ){
            tket.setText("TINGGAL KELAS");
        }
        else {
            tket.setText("NAIK KELAS");
        }
            }
    }//GEN-LAST:event_bhitungKeyPressed

    private void bhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhitungActionPerformed
        // TODO add your handling code here:
        int agama = Integer.parseInt(tpagama.getText());
        int pkn =  Integer.parseInt(tppkn.getText());
        int indo = Integer.parseInt(tpindo.getText());
        int mtk =  Integer.parseInt(tpmtk.getText());
        int ipa =  Integer.parseInt(tpipa.getText());
        int ips = Integer.parseInt(tpips.getText());
        int seni =  Integer.parseInt(tpseni.getText());
        int jas =  Integer.parseInt(tpjas.getText());
        int sunda =  Integer.parseInt(tpsunda.getText());
        
        int k_agama = Integer.parseInt(tkagama.getText());
        int k_pkn =  Integer.parseInt(tkpkn.getText());
        int k_indo = Integer.parseInt(tkindo.getText());
        int k_mtk =  Integer.parseInt(tkmtk.getText());
        int k_ipa =  Integer.parseInt(tkipa.getText());
        int k_ips = Integer.parseInt(tkips.getText());
        int k_seni =  Integer.parseInt(tkseni.getText());
        int k_jas =  Integer.parseInt(tkjas.getText());
        int k_sunda =  Integer.parseInt(tksunda.getText());
        

        int p_jumlah = agama + pkn + indo + mtk + ipa + ips + seni + jas + sunda;
        tjump.setText("" + p_jumlah);
        
        int k_jumlah = k_agama + k_pkn + k_indo + k_mtk + k_ipa + k_ips + k_seni + k_jas + k_sunda;
        tjumk.setText("" + k_jumlah);
        
        int p_rata = ( Integer.parseInt(tjump.getText()))/9;
        tratap.setText("" + p_rata);
        
        int k_rata = ( Integer.parseInt(tjumk.getText()))/9;
        tratak.setText("" + k_rata);
        
        int a = Integer.parseInt(tratap.getText());
        char p_predikat = ' ';
        if (a == 100 && a>=86) {
            p_predikat = 'A';
            tprep.setText("" + p_predikat);
        }
        else if (a <=85 && a>=71) {
            p_predikat = 'B';
            tprep.setText("" + p_predikat);
        }
        else if (a <=70 && a>=56) {
            p_predikat = 'C';
            tprep.setText("" + p_predikat);
        }
        else if (a <=55 && a>=41) {
            p_predikat = 'D';
            tprep.setText("" + p_predikat);
        }
        else {
            p_predikat = 'E';
            tprep.setText("" + p_predikat);
        }
        
        int b = Integer.parseInt(tratak.getText());
        char k_predikat = ' ';
        if (b == 100 && b>=86) {
            k_predikat = 'A';
            tprek.setText("" + k_predikat);
        }
        else if (b <=85 && b>=71) {
            k_predikat = 'B';
            tprek.setText("" + k_predikat);
        }
        else if (b <=70 && b>=56) {
            k_predikat = 'C';
            tprek.setText("" + k_predikat);
        }
        else if (b <=55 && b>=41) {
            k_predikat = 'D';
            tprek.setText("" + k_predikat);
        }
        else {
            k_predikat = 'E';
            tprek.setText("" + k_predikat);
        }
        
        if (agama <=41 && pkn <=41 && indo <=41 && mtk <=41 && ipa <=41 && ips <=41 && seni <=41 && jas <=41 && sunda <=41 &&
               k_agama <=41 && k_pkn <=41 && k_indo <=41 && k_mtk <=41 && k_ipa <=41 && k_ips <=41 && k_seni <=41 && k_jas <=41 && k_sunda <=41 ){
            tket.setText("TINGGAL KELAS");
        }
        else {
            tket.setText("NAIK KELAS");
        }
    }//GEN-LAST:event_bhitungActionPerformed

    private void bsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsaveActionPerformed
        // TODO add your handling code here:
        String sql = "insert into uAS values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, tnoinduk.getText());
            stat.setString(2, tnama_murid.getText());
            stat.setString(3, ckelas_ajaran.getSelectedItem().toString());
            stat.setString(4, csemester.getSelectedItem().toString());
            stat.setString(5, cid_guru.getSelectedItem().toString());
            stat.setString(6, tnama_guru.getText());
            stat.setInt(7, Integer.parseInt(tpagama.getText()));
            stat.setInt(8, Integer.parseInt(tkagama.getText()));
            stat.setInt(9, Integer.parseInt(tppkn.getText()));
            stat.setInt(10, Integer.parseInt(tkpkn.getText()));
            stat.setInt(11, Integer.parseInt(tpindo.getText()));
            stat.setInt(12, Integer.parseInt(tkindo.getText()));
            stat.setInt(13, Integer.parseInt(tpmtk.getText()));
            stat.setInt(14, Integer.parseInt(tkmtk.getText()));
            stat.setInt(15, Integer.parseInt(tpipa.getText()));
            stat.setInt(16, Integer.parseInt(tkipa.getText()));
            stat.setInt(17, Integer.parseInt(tpips.getText()));
            stat.setInt(18, Integer.parseInt(tkips.getText()));
            stat.setInt(19, Integer.parseInt(tpseni.getText()));
            stat.setInt(20, Integer.parseInt(tkseni.getText()));
            stat.setInt(21, Integer.parseInt(tpjas.getText()));
            stat.setInt(22, Integer.parseInt(tkjas.getText()));
            stat.setInt(23, Integer.parseInt(tpsunda.getText()));
            stat.setInt(24, Integer.parseInt(tksunda.getText()));
            stat.setInt(25, Integer.parseInt(tjump.getText()));
            stat.setInt(26, Integer.parseInt(tjumk.getText()));
            stat.setInt(27, Integer.parseInt(tratap.getText()));
            stat.setInt(28, Integer.parseInt(tratak.getText()));
            stat.setString(29, tprep.getText());
            stat.setString(30, tprek.getText());
            stat.setString(31, tket.getText());
            
            stat.executeUpdate();

            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            kosong();
            tnoinduk.requestFocus();
            datatable();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan"+e.getMessage());
        }
    }//GEN-LAST:event_bsaveActionPerformed

    private void beditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beditActionPerformed
        // TODO add your handling code here:
        try {
            String value1 = tnoinduk.getText();
            String value2 = tnama_murid.getText();
            String value3 = (String)ckelas_ajaran.getSelectedItem();
            String value4 = (String)csemester.getSelectedItem();
            String value5 = (String)cid_guru.getSelectedItem();
            String value6 = tnama_guru.getText();
            String value7 = tpagama.getText();
            String value8 = tkagama.getText();
            String value9 = tppkn.getText();
            String value10 = tkpkn.getText();
            String value11 = tpindo.getText();
            String value12 = tkindo.getText();
            String value13 = tpmtk.getText();
            String value14 = tkmtk.getText();
            String value15 = tpipa.getText();
            String value16 = tkipa.getText();
            String value17 = tpips.getText();
            String value18 = tkips.getText();
            String value19 = tpseni.getText();
            String value20 = tkseni.getText();
            String value21 = tpjas.getText();
            String value22 = tkjas.getText();
            String value23 = tpsunda.getText();
            String value24 = tksunda.getText();
            String value25 = tjump.getText();
            String value26 = tjumk.getText();
            String value27 = tratap.getText();
            String value28 = tratak.getText();
            String value29 = tprep.getText();
            String value30 = tprek.getText();
            String value31 = tket.getText();
            
            String sql = "UPDATE uas SET id_murid = '"+value1+"',"
                    + "nama_murid='"+value2+"',"
                    + "kelas_ajaran='"+value3+"',"
                    + "semester='"+value4+"',"
                    + "id_guru='"+value5+"',"
                    + "nama_guru='"+value6+"',"
                    + "p_agama='"+value7+"',"
                    + "k_agama='"+value8+"',"
                    + "p_pkn='"+value9+"',"
                    + "k_pkn='"+value10+"',"
                    + "p_indo='"+value11+"',"
                    + "k_indo='"+value12+"'," 
                    + "p_mtk='"+value13+"',"
                    + "k_mtk='"+value14+"',"
                    + "p_ipa='"+value15+"',"
                    + "k_ipa='"+value16+"',"
                    + "p_ips='"+value17+"',"
                    + "k_ips='"+value18+"',"
                    + "p_seni='"+value19+"',"
                    + "k_seni='"+value20+"',"
                    + "p_jas='"+value21+"',"
                    + "k_jas='"+value22+"',"
                    + "p_sunda='"+value23+"',"
                    + "k_sunda='"+value24+"',"
                    + "p_jumlah='"+value25+"',"
                    + "k_jumlah='"+value26+"',"
                    + "p_rata='"+value27+"',"
                    + "k_rata='"+value28+"',"
                    + "p_pre='"+value29+"',"
                    + "k_pre='"+value30+"',"
                    + "ket='"+value31+"' WHERE id_murid = '"+tnoinduk.getText()+"'";
            
            java.sql.PreparedStatement stat = conn.prepareStatement(sql);
            stat.execute();
            datatable();
            kosong();
            
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");    
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan"+e.getMessage());
        }
    }//GEN-LAST:event_beditActionPerformed

    private void bdelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdelActionPerformed
        // TODO add your handling code here:
        String sql = "delete from uas where id_murid=?";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, tnoinduk.getText());
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
            kosong();
            tnoinduk.requestFocus();
            datatable();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus");
        }
    }//GEN-LAST:event_bdelActionPerformed

    private void bclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bclearActionPerformed
        // TODO add your handling code here:
        kosong();
        datatable();
    }//GEN-LAST:event_bclearActionPerformed

    private void bcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcariActionPerformed
        // TODO add your handling code here:
        Object [] baris = {"Nomor Induk Siswa","Nama Siswa","Kelas/Tahun Ajaran","Semester","ID Walas","Nama Walas","P_Agama","K_Agama","P_Pkn","K_Pkn","P_B.Indo","K_B.Indo","P_Mtk","K_Mtk","P_IPA","K_IPA","P_IPS","K_IPS","P_Seni","K_Seni","P_Jasmani","K_Jasmani","P_B.Sun","K_B.Sun","P_Jumlah","K_Jumlah","P_Rata-rata","K_Rata-Rata","P_Predikat","K_Predikat","Keterangan"};
        tabmode = new DefaultTableModel(null, baris);
        tabeluas.setModel(tabmode);
        String sql = "select * from uas where id_murid like '%"+tcari.getText()+"%' or nama_murid like '%"+tcari.getText()+"%'";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
               String a = hasil.getString("id_murid");
               String b = hasil.getString("nama_murid");
               String c = hasil.getString("kelas_ajaran");
               String d = hasil.getString("semester");
               String e = hasil.getString("id_guru");
               String f = hasil.getString("nama_guru");
               String g = hasil.getString("p_agama");
               String h = hasil.getString("k_agama");
               String i = hasil.getString("p_pkn");
               String j = hasil.getString("k_pkn");
               String k = hasil.getString("p_indo");
               String l = hasil.getString("k_indo");
               String m = hasil.getString("p_mtk");
               String n = hasil.getString("k_mtk");
               String o = hasil.getString("p_ipa");
               String p = hasil.getString("k_ipa");
               String q = hasil.getString("p_ips");
               String r = hasil.getString("k_ips");
               String s = hasil.getString("p_seni");
               String t = hasil.getString("k_seni");
               String u = hasil.getString("p_jas");
               String v = hasil.getString("k_jas");
               String w = hasil.getString("p_sunda");
               String x = hasil.getString("k_sunda");
               String y = hasil.getString("p_jumlah");
               String z = hasil.getString("k_jumlah");
               String aa = hasil.getString("p_rata");
               String ab = hasil.getString("k_rata");
               String ac = hasil.getString("p_pre");
               String ad = hasil.getString("k_pre");
               String ae = hasil.getString("ket");
               
               String [] data = {a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,aa,ab,ac,ad,ae};
               tabmode.addRow(data); 
            }
        } catch (Exception e) {}
    }//GEN-LAST:event_bcariActionPerformed

    private void tabeluasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeluasMouseClicked
        // TODO add your handling code here:
        int bar = tabeluas.getSelectedRow();
        String a = tabmode.getValueAt(bar, 0).toString();
        String b = tabmode.getValueAt(bar, 1).toString();
        String c = tabmode.getValueAt(bar, 2).toString();
        String d = tabmode.getValueAt(bar, 3).toString();
        String e = tabmode.getValueAt(bar,4).toString();
        String f = tabmode.getValueAt(bar, 5).toString();
        String g = tabmode.getValueAt(bar, 6).toString();
        String h = tabmode.getValueAt(bar, 7).toString();
        String i = tabmode.getValueAt(bar, 8).toString();
        String j = tabmode.getValueAt(bar, 9).toString();
        String k = tabmode.getValueAt(bar, 10).toString();
        String l = tabmode.getValueAt(bar, 11).toString();
        String m = tabmode.getValueAt(bar, 12).toString();
        String n = tabmode.getValueAt(bar, 13).toString();
        String o = tabmode.getValueAt(bar, 14).toString();
        String p = tabmode.getValueAt(bar, 15).toString();
        String q = tabmode.getValueAt(bar, 16).toString();
        String r = tabmode.getValueAt(bar, 17).toString();
        String s = tabmode.getValueAt(bar, 18).toString();
        String t = tabmode.getValueAt(bar, 19).toString();
        String u = tabmode.getValueAt(bar, 20).toString();
        String v = tabmode.getValueAt(bar, 21).toString();
        String w = tabmode.getValueAt(bar, 22).toString();
        String x = tabmode.getValueAt(bar, 23).toString();
        String y = tabmode.getValueAt(bar, 24).toString();
        String z = tabmode.getValueAt(bar, 25).toString();
        String aa = tabmode.getValueAt(bar, 26).toString();
        String ab = tabmode.getValueAt(bar, 27).toString();
        String ac = tabmode.getValueAt(bar, 28).toString();
        String ad = tabmode.getValueAt(bar, 29).toString();
        String ae = tabmode.getValueAt(bar, 30).toString();
        
        tnoinduk.setText(a);
        tnama_murid.setText(b);
        ckelas_ajaran.setSelectedItem(c);
        csemester.setSelectedItem(d);
        cid_guru.setSelectedItem(e);
        tnama_guru.setText(f);
        tpagama.setText(g);
        tkagama.setText(h);
        tppkn.setText(i);
        tkpkn.setText(j);
        tpindo.setText(k);
        tkindo.setText(l);
        tpmtk.setText(m);
        tkmtk.setText(n);
        tpipa.setText(o);
        tkipa.setText(p);
        tpips.setText(q);
        tkips.setText(r);
        tpseni.setText(s);
        tkseni.setText(t);
        tpjas.setText(u);
        tkjas.setText(v);
        tpsunda.setText(w);
        tksunda.setText(x);
        tjump.setText(y);
        tjumk.setText(z);
        tratap.setText(aa);
        tratak.setText(ab);
        tprep.setText(ac);
        tprek.setText(ad);
        tket.setText(ae);
    }//GEN-LAST:event_tabeluasMouseClicked

    private void bprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bprintActionPerformed
        // TODO add your handling code here:
        String kelas = JOptionPane.showInputDialog("Masukkan Kelas/Tahun Ajaran yang Akan Dicetak");
        try {
            Map<String, Object> parameter = new HashMap<String, Object>();
            parameter.put("kelas/ajaran", kelas);
            File file = new File ("src/Laporan/Laporan_Uas.jrxml");
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/raport","root","");
            JasperDesign jasperdesign = JRXmlLoader.load(file);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperdesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameter, conn);
            JasperViewer.viewReport(jasperPrint, false);
            //JasperViewer.setDefaultLookAndFeelDecorated(true);
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null, "Data tidak dapat dicetak" +exc.getMessage(),"Cetak Data",JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_bprintActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        Menu xx;
        xx = new  Menu();
        xx.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(nilaiuas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nilaiuas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nilaiuas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nilaiuas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                nilaiuas na = new nilaiuas();
                na.setExtendedState(nilaiuas.MAXIMIZED_BOTH);
                na.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton bcari;
    private javax.swing.JButton bcari_murid;
    private javax.swing.JButton bclear;
    private javax.swing.JButton bdel;
    private javax.swing.JButton bedit;
    private javax.swing.JButton bhitung;
    private javax.swing.JButton bprint;
    private javax.swing.JButton bsave;
    private javax.swing.JComboBox<String> cid_guru;
    private javax.swing.JComboBox<String> ckelas_ajaran;
    private javax.swing.JComboBox<String> csemester;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTable tabeluas;
    private javax.swing.JTextField tcari;
    private javax.swing.JTextField tjumk;
    private javax.swing.JTextField tjump;
    private javax.swing.JTextField tkagama;
    private javax.swing.JTextField tket;
    private javax.swing.JTextField tkindo;
    private javax.swing.JTextField tkipa;
    private javax.swing.JTextField tkips;
    private javax.swing.JTextField tkjas;
    private javax.swing.JTextField tkmtk;
    private javax.swing.JTextField tkpkn;
    private javax.swing.JTextField tkseni;
    private javax.swing.JTextField tksunda;
    private javax.swing.JTextField tnama_guru;
    private javax.swing.JTextField tnama_murid;
    private javax.swing.JTextField tnoinduk;
    private javax.swing.JTextField tpagama;
    private javax.swing.JTextField tpindo;
    private javax.swing.JTextField tpipa;
    private javax.swing.JTextField tpips;
    private javax.swing.JTextField tpjas;
    private javax.swing.JTextField tpmtk;
    private javax.swing.JTextField tppkn;
    private javax.swing.JTextField tprek;
    private javax.swing.JTextField tprep;
    private javax.swing.JTextField tpseni;
    private javax.swing.JTextField tpsunda;
    private javax.swing.JTextField tratak;
    private javax.swing.JTextField tratap;
    // End of variables declaration//GEN-END:variables
}
