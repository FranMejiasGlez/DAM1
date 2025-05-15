<?xml version="1.0" encoding="UTF-8"?>


<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <xsl:template match="/">
        <xsl:variable name="codigoModulo" select="'0823'"></xsl:variable>
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
                <ul>
                    <div class="contenedor-curso ">
                        <div class="curso" style="font-weight:bold;">
                            <p>Competencias</p>
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
                                            Determinación de la oportunidad de entrada de un producto en un mercado exterior:
                                            <br/>
                                            – Factores de la política de productos.
                                            <br/>
                                            – Relaciones causales de las variables de marketing mix.
                                            <br/>
                                            – Análisis DAFO.
                                            <br/>
                                            – Posicionamiento del producto.
                                            <br/>
                                            – Informe sobre oportunidades de lanzamiento de un producto.
                                            <br/>
                                            Diseño de políticas de precios y tarifas comerciales en un mercado exterior:
                                            <br/>
                                            – Métodos de fijación de precios.
                                            <br/>
                                            – Variables determinantes del precio del producto para la exportación: costes, incoterms, divisas, tipo de cambio, márgenes, demanda y competencia.
                                            <br/>
                                            – Cálculo del precio del producto para la exportación, a partir del escandallo de costes, utilizando diferentes incoterms.
                                            <br/>
                                            – Políticas de precios en mercados exteriores.
                                            <br/>
                                            – Estrategias de precios.
                                            <br/>
                                            – Tendencia de los precios.
                                            <br/>
                                            Selección de la forma más adecuada de entrada en un mercado exterior:
                                            <br/>
                                            – Alternativas para operar en mercados internacionales.
                                            <br/>
                                            – Modos de operación directos.
                                            <br/>
                                            – Modos de operación indirectos.
                                            <br/>
                                            – Modos de operación mixtos.
                                            <br/>
                                            – Coste de distribución en mercados exteriores.
                                            <br/>
                                            – Selección del canal de distribución.
                                            <br/>
                                            – Red de ventas exterior, propia, ajena o mixta.
                                            <br/>
                                            – Clasificación de los productos asociada a la forma de distribución de los mismos.
                                            <br/>
                                            – Informe sobre las alternativas de distribución de los productos de una empresa.
                                            <br/>
                                            Determinación de las acciones de comunicación comercial más adecuadas en la entrada a un mercado exterior:
                                            <br/>
                                            – Herramientas de comunicación.
                                            <br/>
                                            – Medios, soportes y formas de comunicación comercial e la práctica comercial internacional.
                                            <br/>
                                            – Objetivos y elementos de la comunicación comercial con clientes internacionales.
                                            <br/>
                                            – Técnicas psicológicas en el diseño de una acción de comunicación comercial.
                                            <br/>
                                            – Medios de promoción, contenido y forma del mensaje promocional.
                                            <br/>
                                            – Comunicación online.
                                            <br/>
                                            – Métodos para la asignación de recursos financieros y presupuesto de una campaña de comunicación internacional.
                                            <br/>
                                            – Objetivos y criterios para la asistencia a ferias y eventos internacionales
                                            <br/>
                                            – Plan de marketing online para el lanzamiento y difusión de nuevos productos.
                                            <br/>
                                            Elaboración de un plan de marketing internacional:
                                            <br/>
                                            – La internacionalización: motivos, obstáculos y etapas del proceso de internacionalización de la empresa.
                                            <br/>
                                            – La planificación de marketing. Finalidad y objetivos.
                                            <br/>
                                            – Análisis de la situación. Análisis interno y externo. Análisis DAFO.
                                            <br/>
                                            – Estrategias del plan de marketing del producto o servicio, a partir de la información disponible en el SIM sobre los distintos mercados.
                                            <br/>
                                            – El briefing del plan de marketing internacional: estructura y elementos.
                                            <br/>
                                            – Presupuesto. Recursos financieros, humanos y de tiempo.
                                            <br/>
                                            – Ejecución y control del plan de marketing.
                                            <br/>
                                            – Análisis estadístico de un plan de marketing internacional convenientemente caracterizado.
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
                                                La formación del módulo se relaciona con los objetivos generales c), d), n), ñ), o), p), q), r), s), t), u), v) y w) del ciclo formativo, y las competencias c), d), m), n), ñ), o), p), q), r), y s) del título.
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
