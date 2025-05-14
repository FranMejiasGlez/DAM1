<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" encoding="UTF-8" indent="yes"/>
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
                        <img src="../img/eusa2021.jpg" alt="Eusa Campus Camara Sevilla"/>
                    </div>
                    <ul>
                        <li class="links-header">
                            <a>Servicios socioculturales y a la comunidad</a>
                        </li>
                        <li class="links-header">
                            <a>Informática y videojuegos</a>
                        </li>
                        <li class="links-header">
                            <a>Administración, marketing y comercio</a>
                        </li>
                        <li class="links-header">
                            <a>Imagen y Sonido</a>
                        </li>
                        <li class="links-header">
                            <a>Hosteleria y turismo</a>
                        </li>
                        <li class="links-header">
                            <a>Actividades Físicas y Deportivas</a>
                        </li>
                    </ul>
                </div>
                <div class="header2">
                    <h1>CENTRO FP SUPERIOR DE LA CÁMARA DE COMERCIO DE SEVILLA</h1>

                </div>
                <div class="header3">
                    <h1>
                        <xsl:value-of select="//Titulos/Titulo[@Denominacion='Comercio Internacional']/@Nombre"></xsl:value-of>
                    </h1>
                </div>
                <div class="contenedor-competencias ">
                    <div class="item1">
                        <div class="rectangulos">Competencias</div>
                    </div>
                    <div class="item3">
                        <div class="dropdown" style="margin-right: 40%;">
                            <button type="button"
                                    style="width: 400px;height: 50px; font-size: 20px; font-weight: bold;color: white;border-radius: 999px;"
                                    class="btn btn-primary dropdown-toggle"
                                    data-bs-toggle="dropdown">
                                Competencias Generales
                            </button>
                            <ul class="dropdown-menu"
                                style="text-align:justify;text-align: center;">
                                <p> La competencia general de este título consiste en
                                    definir y
                                    efectuar el seguimiento de las políticas de
                                    marketing basadas
                                    en estudios comerciales y en promocionar y
                                    publicitar los productos
                                    y/o servicios en los medios y soportes de
                                    comunicación adecuados,
                                    elaborando los materiales publipromocionales
                                    necesarios.</p>
                            </ul>
                        </div>
                    </div>
                    <div class="item2">
                        <div class="dropdown" style="margin-right: 40%;">
                            <button type="button"
                                    style="width: 100%; max-width: 500px; height: 50px; font-size: 18px; font-weight: bold; color: white; border-radius: 999px;"
                                    class="btn btn-primary dropdown-toggle"
                                    data-bs-toggle="dropdown">
                                Competencias profesionales, personales y sociales
                            </button>
                            <ul class="dropdown-menu"
                                style="text-align:justify;text-align: center;max-height: 500px;  overflow-y: auto;">
                                <xsl:for-each select="//Titulos/Titulo[@Denominacion='Comercio Internacional']/CompetenciaProfesionalPersonalySocial">
                                    <p>
                                        <b>Codigo: </b> 
                                        <xsl:value-of select="@Codigo"></xsl:value-of> 
                                        <br></br>
                                        <b>Descripcion: </b> 
                                        <xsl:value-of select="@Descripcion"></xsl:value-of>
                                    </p>
                                </xsl:for-each>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="contenedor-objetivos ">
                    <div class="item5">
                        <div class="rectangulos">Objetivos</div>
                    </div>
                    <div class="item4">
                        <div class="dropdown" style="margin-right: 40%;">
                            <button type="button"
                                    style="width: 400px;height: 50px; font-size: 20px; font-weight: bold;color: white;border-radius: 999px;"
                                    class="btn btn-primary dropdown-toggle"
                                    data-bs-toggle="dropdown">
                                Objetivos Generales
                            </button>
                            <ul class="dropdown-menu"
                                style="text-align:justify;text-align: center;max-height: 500px;  overflow-y: auto;">
                                <xsl:for-each select="//Titulos/Titulo[@Denominacion='Comercio Internacional']/ObjetivoGeneral">
                                    <p>
                                        <b>Codigo: </b> 
                                        <xsl:value-of select="@Codigo"></xsl:value-of> 
                                        <br></br>
                                        <b>Descripcion: </b> 
                                        <xsl:value-of select="@Descripcion"></xsl:value-of>
                                    </p>
                                </xsl:for-each>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="contenedor-modulos1">
                    <div class="item6">
                        <div class="rectangulos">Modulos 1º</div>
                    </div>
                    <div class="item7">
                        <div class="dropdown" style="margin-right: 40%;">
                            <button type="button"
                                    style="width: 400px;height: 50px; font-size: 20px; font-weight: bold;color: white;border-radius: 999px;"
                                    class="btn btn-primary dropdown-toggle"
                                    data-bs-toggle="dropdown">
                                Modulos
                            </button>
                           
                            <ul class="dropdown-menu" style="margin-right: 40%;">
                                <xsl:for-each select="//Titulos/Titulo[@Denominacion='Comercio Internacional']/Modulos/Modulo[@Curso=1]">
                                    <xsl:variable name="CodModulo" select="@Codigo"/>
                                    <li>
                                        <a style="text-decoration: none;" href="../ModulosComercioInternacional/paginaModulo{$CodModulo}.xslt"> 
                                            <xsl:value-of select="@Nombre"></xsl:value-of>
                                        </a>
                                    </li>
                                </xsl:for-each>
                            </ul>
                            
                        </div>
                    </div>
                </div>
                <div class="contenedor-modulos2">
                    <div class="item8">
                        <div class="rectangulos">Modulos 2º</div>
                    </div>
                    <div class="item9">
                        <div class="dropdown" style="margin-right: 40%;"> 
                            <button
                                type="button"
                                style="width: 400px;height: 50px; font-size: 20px; font-weight: bold;color: white;border-radius: 999px;"
                                class="btn btn-primary dropdown-toggle"
                                data-bs-toggle="dropdown">
                                Modulos
                            </button>
                            <ul class="dropdown-menu" style="margin-right: 40%;">
                                  <xsl:for-each select="//Titulos/Titulo[@Denominacion='Comercio Internacional']/Modulos/Modulo[@Curso=2]">
                                    <xsl:variable name="CodModulo" select="@Codigo"/>
                                    <li>
                                        <a style="text-decoration: none;" href="../ModulosComercioInternacional/paginaModulo{$CodModulo}.xslt"> 
                                            <xsl:value-of select="@Nombre"></xsl:value-of>
                                        </a>
                                    </li>
                                </xsl:for-each>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="footer">
                    <div class="logoFooter">
                        <img src="../img/logoCampusCamara.png"
                             alt="logo Centro FP SUPERIOR" width="218px" height="78px"
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
                                <p style="color:white">info@fpcampuscamara.es</p>
                            </li>
                            <li>
                                <img src="../img/llamada.png" alt="Teléfono"/>
                                <p style="color:white">954238797</p>
                            </li>
                        </ul>
                    </div>
                </div>

            </body>

        </html>
    </xsl:template>
</xsl:stylesheet>
