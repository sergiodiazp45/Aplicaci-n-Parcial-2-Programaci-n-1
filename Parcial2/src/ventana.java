/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cruz Arevalo
 */
public class ventana extends javax.swing.JFrame {

    
    profesor carlos = new profesor();
    profesor eva = new profesor();
    profesor palgebra = new profesor();
    profesor pcatedra = new profesor();
    profesor pinglesl = new profesor();
    profesor joel = new profesor();
    profesor pedro = new profesor();
    materia matel = new materia();
    materia fingeniera = new materia();
    materia logica = new materia();
    materia algebra = new materia();
    materia catedra = new materia();
    materia inglesl= new materia();
    materia discretas = new materia();
    materia flogica = new materia();
    ///
    profesor pinglesll = new profesor();
    profesor jorger = new profesor();
    profesor jose = new profesor();
    profesor juaquin = new profesor();
    profesor pcomunicacionll = new profesor();
    profesor pconstitucion = new profesor();
    profesor jorgeq = new profesor();
    materia inglesll = new materia();
    materia singenieria = new materia();
    materia fprogramacion = new materia();
    materia fisical = new materia();
    materia comunicacionll = new materia();
    materia constitucion = new materia();
    materia matell = new materia();
    //
    profesor juaquin1 = new profesor();
    profesor wilson = new profesor();
    profesor joaquin = new profesor();
    profesor bernabe = new profesor();
    profesor sotelo = new profesor();
    profesor sotelo1 = new profesor();
    profesor psociohumanistica = new profesor();
    materia fisicall = new materia();
    materia programacionl = new materia();
    materia elementos = new materia();
    materia matelll = new materia();
    materia progral = new materia();
    materia estructuras = new materia();
    materia sociohumanistica = new materia();
    //
    profesor bernabe1 = new profesor();
    profesor pingleslll = new profesor();
    profesor sotelo2 = new profesor();
    profesor sotelo3 = new profesor();
    profesor joaquin1 = new profesor();
    profesor eva1 = new profesor();
    profesor joel1 = new profesor();
    profesor joel2 = new profesor();
    materia matelv = new materia();
    materia ingleslll = new materia();
    materia programacionll = new materia();
    materia prograll = new materia();
    materia microprocesadores = new materia();
    materia tgs = new materia();
    materia fisicalll = new materia();
    materia discretas1 = new materia();
    //
     profesor esau = new profesor();
     profesor duvan = new profesor();
     profesor jorgeq1 = new profesor();
     profesor jose1 = new profesor();
     profesor esau1 = new profesor();
     profesor wilson1 = new profesor();
     profesor joel3 = new profesor();
     materia grafica = new materia();
     materia grafica1 = new materia();
     materia estadistica = new materia();
     materia sistemaso= new materia();
     materia sistemasi = new materia();
     materia especiales = new materia();
     materia fisicalv = new materia();
     //
     profesor nelly = new profesor();
     profesor esau2 = new profesor();
     profesor esau3 = new profesor();
     profesor carlos1 = new profesor();
     profesor sotelo4 = new profesor();
     profesor jose2 = new profesor();
     profesor maria = new profesor();
     profesor hector = new profesor ();
     materia economia = new materia();
     materia teoria = new materia();
     materia teoria1 = new materia();
     materia datos1= new materia();
     materia bases1 = new materia();
     materia sofware = new materia();
     materia contabilidad = new materia();
     materia metodos = new materia ();
     //
     profesor merchan = new profesor();
     profesor merchan1 = new profesor();
     profesor ascanio = new profesor();
     profesor pinvestigacion1 = new profesor();
     profesor duvan1 = new profesor();
     profesor jose3 = new profesor();
     profesor wilson2 = new profesor();
     profesor carlos2 = new profesor ();
     materia basesll = new materia();
     materia bases1ll = new materia();
     materia administracion = new materia();
     materia investigacionl= new materia();
     materia optimizacionl = new materia();
     materia sofwarell = new materia();
     materia datosll = new materia();
     materia electival = new materia ();
     //
     profesor oscar = new profesor();
     profesor ascanio1 = new profesor();
     profesor pinvestigacionll = new profesor();
     profesor duvan2 = new profesor();
     profesor pedro1 = new profesor();
     profesor duvan3 = new profesor ();
     materia inteligencia = new materia();
     materia planeacion = new materia();
     materia investigacionll = new materia();
     materia optimizacionll= new materia();
     materia electivall = new materia();
     materia formulacion = new materia();
     //
     profesor wilson3 = new profesor();
     profesor castillo = new profesor();
     profesor marcia = new profesor();
     profesor merchan2 = new profesor();
     profesor joaquin2 = new profesor();
     profesor duvan4 = new profesor ();
     profesor oscar1 = new profesor ();
     profesor carlos3 = new profesor ();
     materia electivapll = new materia();
     materia electivap1ll = new materia();
     materia electivapl = new materia();
     materia electivap1l= new materia();
     materia auditoria = new materia();
     materia modelacion = new materia();
     materia investigacionlll = new materia();
     materia gerencia = new materia ();
         //
     profesor carlos4 = new profesor();
     profesor marcia1 = new profesor();
     profesor esau4 = new profesor();
     profesor jose4 = new profesor();
     profesor jorger1 = new profesor();
     profesor botero = new profesor ();
     profesor eva2 = new profesor ();
     materia electivaplll = new materia();
     materia proyecto = new materia();
     materia electivaplv = new materia();
     materia gestion= new materia();
     materia legislacion = new materia();
     materia proyecto1 = new materia();
     materia etica = new materia();
     
     
     public ventana() {
         
        initComponents();
            
            
            carlos.nombre="Profesor Carlos Vargas";
            carlos.materia.nombrem="Fundamentos de Ingeniera";
            carlos.materia.horario="\nLunes 7-9";
            fingeniera.nombrem="Fundamentos de Ingeniera";
            fingeniera.horario="\nLunes 7-9";
            fingeniera.profe=carlos;
            eva.nombre="Profesora Eva Patricia Vazques";
            eva.materia.nombrem="Logica y Algoritmia";
            eva.materia.horario="\nMartes 7-9\nViernes 7-9";
            logica.nombrem="Logica y Algoritmia";
            logica.horario="\nMartes 7-9\nViernes 7-9";
            logica.profe=eva;
            palgebra.nombre="Profesor Algebra Lineal";
            palgebra.materia.nombrem="Algebra Lineal";
            palgebra.materia.horario="\nMiercoles 9-11\nJueves 9-11\n Jueves 11-2";
            algebra.nombrem="Profesor Algebra Lineal";
            algebra.horario=palgebra.materia.horario;
            algebra.profe=palgebra;
            pcatedra.nombre="Profesor Catedra Udecina";
            pcatedra.materia.nombrem="Etica y Universalidad";
            pcatedra.materia.horario="\nJueves 7-9";
            catedra.nombrem="Etica y Universalidad";
            catedra.horario="\nJueves 7-9";
            catedra.profe=pcatedra;
            
            pedro.nombre="Profesor Pedro Melendez";
            pedro.materia.nombrem="Fundamentos de Logica";
            pedro.materia.horario="\nMiercoles 2-4\nViernes 2-4";
            flogica.nombrem="Fundamentos de Logica\n";
            flogica.horario="\nMiercoles 2-4\nViernes 2-4\n";
            flogica.profe=pedro;
            
            jorger.nombre="Profesor Jorge Reyes";
            jorger.materia.nombrem="Seminario de Ingenieria";
            jorger.materia.horario="\nLunes 9-12\n";
            singenieria.nombrem=jorger.materia.nombrem;
            singenieria.horario=jorger.materia.horario;
            singenieria.profe=jorger;
            jose.nombre="Profesor Jose Miguel Ojeda";
            jose.materia.nombrem="FUNDAMENTOS DE PROGRAMACION";
            jose.materia.horario="\nMartes 8-10\nJueves 8-10\n";
            fprogramacion.nombrem=jose.materia.nombrem;
            fprogramacion.horario=jose.materia.horario;
            fprogramacion.profe=jose;
            
            wilson.nombre="Profesor Wilson Gordillo";
            wilson.materia.nombrem="Programacion l";
            wilson.materia.horario="\nLunes 9-11\nMiercoles 9-11\n";
            programacionl.nombrem=wilson.materia.nombrem;
            programacionl.horario=wilson.materia.horario;
            programacionl.profe=wilson;
            joaquin.nombre="Profesor Joaquin Ariza";
            joaquin.materia.nombrem="Elementos de computador";
            joaquin.materia.horario="\nMartes 7-10\n";
            elementos.nombrem=joaquin.materia.nombrem;
            elementos.horario=joaquin.materia.horario;
            elementos.profe=joaquin;
            bernabe.nombre="Profesor Bernabe Buitrago";
            bernabe.materia.nombrem="Matematicas lll";
            bernabe.materia.horario="\nMartes 3-6\nMiercoles 7-9\n";
            matelll.nombrem=bernabe.materia.nombrem;
            matelll.horario=bernabe.materia.horario;
            matelll.profe=bernabe;
            sotelo.nombre="Profesor Fernando Sotelo";
            sotelo.materia.nombrem="Estructuras de Informacion";
            sotelo.materia.horario="\nMiercoles 11-1\nJueves 9-11\n";
            estructuras.nombrem=sotelo.materia.nombrem;
            estructuras.horario=sotelo.materia.horario;
            estructuras.profe=sotelo;
            sotelo1.nombre=sotelo.nombre;
            sotelo1.materia.nombrem="Programacion l";
            sotelo1.materia.horario="\nLUNES 8-10\nMARTES 8-10\n";
            progral.nombrem=sotelo1.materia.nombrem;
            progral.horario=sotelo1.materia.horario;
            progral.profe=sotelo1;
            psociohumanistica.nombre="Profesor Electiva SocioHumanistica";
            psociohumanistica.materia.nombrem="Electiva Sociohumanistica";
            psociohumanistica.materia.horario="\nViernes 7-10\n";
            sociohumanistica.nombrem="Electiva Sociohumanistica";
            sociohumanistica.horario="\nViernes 7-10\n";
            sociohumanistica.profe=psociohumanistica;
            //
            bernabe1.nombre=bernabe.nombre;
            bernabe1.materia.nombrem="Ecuaciones Diferenciales";
            bernabe1.materia.horario="\nLunes 7-9\nJueves 7-9\n";
            matelv.nombrem=bernabe1.materia.nombrem;
            matelv.horario=bernabe1.materia.horario;
            matelv.profe=bernabe1;
            pingleslll.nombre="Profesor de Ingles lll";
            pingleslll.materia.nombrem="Ingles lll";
            pingleslll.materia.horario="\nLunes 9-11\nMartes 10-11";
            ingleslll.nombrem=pingleslll.materia.nombrem;
            ingleslll.horario=pingleslll.materia.horario;
            ingleslll.profe=pingleslll;
            sotelo2.nombre=sotelo.nombre;
            sotelo2.materia.nombrem="Programacion ll";
            sotelo2.materia.horario="\nLUNES 11-1\nMARTES 11-1\n";
            programacionll.nombrem=sotelo2.materia.nombrem;
            programacionll.horario=sotelo2.materia.horario;
            programacionll.profe=sotelo2;
            sotelo3.nombre=sotelo.nombre;
            sotelo3.materia.nombrem="Programacion ll";
            sotelo3.materia.horario="\nJueves 11-1\nViernes 11-1\n";
            prograll.nombrem=sotelo3.materia.nombrem;
            prograll.horario=sotelo3.materia.horario;
            prograll.profe=sotelo3;
            joaquin1.nombre=joaquin.nombre;
            joaquin1.materia.nombrem="Microprocesadores";
            joaquin1.materia.horario="\nJueves 10-12\nViernes 7-9\n";
            microprocesadores.nombrem=joaquin1.materia.nombrem;
            microprocesadores.horario=joaquin1.materia.horario;
            microprocesadores.profe=joaquin1;
            eva1.nombre=eva.nombre;
            eva1.materia.nombrem="Teoria General De Sistemas";
            eva1.materia.horario="\nViernes 9-12\n";
            tgs.nombrem=eva1.materia.nombrem;
            tgs.horario=eva1.materia.horario;
            tgs.profe=eva1;
            joel1.nombre=joel.nombre;
            joel1.materia.nombrem="Fisica lll";
            joel1.materia.horario="\nMiercoles 2-4\nJueves 2-4\n";
            fisicalll.nombrem=joel1.materia.nombrem;
            fisicalll.horario=joel1.materia.horario;
            fisicalll.profe=joel1;
            joel2.nombre=joel.nombre;
            joel2.materia.nombrem="Matematicas Discretas";
            joel2.materia.horario="\nViernes 4-7\n";
            discretas1.nombrem=joel2.materia.nombrem;
            discretas1.horario=joel2.materia.horario;
            discretas1.profe=joel2;
            //
            esau.nombre="Profesor Esau Paloma";
            esau.materia.nombrem="Computacion Grafica";
            esau.materia.horario="\nLunes 7-9\nViernes 12-2";
            grafica.nombrem=esau.materia.nombrem;
            grafica.horario=esau.materia.horario;
            grafica.profe=esau;
            esau1.nombre=esau.nombre;
            esau1.materia.nombrem=esau.materia.nombrem;
            esau1.materia.horario="\nMartes 11-1\nMiercoles 7-9";
            grafica1.nombrem=esau.materia.nombrem;
            grafica1.horario=esau1.materia.horario;
            grafica1.profe=esau1;
            duvan.nombre="Profesor Duvan Ordoñez";
            duvan.materia.nombrem="Estadistica Y Probabilidad";
            duvan.materia.horario="\nLunes 9-12";
            estadistica.nombrem=duvan.materia.nombrem;
            estadistica.horario=duvan.materia.horario;
            estadistica.profe=duvan;
            wilson1.nombre=wilson.nombre;
            wilson1.materia.nombrem="Sistemas Operativos";
            wilson1.materia.horario="\nLunes 2-4\nJueves 2-4";
            sistemaso.nombrem=wilson1.materia.nombrem;
            sistemaso.horario=wilson1.materia.horario;
            sistemaso.profe=wilson1;
            jorgeq1.nombre=jorgeq.nombre;
            jorgeq1.materia.nombrem="Matematicas Especiales";
            jorgeq1.materia.horario="\nMartes 7-9\nMiercoles 7-9";
            especiales.nombrem=jorgeq1.materia.nombrem;
            especiales.horario=jorgeq1.materia.horario;
            especiales.profe=jorgeq1;
            jose1.nombre=jose.nombre;
            jose1.materia.nombrem="Sistemas de Informacion";
            jose1.materia.horario="\nMartes 2-4\nJueves 10-12";
            sistemasi.nombrem=jose1.materia.nombrem;
            sistemasi.horario=jose1.materia.horario;
            sistemasi.profe=jose1;
            joel3.nombre=joel.nombre;
            joel3.materia.nombrem="Fisica lV";
            joel3.materia.horario="\nJueves 8-10\nViernes 8-10";
            fisicalv.nombrem=joel3.materia.nombrem;
            fisicalv.horario=joel3.materia.horario;
            fisicalv.profe=joel3;
            //
            nelly.nombre="Profesora Nelly Gonzales";
            nelly.materia.nombrem="Economia";
            nelly.materia.horario="\nLunes 7-10";
            economia.nombrem=nelly.materia.nombrem;
            economia.horario=nelly.materia.horario;
            economia.profe=nelly;
            esau2.nombre=esau.nombre;
            esau2.materia.nombrem="Teoria de Control";
            esau2.materia.horario="\nLunes 11-1\nMiercoles 9-11";
            teoria.nombrem=esau2.materia.nombrem;
            teoria.horario=esau2.materia.horario;
            teoria.profe=esau2;
            esau3.nombre=esau.nombre;
            esau3.materia.nombrem="Teoria de Control";
            esau3.materia.horario="\nLunes 9-11\nViernes 10-12";
            teoria1.nombrem=esau3.materia.nombrem;
            teoria1.horario=esau3.materia.horario;
            teoria1.profe=esau3;
            carlos1.nombre=carlos.nombre;
            carlos1.materia.nombrem="Comunicacion de datos 1";
            carlos1.materia.horario="\nMartes 7-9\nJueves 7-9";
            datos1.nombrem=carlos1.materia.nombrem;
            datos1.horario=carlos1.materia.horario;
            datos1.profe=carlos1;
            sotelo4.nombre=sotelo.nombre;
            sotelo4.materia.nombrem="Bases de Datos l";
            sotelo4.materia.horario="\nMiercoles 7-9\nViernes 7-9";
            bases1.nombrem=sotelo4.materia.nombrem;
            bases1.horario=sotelo4.materia.horario;
            bases1.profe=sotelo4;
            jose2.nombre=jose.nombre;
            jose2.materia.nombrem="Ingenieria de Sofware";
            jose2.materia.horario="\nMiercoles 11-1\nJueves 12-2";
            sofware.nombrem=jose2.materia.nombrem;
            sofware.horario=jose2.materia.horario;
            sofware.profe=jose2;
            maria.nombre="Profesora Maria Velasquez";
            maria.materia.nombrem="Contabilidad";
            maria.materia.horario="\nJueves 9-12";
            contabilidad.nombrem=maria.materia.nombrem;
            contabilidad.horario=maria.materia.horario;
            contabilidad.profe=maria;
            hector.nombre="Profesor Hector Romero";
            hector.materia.nombrem="Metodos Numericos";
            hector.materia.horario="\nViernes 2-5";
            metodos.nombrem=hector.materia.nombrem;
            metodos.horario=hector.materia.horario;
            metodos.profe=hector;
            //
            merchan.nombre="Profesora Esperanza Merchan";
            merchan.materia.nombrem="Bases de Datos ll";
            merchan.materia.horario="\nLunes 7-9\nMartes 7-9";
            basesll.nombrem=merchan.materia.nombrem;
            basesll.horario=merchan.materia.horario;
            basesll.profe=merchan;
            merchan1.nombre=merchan.nombre;
            merchan1.materia.nombrem=merchan.materia.nombrem;
            merchan1.materia.horario="\nJueves 2-4\nViernes 2-4";
            bases1ll.nombrem=merchan1.materia.nombrem;
            bases1ll.horario=merchan1.materia.horario;
            bases1ll.profe=merchan1;
            ascanio.nombre="Profesor Ascanio Horta";
            ascanio.materia.nombrem="Administracion Y Gestion";
            ascanio.materia.horario="\nLunes 10-1";
            administracion.nombrem=ascanio.materia.nombrem;
            administracion.horario=ascanio.materia.horario;
            administracion.profe=ascanio;
            pinvestigacion1.nombre="Profesor Investigacion l";
            pinvestigacion1.materia.nombrem="Investigacion l";
            pinvestigacion1.materia.horario="\nMartes 9-11";
            investigacionl.nombrem=pinvestigacion1.materia.nombrem;
            investigacionl.horario=pinvestigacion1.materia.horario;
            investigacionl.profe=pinvestigacion1;
            duvan1.nombre=duvan.nombre;
            duvan1.materia.nombrem="Optimizacion l";
            duvan1.materia.horario="\nMiercoles 7-9\nJueves 7-9";
            optimizacionl.nombrem=duvan1.materia.nombrem;
            optimizacionl.horario=duvan1.materia.horario;
            optimizacionl.profe=duvan1;
            jose3.nombre=jose.nombre;
            jose3.materia.nombrem="Ingenieria de Sofware ll";
            jose3.materia.horario="\nMiercoles 9-11\nJueves de 2-4";
            sofwarell.nombrem=jose3.materia.nombrem;
            sofwarell.horario=jose3.materia.horario;
            sofwarell.profe=jose3;
            wilson2.nombre=wilson.nombre;
            wilson2.materia.nombrem="Comunicacion de Datos ll";
            wilson2.materia.horario="\nMiercoles 12-2\nJueves9-11";
            datosll.nombrem=wilson2.materia.nombrem;
            datosll.horario=wilson2.materia.horario;
            datosll.profe=wilson2;
            carlos2.nombre=carlos.nombre;
            carlos2.materia.nombrem="Electiva Basica De Ingenieria l";
            carlos2.materia.horario="\nViernes 7-10";
            electival.nombrem=carlos2.materia.nombrem;
            electival.horario=carlos2.materia.horario;
            electival.profe=carlos2;
            //
            oscar.nombre="Profesor Oscar Bachiller";
            oscar.materia.nombrem="Inteligencia Artificial";
            oscar.materia.horario="\nLunes 7-9\nMiercoles 7-9";
            inteligencia.nombrem=oscar.materia.nombrem;
            inteligencia.horario=oscar.materia.horario;
            inteligencia.profe=oscar;
            ascanio1.nombre=ascanio.nombre;
            ascanio1.materia.nombrem="Planeacion Estrategica";
            ascanio1.materia.horario="\nMartes 7-10";
            planeacion.nombrem=ascanio1.materia.nombrem;
            planeacion.horario=ascanio1.materia.horario;
            planeacion.profe=ascanio1;
            pinvestigacionll.nombre="Profesor Investigacion ll";
            pinvestigacionll.materia.nombrem="Investigacion ll";
            pinvestigacionll.materia.horario="\nJueves 7-9";
            investigacionll.nombrem=pinvestigacionll.materia.nombrem;
            investigacionll.horario=pinvestigacionll.materia.horario;
            investigacionll.profe=pinvestigacionll;
            duvan2.nombre=duvan.nombre;
            duvan2.materia.nombrem="Optimizacion ll";
            duvan2.materia.horario="\nMartes 11-1\n Miercoles 9-11";
            optimizacionll.nombrem=duvan2.materia.nombrem;
            optimizacionll.horario=duvan2.materia.horario;
            optimizacionll.profe=duvan2;
            pedro1.nombre=pedro.nombre;
            pedro1.materia.nombrem="Electiva Basica De Ingenieria ll";
            pedro1.materia.horario="\nMartes 2-4";
            electivall.nombrem=pedro1.materia.nombrem;
            electivall.horario=pedro1.materia.horario;
            electivall.profe=pedro1;
            duvan3.nombre=duvan.nombre;
            duvan3.materia.nombrem="Formulacion y Evaluacion De Proyectos";
            duvan3.materia.horario="\nJueves 10-1";
            formulacion.nombrem=duvan3.materia.nombrem;
            formulacion.horario=duvan3.materia.horario;
            formulacion.profe=duvan3;
            //
            wilson3.nombre=wilson.nombre;
            wilson3.materia.nombrem="Electiva Profesional ll";
            wilson3.materia.horario="\nLunes 7-9\nMiercoles 7-9";
            electivapll.nombrem=wilson3.materia.nombrem;
            electivapll.horario=wilson3.materia.horario;
            electivapll.profe=wilson3;
            castillo.nombre="Profesor Gustavo Castillo";
            castillo.materia.nombrem="Electiva Profesional ll";
            castillo.materia.horario="\nLunes 2-4\nJueves 2-4";
            electivap1ll.nombrem=castillo.materia.nombrem;
            electivap1ll.horario=castillo.materia.horario;
            electivap1ll.profe=castillo;
            marcia.nombre="Profesor Marcia Pulido";
            marcia.materia.nombrem="Electiva Profesional l";
            marcia.materia.horario="\nMiercoles 2-4\nViernes 2-4";
            electivapl.nombrem=marcia.materia.nombrem;
            electivapl.horario=marcia.materia.horario;
            electivapl.profe=marcia;
            merchan2.nombre=merchan.nombre;
            merchan2.materia.nombrem="Electiva Profesional l";
            merchan2.materia.horario="\nMiercoles 9-11\nViernes 7-9";
            electivap1l.nombrem=merchan2.materia.nombrem;
            electivap1l.horario=merchan2.materia.horario;
            electivap1l.profe=merchan2;
            joaquin2.nombre=joaquin.nombre;
            joaquin2.materia.nombrem="Auditoria de Sistemas";
            joaquin2.materia.horario="\nMartes 10-1";
            auditoria.nombrem=joaquin2.materia.nombrem;
            auditoria.horario=joaquin2.materia.horario;
            auditoria.profe=joaquin2;
            duvan4.nombre=duvan.nombre;
            duvan4.materia.nombrem="Modelacion";
            duvan4.materia.horario="\nLunes 4-6\nMiercoles 11-1";
            modelacion.nombrem=duvan4.materia.nombrem;
            modelacion.horario=duvan4.materia.horario;
            modelacion.profe=duvan4;
            oscar1.nombre=oscar.nombre;
            oscar1.materia.nombrem="Investigacion lll";
            oscar1.materia.horario="\nJueves 9-12";
            investigacionlll.nombrem=oscar1.materia.nombrem;
            investigacionlll.horario=oscar1.materia.horario;
            investigacionlll.profe=oscar1;
            carlos3.nombre=carlos.nombre;
            carlos3.materia.nombrem="Gerencia Informatica";
            carlos3.materia.horario="\nViernes 10-1";
            gerencia.nombrem=carlos3.materia.nombrem;
            gerencia.horario=carlos3.materia.horario;
            gerencia.profe=carlos3;
            //
            carlos4.nombre=carlos.nombre;
            carlos4.materia.nombrem="Electiva Profesional lll";
            carlos4.materia.horario="\nLunes 7-9\nJueves 11-1";
            electivaplll.nombrem=carlos4.materia.nombrem;
            electivaplll.horario=carlos4.materia.horario;
            electivaplll.profe=carlos4;
            marcia1.nombre=marcia.nombre;
            marcia1.materia.nombrem="Proyecto de Grado";
            marcia1.materia.horario="\nLunes 12-1\nJueves 9-11";
            proyecto.nombrem=marcia1.materia.nombrem;
            proyecto.horario=marcia1.materia.horario;
            proyecto.profe=marcia1;
            esau4.nombre=esau.nombre;
            esau4.materia.nombrem="Electiva Profesional lV";
            esau4.materia.horario="\nMartes 8-10\nJueves 7-9";
            electivaplv.nombrem=esau4.materia.nombrem;
            electivaplv.horario=esau4.materia.horario;
            electivaplv.profe=esau4;
            jose4.nombre=jose.nombre;
            jose4.materia.nombrem="Gestion Tegnologica";
            jose4.materia.horario="\nMartes 10-1";
            gestion.nombrem=jose4.materia.nombrem;
            gestion.horario=jose4.materia.horario;
            gestion.profe=jose4;
            jorger1.nombre=jorger.nombre;
            jorger1.materia.nombrem="Legislacion de Ingenieria";
            jorger1.materia.horario="Viernes 10-1";
            legislacion.nombrem=jorger1.materia.nombrem;
            legislacion.horario=jorger1.materia.horario;
            legislacion.profe=jorger1;
            botero.nombre="Profesor Allfonso Botero";
            botero.materia.nombrem="Proyecto de Grado";
            botero.materia.horario="\nLunes 12-2\nJueves 9-11";
            proyecto1.nombrem=botero.materia.nombrem;
            proyecto1.horario=botero.materia.horario;
            proyecto1.profe=botero;
            eva2.nombre=eva.nombre;
            eva2.materia.nombrem="Etica para Ingenieros";
            eva2.materia.horario="\nMiercoles 7-10";
            etica.nombrem=eva2.materia.nombrem;
            etica.horario=eva2.materia.horario;
            etica.profe=eva2;
            
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        try {
            tex =(javax.swing.JTextArea)java.beans.Beans.instantiate(getClass().getClassLoader(), "ventana_tex");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        jScrollPane2 = new javax.swing.JScrollPane();
        try {
            tex1 =(javax.swing.JTextArea)java.beans.Beans.instantiate(getClass().getClassLoader(), "ventana_tex");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem94 = new javax.swing.JMenuItem();
        jMenuItem93 = new javax.swing.JMenuItem();
        jMenuItem95 = new javax.swing.JMenuItem();
        jMenuItem75 = new javax.swing.JMenuItem();
        jMenuItem85 = new javax.swing.JMenuItem();
        jMenuItem74 = new javax.swing.JMenuItem();
        jMenuItem73 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem84 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenuItem53 = new javax.swing.JMenuItem();
        jMenuItem54 = new javax.swing.JMenuItem();
        jMenuItem56 = new javax.swing.JMenuItem();
        jMenuItem57 = new javax.swing.JMenuItem();
        jMenuItem58 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem68 = new javax.swing.JMenuItem();
        jMenuItem80 = new javax.swing.JMenuItem();
        jMenuItem82 = new javax.swing.JMenuItem();
        jMenuItem81 = new javax.swing.JMenuItem();
        jMenuItem79 = new javax.swing.JMenuItem();
        jMenuItem78 = new javax.swing.JMenuItem();
        jMenuItem76 = new javax.swing.JMenuItem();
        jMenuItem86 = new javax.swing.JMenuItem();
        jMenuItem77 = new javax.swing.JMenuItem();
        jMenuItem69 = new javax.swing.JMenuItem();
        jMenuItem62 = new javax.swing.JMenuItem();
        jMenuItem67 = new javax.swing.JMenuItem();
        jMenuItem64 = new javax.swing.JMenuItem();
        jMenuItem60 = new javax.swing.JMenuItem();
        jMenuItem66 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem50 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenuItem39 = new javax.swing.JMenuItem();
        jMenuItem40 = new javax.swing.JMenuItem();
        jMenuItem42 = new javax.swing.JMenuItem();
        jMenuItem48 = new javax.swing.JMenuItem();
        jMenuItem49 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem44 = new javax.swing.JMenuItem();
        jMenuItem52 = new javax.swing.JMenuItem();
        jMenuItem55 = new javax.swing.JMenuItem();
        jMenuItem72 = new javax.swing.JMenuItem();
        jMenuItem83 = new javax.swing.JMenuItem();
        jMenuItem92 = new javax.swing.JMenuItem();
        jMenuItem102 = new javax.swing.JMenuItem();
        jMenuItem109 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem110 = new javax.swing.JMenuItem();

        jMenu6.setText("File");
        jMenuBar2.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar2.add(jMenu7);

        jMenu8.setText("File");
        jMenuBar3.add(jMenu8);

        jMenu9.setText("Edit");
        jMenuBar3.add(jMenu9);

        jMenu10.setText("File");
        jMenuBar4.add(jMenu10);

        jMenu11.setText("Edit");
        jMenuBar4.add(jMenu11);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(tex);

        jScrollPane2.setViewportView(tex1);

        jMenu1.setText("MENU");

        jMenu3.setText("PROFESOR");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem3.setText("Prof. Carlos V.");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem94.setText("Prof. Marcia P.");
        jMenuItem94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem94ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem94);

        jMenuItem93.setText("Prof. Gustavo C.");
        jMenuItem93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem93ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem93);

        jMenuItem95.setText("Prof. Alfonso B.");
        jMenuItem95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem95ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem95);

