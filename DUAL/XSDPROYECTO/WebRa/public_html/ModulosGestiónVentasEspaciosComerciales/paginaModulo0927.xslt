<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" encoding="UTF-8" indent="yes"/>
    <xsl:template match="/">
       
        <html>
            <head>
                <meta charset="utf-8"/> 
                <meta name="viewport" content="width=device-width, initial-scale=1"/>
                <link rel="stylesheet" href="../stylesheet3.css"/>
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
                    <h5> CENTRO FP SUPERIOR DE LA CÁMARA DE COMERCIO DE SEVILLA</h5>

                </div>
                <div class="header3">
                    <h2> 
                        <xsl:value-of select="//Titulos/Titulo[@Denominacion='Gestión de Ventas y Espacios Comerciales']/@Nombre"></xsl:value-of>
                    </h2> <!--XPATH-->
                </div>
                <div class="header4">
                    <h2>
                        <xsl:value-of select="//Titulos/Titulo/Modulos/Modulo[@Codigo=0927]/@Nombre"></xsl:value-of>
                    </h2> <!--XPATH-->
                </div>
               
                <div class="contenedor-competencias ">
                    <div>
                        <div class="rectangulos" style="height: 100px;padding:10px 20px">
                            <xsl:value-of select="//Titulos/Titulo/@Denominacion"></xsl:value-of>
                        </div> <!--XPATH-->
                    </div>
                    <div>
                        <div class="dropdown">
                            <ul>
                                <button type="button"
                                        style="width: 400px;height: 50px; font-size: 20px; font-weight: bold;color: white;border-radius: 999px;"
                                        class="btn btn-primary dropdown-toggle contenidos"
                                        data-bs-toggle="dropdown">
                                    Contenidos Básicos
                                </button>
                                <ul class="dropdown-menu"
                                    style="text-align:justify;text-align: center;">
                                    <p>Contenidos</p>
                                </ul>
                            </ul>
                        </div>
                        <div class="dropdown">
                            <ul>
                                <button type="button"
                                        style="width: 400px;height: 50px; font-size: 20px; font-weight: bold;color: white;border-radius: 999px;"
                                        class="btn btn-primary dropdown-toggle objetivos"
                                        data-bs-toggle="dropdown">
                                    Objetivos Generales
                                </button>
                                <ul class="dropdown-menu"
                                    style="text-align:justify;text-align: center;">
                                    <p>Contenidos</p>
                                </ul>
                            </ul>
                        </div>
                        <div class="dropdown">
                            <ul>
                                <button type="button"
                                        style="width: 100%; max-width: 500px; height: 50px; font-size: 18px; font-weight: bold; color: white; border-radius: 999px;"
                                        class="btn btn-primary dropdown-toggle competencias"
                                        data-bs-toggle="dropdown">
                                    Competencias profesionales, personales y sociales
                                </button>
                                <ul class="dropdown-menu"
                                    style="text-align:justify;text-align: center;">
                                    <p>Contenidos</p>
                                </ul>
                            </ul>
                        </div>
                    </div>

                </div>
                <div class="contenedor-ResultadosAprendizaje">
                    <div>
                        <div class="rectangulos" style="height:80px;padding:10px 20px;text-align: center;">Resultados de
                            Aprendizaje</div> <!--XPATH-->
                    </div>
                    <div class="dropdown" style="justify-self:center;">
                        <ul>
                            <xsl:for-each select="//Titulos/Titulo[@Denominacion='Gestión de Ventas y Espacios Comerciales']/Modulos/Modulo[@Codigo=0927]/ResultadoDeAprendizaje">
                                <xsl:variable name="idResultado" select="@Codigo"/>
                                <br></br>
                                <button type="button"
                                        style="text-align: center;padding:30px 30px;white-space: normal;width: 100%; max-width: 500px; height:auto;font-size: 18px; font-weight: bold; color: white; border-radius: 999px;"
                                        class="btn btn-primary dropdown-toggle rectangulos"
                                        data-bs-toggle="dropdown">
                                    <p> 
                                        <xsl:value-of select="@Codigo"></xsl:value-of> - <xsl:value-of select="@Descripcion"></xsl:value-of>
                                    </p>
                                </button>
                                <br></br>
                                <ul class="dropdown-menu"
                                    style="text-align:justify;text-align: center;">
                                    
                                    <xsl:for-each select="//Titulos/Titulo[@Denominacion='Gestión de Ventas y Espacios Comerciales']/Modulos/Modulo[@Codigo=0927]/ResultadoDeAprendizaje[@Codigo=concat($idResultado,'')]/CriterioDeEvaluacion">
                                        <p>
                                            <b>Codigo: </b> 
                                            <xsl:value-of select="@Codigo"></xsl:value-of> 
                                            <br></br>
                                            <b>Descripcion: </b> 
                                            <xsl:value-of select="@Descripcion"></xsl:value-of>
                                        </p>
                                    </xsl:for-each>
                                </ul>
                            </xsl:for-each>
                        </ul>
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
                             width="50px" height="50px"/>
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
                </div><!--FOOTER-->

            </body>

        </html>
    </xsl:template>
</xsl:stylesheet>
