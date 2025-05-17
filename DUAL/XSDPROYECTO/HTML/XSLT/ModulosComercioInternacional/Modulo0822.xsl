<?xml version="1.0" encoding="UTF-8"?>


<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <xsl:template match="/">
        <xsl:variable name="codigoModulo" select="'0822'"></xsl:variable>
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
                                            Análisis de las variables del mercado y del entorno de la empresa u organización:
                                            <br/>
                                            – El mercado. Elementos que lo conforman. Funcionamiento.
                                            <br/>
                                            – Estructura del mercado: mercado actual y mercado potencial.
                                            <br/>
                                            – Límites del mercado.
                                            <br/>
                                            – Clasificación de los mercados, atendiendo a distintos criterios.
                                            <br/>
                                            – Análisis de las variables del macroentorno.
                                            <br/>
                                            – Análisis de los factores del microentorno.
                                            <br/>
                                            – Instituciones nacionales e internacionales que influyen en los mercados.
                                            <br/>
                                            – Estudio de las necesidades y del comportamiento del consumidor.
                                            <br/>
                                            – El proceso de compra del consumidor. Fases y variables que intervienen.
                                            <br/>
                                            – Segmentación de mercados: objetivos y criterios de segmentación.
                                            <br/>
                                            – Aplicación de la segmentación en el diseño de estrategias comerciales.
                                            <br/>
                                            – El posicionamiento del producto y de la empresa en el mercado.
                                            <br/>
                                            Configuración de un sistema de información de marketing (SIM):
                                            <br/>
                                            – La necesidad de información para la toma de decisiones en la empresa.
                                            <br/>
                                            – Tipos de información: según su naturaleza, su origen y su disponibilidad.
                                            <br/>
                                            – El sistema de información de marketing (SIM). Características y finalidad.
                                            <br/>
                                            – Estructura del SIM. Subsistemas que lo integran y tipos de datos.
                                            <br/>
                                            – La investigación comercial. Concepto y finalidad.
                                            <br/>
                                            – Aplicaciones de la investigación comercial.
                                            <br/>
                                            – El proceso metodológico de la investigación comercial. Fases del proceso.
                                            <br/>
                                            – Aspectos éticos de la investigación comercial. El código CCI/ESOMAR.
                                            <br/>
                                            Diseño de planes de trabajo para la obtención de información:
                                            <br/>
                                            – Identificación y definición del problema u oportunidad para investigar.
                                            <br/>
                                            – Determinación de los objetivos de la investigación.
                                            <br/>
                                            – Tipos investigación: estudios exploratorios, descriptivos y experimentales.
                                            <br/>
                                            – Diseño y elaboración del plan de la investigación comercial.
                                            <br/>
                                            – Presupuesto y costes de la investigación comercial.
                                            <br/>
                                            – Fuentes de información: internas y externas, primarias y secundarias.
                                            <br/>
                                            – Métodos y técnicas de obtención de información secundaria.
                                            <br/>
                                            – Métodos y técnicas de obtención de información primaria.
                                            <br/>
                                            – Técnicas de investigación cualitativa: entrevista en profundidad, dinámica de grupos, observación y otras.
                                            <br/>
                                            – Técnicas de investigación cuantitativa: encuestas, paneles (de consumidores, de detallistas y de audiencias), observación y experimentación.
                                            <br/>
                                            – El cuestionario. Metodología para su diseño.
                                            <br/>
                                            – Elementos y estructura del cuestionario.
                                            <br/>
                                            Determinación de las características y tamaño de la muestra:
                                            <br/>
                                            – Conceptos básicos de muestreo: población, universo, marco muestral, unidades muestrales y muestra.
                                            <br/>
                                            – Muestreos aleatorios o probabilísticos.
                                            <br/>
                                            – Muestreos no probabilísticos.
                                            <br/>
                                            – Errores muestrales y no muestrales.
                                            <br/>
                                            – Factores que influyen en el tamaño de la muestra. Error de muestreo y nivel de confianza.
                                            <br/>
                                            – Cálculo del tamaño de la muestra.
                                            <br/>
                                            – Cálculo del error de muestreo.
                                            <br/>
                                            – Elaboración del plan de trabajo de campo. Fases del proceso.
                                            <br/>
                                            – Determinación del tiempo y los recursos materiales y humanos necesarios para el trabajo de campo, en función del medio y tipo de encuesta (PAPI, CAPI, CATI y CAWI).
                                            <br/>
                                            – Programación del trabajo de campo.
                                            <br/>
                                            – Organización del trabajo de campo.
                                            <br/>
                                            – Elaboración de la hoja de ruta de cada entrevistador.
                                            <br/>
                                            – Interpretación del cuestionario para detectar posibles errores con relación a la estructura y conexión entre las preguntas, y establecimiento de las oportunas medidas correctoras de las desviaciones.
                                            <br/>
                                            Realización del tratamiento y análisis de los datos:
                                            <br/>
                                            – Organización y tabulación de datos. Representación gráfica de los datos.
                                            <br/>
                                            – Análisis univariable y multivariable de datos.
                                            <br/>
                                            – Medidas de posición o tendencia central (media, mediana y moda).
                                            <br/>
                                            – Medidas de dispersión (varianza y desviación típica, recorridos y rango).
                                            <br/>
                                            – Medidas de forma de la distribución (asimetría y kurtosis).
                                            <br/>
                                            – Técnicas de análisis probabilístico. Estimación puntual y por intervalos.
                                            <br/>
                                            – Contraste de hipótesis.
                                            <br/>
                                            – Técnicas de inferencia estadística.
                                            <br/>
                                            – Regresión lineal y correlación simple. Ajuste de curvas.
                                            <br/>
                                            – Números índices.
                                            <br/>
                                            – Series temporales. Estimación de tendencias.
                                            <br/>
                                            – Aplicaciones informáticas para el tratamiento y análisis de la información: hojas de cálculo y bases de datos.
                                            <br/>
                                            – Elaboración de informes comerciales con los resultados del análisis y las conclusiones de la investigación y estudio estadístico de los datos
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
                                            La formación del módulo se relaciona con los objetivos generales b), ñ), o), p), q), r), s), t), u), v) y w) del ciclo formativo, y las competencias b), m), n), ñ), o), p), q), r) y s) del título.
                                            <p style="font-size:13px;">
                                               
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