        jMenuItem75.setText("Prof. Investigacion l");
        jMenuItem75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem75ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem75);

        jMenuItem85.setText("Prof. Investigacion ll");
        jMenuItem85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem85ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem85);

        jMenuItem74.setText("Prof. Ascanio H.");
        jMenuItem74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem74ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem74);

        jMenuItem73.setText("Prof. Esperanza M.");
        jMenuItem73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem73ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem73);

        jMenuItem4.setText("Prof. Eva V.");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem84.setText("Prof. Oscar B.");
        jMenuItem84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem84ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem84);

        jMenuItem5.setText("Prof. Algebra L.");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Prof. Catedra U.");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem8.setText("Prof. Joel V.");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem9.setText("Prof. Pedro M.");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem19.setText("Prof. Jorge R.");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem19);

        jMenuItem20.setText("Prof. Jose O.");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem20);

        jMenuItem21.setText("Prof. Juaquin R.");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem21);

        jMenuItem24.setText("Prof. Jorge Q.");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem24);

        jMenuItem33.setText("Prof. Wilson G.");
        jMenuItem33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem33ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem33);

        jMenuItem34.setText("Prof. Joaquin A.");
        jMenuItem34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem34ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem34);

        jMenuItem35.setText("Prof. Bernabe B.");
        jMenuItem35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem35ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem35);

        jMenuItem36.setText("Prof. Fernando S. ");
        jMenuItem36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem36ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem36);

        jMenuItem53.setText("Prof. Esau P.");
        jMenuItem53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem53ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem53);

        jMenuItem54.setText("Prof. Duvan O.");
        jMenuItem54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem54ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem54);

        jMenuItem56.setText("Prof. Nelly G.");
        jMenuItem56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem56ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem56);

        jMenuItem57.setText("Prof. Maria V.");
        jMenuItem57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem57ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem57);

        jMenuItem58.setText("Prof Hector R.");
        jMenuItem58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem58ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem58);

        jMenu1.add(jMenu3);

        jMenu4.setText("MATERIA");

        jMenuItem10.setText("F. de Ingenieria");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuItem68.setText("Bases de Datos 1");
        jMenuItem68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem68ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem68);

        jMenuItem80.setText("Ingenieria de Sofware ll");
        jMenuItem80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem80ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem80);

        jMenuItem82.setText("Electiva Basica de Ingenieria l");
        jMenuItem82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem82ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem82);

        jMenuItem81.setText("Comunicacion de Datos ll");
        jMenuItem81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem81ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem81);

        jMenuItem79.setText("Optimizacion l");
        jMenuItem79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem79ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem79);

        jMenuItem78.setText("Investigacion l");
        jMenuItem78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem78ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem78);

        jMenuItem76.setText("Bases de Datos ll");
        jMenuItem76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem76ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem76);

        jMenuItem86.setText("Inteligencia Artificial");
        jMenuItem86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem86ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem86);

        jMenuItem77.setText("Administracion y Gestion");
        jMenuItem77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem77ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem77);

        jMenuItem69.setText("Ingenieria de Sofware");
        jMenuItem69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem69ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem69);

        jMenuItem62.setText("Sistemas Operativos");
        jMenuItem62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem62ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem62);

        jMenuItem67.setText("Comunicacion de Datos l");
        jMenuItem67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem67ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem67);

        jMenuItem64.setText("Sistemas de Informacion");
        jMenuItem64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem64ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem64);

        jMenuItem60.setText("Computacion Grafica");
        jMenuItem60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem60ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem60);

        jMenuItem66.setText("Teoria De Control");
        jMenuItem66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem66ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem66);

        jMenuItem11.setText("Logica y Algoritmia");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenuItem13.setText("Catedra Udecina");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem13);

        jMenuItem50.setText("Teoria General de Sistemas");
        jMenuItem50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem50ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem50);

        jMenuItem15.setText("Matematicas Discretas");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem15);

        jMenuItem16.setText("Fundamentos de Logica");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem16);

        jMenuItem26.setText("Seminario de Ingenieria");
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem26);

        jMenuItem27.setText("Fundamentos de Programacion");
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem27);

        jMenuItem30.setText("Constitucion y Democracia");
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem30);

        jMenuItem39.setText("Programacion l");
        jMenuItem39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem39ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem39);

        jMenuItem40.setText("Elementos de Computador");
        jMenuItem40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem40ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem40);

        jMenuItem42.setText("Estructura de Informacion");
        jMenuItem42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem42ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem42);

        jMenuItem48.setText("Programacion ll");
        jMenuItem48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem48ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem48);

        jMenuItem49.setText("Microprocesadores");
        jMenuItem49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem49ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem49);

        jMenu1.add(jMenu4);

        jMenu5.setText("SEMESTRES");

        jMenuItem17.setText("SEMESTRE l");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem17);

        jMenuItem32.setText("SEMESTRE ll");
        jMenuItem32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem32ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem32);

        jMenuItem44.setText("SEMESTRE lll");
        jMenuItem44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem44ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem44);

        jMenuItem52.setText("SEMESTRE lV");
        jMenuItem52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem52ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem52);

        jMenuItem55.setText("SEMESTRE V");
        jMenuItem55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem55ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem55);

        jMenuItem72.setText("SEMESTRE Vl");
        jMenuItem72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem72ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem72);

        jMenuItem83.setText("SEMESTRE Vll");
        jMenuItem83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem83ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem83);

        jMenuItem92.setText("SEMESTRE Vlll");
        jMenuItem92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem92ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem92);

        jMenuItem102.setText("SEMESTRE lX");
        jMenuItem102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem102ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem102);

        jMenuItem109.setText("SEMESTRE X");
        jMenuItem109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem109ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem109);

        jMenu1.add(jMenu5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("SALIR");

        jMenuItem110.setText("Salir");
        jMenuItem110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem110ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem110);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
              
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
     
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
            tex.setText("");
        tex.append("NOMBRE: "+palgebra.nombre);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+palgebra.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+palgebra.materia.horario);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
              tex.setText("");
        tex.append("NOMBRE: "+pcatedra.nombre);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+pcatedra.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+pcatedra.materia.horario);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
               tex.setText("");
        tex.append("NOMBRE: "+joel.nombre);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+joel.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+joel.materia.horario);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+joel1.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+joel1.materia.horario);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+joel2.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+joel2.materia.horario);
          tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+joel3.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+joel3.materia.horario);   
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
               tex.setText("");
        tex.append("NOMBRE: "+pedro.nombre);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+pedro.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+pedro.materia.horario);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+pedro1.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+pedro1.materia.horario); 
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        tex.setText("");  
   tex.append("MATERIA: "+fingeniera.nombrem);
   tex.append(System.getProperty("line.separator"));
   tex.append("HORARIO: "+fingeniera.horario);
   tex.append(System.getProperty("line.separator"));
   tex.append("PROFESOR :"+fingeniera.profe.nombre);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
     tex.setText("");  
   tex.append("MATERIA: "+logica.nombrem);
   tex.append(System.getProperty("line.separator"));
   tex.append("HORARIO: "+logica.horario);
   tex.append(System.getProperty("line.separator"));
   tex.append("PROFESOR :"+logica.profe.nombre);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
       tex.setText("");  
   tex.append("MATERIA: "+catedra.nombrem);
   tex.append(System.getProperty("line.separator"));
   tex.append("HORARIO: "+catedra.horario);
   tex.append(System.getProperty("line.separator"));
   tex.append("PROFESOR :"+catedra.profe.nombre);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
 tex.setText("");  
   tex.append("MATERIA: "+discretas.nombrem);
   tex.append(System.getProperty("line.separator"));
   tex.append("HORARIO: "+discretas.horario);
   tex.append(System.getProperty("line.separator"));
   tex.append("PROFESOR :"+discretas.profe.nombre);
   tex.append(System.getProperty("line.separator"));
   tex.append("HORARIO: "+discretas1.horario);
   tex.append(System.getProperty("line.separator"));
   tex.append("PROFESOR :"+discretas1.profe.nombre);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
 tex.setText("");  
   tex.append("MATERIA: "+flogica.nombrem);
   tex.append("HORARIO: "+flogica.horario);
   tex.append("PROFESOR :"+flogica.profe.nombre);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
    tex.setText("");
    tex.append("LUNES\t\tMARTES\t\tMIERCOLES\t\tJUEVES\t\tVIERNES\n");
    tex.append("Matematicas l\t\tLogica y Algoritmia\tMatematicas l\t\tEtica Y Uiversalidad\tLogica Y Algoritmia\n");
    tex.append(matel.profe.nombre+"\t"+logica.profe.nombre+"\t"+matel.profe.nombre+"\t"+catedra.profe.nombre+"\t"+logica.profe.nombre+"\n");
    tex.append("7-9\t\t7-9\t\t7-9\t\t7-9\t\t7-9\n");
    tex.append("Fundamentos de Ingenieria\t\t\tAlgebra Lineal\t\tAlgebra Lineal\t\tIngles l\n");
    tex.append(fingeniera.profe.nombre+"\t\t\t"+algebra.profe.nombre+"\t"+algebra.profe.nombre+"\t"+inglesl.profe.nombre+"\n");
    tex.append("9-12\t\t\t\t9-11\t\t9-11\t\t9-11\n");
    tex.append("\t\t\t\tFundamentos de Logica\tAlgebra Lineal\t\tMatematicas Discretas\n");
    tex.append("\t\t\t\t"+flogica.profe.nombre+"\t"+algebra.profe.nombre+"\t"+discretas.profe.nombre+"\n");
    tex.append("\t\t\t\t2-4\t\t11-2\t\t12-3\n");
    tex.append("\t\t\t\t\t\t\t\tFundamentos de Logica\n");
    tex.append("\t\t\t\t\t\t\t\t"+flogica.profe.nombre+"\n\t\t\t\t\t\t\t\t2-4");    
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
       tex.setText("");
        tex.append("NOMBRE: "+jorger.nombre);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+jorger.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+jorger.materia.horario);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+jorger1.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+jorger1.materia.horario);
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
      tex.setText("");
        tex.append("NOMBRE: "+jose.nombre);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+jose.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+jose.materia.horario);
          tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+jose1.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+jose1.materia.horario);  
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+jose2.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+jose2.materia.horario);
          tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+jose3.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+jose3.materia.horario);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+jose4.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+jose4.materia.horario);
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
      tex.setText("");
        tex.append("NOMBRE: "+juaquin.nombre);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+juaquin.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+juaquin.materia.horario);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+juaquin1.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+juaquin1.materia.horario);
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
   tex.setText("");
        tex.append("NOMBRE: "+jorgeq.nombre);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+jorgeq.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+jorgeq.materia.horario);
          tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+jorgeq1.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+jorgeq1.materia.horario);   
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
   tex.setText("");  
   tex.append("MATERIA: "+singenieria.nombrem);
   tex.append(System.getProperty("line.separator"));
   tex.append("HORARIO: "+singenieria.horario);
   tex.append(System.getProperty("line.separator"));
   tex.append("PROFESOR :"+singenieria.profe.nombre);
    }//GEN-LAST:event_jMenuItem26ActionPerformed

    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed
 tex.setText("");  
   tex.append("MATERIA: "+fprogramacion.nombrem);
   tex.append(System.getProperty("line.separator"));
   tex.append("HORARIO: "+fprogramacion.horario);
   tex.append(System.getProperty("line.separator"));
   tex.append("PROFESOR :"+fprogramacion.profe.nombre);
    }//GEN-LAST:event_jMenuItem27ActionPerformed

    private void jMenuItem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem30ActionPerformed
  tex.setText("");  
   tex.append("MATERIA: "+constitucion.nombrem);
   tex.append(System.getProperty("line.separator"));
   tex.append("HORARIO: "+constitucion.horario);
   tex.append(System.getProperty("line.separator"));
   tex.append("PROFESOR :"+constitucion.profe.nombre);

    }//GEN-LAST:event_jMenuItem30ActionPerformed

    private void jMenuItem32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem32ActionPerformed
   tex.setText("");
    tex.append("LUNES\t\tMARTES\t\tMIERCOLES\t\tJUEVES\t\tVIERNES\n");
    tex.append("Ingles ll\t\tIngles ll\t\tFisica l\t\tConstitucion y democracia\tFisica l\n");
    tex.append(inglesll.profe.nombre+"\t"+inglesll.profe.nombre+"\t"+fisical.profe.nombre+"\t"+constitucion.profe.nombre+"\t"+fisical.profe.nombre+"\n");
    tex.append("7-9\t\t7-8\t\t7-9\t\t7-8\t\t7-9\n");
    tex.append("Seminario de Ingenieria\tFundamentos de Programacion\tComunicacion ll\tFundamentos de Programacion\n");
    tex.append(singenieria.profe.nombre+"\t"+fprogramacion.profe.nombre+"\t"+comunicacionll.profe.nombre+"\t"+fprogramacion.profe.nombre+"\n");
    tex.append("9-12\t\t8-10\t\t9-12\t\t8-10\n");
    tex.append("\t\t\t\tMatematica ll\t\tMatematica ll\n");
    tex.append("\t\t\t\t"+matell.profe.nombre+"\t"+matell.profe.nombre+"\n");
    tex.append("\t\t\t\t3-5\t\t3-6\n");
     
    }//GEN-LAST:event_jMenuItem32ActionPerformed

    private void jMenuItem33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem33ActionPerformed
       tex.setText("");
        tex.append("NOMBRE: "+wilson.nombre);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+wilson.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+wilson.materia.horario);     
          tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+wilson1.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+wilson1.materia.horario);   
         tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+wilson2.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+wilson2.materia.horario); 
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+wilson3.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+wilson3.materia.horario); 
    }//GEN-LAST:event_jMenuItem33ActionPerformed

    private void jMenuItem34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem34ActionPerformed
      tex.setText("");
        tex.append("NOMBRE: "+joaquin.nombre);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+joaquin.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+joaquin.materia.horario);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+joaquin1.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+joaquin1.materia.horario);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+joaquin2.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+joaquin2.materia.horario);
    }//GEN-LAST:event_jMenuItem34ActionPerformed

    private void jMenuItem35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem35ActionPerformed
  tex.setText("");
        tex.append("NOMBRE: "+bernabe.nombre);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+bernabe.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+bernabe.materia.horario);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+bernabe1.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+bernabe1.materia.horario);
        
    }//GEN-LAST:event_jMenuItem35ActionPerformed

    private void jMenuItem36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem36ActionPerformed
       tex.setText("");
        tex.append("NOMBRE: "+sotelo.nombre);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+sotelo.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+sotelo.materia.horario);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+sotelo1.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+sotelo1.materia.horario);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+sotelo2.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+sotelo2.materia.horario);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+sotelo3.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+sotelo3.materia.horario);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+sotelo4.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+sotelo4.materia.horario);
        
    }//GEN-LAST:event_jMenuItem36ActionPerformed

    private void jMenuItem39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem39ActionPerformed
    tex.setText("");  
   tex.append("MATERIA: "+programacionl.nombrem);
   tex.append(System.getProperty("line.separator"));
   tex.append("HORARIO: "+programacionl.horario);
   tex.append(System.getProperty("line.separator"));
   tex.append("PROFESOR :"+programacionl.profe.nombre);
   tex.append(System.getProperty("line.separator"));
   tex.append("HORARIO: "+progral.horario);
   tex.append(System.getProperty("line.separator"));
   tex.append("PROFESOR :"+progral.profe.nombre);
    }//GEN-LAST:event_jMenuItem39ActionPerformed

    private void jMenuItem40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem40ActionPerformed
  tex.setText("");  
   tex.append("MATERIA: "+elementos.nombrem);
   tex.append(System.getProperty("line.separator"));
   tex.append("HORARIO: "+elementos.horario);
   tex.append(System.getProperty("line.separator"));
   tex.append("PROFESOR :"+elementos.profe.nombre);
    }//GEN-LAST:event_jMenuItem40ActionPerformed

    private void jMenuItem42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem42ActionPerformed
      tex.setText("");  
   tex.append("MATERIA: "+estructuras.nombrem);
   tex.append(System.getProperty("line.separator"));
   tex.append("HORARIO: "+estructuras.horario);
   tex.append(System.getProperty("line.separator"));
   tex.append("PROFESOR :"+estructuras.profe.nombre);
    }//GEN-LAST:event_jMenuItem42ActionPerformed

    private void jMenuItem44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem44ActionPerformed
   tex.setText("");
    tex.append("LUNES\t\tMARTES\t\tMIERCOLES\t\tJUEVES\t\tVIERNES\n");
    tex.append("Fisica ll\t\tElementos de Computadores\tMatematicas lll\t\tFisica ll\t\tElectiva sociohumanistica\n");
    tex.append(fisicall.profe.nombre+"\t"+elementos.profe.nombre+"\t"+matelll.profe.nombre+"\t"+fisicall.profe.nombre+"\t"+sociohumanistica.profe.nombre+"\n");
    tex.append("7-9\t\t7-10\t\t7-9\t\t7-9\t\t7-10\n");
    tex.append(programacionl.nombrem+"\t\t\t\t"+programacionl.nombrem+"\t\t"+estructuras.nombrem+"\n");
    tex.append(programacionl.profe.nombre+"\t\t\t"+programacionl.profe.nombre+"\t"+estructuras.profe.nombre+"\n");
    tex.append("9-11\t\t\t\t9-11\t\t9-11\n");
    tex.append("\t\t"+matelll.nombrem+"\t\t"+estructuras.nombrem+"\n");
    tex.append("\t\t"+matelll.profe.nombre+"\t"+estructuras.profe.nombre+"\n");
    tex.append("\t\t3-6\t\t11-1\n");
    tex.append(progral.nombrem+"\t\t"+progral.nombrem+"\n");
    tex.append(progral.profe.nombre+"\t"+progral.profe.nombre+"\n");
    tex.append("8-10\t\t8-10\n");
    
    }//GEN-LAST:event_jMenuItem44ActionPerformed

    private void jMenuItem48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem48ActionPerformed
        tex.setText("");  
   tex.append("MATERIA: "+programacionll.nombrem);
   tex.append(System.getProperty("line.separator"));
   tex.append("HORARIO: "+programacionll.horario);
   tex.append(System.getProperty("line.separator"));
   tex.append("PROFESOR :"+programacionll.profe.nombre);
   tex.append(System.getProperty("line.separator"));
   tex.append("HORARIO: "+prograll.horario);
   tex.append(System.getProperty("line.separator"));
   tex.append("PROFESOR :"+prograll.profe.nombre);
    }//GEN-LAST:event_jMenuItem48ActionPerformed

    private void jMenuItem49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem49ActionPerformed
 tex.setText("");  
   tex.append("MATERIA: "+microprocesadores.nombrem);
   tex.append(System.getProperty("line.separator"));
   tex.append("HORARIO: "+microprocesadores.horario);
   tex.append(System.getProperty("line.separator"));
   tex.append("PROFESOR :"+microprocesadores.profe.nombre);
    }//GEN-LAST:event_jMenuItem49ActionPerformed

    private void jMenuItem50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem50ActionPerformed
    tex.setText("");  
   tex.append("MATERIA: "+tgs.nombrem);
   tex.append(System.getProperty("line.separator"));
   tex.append("HORARIO: "+tgs.horario);
   tex.append(System.getProperty("line.separator"));
   tex.append("PROFESOR :"+tgs.profe.nombre);
    }//GEN-LAST:event_jMenuItem50ActionPerformed

    private void jMenuItem52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem52ActionPerformed
    tex.setText("");
    tex.append("LUNES\t\tMARTES\t\tMIERCOLES\t\tJUEVES\t\tVIERNES\n");
    tex.append("Ecuaciones Diferenciasles\t\t\t\t\tEcuaciones Diferenciales\tMicroprocesadores\n");
    tex.append(matelv.profe.nombre+"\t\t\t\t\t"+matelv.profe.nombre+"\t"+microprocesadores.profe.nombre+"\n");
    tex.append("7-9\t\t\t\t\t\t7-9\t\t7-9\n");
    tex.append(ingleslll.nombrem+"\t\t"+ingleslll.nombrem+"\t\t\t\t"+microprocesadores.nombrem+"\t"+tgs.nombrem+"\n");
    tex.append(ingleslll.profe.nombre+"\t"+ingleslll.profe.nombre+"\t\t\t"+microprocesadores.profe.nombre+"\t"+tgs.profe.nombre+"\n");
    tex.append("9-11\t\t10-11\t\t\t\t10-12\t\t9-12\n");
    tex.append(programacionll.nombrem+"\t\t"+programacionll.nombrem+"\t\t\t\t"+prograll.nombrem+"\t\t"+prograll.nombrem+"\n");
    tex.append(programacionll.profe.nombre+"\t"+programacionll.profe.nombre+"\t\t\t"+prograll.profe.nombre+"\t"+prograll.profe.nombre+"\n");
    tex.append("11-1\t\t11-1\t\t\t\t11-1\t\t11-1\n");
    tex.append("\t\t\t\t"+fisicalll.nombrem+"\t\t"+fisicalll.nombrem+"\t\t"+discretas1.nombrem+"\n");
    tex.append("\t\t\t\t"+fisicalll.profe.nombre+"\t"+fisicalll.profe.nombre+"\t"+discretas1.profe.nombre+"\n");
    tex.append("\t\t\t\t2-4\t\t2-4\t\t4-7\n");
    }//GEN-LAST:event_jMenuItem52ActionPerformed

    private void jMenuItem53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem53ActionPerformed
        tex.setText("");
        tex.append("NOMBRE: "+esau.nombre);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+esau.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+esau.materia.horario);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+esau1.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+esau1.materia.horario);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+esau2.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+esau2.materia.horario);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+esau3.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+esau3.materia.horario);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+esau4.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+esau4.materia.horario);
    }//GEN-LAST:event_jMenuItem53ActionPerformed

    private void jMenuItem54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem54ActionPerformed
