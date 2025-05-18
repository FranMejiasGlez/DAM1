<?xml version="1.0" encoding="UTF-8"?>


<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <xsl:template match="/">
        <xsl:variable name="codigoModulo" select="'1010'"></xsl:variable>
        <xsl:variable name="codigoTitulo" select="1"></xsl:variable>
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
                                            <br/>
                                            Análisis de las variables del mercado en el entorno de la empresa:
                                            <br/>
                                            - El sistema comercial. Variables controlables y no controlables.
                                            <br/>
                                            - Variables no controlables: el mercado y el entorno.
                                            <br/>
                                            - El mercado: estructura y límites. Clasificación de los mercados atendiendo a distintos criterios.
                                            <br/>
                                            - Análisis de los elementos del macroentorno: económico, demográfico, sociocultural, tecnológico, medioambiental y político-legal.
                                            <br/>
                                            - Análisis de los factores del microentorno: competencia, distribuidores, suministradores e instituciones.
                                            <br/>
                                            - Estudio del comportamiento del consumidor. Tipos de consumidores.
                                            <br/>
                                            - Las necesidades del consumidor. Tipos y jerarquía de las necesidades.
                                            <br/>
                                            - Análisis del proceso de compra del consumidor final. Fases y variables.
                                            <br/>
                                            - Análisis del proceso de compra del consumidor industrial. Fases y variables.
                                            <br/>
                                            - Segmentación de mercados: finalidad, requisitos y criterios de segmentación.
                                            <br/>
                                            Configuración de un sistema de información de marketing (SIM):
                                            <br/>
                                            - La necesidad de información para la toma de decisiones de marketing.
                                            <br/>
                                            - Tipos de información. Según su naturaleza, su origen y su disponibilidad.
                                            <br/>
                                            - El sistema de información de marketing (SIM). Concepto y finalidad.
                                            <br/>
                                            - Estructura del SIM. Subsistemas que lo integran.
                                            <br/>
                                            - La investigación comercial. Concepto y finalidad.
                                            <br/>
                                            - Aplicaciones de la investigación comercial.
                                            <br/>
                                            - Aspectos éticos de la investigación comercial. El código CCI/ESOMAR.
                                            <br/>
                                            Elaboración del plan de la investigación comercial:
                                            <br/>
                                            - El proceso metodológico de la investigación comercial. Fases del proceso.
                                            <br/>
                                            - Identificación y definición del problema que hay que investigar.
                                            <br/>
                                            - Definición del propósito o finalidad de la investigación.
                                            <br/>
                                            - Determinación de los objetivos de la investigación: cuestiones que hay que investigar o hipótesis que hay que contrastar.
                                            <br/>
                                            - Diseño de la investigación y elaboración del plan de la investigación comercial.
                                            <br/>
                                            - Tipos de diseños de investigación: estudios exploratorios, descriptivos y experimentales.
                                            <br/>
                                            - Presupuesto de un estudio comercial.
                                            <br/>
                                            - Fuentes de información: internas y externas, primarias y secundarias.
                                            <br/>
                                            Organización de la información secundaria disponible:
                                            <br/>
                                            - Métodos y técnicas de obtención de información secundaria.
                                            <br/>
                                            - Motores de búsqueda y criterios de selección de fuentes de información secundaria.
                                            <br/>
                                            - Obtención de datos de las fuentes de información online y offline y de las bases de datos internas y externas.
                                            <br/>
                                            - Organización de los datos obtenidos.
                                            <br/>
                                            - Análisis cuantitativo y cualitativo de la información.
                                            <br/>
                                            - Presentación de los datos.
                                            <br/>
                                            Obtención de información primaria:
                                            <br/>
                                            - Técnicas de recogida de información de las fuentes primarias.
                                            <br/>
                                            - Técnicas de investigación cualitativa: entrevistas en profundidad, focus group, técnicas proyectivas, técnicas de creatividad y observación.
                                            <br/>
                                            - Técnicas de investigación cuantitativa: encuestas, paneles, observación y experimentación.
                                            <br/>
                                            - Tecnologías de la información y la comunicación aplicadas a la investigación comercial: CAPI, MCAPI, CATI y CAWI.
                                            <br/>
                                            - El cuestionario: metodología para su diseño.
                                            <br/>
                                            Determinación de las características y tamaño de la muestra de la población:
                                            <br/>
                                            - Conceptos básicos de muestreo: población, universo, marco muestral, unidades muestrales y muestra.
                                            <br/>
                                            - Tipos de muestreo: probabilísticos y no probabilísticos.
                                            <br/>
                                            - Fases de un proceso de muestreo.
                                            <br/>
                                            - Muestreos aleatorios o probabilísticos: aleatorio simple, sistemático, estratificado, por conglomerados, por áreas y por ruta aleatoria.
                                            <br/>
                                            - Muestreos no probabilísticos: de conveniencia, por juicios, por cuotas y bola de nieve.
                                            <br/>
                                            - Factores que influyen en el tamaño de la muestra. Nivel de confianza, error de muestreo y otros.
                                            <br/>
                                            - Cálculo del tamaño de la muestra.
                                            <br/>
                                            - Inferencia estadística.
                                            <br/>
                                            - Errores muestrales y no muestrales.
                                            <br/>
                                            - Cálculo del error de muestreo.
                                            <br/>
                                            - Estimación puntual y por intervalos. Intervalos de confianza.
                                            <br/>
                                            Tratamiento y análisis estadístico de los datos:
                                            <br/>
                                            - Codificación y tabulación de los datos
                                            <br/>
                                            - Representación gráfica de los datos.
                                            <br/>
                                            - Tipos de datos: cuantitativos y cualitativos. Técnicas de análisis.
                                            <br/>
                                            - Estadística descriptiva: medidas de tendencia central, de dispersión y de forma.
                                            <br/>
                                            - Técnicas de regresión lineal y correlación simple. Ajuste de curvas.
                                            <br/>
                                            - Técnicas de regresión y correlación múltiple.
                                            <br/>
                                            - Números índices.
                                            <br/>
                                            - Series temporales. Estimación de tendencias. Deflación de series temporales.
                                            <br/>
                                            - Técnicas de análisis probabilístico.
                                            <br/>
                                            - Contraste de hipótesis.
                                            <br/>
                                            - Extrapolación de los resultados de la muestra a la población objeto de estudio.
                                            <br/>
                                            - Elaboración de informes comerciales con los resultados del análisis estadístico de datos y las conclusiones de la investigación.
                                            <br/>
                                            - Presentación de datos y anexos estadísticos: tablas, cuadros y gráficos.
                                            <br/>
                                            Gestiona bases de datos relacionales:
                                            <br/>
                                            - Estructura y funciones de las bases de datos.
                                            <br/>
                                            - Diseño de una base de datos.
                                            <br/>
                                            - Búsquedas avanzadas de datos.
                                            <br/>
                                            - Consultas de información dirigidas.
                                            <br/>
                                            - Mantenimiento y actualización de la base de datos.
                                            <br/>
                                            - Creación y desarrollo de formularios e informes.
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
                                                La formación del módulo contribuye a alcanzar los objetivos generales d), e), o), p), q), r), s), t), u), v) y x) del ciclo formativo, y las competencias d), l), m), n), ñ), o), p) y r) del título. 
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
