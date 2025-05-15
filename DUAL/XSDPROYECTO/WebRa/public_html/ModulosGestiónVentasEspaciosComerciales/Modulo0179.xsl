<?xml version="1.0" encoding="UTF-8"?>


<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <xsl:template match="/">
        <xsl:variable name="codigoModulo" select="'0179'"></xsl:variable>
        <xsl:variable name="codigoTitulo" select="3"></xsl:variable>
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
                                            <br/>
                                            Análisis de mensajes orales:
                                            <br/>
                                            – Comprensión de mensajes profesionales y cotidianos:
                                            <br/>
                                            • Mensajes directos, telefónicos, radiofónicos, grabados.
                                            <br/>
                                            • Terminología específica de la actividad profesional.
                                            <br/>
                                            • Ideas principales y secundarias.
                                            <br/>
                                            • Recursos gramaticales: tiempos verbales, preposiciones, phrasal verbs, locuciones, expresión de la condición y de la duda, uso de la voz pasiva, oraciones de relativo, estilo indirecto y verbos modales.
                                            <br/>
                                            • Otros recursos lingüísticos: acuerdos y desacuerdos, hipótesis y especulaciones, opiniones y consejos, persuasión y advertencia.
                                            <br/>
                                            • Diferentes acentos de lengua oral.
                                            <br/>
                                            Interpretación de mensajes escritos:
                                            <br/>
                                            – Comprensión de mensajes, textos, artículos básicos profesionales y cotidianos:
                                            <br/>
                                            • Soportes telemáticos: fax, e-mail, burofax.
                                            <br/>
                                            • Terminología específica de la actividad profesional. “False friends”.
                                            <br/>
                                            • Ideas principales y secundarias.
                                            <br/>
                                            • Recursos gramaticales: tiempos verbales, preposiciones, phrasal verbs, I wish + pasado simple o perfecto, I wish + would, If only; uso de la voz pasiva, oraciones de relativo, estilo indirecto y verbos modales.
                                            <br/>
                                            – Relaciones lógicas: oposición, concesión, comparación, condición, causa, finalidad y resultado.
                                            <br/>
                                            – Relaciones temporales: anterioridad, posterioridad y simultaneidad.
                                            <br/>
                                            Producción de mensajes orales:
                                            <br/>
                                            – Mensajes orales:
                                            <br/>
                                            • Registros utilizados en la emisión de mensajes orales.
                                            <br/>
                                            • Terminología específica de la actividad profesional. “False friends”.
                                            <br/>
                                            • Recursos gramaticales: tiempos verbales, preposiciones, phrasal verbs, locuciones, expresión de la condición y de la duda, uso de la voz pasiva, oraciones de relativo, estilo indirecto y verbos modales.
                                            <br/>
                                            • Otros recursos lingüísticos: acuerdos y desacuerdos, hipótesis y especulaciones, opiniones y consejos, persuasión y advertencia.
                                            <br/>
                                            • Fonética. Sonidos y fonemas vocálicos y sus combinaciones y sonidos y fonemas consonánticos y sus agrupaciones.
                                            <br/>
                                            • Marcadores lingüísticos de relaciones sociales, normas de cortesía y diferencias de registro.
                                            <br/>
                                            – Mantenimiento y seguimiento del discurso oral:
                                            <br/>
                                            • Toma, mantenimiento y cesión del turno de palabra.
                                            <br/>
                                            • Apoyo, demostración de entendimiento, petición de aclaración, etc.
                                            <br/>
                                            • Entonación como recurso de cohesión del texto oral: uso de los patrones de entonación.
                                            <br/>
                                            Emisión de textos escritos:
                                            <br/>
                                            – Expresión y cumplimentación de mensajes y textos profesionales y cotidianos:
                                            <br/>
                                            • Currículo vitae y soportes telemáticos: fax, e-mail y burofax, entre otros.
                                            <br/>
                                            • Terminología específica de la actividad profesional.
                                            <br/>
                                            • Idea principal e ideas secundarias.
                                            <br/>
                                            • Recursos gramaticales: tiempos verbales, preposiciones, phrasal verbs, verbos modales, locuciones, uso de la voz pasiva, oraciones de relativo y estilo indirecto.
                                            <br/>
                                            – Relaciones lógicas: oposición, concesión, comparación, condición, causa, finalidad y resultado.
                                            <br/>
                                            – Relaciones temporales: anterioridad, posterioridad y simultaneidad.
                                            <br/>
                                            – Coherencia textual:
                                            <br/>
                                            • Adecuación del texto al contexto comunicativo.
                                            <br/>
                                            • Tipo y formato de texto.
                                            <br/>
                                            • Variedad de lengua. Registro.
                                            <br/>
                                            • Selección léxica, de estructuras sintácticas y de contenido relevante.
                                            <br/>
                                            • Inicio del discurso e introducción del tema. Desarrollo y expansión: ejemplificación, conclusión y/ o resumen del discurso.
                                            <br/>
                                            • Uso de los signos de puntuación.
                                            <br/>
                                            Identificación e interpretación de los elementos culturales más significativos de los países de lengua extranjera (inglesa):
                                            <br/>
                                            – Valoración de las normas socioculturales y protocolarias en las relaciones internacionales.
                                            <br/>
                                            – Uso de los recursos formales y funcionales en situaciones que requieren un comportamiento socio-profesional con el fin de proyectar una buena imagen de la empresa.
                                            <br/>
                                            – Reconocimiento de la lengua extranjera para profundizar en conocimientos que resulten de interés a lo largo de la vida personal y profesional.
                                            <br/>   
                                            – Uso de registros adecuados según el contexto de la comunicación, el interlocutor y la intención de los interlocutores.
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
                                                La formación del módulo contribuye a alcanzar los objetivos generales m), ñ), o), p), q), r), s), t), u), v) y w) del ciclo formativo, y las competencias k), m), n), ñ), o), p), q), r) y s) del título.
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