tex.setText("");
        tex.append("NOMBRE: "+duvan.nombre);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+duvan.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+duvan.materia.horario);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+duvan1.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+duvan1.materia.horario);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+duvan2.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+duvan2.materia.horario); 
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+duvan3.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+duvan3.materia.horario); 
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+duvan4.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+duvan4.materia.horario);
    }//GEN-LAST:event_jMenuItem54ActionPerformed

    private void jMenuItem56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem56ActionPerformed
     tex.setText("");
        tex.append("NOMBRE: "+nelly.nombre);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+nelly.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+nelly.materia.horario);
    }//GEN-LAST:event_jMenuItem56ActionPerformed

    private void jMenuItem57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem57ActionPerformed
      tex.setText("");
        tex.append("NOMBRE: "+maria.nombre);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+maria.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+maria.materia.horario);
    }//GEN-LAST:event_jMenuItem57ActionPerformed

    private void jMenuItem58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem58ActionPerformed
      tex.setText("");
        tex.append("NOMBRE: "+hector.nombre);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+hector.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+hector.materia.horario);
    }//GEN-LAST:event_jMenuItem58ActionPerformed

    private void jMenuItem60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem60ActionPerformed
         tex.setText("");  
   tex.append("MATERIA: "+grafica.nombrem);
   tex.append(System.getProperty("line.separator"));
   tex.append("HORARIO: "+grafica.horario);
   tex.append(System.getProperty("line.separator"));
   tex.append("PROFESOR :"+grafica.profe.nombre);
   tex.append(System.getProperty("line.separator"));
   tex.append("HORARIO: "+grafica1.horario);
   tex.append(System.getProperty("line.separator"));
   tex.append("PROFESOR :"+grafica1.profe.nombre);
    }//GEN-LAST:event_jMenuItem60ActionPerformed

    private void jMenuItem62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem62ActionPerformed
       tex.setText("");  
   tex.append("MATERIA: "+sistemaso.nombrem);
   tex.append(System.getProperty("line.separator"));
   tex.append("HORARIO: "+sistemaso.horario);
   tex.append(System.getProperty("line.separator"));
   tex.append("PROFESOR :"+sistemaso.profe.nombre);
    }//GEN-LAST:event_jMenuItem62ActionPerformed

    private void jMenuItem64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem64ActionPerformed
     tex.setText("");  
   tex.append("MATERIA: "+sistemasi.nombrem);
   tex.append(System.getProperty("line.separator"));
   tex.append("HORARIO: "+sistemasi.horario);
   tex.append(System.getProperty("line.separator"));
   tex.append("PROFESOR :"+sistemasi.profe.nombre);
    }//GEN-LAST:event_jMenuItem64ActionPerformed

    private void jMenuItem66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem66ActionPerformed
    tex.setText("");  
   tex.append("MATERIA: "+teoria.nombrem);
   tex.append(System.getProperty("line.separator"));
   tex.append("HORARIO: "+teoria.horario);
   tex.append(System.getProperty("line.separator"));
   tex.append("PROFESOR :"+teoria.profe.nombre);
    tex.append(System.getProperty("line.separator"));
   tex.append("HORARIO: "+teoria1.horario);
   tex.append(System.getProperty("line.separator"));
   tex.append("PROFESOR :"+teoria1.profe.nombre);
    }//GEN-LAST:event_jMenuItem66ActionPerformed

    private void jMenuItem67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem67ActionPerformed
        tex.setText("");  
   tex.append("MATERIA: "+datos1.nombrem);
   tex.append(System.getProperty("line.separator"));
   tex.append("HORARIO: "+datos1.horario);
   tex.append(System.getProperty("line.separator"));
   tex.append("PROFESOR :"+datos1.profe.nombre);
    }//GEN-LAST:event_jMenuItem67ActionPerformed

    private void jMenuItem68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem68ActionPerformed
         tex.setText("");  
   tex.append("MATERIA: "+bases1.nombrem);
   tex.append(System.getProperty("line.separator"));
   tex.append("HORARIO: "+bases1.horario);
   tex.append(System.getProperty("line.separator"));
   tex.append("PROFESOR :"+bases1.profe.nombre);
    }//GEN-LAST:event_jMenuItem68ActionPerformed

    private void jMenuItem69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem69ActionPerformed
          tex.setText("");  
   tex.append("MATERIA: "+sofware.nombrem);
   tex.append(System.getProperty("line.separator"));
   tex.append("HORARIO: "+sofware.horario);
   tex.append(System.getProperty("line.separator"));
   tex.append("PROFESOR :"+sofware.profe.nombre);
    }//GEN-LAST:event_jMenuItem69ActionPerformed

    private void jMenuItem72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem72ActionPerformed
         tex.setText("");
    tex.append("LUNES\t\tMARTES\t\tMIERCOLES\t\tJUEVES\t\tVIERNES\n");
    tex.append(economia.nombrem+"\t\t"+datos1.nombrem+"\t"+bases1.nombrem+"\t"+datos1.nombrem+"\t"+teoria1.nombrem+"\n");
    tex.append(economia.profe.nombre+"\t"+datos1.profe.nombre+"\t"+bases1.profe.nombre+"\t"+datos1.profe.nombre+"\t"+teoria1.profe.nombre+"\n");
    tex.append("7-10\t\t7-9\t\t7-9\t\t7-9\t\t10-12\n");
    tex.append(teoria1.nombrem+"\t\t\t"+teoria.nombrem+"\t"+contabilidad.nombrem+"\t\t"+bases1.nombrem+"\n");
    tex.append(teoria1.profe.nombre+"\t\t\t"+teoria.profe.nombre+"\t"+contabilidad.profe.nombre+"\t"+bases1.profe.nombre+"\n");
    tex.append("9-11\t\t\t\t9-11\t\t9-11\t\t9-12\t\t9-11\n");
    tex.append(teoria.nombrem+"\t\t\t"+sofware.nombrem+"\t"+sofware.nombrem+"\t"+metodos.nombrem+"\n");
    tex.append(teoria.profe.nombre+"\t\t\t"+sofware.profe.nombre+"\t"+sofware.profe.nombre+"\t"+metodos.profe.nombre+"\n");
    tex.append("11-1\t\t\t\t11-1\t\t12-2\t\t2-5\n");
    
    }//GEN-LAST:event_jMenuItem72ActionPerformed

    private void jMenuItem73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem73ActionPerformed
      tex.setText("");
        tex.append("NOMBRE: "+merchan.nombre);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+merchan.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+merchan.materia.horario);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+merchan1.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+merchan1.materia.horario);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+merchan2.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+merchan2.materia.horario);
        
        
    }//GEN-LAST:event_jMenuItem73ActionPerformed

    private void jMenuItem74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem74ActionPerformed
    tex.setText("");
        tex.append("NOMBRE: "+ascanio.nombre);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+ascanio.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+ascanio.materia.horario);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+ascanio1.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+ascanio1.materia.horario); 
    }//GEN-LAST:event_jMenuItem74ActionPerformed

    private void jMenuItem75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem75ActionPerformed
