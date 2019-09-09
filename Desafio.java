package neomind;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Desafio extends javax.swing.JFrame {

    public Desafio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtHora = new javax.swing.JTextField();
        txtMinuto = new javax.swing.JTextField();
        btConverter = new javax.swing.JButton();
        txtResultado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btConverter.setText("Calcular");
        btConverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConverterActionPerformed(evt);
            }
        });

        jLabel1.setText("Hora:");

        jLabel2.setText("Minuto:");

        jLabel3.setText("Resultado:");

        jLabel4.setText("graus");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btConverter)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtHora, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                            .addComponent(txtMinuto)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btConverter)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btConverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConverterActionPerformed
        //CONVERTENDO O RESULTADO DE STRING PARA INT
        GregorianCalendar result = new GregorianCalendar(2019,9,5, 
                            Integer.parseInt(txtHora.getText()), 
                            Integer.parseInt(txtMinuto.getText()));
        
        txtResultado.setText(String.valueOf(retornaAnguloRelogio(result)));
    }//GEN-LAST:event_btConverterActionPerformed
        //CALCULANDO A ENTRADA DE VALORES DE HORA E MINUTO PARA GRAUS
    public int pontH(long hora, long minuto) {
        return (int)(hora * 30 + 0.5 * minuto);
    }
    
    public int pontM(long minuto) {
        return (int) minuto * 6;
    }
    //ALOCANDO O VALOR DE CALENDÁRIO GREGORIANO EM UMA VARIÁVEL
    public long retornaAnguloRelogio(GregorianCalendar horario) {
        int pH = pontH(horario.get(Calendar.HOUR), horario.get(Calendar.MINUTE));
        int pM = pontM(horario.get(Calendar.MINUTE));
    //CALCULANDO O RESULTADO EM UMA FUNÇÃO PARA RETORNO DE VALORES ABSOLUTO (EXCLUINDO VALORES NEGATIVOS)
        int result = Math.abs(pH - pM);
        return result;
        }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Desafio().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConverter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtMinuto;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
