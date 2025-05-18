<?xml version="1.0" encoding="UTF-8"?>


<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <xsl:template match="/">
        <xsl:variable name="codigoModulo" select="'0627'"></xsl:variable>
        <xsl:variable name="codigoTitulo" select="2"></xsl:variable>
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
                <title> 
                    <xsl:value-of select="//Titulos/Titulo[$codigoTitulo]/@Nombre"></xsl:value-of>
                </title>
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
                    <h5> CENTRO FP SUPERIOR DE LA CÁMARA DE COMERCIO DE SEVILLA</h5>

                </div>
                <div class="header3">
                    <h2>
                        <xsl:value-of select="//Titulos/Titulo[$codigoTitulo]/@Nombre"></xsl:value-of>
                    </h2> <!--XPATH-->
                </div>
                <div class="header4">
                    <h2>
                        <xsl:value-of select="//Titulos/Titulo[$codigoTitulo]/Modulos/Modulo[@Codigo=concat($codigoModulo,'')]/@Nombre"></xsl:value-of>
                    </h2> <!--XPATH-->
                </div>
                <ul style="margin-right:8%">
                    <div class="contenedor-curso ">
                        <div class="contenedor"
                             style="height:300px;width: 350px;background-color: rgb(0, 0, 114);display:flex;flex-direction:column;justify-self: center;border-radius: 10%; ">
                            <div class="contenedor-curso">
                                <div class="naranja"
                                     style="background-color: #ea9c00;flex:1;border-radius: 999px;margin-top:-5%;margin-left: 5%;margin-right: 5%;font-size: 23px;align-content: center;text-align: center;font-weight: bold;color: white;padding-top: 5%;height: 80px;width:315px">
                                    <p>Modulos requeridos</p>
                                </div>
                            </div>
                            <div class="contenedor-acordeon" style="flex:2;">
                                <div class="accordion rounded-pill" id="contenedor-acordeon"
                                     style="background-color: #0195db; width: 280px; margin-top: -5%; justify-self: center;">
                                    <div class="accordion-item rounded-5 mb-2"
                                         style="border:none; ">
                                        <h2 class="accordion-header"
                                            id="headingcontenedor-acordeon"
                                            style="border-radius: 40px;">
                                            <button class="accordion-button rounded-pill"
                                                    type="button" data-bs-toggle="collapse"
                                                    data-bs-target="#collapseZero"
                                                    style="background-color:#0195db;color:#ffffff ;font-size:15px;font-weight: bold;">
                                                Modulos requeridos
                                            </button>
                                        </h2>
                                        <div id="collapseZero"
                                             class="accordion-collapse collapse"
                                             data-bs-parent="#contenedor-acordeon">
                                            <div class="accordion-body">
                                                <i>No hay informacion</i>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="objetivosgenerales">
                            <div class="accordion rounded-5" id="competenciageneral"
                                 style="background-color: #0195db; max-width: 550px;">
                                <div class="accordion-item rounded-5 mb-2">
                                    <h2 class="accordion-header" id="headingOne">
                                        <button class="accordion-button rounded-5  "
                                                type="button" data-bs-toggle="collapse"
                                                data-bs-target="#collapseOne"
                                                style="background-color:#0195db;color:#ffffff ;font-size: 23px;font-weight: bold;align-items: center;justify-content: center;">
                                            Contenidos Básicos
                                        </button>
                                    </h2>
                                    <div id="collapseOne"
                                         class="accordion-collapse collapse "
                                         data-bs-parent="#accordionExample">
                                        <div class="accordion-body" style="font-size:13px;">
                                            Organismos e instituciones relacionados con el comercio internacional:
                                            <br>/</br>
                                            – La balanza de pagos: concepto y estructura.
                                            <br>/</br>
                                            – La Organización Mundial de Comercio (OMC).
                                            <br>/</br>
                                            – La Organización para la Cooperación y el Desarrollo Económico (OCDE).
                                            <br>/</br>
                                            – El Fondo Monetario Internacional.
                                            <br>/</br>
                                            – El Banco Mundial.
                                            <br>/</br>
                                            – Otros organismos internacionales que afectan al comercio.
                                            <br>/</br>
                                            – El proceso de integración económica. Niveles y fases de integración. Integración europea. Integraciones económicas internacionales.
                                            <br>/</br>
                                            – Instituciones de la Unión Europea.
                                            <br>/</br>
                                            Organización de sistemas de información aplicados al comercio internacional:
                                            <br>/</br>
                                            – Fuentes de información sobre comercio internacional. Identificación de organismos e instituciones que facilitan información.
                                            <br>/</br>
                                            – El Instituto de Comercio Exterior (ICEX).
                                            <br>/</br>
                                            – La Cámara de Comercio Internacional. Bases de datos.
                                            <br>/</br>
                                            – Obtención de información a través de Internet.
                                            <br>/</br>
                                            – Diseño, utilización y mantenimiento de bases de datos de clientes y proveedores.
                                            <br>/</br>
                                            – Sistemas de comunicación con clientes y proveedores.
                                            <br>/</br>
                                            – Sistemas de archivo de documentación generada en las operaciones de comercio internacional.
                                            <br>/</br>
                                            – Diseño, utilización y actualización de bases de datos con información de las operaciones de comercio internacional.
                                            <br>/</br>
                                            Reconocimiento de las distintas barreras al comercio internacional:
                                            <br>/</br>
                                            – Barreras arancelarias a la importación de mercancías: El arancel de aduanas y medidas de efecto equivalente.
                                            <br>/</br>
                                            – Barreras no arancelarias. Restricciones cuantitativas a la importación.
                                            <br>/</br>
                                            – Medidas de defensa de la competencia.
                                            <br>/</br>
                                            – Medidas de salvaguardia.
                                            <br>/</br>
                                            – Barreras técnicas y administrativas a la importación: certificados de normalización, homologación y control de calidad, certificados sanitarios, fitosanitarios y veterinarios, certificados SOIVRE y certificados CITES, entre otros.
                                            <br>/</br>
                                            – Barreras fiscales.
                                            <br>/</br>
                                            – Instrumentos de protección de las exportaciones.
                                            <br>/</br>
                                            – La política comercial común.
                                            <br>/</br>
                                            – Régimen de comercio de las importaciones y de las exportaciones.
                                            <br>/</br>
                                            – La política agrícola común (PAC).
                                            <br>/</br>
                                            Caracterización de los procedimientos administrativos de las operaciones de importación/exportación y de introducción/expedición:
                                            <br>/</br>
                                            – El origen de las mercancías:
                                            <br>/</br>
                                            · Criterios para la atribución del origen. Origen preferencial y no preferencial.
                                            <br>/</br>
                                            · Justificación o acreditación del origen: Certificados de origen para la exportación y para la importación.
                                            <br>/</br>
                                            – El arancel de aduanas: estructura, tarifas. El arancel integrado comunitario.
                                            <br>/</br>
                                            – Valoración en Aduana de las mercancías: la declaración de valor en aduana (documento DV1).
                                            <br>/</br>
                                            – Fiscalidad del comercio exterior en las aduanas.
                                            <br>/</br>
                                            – Operaciones intracomunitarias. Sistema INTRASTAT.
                                            <br>/</br>
                                            Elaboración de la documentación de las operaciones de importación/exportación e introducción/expedición de mercancías:
                                            <br>/</br>
                                            – Gestión aduanera de las importaciones y de las exportaciones. Normativa.
                                            <br>/</br>
                                            – Procedimiento de gestión aduanera o despacho de importaciones y exportaciones. Presentación de la mercancía. La declaración sumaria. Presentación de la declaración de importación/exportación (DUA) y demás documentos que lo acompañan.
                                            <br>/</br>
                                            – Aplicación informática de gestión administrativa y aduanera de las operaciones de importación y exportación.
                                            <br>/</br>
                                            – Regímenes económicos aduaneros: normativa aplicable. Procedimiento y documentación necesaria para su gestión.
                                            <br>/</br>
                                            – Otros destinos aduaneros: normativa, documentación y procedimiento de gestión.
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="competenciaspps">
                            <div class="accordion rounded-5" id="competenciaspps"
                                 style="background-color: #0195db; max-width: 550px; margin-top: 10%;">
                                <div class="accordion-item rounded-5 mb-2">
                                    <h2 class="accordion-header" id="headingTwo">
                                        <button class="accordion-button rounded-5"
                                                type="button" data-bs-toggle="collapse"
                                                data-bs-target="#collapseTwo"
                                                style="background-color:#0195db;color:#ffffff ;font-size: 23px;font-weight: bold;align-items: center;justify-content: center;">
                                            Objetivos Generales
                                        </button>
                                    </h2>
                                    <div id="collapseTwo"
                                         class="accordion-collapse collapse"
                                         data-bs-parent="#accordionExample">
                                        <div class="accordion-body">
                                             
                                            <p style="font-size:13px;">
                                                La formación del módulo contribuye a alcanzar los objetivos generales g), ñ), o), p), q), r), s), t), u), v) y w) del ciclo formativo, y las competencias f), l), m), n), ñ), o), p), q), r) y s) del título.
                                            </p>
                                             
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </ul>
                <div class="contenedor-ResultadosAprendizaje">
                    <div class="resultado">
                        <p>Resultados</p>
                    </div>
                    <ul style="margin-left: 12%;">
                        <xsl:for-each select="//Titulos/Titulo[$codigoTitulo]/Modulos/Modulo[@Codigo=concat($codigoModulo,'')]/ResultadoDeAprendizaje">
                            <xsl:variable name="idAc" select="position()" />
                            <xsl:variable name="idResultado" select="@Codigo"/>
                            <br></br>
                            <div class="ra">
                                <div class="accordion rounded-5" id="accordion2{$idAc}"
                                     style="background-color: #0195db; max-width: 550px;">
                                    <div class="accordion-item rounded-5 mb-2">
                                        <h2 class="accordion-header" id="heading{$idAc}">
                                            <button class="accordion-button rounded-5  "
                                                    type="button" data-bs-toggle="collapse"
                                                    data-bs-target="#collapse{$idAc}"
                                                    style="background-color:#0195db;color:#ffffff ;font-size: 23px;font-weight: bold;align-items: center;justify-content: center;">
                                                  
                                                <xsl:value-of select="@Codigo"></xsl:value-of> - <xsl:value-of select="@Descripcion"></xsl:value-of>
                                                
                                            </button>
                                        </h2>
                                        <div id="collapse{$idAc}"
                                             class="accordion-collapse collapse"
                                             data-bs-parent="#accordion2{$idAc}">
                                            <div class="accordion-body">
                                                <xsl:for-each select="//Titulos/Titulo[$codigoTitulo]/Modulos/Modulo[@Codigo=concat($codigoModulo,'')]/ResultadoDeAprendizaje[@Codigo=concat($idResultado,'')]/CriterioDeEvaluacion">
                                                    <li style="list-style:none;text-decoration:none;font-size:13px;">
                                                        <b>Codigo: </b> 
                                                        <xsl:value-of select="@Codigo"></xsl:value-of> 
                                                        <br></br>
                                                        <b>Descripcion: </b> 
                                                        <xsl:value-of select="@Descripcion"></xsl:value-of>
                                                    </li>
                                                </xsl:for-each>
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
                        <img src="../img/icons8-instagram-50.png"
                             alt="Instagram"/>
                        <img src="../img/icons8-youtube-50.png" alt="Youtube"/>
                        <img src="../img/logo-de-facebook.png" alt="Facebook"
                             width="50px" height="50px"/>
                    </div>
                    <div class="contacto">
                        <ul
                            style="align-content: center;list-style-type: none;">
                            <li>
                                <img src="../img/correo-electronico.png"
                                     alt="Correo Electrónico"/>
                                <p
                                    style="color:white;font-size:20px">info@fpcampuscamara.es</p>
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
