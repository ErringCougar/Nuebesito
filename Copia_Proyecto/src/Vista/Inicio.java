package Vista;

import java.awt.Color;
import swing.Panel_Round_JWC;

public class Inicio extends javax.swing.JFrame {

int LayoutX;
int LayoutY;
    public Inicio() {
        initComponents();
        setBackground(new Color(0,0,0,0));
    }

    public void hide(Panel_Round_JWC... panel){
        
        for(int i=0; i<panel.length;i++){
            panel[i].setVisible(false);
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Round_JWC1 = new swing.Panel_Round_JWC();
        Panel_Ventanas = new swing.Panel_Round_JWC();
        Boton_Almacen = new swing.Btn_Round_JWC();
        Boton_Ventas = new swing.Btn_Round_JWC();
        Boton_Graficos = new swing.Btn_Round_JWC();
        Boton_Acceso = new swing.Btn_Round_JWC();
        Boton_AcercaDe = new swing.Btn_Round_JWC();
        img_Round_JWC1 = new swing.Img_Round_JWC();
        jLabel2 = new javax.swing.JLabel();
        btn_Round_JWC13 = new swing.Btn_Round_JWC();
        jLabel3 = new javax.swing.JLabel();
        Exit1 = new swing.Btn_Round_JWC();
        Paneles_Categorias = new swing.Panel_Round_JWC();
        Panel_Clientes = new swing.Panel_Round_JWC();
        jLabel12 = new javax.swing.JLabel();
        Panel_Almacen = new swing.Panel_Round_JWC();
        jLabel7 = new javax.swing.JLabel();
        Panel_Ventas = new swing.Panel_Round_JWC();
        panel_Round_JWC7 = new swing.Panel_Round_JWC();
        Panel_Graficos = new swing.Panel_Round_JWC();
        jLabel9 = new javax.swing.JLabel();
        Panel_Acceso = new swing.Panel_Round_JWC();
        jLabel10 = new javax.swing.JLabel();
        Minimizar = new swing.Btn_Round_JWC();
        Salir = new swing.Btn_Round_JWC();
        Pestaña_Ayuda = new btn_borde_01_jwc.Btn_Borde01_JWC();
        Pestaña_Archivo = new btn_borde_01_jwc.Btn_Borde01_JWC();
        Pestaña_Reportes = new btn_borde_01_jwc.Btn_Borde01_JWC();
        Pestaña_Ventas = new btn_borde_01_jwc.Btn_Borde01_JWC();
        Pestaña_Configuracion = new btn_borde_01_jwc.Btn_Borde01_JWC();
        jLabel4 = new javax.swing.JLabel();
        panel_Round_JWC4 = new swing.Panel_Round_JWC();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Round_JWC1.setBackground(new java.awt.Color(32, 32, 32));
        panel_Round_JWC1.setEsqInferiorDerecha(40);
        panel_Round_JWC1.setEsqInferiorIzquierda(40);
        panel_Round_JWC1.setEsqSuperiorDerecha(40);
        panel_Round_JWC1.setEsqSuperiorIzquierda(40);
        panel_Round_JWC1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panel_Round_JWC1MouseDragged(evt);
            }
        });
        panel_Round_JWC1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_Ventanas.setBackground(new java.awt.Color(43, 43, 43));
        Panel_Ventanas.setEsqInferiorDerecha(30);
        Panel_Ventanas.setEsqInferiorIzquierda(30);
        Panel_Ventanas.setEsqSuperiorDerecha(30);
        Panel_Ventanas.setEsqSuperiorIzquierda(30);
        Panel_Ventanas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Boton_Almacen.setBackground(new java.awt.Color(43, 43, 43));
        Boton_Almacen.setForeground(new java.awt.Color(153, 153, 153));
        Boton_Almacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos Good/box-solid-24 (1).png"))); // NOI18N
        Boton_Almacen.setText("     Almacen");
        Boton_Almacen.setArco_esquina(15);
        Boton_Almacen.setColor_Hover(new java.awt.Color(113, 113, 113));
        Boton_Almacen.setColor_N_text(new java.awt.Color(153, 153, 153));
        Boton_Almacen.setColor_Normal(new java.awt.Color(43, 43, 43));
        Boton_Almacen.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Boton_Almacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_AlmacenActionPerformed(evt);
            }
        });
        Panel_Ventanas.add(Boton_Almacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 170, 40));

        Boton_Ventas.setBackground(new java.awt.Color(43, 43, 43));
        Boton_Ventas.setForeground(new java.awt.Color(153, 153, 153));
        Boton_Ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos Good/cart-solid-24 (1).png"))); // NOI18N
        Boton_Ventas.setText("       Ventas");
        Boton_Ventas.setArco_esquina(15);
        Boton_Ventas.setColor_Hover(new java.awt.Color(113, 113, 113));
        Boton_Ventas.setColor_N_text(new java.awt.Color(153, 153, 153));
        Boton_Ventas.setColor_Normal(new java.awt.Color(43, 43, 43));
        Boton_Ventas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Boton_Ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_VentasActionPerformed(evt);
            }
        });
        Panel_Ventanas.add(Boton_Ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 170, 40));

        Boton_Graficos.setBackground(new java.awt.Color(43, 43, 43));
        Boton_Graficos.setForeground(new java.awt.Color(153, 153, 153));
        Boton_Graficos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos Good/bar-chart-square-solid-24.png"))); // NOI18N
        Boton_Graficos.setText("     Graficos");
        Boton_Graficos.setArco_esquina(15);
        Boton_Graficos.setColor_Hover(new java.awt.Color(113, 113, 113));
        Boton_Graficos.setColor_N_text(new java.awt.Color(153, 153, 153));
        Boton_Graficos.setColor_Normal(new java.awt.Color(43, 43, 43));
        Boton_Graficos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Boton_Graficos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_GraficosActionPerformed(evt);
            }
        });
        Panel_Ventanas.add(Boton_Graficos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 170, 40));

        Boton_Acceso.setBackground(new java.awt.Color(43, 43, 43));
        Boton_Acceso.setForeground(new java.awt.Color(153, 153, 153));
        Boton_Acceso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos Good/folder-open-solid-24 (1).png"))); // NOI18N
        Boton_Acceso.setText("       Acceso");
        Boton_Acceso.setArco_esquina(15);
        Boton_Acceso.setColor_Hover(new java.awt.Color(113, 113, 113));
        Boton_Acceso.setColor_N_text(new java.awt.Color(153, 153, 153));
        Boton_Acceso.setColor_Normal(new java.awt.Color(43, 43, 43));
        Boton_Acceso.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Boton_Acceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_AccesoActionPerformed(evt);
            }
        });
        Panel_Ventanas.add(Boton_Acceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 170, 40));

        Boton_AcercaDe.setBackground(new java.awt.Color(43, 43, 43));
        Boton_AcercaDe.setForeground(new java.awt.Color(153, 153, 153));
        Boton_AcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos Good/comment-error-solid-24.png"))); // NOI18N
        Boton_AcercaDe.setText("    Acerca de");
        Boton_AcercaDe.setArco_esquina(15);
        Boton_AcercaDe.setColor_Hover(new java.awt.Color(113, 113, 113));
        Boton_AcercaDe.setColor_N_text(new java.awt.Color(153, 153, 153));
        Boton_AcercaDe.setColor_Normal(new java.awt.Color(43, 43, 43));
        Boton_AcercaDe.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Panel_Ventanas.add(Boton_AcercaDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 170, 40));

        img_Round_JWC1.setForeground(new java.awt.Color(255, 204, 153));
        img_Round_JWC1.setGrosor_Borde(3);
        img_Round_JWC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/pexels-jerald-pacheco-famoleras-1837461.jpg"))); // NOI18N
        Panel_Ventanas.add(img_Round_JWC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 170, 150));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Administrador");
        Panel_Ventanas.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        btn_Round_JWC13.setBackground(new java.awt.Color(43, 43, 43));
        btn_Round_JWC13.setForeground(new java.awt.Color(153, 153, 153));
        btn_Round_JWC13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos Good/user-solid-24.png"))); // NOI18N
        btn_Round_JWC13.setText(" Proveedores");
        btn_Round_JWC13.setArco_esquina(15);
        btn_Round_JWC13.setColor_Hover(new java.awt.Color(113, 113, 113));
        btn_Round_JWC13.setColor_N_text(new java.awt.Color(153, 153, 153));
        btn_Round_JWC13.setColor_Normal(new java.awt.Color(43, 43, 43));
        btn_Round_JWC13.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_Round_JWC13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Round_JWC13ActionPerformed(evt);
            }
        });
        Panel_Ventanas.add(btn_Round_JWC13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 170, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Punto de venta");
        Panel_Ventanas.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        Exit1.setBackground(new java.awt.Color(102, 102, 102));
        Exit1.setForeground(new java.awt.Color(255, 255, 255));
        Exit1.setText("Salir");
        Exit1.setArco_esquina(15);
        Exit1.setColor_Hover(new java.awt.Color(153, 153, 153));
        Exit1.setColor_Normal(new java.awt.Color(102, 102, 102));
        Exit1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit1ActionPerformed(evt);
            }
        });
        Panel_Ventanas.add(Exit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, 170, 40));

        panel_Round_JWC1.add(Panel_Ventanas, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 10, 190, 750));

        Paneles_Categorias.setBackground(new java.awt.Color(43, 43, 43));
        Paneles_Categorias.setEsqInferiorDerecha(30);
        Paneles_Categorias.setEsqInferiorIzquierda(30);
        Paneles_Categorias.setEsqSuperiorDerecha(30);
        Paneles_Categorias.setEsqSuperiorIzquierda(30);
        Paneles_Categorias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_Clientes.setBackground(new java.awt.Color(43, 43, 43));
        Panel_Clientes.setEsqInferiorDerecha(30);
        Panel_Clientes.setEsqInferiorIzquierda(30);
        Panel_Clientes.setEsqSuperiorDerecha(30);
        Panel_Clientes.setEsqSuperiorIzquierda(30);
        Panel_Clientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Interfaz: Clientes");
        Panel_Clientes.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 40));

        Paneles_Categorias.add(Panel_Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 710));

        Panel_Almacen.setBackground(new java.awt.Color(43, 43, 43));
        Panel_Almacen.setEsqInferiorDerecha(30);
        Panel_Almacen.setEsqInferiorIzquierda(30);
        Panel_Almacen.setEsqSuperiorDerecha(30);
        Panel_Almacen.setEsqSuperiorIzquierda(30);
        Panel_Almacen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Interfaz: Almacen");
        Panel_Almacen.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 40));

        Paneles_Categorias.add(Panel_Almacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 710));

        Panel_Ventas.setBackground(new java.awt.Color(43, 43, 43));
        Panel_Ventas.setEsqInferiorDerecha(30);
        Panel_Ventas.setEsqInferiorIzquierda(30);
        Panel_Ventas.setEsqSuperiorDerecha(30);
        Panel_Ventas.setEsqSuperiorIzquierda(30);
        Panel_Ventas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Round_JWC7.setBackground(new java.awt.Color(42, 42, 42));
        panel_Round_JWC7.setEsqInferiorDerecha(30);
        panel_Round_JWC7.setEsqInferiorIzquierda(30);
        panel_Round_JWC7.setEsqSuperiorDerecha(30);
        panel_Round_JWC7.setEsqSuperiorIzquierda(30);
        Panel_Ventas.add(panel_Round_JWC7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 710));

        Paneles_Categorias.add(Panel_Ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 710));

        Panel_Graficos.setBackground(new java.awt.Color(43, 43, 43));
        Panel_Graficos.setEsqInferiorDerecha(30);
        Panel_Graficos.setEsqInferiorIzquierda(30);
        Panel_Graficos.setEsqSuperiorDerecha(30);
        Panel_Graficos.setEsqSuperiorIzquierda(30);
        Panel_Graficos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Interfaz: Graficos");
        Panel_Graficos.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 40));

        Paneles_Categorias.add(Panel_Graficos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 710));

        Panel_Acceso.setBackground(new java.awt.Color(43, 43, 43));
        Panel_Acceso.setEsqInferiorDerecha(30);
        Panel_Acceso.setEsqInferiorIzquierda(30);
        Panel_Acceso.setEsqSuperiorDerecha(30);
        Panel_Acceso.setEsqSuperiorIzquierda(30);
        Panel_Acceso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Interfaz: Acceso");
        Panel_Acceso.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 40));

        Paneles_Categorias.add(Panel_Acceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 710));

        panel_Round_JWC1.add(Paneles_Categorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 50, 1000, 710));

        Minimizar.setBackground(new java.awt.Color(255, 102, 102));
        Minimizar.setForeground(new java.awt.Color(255, 255, 255));
        Minimizar.setText("");
        Minimizar.setArco_esquina(15);
        Minimizar.setColor_Hover(new java.awt.Color(255, 153, 153));
        Minimizar.setColor_Normal(new java.awt.Color(255, 102, 102));
        Minimizar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinimizarActionPerformed(evt);
            }
        });
        panel_Round_JWC1.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 20, 15, 15));

        Salir.setBackground(new java.awt.Color(255, 51, 51));
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setText("");
        Salir.setArco_esquina(15);
        Salir.setColor_Hover(new java.awt.Color(102, 0, 0));
        Salir.setColor_Normal(new java.awt.Color(255, 51, 51));
        Salir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        panel_Round_JWC1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 20, 15, 15));

        Pestaña_Ayuda.setBackground(new java.awt.Color(32, 32, 32));
        Pestaña_Ayuda.setForeground(new java.awt.Color(153, 153, 153));
        Pestaña_Ayuda.setText("Ayuda");
        Pestaña_Ayuda.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        Pestaña_Ayuda.setJ_Color_Borde(new java.awt.Color(255, 204, 153));
        Pestaña_Ayuda.setJ_Color_NoHover_text(new java.awt.Color(153, 153, 153));
        Pestaña_Ayuda.setJ_Grosor_borde(new java.lang.Integer(3));
        Pestaña_Ayuda.setJ_Ubicacion_borde(btn_borde_01_jwc.BordePosicion.Abajo);
        panel_Round_JWC1.add(Pestaña_Ayuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 110, 30));

        Pestaña_Archivo.setBackground(new java.awt.Color(32, 32, 32));
        Pestaña_Archivo.setForeground(new java.awt.Color(153, 153, 153));
        Pestaña_Archivo.setText("Archivo");
        Pestaña_Archivo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        Pestaña_Archivo.setJ_Color_Borde(new java.awt.Color(255, 204, 153));
        Pestaña_Archivo.setJ_Color_NoHover_text(new java.awt.Color(153, 153, 153));
        Pestaña_Archivo.setJ_Grosor_borde(new java.lang.Integer(3));
        Pestaña_Archivo.setJ_Ubicacion_borde(btn_borde_01_jwc.BordePosicion.Abajo);
        panel_Round_JWC1.add(Pestaña_Archivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 110, 30));

        Pestaña_Reportes.setBackground(new java.awt.Color(32, 32, 32));
        Pestaña_Reportes.setForeground(new java.awt.Color(153, 153, 153));
        Pestaña_Reportes.setText("Reportes");
        Pestaña_Reportes.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        Pestaña_Reportes.setJ_Color_Borde(new java.awt.Color(255, 204, 153));
        Pestaña_Reportes.setJ_Color_NoHover_text(new java.awt.Color(153, 153, 153));
        Pestaña_Reportes.setJ_Grosor_borde(new java.lang.Integer(3));
        Pestaña_Reportes.setJ_Ubicacion_borde(btn_borde_01_jwc.BordePosicion.Abajo);
        panel_Round_JWC1.add(Pestaña_Reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 110, 30));

        Pestaña_Ventas.setBackground(new java.awt.Color(32, 32, 32));
        Pestaña_Ventas.setForeground(new java.awt.Color(153, 153, 153));
        Pestaña_Ventas.setText("Ventas");
        Pestaña_Ventas.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        Pestaña_Ventas.setJ_Color_Borde(new java.awt.Color(255, 204, 153));
        Pestaña_Ventas.setJ_Color_NoHover_text(new java.awt.Color(153, 153, 153));
        Pestaña_Ventas.setJ_Grosor_borde(new java.lang.Integer(3));
        Pestaña_Ventas.setJ_Ubicacion_borde(btn_borde_01_jwc.BordePosicion.Abajo);
        Pestaña_Ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pestaña_VentasActionPerformed(evt);
            }
        });
        panel_Round_JWC1.add(Pestaña_Ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 110, 30));

        Pestaña_Configuracion.setBackground(new java.awt.Color(32, 32, 32));
        Pestaña_Configuracion.setForeground(new java.awt.Color(153, 153, 153));
        Pestaña_Configuracion.setText("Configuracion");
        Pestaña_Configuracion.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        Pestaña_Configuracion.setJ_Color_Borde(new java.awt.Color(255, 204, 153));
        Pestaña_Configuracion.setJ_Color_NoHover_text(new java.awt.Color(153, 153, 153));
        Pestaña_Configuracion.setJ_Grosor_borde(new java.lang.Integer(3));
        Pestaña_Configuracion.setJ_Ubicacion_borde(btn_borde_01_jwc.BordePosicion.Abajo);
        panel_Round_JWC1.add(Pestaña_Configuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 110, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Fecha y Hora");
        panel_Round_JWC1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, -1, 30));

        panel_Round_JWC4.setBackground(new java.awt.Color(32, 32, 32));
        panel_Round_JWC4.setEsqInferiorDerecha(30);
        panel_Round_JWC4.setEsqInferiorIzquierda(30);
        panel_Round_JWC4.setEsqSuperiorDerecha(30);
        panel_Round_JWC4.setEsqSuperiorIzquierda(30);
        panel_Round_JWC4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panel_Round_JWC4MouseDragged(evt);
            }
        });
        panel_Round_JWC4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel_Round_JWC4MousePressed(evt);
            }
        });
        panel_Round_JWC1.add(panel_Round_JWC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 50));

        getContentPane().add(panel_Round_JWC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void panel_Round_JWC1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_Round_JWC1MouseDragged
        //this.setLocation(evt.getXOnScreen()-LayoutX, evt.getYOnScreen()-LayoutY); 
    }//GEN-LAST:event_panel_Round_JWC1MouseDragged

    private void MinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizarActionPerformed
        this.setExtendedState(1);        
    }//GEN-LAST:event_MinimizarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(9);
    }//GEN-LAST:event_SalirActionPerformed

    private void panel_Round_JWC4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_Round_JWC4MousePressed
       if(evt.getButton()==java.awt.event.MouseEvent.BUTTON1){
            LayoutX = evt.getX();
            LayoutY = evt.getY();          
        }
    }//GEN-LAST:event_panel_Round_JWC4MousePressed

    private void panel_Round_JWC4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_Round_JWC4MouseDragged
        this.setLocation(evt.getXOnScreen()-LayoutX, evt.getYOnScreen()-LayoutY); 
    }//GEN-LAST:event_panel_Round_JWC4MouseDragged

    private void Exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit1ActionPerformed
        System.exit(9);
    }//GEN-LAST:event_Exit1ActionPerformed

    private void btn_Round_JWC13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Round_JWC13ActionPerformed
        hide(Panel_Clientes, Panel_Ventas, Panel_Acceso, Panel_Almacen, Panel_Graficos);
        Panel_Clientes.setVisible(true);
    }//GEN-LAST:event_btn_Round_JWC13ActionPerformed

    private void Boton_AlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_AlmacenActionPerformed
        hide(Panel_Clientes, Panel_Ventas, Panel_Acceso, Panel_Almacen, Panel_Graficos);
        Panel_Almacen.setVisible(true);
    }//GEN-LAST:event_Boton_AlmacenActionPerformed

    private void Boton_VentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_VentasActionPerformed
        hide(Panel_Clientes, Panel_Ventas, Panel_Acceso, Panel_Almacen, Panel_Graficos);
        Panel_Ventas.setVisible(true);
    }//GEN-LAST:event_Boton_VentasActionPerformed

    private void Boton_GraficosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_GraficosActionPerformed
        hide(Panel_Clientes, Panel_Ventas, Panel_Acceso, Panel_Almacen, Panel_Graficos);
        Panel_Graficos.setVisible(true);
    }//GEN-LAST:event_Boton_GraficosActionPerformed

    private void Boton_AccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_AccesoActionPerformed
        hide(Panel_Clientes, Panel_Ventas, Panel_Acceso, Panel_Almacen, Panel_Graficos);
        Panel_Acceso.setVisible(true);
    }//GEN-LAST:event_Boton_AccesoActionPerformed

    private void Pestaña_VentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pestaña_VentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pestaña_VentasActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Btn_Round_JWC Boton_Acceso;
    private swing.Btn_Round_JWC Boton_AcercaDe;
    private swing.Btn_Round_JWC Boton_Almacen;
    private swing.Btn_Round_JWC Boton_Graficos;
    private swing.Btn_Round_JWC Boton_Ventas;
    private swing.Btn_Round_JWC Exit1;
    private swing.Btn_Round_JWC Minimizar;
    private swing.Panel_Round_JWC Panel_Acceso;
    private swing.Panel_Round_JWC Panel_Almacen;
    private swing.Panel_Round_JWC Panel_Clientes;
    private swing.Panel_Round_JWC Panel_Graficos;
    private swing.Panel_Round_JWC Panel_Ventanas;
    private swing.Panel_Round_JWC Panel_Ventas;
    private swing.Panel_Round_JWC Paneles_Categorias;
    private btn_borde_01_jwc.Btn_Borde01_JWC Pestaña_Archivo;
    private btn_borde_01_jwc.Btn_Borde01_JWC Pestaña_Ayuda;
    private btn_borde_01_jwc.Btn_Borde01_JWC Pestaña_Configuracion;
    private btn_borde_01_jwc.Btn_Borde01_JWC Pestaña_Reportes;
    private btn_borde_01_jwc.Btn_Borde01_JWC Pestaña_Ventas;
    private swing.Btn_Round_JWC Salir;
    private swing.Btn_Round_JWC btn_Round_JWC13;
    private swing.Img_Round_JWC img_Round_JWC1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private swing.Panel_Round_JWC panel_Round_JWC1;
    private swing.Panel_Round_JWC panel_Round_JWC4;
    private swing.Panel_Round_JWC panel_Round_JWC7;
    // End of variables declaration//GEN-END:variables
}
