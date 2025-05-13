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
                    src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
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
                    <h2> buscar xpath nombre titulo</h2> <!--XPATH-->
                </div>
                <div class="header4">
                    <h2>buscar xpath nombre modulo</h2> <!--XPATH-->
                </div>
                <div class="contenedor-competencias ">
                    <div class="item1">
                        <div class="rectangulos">Buscar Curso xpath</div> <!--XPATH-->
                    </div>
                    <div class="item3">
                        <div class="dropdown" style="margin-right: 40%;">
                            <button type="button"
                                    style="width: 400px;height: 50px; font-size: 20px; font-weight: bold;color: white;border-radius: 999px;"
                                    class="btn btn-primary dropdown-toggle"
                                    data-bs-toggle="dropdown">
                                Contenidos Básicos
                            </button>
                            <ul class="dropdown-menu"
                                style="text-align:justify;text-align: center;">
                                <p>Contenidos</p>
                            </ul>
                        </div>
                    </div>
                    <div class="item2">
                        <div class="dropdown" style="margin-right: 40%;">
                            <button type="button"
                                    style="width: 100%; max-width: 500px; height: 50px; font-size: 18px; font-weight: bold; color: white; border-radius: 999px;"
                                    class="btn btn-primary dropdown-toggle"
                                    data-bs-toggle="dropdown">
                                Objetivos
                            </button>
                            <ul class="dropdown-menu"
                                style="text-align:justify;text-align: center;max-height: 500px;  overflow-y: auto;">
                                <p>Objetivos</p>
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
                                <p></p>
                            </ul>
                        </div>
                    </div>
                </div>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
