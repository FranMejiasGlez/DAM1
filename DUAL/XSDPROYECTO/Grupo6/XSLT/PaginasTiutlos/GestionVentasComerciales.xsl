<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <xsl:template match="/">
        <html>

            <head>
                <meta charset="utf-8"/>
                <meta name="viewport" content="width=device-width, initial-scale=1"/>
                <link rel="stylesheet" href="../stylesheet2.css"/>
                <link
                    href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
                    rel="stylesheet"/>
                <script
                    src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js">
                </script>
                <title>placeholder</title>
            </head>

            <body>
                <div class="header">
                    <div class="logo-header">
                        <img src="../img/eusa2021.jpg" alt="Eusa Campus Camara Sevilla"
                             width="222px" height="79px"/>
                    </div>
                    <ul>
                        <li class="links-header">
                            <br></br>
                            <a>
                                <strong>Servicios socioculturales y a la
                                    comunidad</strong>
                            </a>
                        </li>
                        <li class="links-header">
                            <a>
                                <strong>Informática y videojuegos</strong>
                            </a>
                        </li>
                        <li class="links-header">
                            <a>
                                <strong>Administración, marketing y comercio</strong>
                            </a>
                        </li>
                        <li class="links-header">
                            <a>
                                <strong>Imagen y Sonido</strong>
                            </a>
                        </li>
                        <li class="links-header">
                            <a>
                                <strong>Hosteleria y turismo</strong>
                            </a>
                        </li>
                        <li class="links-header">
                            <a>
                                <strong>Actividades Físicas y Deportivas</strong>
                            </a>
                        </li>
                    </ul>
                </div>
                <div class="header2">
                    <h5>CENTRO FP SUPERIOR DE LA CÁMARA DE COMERCIO DE SEVILLA</h5>

                </div>
                <div class="header3">
                    <h2>
                        <xsl:value-of select="//Titulos/Titulo[3]/@Nombre"></xsl:value-of>
                    </h2>
                    <h2>- FP Superior con Titulación Oficial Junta de Andalucía --</h2>
                </div>
               
                <div class="contenedor-competencias ">
                    <div class="competencias">
                        <p>Competencias</p>
                    </div>
                    <ul style="margin-left: 12%;">
                        <div class="competenciageneral">
                            <div class="accordion rounded-5" id="competenciageneral"
                                 style="background-color: #0195db; max-width: 550px; ">
                                <div class="accordion-item rounded-5 mb-2" >
                                    <h2 class="accordion-header" id="headingOne">
                                        <button class="accordion-button rounded-5  "
                                                type="button" data-bs-toggle="collapse"
                                                data-bs-target="#collapseOne"
                                                style="background-color:#0195db;color:#ffffff ;font-size: 23px;font-weight: bold;  align-items: center;justify-content: center;">
                                            Competencias
                                        </button>
                                    </h2>
                                    <div id="collapseOne"
                                         class="accordion-collapse collapse "
                                         data-bs-parent="#accordionExample">
                                        <div class="accordion-body">
                                        
                                            <p>La competencia general de este título consiste en planificar y gestionar los procesos de importación/exportación e introducción/expedición de mercancías, aplicando la legislación vigente, en el marco de los objetivos y procedimientos establecidos.</p>
                                         
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </ul>
                    <ul style="margin-left: 12%;">
                        <div class="competenciaspps">
                            <div class="accordion rounded-5" id="competenciaspps"
                                 style="background-color: #0195db; max-width: 550px;  margin-top: 10%;">
                                <div class="accordion-item rounded-5 mb-2">
                                    <h2 class="accordion-header" id="headingTwo">
                                        <button class="accordion-button rounded-5 "
                                                type="button" data-bs-toggle="collapse"
                                                data-bs-target="#collapseTwo"
                                                style="background-color:#0195db;color:#ffffff ;font-size: 23px;font-weight: bold;  align-items: center;justify-content: center;">
                                            Competencias profesionales, personales y sociales
                                        </button>
                                    </h2>
                                    <div id="collapseTwo"
                                         class="accordion-collapse collapse "
                                         data-bs-parent="#competenciaspps">
                                        <div class="accordion-body"  >
                                            <xsl:for-each select="//Titulo[3]/CompetenciaProfesionalPersonalySocial ">
                                                <p>
                                                    <xsl:value-of select="@Codigo"></xsl:value-of>:<br></br>
                                                    <xsl:value-of select="@Descripcion"></xsl:value-of>
                                                </p>
                                            </xsl:for-each>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </ul>
                </div>
            
                
                <div class="contenedor-objetivos ">
                    <div class="objetivos" style="margin-right:18%">
                        <p>Objetivos</p>
                    </div>
                    <ul style="margin-right:12%;">
                        <div class="objetivosgenerales">
                            <div class="accordion rounded-5" id="objetivosgenerales"
                                 style="background-color: #0195db; max-width: 550px; ">
                                <div class="accordion-item rounded-5 mb-2">
                                    <h2 class="accordion-header" id="headingThree">
                                        <button class="accordion-button rounded-5"
                                                type="button" data-bs-toggle="collapse"
                                                data-bs-target="#collapseThree"
                                                style="background-color:#0195db;color:#ffffff ;font-size: 23px;font-weight: bold;  align-items: center;justify-content: center;">
                                            Objetivos generales
                                        </button>
                                    </h2>
                                    <div id="collapseThree"
                                         class="accordion-collapse collapse "
                                         data-bs-parent="#objetivosgenerales">
                                        <div class="accordion-body">
                                            <xsl:for-each select="//Titulos/Titulo[3]/ObjetivoGeneral">
                                                <p>
                                                    <b>Codigo: </b> 
                                                    <xsl:value-of select="@Codigo"></xsl:value-of> 
                                                    <br></br>
                                                    <b>Descripcion: </b> 
                                                    <xsl:value-of select="@Descripcion"></xsl:value-of>
                                                </p>
                                            </xsl:for-each>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </ul>
                </div>
           
              
                <div class="contenedor-modulos1">
                    <div class="modulo" style="font-weight:bold;">
                        <p>Módulos 1º</p>
                    </div>
                    <ul style="margin-left:12%;">
                        <xsl:for-each select="//Titulos/Titulo[3]/Modulos/Modulo[@Curso='1']">
                            <xsl:variable name="idAccordion" select="position()" />
                            <br></br>
                            <div class="modulo1" style="font-weight:bold;">
                                <ul>
                                    <div class="accordion rounded-5" id="accordion1{$idAccordion}"
                                         style="background-color: #0195db; max-width: 550px; ">
                                        <div class="accordion-item rounded-5 mb-2">
                                            <h2 class="accordion-header" id="heading{$idAccordion}">
                                                <button class="accordion-button rounded-5"
                                                        type="button" data-bs-toggle="collapse"
                                                        data-bs-target="#collapse{$idAccordion}"
                                                        style="background-color:#0195db;color:#ffffff ;font-size: 23px;font-weight: bold; align-items: center;justify-content: center;">
                                                    <p>
                                                        <xsl:value-of select="@Nombre"></xsl:value-of>
                                                    </p>
                                                </button>
                                            </h2>
                                            <div id="collapse{$idAccordion}"
                                                 class="accordion-collapse collapse "
                                                 data-bs-parent="#accordion{$idAccordion}">
                                                <div class="accordion-body">
                                                    <xsl:variable name="CodModulo" select="@Codigo"/>
                                                    <li style="list-style:none;text-decoration:none;">
                                                        <p>Horas anuales: <xsl:value-of select="@HorasAnuales"/></p>
                                                        <a style="text-decoration: none;" href="../ModulosGestionVentasEspaciosComerciales/Modulo{$CodModulo}.html"> 
                                                            Mas informacion
                                                        </a>
                                                    </li>
                                       
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </ul>
                            </div>
                            <br></br>
                        </xsl:for-each>
                    </ul>
                </div>
                <div class="contenedor-modulos2">
                    <div class="modulo" style="font-weight:bold;">
                        <p>Módulos 2º</p>
                    </div>
                    <ul style="margin-left:12%;">
                        <xsl:for-each select="//Titulos/Titulo[3]/Modulos/Modulo[@Curso='2']">
                            <xsl:variable name="idAc" select="position()" />
                            <br></br>
                            <div class="modulo2"  style="font-weight:bold;">
                            
                                <div class="accordion rounded-5" id="accordion2{$idAc}"
                                     style="background-color: #0195db; max-width: 550px; ">
                                    <div class="accordion-item rounded-5 mb-2">
                                        <h2 class="accordion-header" id="heading{$idAc}">
                                            <button class="accordion-button rounded-5"
                                                    type="button" data-bs-toggle="collapse"
                                                    data-bs-target="#collapse{$idAc}"
                                                    style="background-color:#0195db;color:#ffffff ;font-size: 23px;font-weight: bold; align-items: center;justify-content: center;">
                                                <p>
                                                    <xsl:value-of select="@Nombre"></xsl:value-of>
                                                </p>
                                            </button>
                                        </h2>
                                        <div id="collapse{$idAc}"
                                             class="accordion-collapse collapse "
                                             data-bs-parent="#accordion{$idAc}">
                                            <div class="accordion-body">
                                                <xsl:variable name="CodModulo" select="@Codigo"/>
                                                <li style="list-style:none;text-decoration:none;">
                                                    <p>Horas anuales: <xsl:value-of select="@HorasAnuales"/></p>
                                                    <a style="text-decoration: none;" href="../ModulosGestionVentasEspaciosComerciales/Modulo{$CodModulo}.html"> 
                                                        <div >Mas informacion</div> 
                                                    </a>
                                                </li>
                                       
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <br></br>
                        </xsl:for-each>
                    </ul>
                </div>
                <div class="footer">
                    <div class="logoFooter">
                        <img src="../img/logoCampusCamara.png"
                             alt="logo Centro FP SUPERIOR" width="218px"
                             height="78px"
                             class="imagen"/>
                    </div>
                    <div class="redes">
                        <img src="../img/icons8-instagram-50.png" alt="Instagram"/>
                        <img src="../img/icons8-youtube-50.png" alt="Youtube"/>
                        <img src="../img/logo-de-facebook.png" alt="Facebook"
                             width="50px"
                             height="50px"/>
                    </div>
                    <div class="contacto">
                        <ul style="align-content: center;list-style-type: none;">
                            <li>
                                <img src="../img/correo-electronico.png"
                                     alt="Correo Electrónico"/>
                                <p style="color:white;font-size:20px">info@fpcampuscamara.es</p>
                            </li>
                            <li>
                                <img src="../img/llamada.png" alt="Teléfono"/>
                                <p style="color:white;font-size:20px">954238797</p>
                            </li>
                        </ul>
                    </div>
                </div>
            </body>

        </html>
    </xsl:template>

</xsl:stylesheet>
