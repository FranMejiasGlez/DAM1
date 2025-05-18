<?xml version="1.0" encoding="UTF-8"?>


<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <xsl:template match="/">
        <xsl:variable name="codigoModulo" select="'0825'"></xsl:variable>
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
                                            Organización de la información y documentación relativa a las operaciones de financiación internacional:
                                            <br/>
                                            – Organismos y entidades que proporcionan información relacionada con la financiación de las operaciones de comercio internacional.
                                            <br/>
                                            – Obtención de información a través de la página web de los distintos organismos.
                                            <br/>
                                            – Elaboración de una base de datos de los organismos que facilitan apoyo financiero, ayuda o subvenciones a la exportación y venta internacional.
                                            <br/>
                                            – Elaboración y mantenimiento de bases de datos de clientes y proveedores potenciales.
                                            <br/>
                                            Análisis del funcionamiento del mercado de divisas:
                                            <br/>
                                            – El sistema financiero internacional.
                                            <br/>
                                            – Estructura del mercado de divisas o mercado FOREX:
                                            <br/>
                                            · Organismos y entidades que participan en el mercado de divisas.
                                            <br/>
                                            · Normativa reguladora del mercado.
                                            <br/>
                                            – Funcionamiento del mercado de divisas.
                                            <br/>
                                            · La divisa. Convertible y no convertible.
                                            <br/>
                                            · La oferta y la demanda de divisas.
                                            <br/>
                                            · El precio o tipo de cambio. Tipos de compra y de venta.
                                            <br/>
                                            · Variables que influyen en la fluctuación del tipo de cambio de una divisa.
                                            <br/>
                                            · Tipo de cambio y tipo de interés de una divisa.
                                            <br/>
                                            – Tipo de transacciones en el mercado FOREX.
                                            <br/>
                                            – Los euromercados.
                                            <br/>
                                            – Organismos financieros internacionales.
                                            <br/>
                                            – El sistema monetario europeo. La Unión Monetaria.
                                            <br/>
                                            – Instituciones monetarias europeas.
                                            <br/>
                                            Gestión y cobertura del riesgo de cambio y del riesgo de interés en las operaciones de importación y exportación:
                                            <br/>
                                            – Los riegos en el comercio internacional: comerciales y financieros.
                                            <br/>
                                            – El riesgo de cambio de una divisa. Factores de riesgo.
                                            <br/>
                                            – Cobertura del riesgo de cambio. Estrategias de gestión del riesgo.
                                            <br/>
                                            – Mecanismos de cobertura del riesgo de cambio.
                                            <br/>
                                            – Mecanismos de cobertura del riesgo de interés.
                                            <br/>
                                            – Cálculo de los costes financieros de cobertura del riesgo de cambio y del riesgo de interés, utilizando la aplicación informática adecuada.
                                            <br/>
                                            Determinación de la financiación adecuada de las operaciones de compraventa internacional y cálculo de costes financieros y riesgos:
                                            <br/>
                                            – Financiación de las importaciones y compras internacionales.
                                            <br/>
                                            – Financiación de las exportaciones, ventas y proyectos internacionales.
                                            <br/>
                                            – Cálculo de los costes financieros y las cuotas de amortización, elaborando el cuadro de amortización del préstamo, leasing u otro, mediante la hoja de cálculo.
                                            <br/>
                                            Gestión del crédito con apoyo oficial a la exportación:
                                            <br/>
                                            – Marco legal: el consenso OCDE.
                                            <br/>
                                            – Fuentes de financiación de las exportaciones con apoyo oficial.
                                            <br/>
                                            – Organismos que intervienen: ICO, CESCE y otros.
                                            <br/>
                                            – Crédito suministrador-exportador nacional. Operativa.
                                            <br/>
                                            – Crédito comprador extranjero: crédito individual o línea de crédito. Operativa.
                                            <br/>
                                            – Requisitos y condiciones básicas del crédito con apoyo oficial.
                                            <br/>
                                            – El Convenio de Ajuste Recíproco de Intereses (CARI). Procedimiento de cálculo.
                                            <br/>
                                            – Créditos del Fondo de Ayuda al Desarrollo (créditos FAD).
                                            <br/>
                                            Elaboración de la documentación necesaria para participar en licitaciones y concursos internacionales:
                                            <br/>
                                            – Normas y reglamentos de licitación del Banco Mundial y otros organismos internacionales que la regulan.
                                            <br/>
                                            – Instituciones y organismos convocantes de proyectos. Objetivos.
                                            <br/>
                                            – Procedimiento de adjudicación de proyectos. Fases del proceso.
                                            <br/>
                                            – Documentación que hay que presentar en un concurso o licitación.
                                            <br/>
                                            – Fianzas y garantías.
                                            <br/>
                                            – Participación de las empresas españolas en proyectos internacionales.
                                            <br/>
                                            Selección de la cobertura adecuada de los posibles riesgos en las operaciones de venta:
                                            <br/>
                                            – Riesgos en las operaciones de comercio internacional.
                                            <br/>
                                            – El contrato de seguro de crédito a la exportación.
                                            <br/>
                                            – La Compañía Española de Seguros de Crédito a la Exportación (CESCE).
                                            <br/>
                                            – Modalidades de pólizas para ventas-exportaciones a corto plazo.
                                            <br/>
                                            – Tipos de pólizas para ventas internacionales a medio y largo plazo.
                                            <br/>
                                            – Proceso de contratación del seguro de crédito.
                                            <br/>
                                            – Procedimiento de declaración de siniestros e indemnización por daños.
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
                                                La formación del módulo contribuye a alcanzar los objetivos generales h), i), ñ), o), p), q), r), s), t), u) y v) del ciclo formativo, y las competencias g), l), m), n), ñ), o), p), q), r) y s) del título.  
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