tex.setText("");
        tex.append("NOMBRE: "+pinvestigacion1.nombre);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+pinvestigacion1.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+pinvestigacion1.materia.horario);    }//GEN-LAST:event_jMenuItem75ActionPerformed

    private void jMenuItem76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem76ActionPerformed
   tex.setText("");  
   tex.append("MATERIA: "+basesll.nombrem);
   tex.append(System.getProperty("line.separator"));
   tex.append("HORARIO: "+basesll.horario);
   tex.append(System.getProperty("line.separator"));
   tex.append("PROFESOR :"+basesll.profe.nombre);
   tex.append(System.getProperty("line.separator"));
   tex.append("HORARIO: "+bases1ll.horario);
   tex.append(System.getProperty("line.separator"));
   tex.append("PROFESOR :"+bases1ll.profe.nombre);
    }//GEN-LAST:event_jMenuItem76ActionPerformed

    private void jMenuItem77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem77ActionPerformed
   tex.setText("");  
   tex.append("MATERIA: "+administracion.nombrem);
   tex.append(System.getProperty("line.separator"));
   tex.append("HORARIO: "+administracion.horario);
   tex.append(System.getProperty("line.separator"));
   tex.append("PROFESOR :"+administracion.profe.nombre);
    }//GEN-LAST:event_jMenuItem77ActionPerformed

    private void jMenuItem78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem78ActionPerformed
    tex.setText("");  
   tex.append("MATERIA: "+investigacionl.nombrem);
   tex.append(System.getProperty("line.separator"));
   tex.append("HORARIO: "+investigacionl.horario);
   tex.append(System.getProperty("line.separator"));
   tex.append("PROFESOR :"+investigacionl.profe.nombre);
    }//GEN-LAST:event_jMenuItem78ActionPerformed

    private void jMenuItem79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem79ActionPerformed
   tex.setText("");  
   tex.append("MATERIA: "+optimizacionl.nombrem);
   tex.append(System.getProperty("line.separator"));
   tex.append("HORARIO: "+optimizacionl.horario);
   tex.append(System.getProperty("line.separator"));
   tex.append("PROFESOR :"+optimizacionl.profe.nombre);
    }//GEN-LAST:event_jMenuItem79ActionPerformed

    private void jMenuItem80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem80ActionPerformed
  tex.setText("");  
   tex.append("MATERIA: "+sofwarell.nombrem);
   tex.append(System.getProperty("line.separator"));
   tex.append("HORARIO: "+sofwarell.horario);
   tex.append(System.getProperty("line.separator"));
   tex.append("PROFESOR :"+sofwarell.profe.nombre);
    }//GEN-LAST:event_jMenuItem80ActionPerformed

    private void jMenuItem81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem81ActionPerformed
    tex.setText("");  
   tex.append("MATERIA: "+datosll.nombrem);
   tex.append(System.getProperty("line.separator"));
   tex.append("HORARIO: "+datosll.horario);
   tex.append(System.getProperty("line.separator"));
   tex.append("PROFESOR :"+datosll.profe.nombre);
    }//GEN-LAST:event_jMenuItem81ActionPerformed

    private void jMenuItem82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem82ActionPerformed
  tex.setText("");  
   tex.append("MATERIA: "+electival.nombrem);
   tex.append(System.getProperty("line.separator"));
   tex.append("HORARIO: "+electival.horario);
   tex.append(System.getProperty("line.separator"));
   tex.append("PROFESOR :"+electival.profe.nombre);
    }//GEN-LAST:event_jMenuItem82ActionPerformed

    private void jMenuItem83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem83ActionPerformed
               tex.setText("");
    tex.append("LUNES\t\tMARTES\t\tMIERCOLES\t\tJUEVES\t\tVIERNES\n");
    tex.append(basesll.nombrem+"\t"+basesll.nombrem+"\t"+optimizacionl.nombrem+"\t\t"+optimizacionl.nombrem+"\t\t"+electival.nombrem+"\n");
    tex.append(basesll.profe.nombre+"\t"+basesll.profe.nombre+"\t"+optimizacionl.profe.nombre+"\t"+optimizacionl.profe.nombre+"\t"+electival.profe.nombre+"\n");
    tex.append("7-9\t\t7-9\t\t7-9\t\t7-9\t\t7-10\n");
    tex.append(administracion.nombrem+"\t"+investigacionl.nombrem+"\t\t"+sofwarell.nombrem+"\t"+datosll.nombrem+"\n");
    tex.append(administracion.profe.nombre+"\t"+investigacionl.profe.nombre+"\t"+sofwarell.profe.nombre+"\t"+datosll.profe.nombre+"\n");
    tex.append("10-1\t\t9-11\t\t9-11\t\t9-11\n");
    tex.append("\t\t\t\t"+datosll.nombrem+"\t"+sofwarell.nombrem+"\n");
    tex.append("\t\t\t\t"+datosll.profe.nombre+"\t"+sofwarell.profe.nombre+"\n");
    tex.append("\t\t\t\t12-2\t\t2-4\n");
    tex.append("\t\t\t\t\t\t"+bases1ll.nombrem+"\t"+bases1ll.nombrem+"\n");
    tex.append("\t\t\t\t\t\t"+bases1ll.profe.nombre+"\t"+bases1ll.profe.nombre+"\n");
    tex.append("\t\t\t\t\t\t12-4\t\t2-4\n");
    }//GEN-LAST:event_jMenuItem83ActionPerformed

    private void jMenuItem84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem84ActionPerformed
  tex.setText("");
        tex.append("NOMBRE: "+oscar.nombre);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+oscar.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+oscar.materia.horario); 
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+oscar1.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+oscar1.materia.horario);
    }//GEN-LAST:event_jMenuItem84ActionPerformed

    private void jMenuItem85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem85ActionPerformed
     tex.setText("");
        tex.append("NOMBRE: "+pinvestigacionll.nombre);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+pinvestigacionll.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+pinvestigacionll.materia.horario); 
    }//GEN-LAST:event_jMenuItem85ActionPerformed

    private void jMenuItem86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem86ActionPerformed
       tex.setText("");  
   tex.append("MATERIA: "+inteligencia.nombrem);
   tex.append(System.getProperty("line.separator"));
   tex.append("HORARIO: "+inteligencia.horario);
   tex.append(System.getProperty("line.separator"));
   tex.append("PROFESOR :"+inteligencia.profe.nombre);
    }//GEN-LAST:event_jMenuItem86ActionPerformed

    private void jMenuItem92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem92ActionPerformed
               tex.setText("");
    tex.append("LUNES\t\tMARTES\t\tMIERCOLES\t\tJUEVES\t\tVIERNES\n");
    tex.append(inteligencia.nombrem+"\t"+planeacion.nombrem+"\t"+inteligencia.nombrem+"\t"+investigacionll.nombrem+"\n");
    tex.append(inteligencia.profe.nombre+"\t"+planeacion.profe.nombre+"\t"+inteligencia.profe.nombre+"\t"+investigacionll.profe.nombre+"\n");
    tex.append("7-9\t\t7-10\t\t7-9\t\t7-9\n");
    tex.append("\t\t"+optimizacionll.nombrem+"\t\t"+optimizacionll.nombrem+"\t\t"+formulacion.nombrem+"\n");
    tex.append("\t\t"+optimizacionll.profe.nombre+"\t"+optimizacionll.profe.nombre+"\t"+formulacion.profe.nombre+"\n");
    tex.append("\t\t11-1\t\t9-11\t\t10-1\n");
    tex.append("\t\t"+electivall.nombrem+"\n");
    tex.append("\t\t"+electivall.profe.nombre+"\n");
    tex.append("\t\t2-5\n");
   
    }//GEN-LAST:event_jMenuItem92ActionPerformed

    private void jMenuItem93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem93ActionPerformed
       tex.setText("");
        tex.append("NOMBRE: "+castillo.nombre);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+castillo.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+castillo.materia.horario); 
    }//GEN-LAST:event_jMenuItem93ActionPerformed

    private void jMenuItem94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem94ActionPerformed
     tex.setText("");
        tex.append("NOMBRE: "+marcia.nombre);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+marcia.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+marcia.materia.horario); 
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+marcia1.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+marcia1.materia.horario);
    }//GEN-LAST:event_jMenuItem94ActionPerformed

    private void jMenuItem102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem102ActionPerformed
          tex.setText("");
    tex.append("LUNES\t\tMARTES\t\tMIERCOLES\t\tJUEVES\t\tVIERNES\n");
    tex.append(electivapll.nombrem+"\t\t\t"+electivapll.nombrem+"\t\t\t"+electivap1l.nombrem+"\n");
    tex.append(electivapll.profe.nombre+"\t\t\t"+electivapll.profe.nombre+"\t\t\t"+electivap1l.profe.nombre+"\n");
    tex.append("7-9\t\t\t\t7-9\t\t\t\t7-9\n");
    tex.append(modelacion.nombrem+"\t\t"+auditoria.nombrem+"\t"+electivap1l.nombrem+"\t"+investigacionlll.nombrem+"\t\t"+gerencia.nombrem+"\n");
    tex.append(modelacion.profe.nombre+"\t"+auditoria.profe.nombre+"\t"+electivap1l.profe.nombre+"\t"+investigacionlll.profe.nombre+"\t"+gerencia.profe.nombre+"\n");
    tex.append("4-6\t\t10-1\t\t9-11\t\t9-12\t\t10-1\n");
    tex.append(electivap1ll.nombrem+"\t\t\t"+modelacion.nombrem+"\t\t"+electivapl.nombrem+"\t"+electivap1ll.nombrem+"\n");
    tex.append(electivap1ll.profe.nombre+"\t\t\t"+modelacion.profe.nombre+"\t"+electivapl.profe.nombre+"\t"+electivap1ll.profe.nombre+"\n");
    tex.append("2-4\t\t\t\t11-1\t\t2-4\t\t2-4\n");
    tex.append("\t\t\t\t"+electivapl.nombrem+"\n");
    tex.append("\t\t\t\t"+electivapl.profe.nombre+"\n");
    tex.append("\t\t\t\t2-4");
    }//GEN-LAST:event_jMenuItem102ActionPerformed

    private void jMenuItem95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem95ActionPerformed
       tex.setText("");
     tex.append("NOMBRE: "+botero.nombre);
        tex.append(System.getProperty("line.separator"));
        tex.append("MATERIA: "+botero.materia.nombrem);
        tex.append(System.getProperty("line.separator"));
        tex.append("HORARIO: "+botero.materia.horario);
    }//GEN-LAST:event_jMenuItem95ActionPerformed

    private void jMenuItem109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem109ActionPerformed
      tex.setText("");
    tex.append("LUNES\t\tMARTES\t\tMIERCOLES\t\tJUEVES\t\tVIERNES\n");
    tex.append(electivaplll.nombrem+"\t"+electivaplv.nombrem+"\t"+etica.nombrem+"\t"+electivaplv.nombrem+"\n");
    tex.append(electivaplll.profe.nombre+"\t"+electivaplv.profe.nombre+"\t"+etica.profe.nombre+"\t"+electivaplv.profe.nombre+"\n");
    tex.append("7-9\t\t8-10\t\t7-10\t\t7-9\n");
    tex.append(proyecto.nombrem+"\t\t\t\t\t"+proyecto.nombrem+"\n");
    tex.append(proyecto.profe.nombre+"\t\t\t\t\t"+proyecto.profe.nombre+"\n");
    tex.append("12-1\t\t\t\t\t\t9-11\n");
    tex.append(proyecto1.nombrem+"\t"+gestion.nombrem+"\t\t\t"+electivaplll.nombrem+"\t"+legislacion.nombrem+"\n");
    tex.append(proyecto1.profe.nombre+"\t"+gestion.profe.nombre+"\t\t\t"+electivaplll.profe.nombre+"\t"+legislacion.profe.nombre+"\n");
    tex.append("12-2\t\t10-1\t\t\t\t11-1\t\t10-1\n");
    tex.append("\t\t\t\t\t\t"+proyecto1.nombrem+"\n");
    tex.append("\t\t\t\t\t\t"+proyecto1.profe.nombre+"\n");
    tex.append("\t\t\t\t\t\t9-1");
    }//GEN-LAST:event_jMenuItem109ActionPerformed

    private void jMenuItem55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem55ActionPerformed
 tex.setText("");
    tex.append("LUNES\t\tMARTES\t\tMIERCOLES\t\tJUEVES\t\tVIERNES\n");
    tex.append(grafica.nombrem+"\t"+especiales.nombrem+"\t"+especiales.nombrem+"\t"+fisicalv.nombrem+"\t\t"+fisicalv.nombrem+"\n");
    tex.append(grafica.profe.nombre+"\t"+especiales.profe.nombre+"\t"+especiales.profe.nombre+"\t"+fisicalv.profe.nombre+"\t"+fisicalv.profe.nombre+"\n");
    tex.append("7-9\t\t7-9\t\t7-9\t\t8-10\t\t8-10\n");
    tex.append(estadistica.nombrem+"\t\t\t"+sistemasi.nombrem+"\t"+grafica.nombrem+"\n");
    tex.append(estadistica.profe.nombre+"\t\t\t"+sistemasi.profe.nombre+"\t"+grafica.profe.nombre+"\n");
    tex.append("9-12\t\t\t\t10-12\t\t12-2\n");
    tex.append(sistemaso.nombrem+"\t"+sistemasi.nombrem+"\t\t\t"+sistemaso.nombrem+"\n");
    tex.append(sistemaso.profe.nombre+"\t"+sistemasi.profe.nombre+"\t\t\t"+sistemaso.profe.nombre+"\t"+"\n");
    tex.append("2-4\t\t2-4\t\t\t\t2-4\n");
    tex.append("\t\t"+grafica1.nombrem+"\t"+grafica1.nombrem+"\n");
    tex.append("\t\t"+grafica1.profe.nombre+"\t"+grafica1.profe.nombre+"\n");
    tex.append("\t\t11-1\t\t7-9");     
    }//GEN-LAST:event_jMenuItem55ActionPerformed

    private void jMenuItem110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem110ActionPerformed
    System.exit(0);
    }//GEN-LAST:event_jMenuItem110ActionPerformed

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
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem102;
    private javax.swing.JMenuItem jMenuItem109;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem110;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem39;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem40;
    private javax.swing.JMenuItem jMenuItem42;
    private javax.swing.JMenuItem jMenuItem44;
    private javax.swing.JMenuItem jMenuItem48;
    private javax.swing.JMenuItem jMenuItem49;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem50;
    private javax.swing.JMenuItem jMenuItem52;
    private javax.swing.JMenuItem jMenuItem53;
    private javax.swing.JMenuItem jMenuItem54;
    private javax.swing.JMenuItem jMenuItem55;
    private javax.swing.JMenuItem jMenuItem56;
    private javax.swing.JMenuItem jMenuItem57;
    private javax.swing.JMenuItem jMenuItem58;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem60;
    private javax.swing.JMenuItem jMenuItem62;
    private javax.swing.JMenuItem jMenuItem64;
    private javax.swing.JMenuItem jMenuItem66;
    private javax.swing.JMenuItem jMenuItem67;
    private javax.swing.JMenuItem jMenuItem68;
    private javax.swing.JMenuItem jMenuItem69;
    private javax.swing.JMenuItem jMenuItem72;
    private javax.swing.JMenuItem jMenuItem73;
    private javax.swing.JMenuItem jMenuItem74;
    private javax.swing.JMenuItem jMenuItem75;
    private javax.swing.JMenuItem jMenuItem76;
    private javax.swing.JMenuItem jMenuItem77;
    private javax.swing.JMenuItem jMenuItem78;
    private javax.swing.JMenuItem jMenuItem79;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem80;
    private javax.swing.JMenuItem jMenuItem81;
    private javax.swing.JMenuItem jMenuItem82;
    private javax.swing.JMenuItem jMenuItem83;
    private javax.swing.JMenuItem jMenuItem84;
    private javax.swing.JMenuItem jMenuItem85;
    private javax.swing.JMenuItem jMenuItem86;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItem92;
    private javax.swing.JMenuItem jMenuItem93;
    private javax.swing.JMenuItem jMenuItem94;
    private javax.swing.JMenuItem jMenuItem95;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea tex;
    private javax.swing.JTextArea tex1;
    // End of variables declaration//GEN-END:variables
}
