<?xml version="1.0" encoding="UTF-8"?>


<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <xsl:template match="/">
        <xsl:variable name="codigoModulo" select="'1011'"></xsl:variable>
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
                                            Planificación del trabajo de campo de una investigación comercial:
                                            <br/>
                                            - Elaboración del plan de trabajo de campo en una investigación de mercados.
                                            <br/>
                                            - Fases del trabajo de campo en un estudio comercial.
                                            <br/>
                                            - Determinación de los objetivos.
                                            <br/>
                                            - Planificación de los medios y recursos necesarios para el trabajo de campo en función del medio y tipo de encuesta (PAPI, CAPI, MCAPI, CATI y CAWI).
                                            <br/>
                                            - Asignación de objetivos individuales y colectivos al equipo de trabajo de campo.
                                            <br/>
                                            - Programación del trabajo de campo.
                                            <br/>
                                            - Elaboración del cuaderno de campo de los encuestadores.
                                            <br/>
                                            - Distribución territorial de los encuestadores.
                                            <br/>
                                            - Localización y/o selección de los elementos de la muestra. Hojas de ruta.
                                            <br/>
                                            - Salud y prevención de riesgos en el trabajo de campo.
                                            <br/>
                                            Determinación de las características del personal de campo y criterios de selección de los encuestadores:
                                            <br/>
                                            - Determinación del número de encuestadores/entrevistadores necesarios para una investigación comercial.
                                            <br/>
                                            - Características, habilidades y conocimientos que se exigen a los encuestadores.
                                            <br/>
                                            - Fases del proceso de selección del personal de campo.
                                            <br/>
                                            - Descripción del puesto de trabajo de encuestador/entrevistador.
                                            <br/>
                                            - Descripción del perfil profesional del encuestador/entrevistador. El profesiograma.
                                            <br/>
                                            - Captación y selección de un equipo de encuestadores/entrevistadores.
                                            <br/>
                                            Definición de planes de formación, perfeccionamiento y reciclaje de un equipo de encuestadores:
                                            <br/>
                                            - Determinación de las necesidades de formación del equipo de campo.
                                            <br/>
                                            - Objetivos y métodos de formación en equipos comerciales.
                                            <br/>
                                            - Planes de formación inicial de los encuestadores.
                                            <br/>
                                            - Programas de formación continua, perfeccionamiento y actualización de equipos de trabajo de campo.
                                            <br/>
                                            - Formación teórico-práctica y formación sobre el terreno de los encuestadores.
                                            <br/>
                                            - Evaluación de planes de formación.
                                            <br/>
                                            Sistemas de motivación y remuneración del equipo de trabajo de campo:
                                            <br/>
                                            - Estilos de mando y liderazgo.
                                            <br/>
                                            - Dinamización y liderazgo del equipo de encuestadores.
                                            <br/>
                                            - Técnicas de dinámica y dirección de grupos.
                                            <br/>
                                            - Motivación del equipo de trabajo de campo.
                                            <br/>
                                            - Elementos de motivación y satisfacción en el trabajo.
                                            <br/>
                                            - Incentivos económicos.
                                            <br/>
                                            - Mejora de las condiciones y promoción interna.
                                            <br/>
                                            - Formación y promoción profesional.
                                            <br/>
                                            - Situaciones de conflicto en las relaciones en equipos de campo.
                                            <br/>
                                            - Técnicas de resolución de situaciones conflictivas.
                                            <br/>
                                            - Negociación y consenso entre las partes.
                                            <br/>
                                            - Conciliación, mediación y arbitraje.
                                            <br/>
                                            - Métodos de decisión en grupo.
                                            <br/>
                                            - Retribución y rendimiento del equipo de trabajo de campo.
                                            <br/>
                                            - Sistemas de retribución del equipo de encuestadores/entrevistadores.
                                            <br/>
                                            Interpretación del cuestionario e instrucciones para la realización de la encuesta:
                                            <br/>
                                            - Métodos de encuesta.
                                            <br/>
                                            - La encuesta personal. Encuesta personal en soporte papel (PAPI) y encuesta personal asistida por ordenador (CAPI, y MCAPI).
                                            <br/>
                                            - La encuesta telefónica. La encuesta telefónica asistida por ordenador (CATI)
                                            <br/>
                                            - La encuesta a través de Internet. La encuesta online asistida por ordenador (CAWI).
                                            <br/>
                                            - La encuesta postal. Peculiaridades. Carta de presentación.
                                            <br/>
                                            - El cuestionario. Partes y elementos del cuestionario. Tipos de cuestionarios.
                                            <br/>
                                            - Metodología para el diseño del cuestionario.
                                            <br/>
                                            - El pretest del cuestionario.
                                            <br/>
                                            - Entorno de la entrevista. Guía de la entrevista y argumentario de la investigación. Cuaderno de trabajo de campo.
                                            <br/>
                                            - Fases del proceso y desarrollo de una entrevista
                                            <br/>
                                            - Derechos y deberes de los encuestados.
                                            <br/>
                                            - Códigos éticos en la obtención de datos por encuesta. Código ESOMAR y otros.
                                            <br/>
                                            - Solución de problemas en el trabajo de campo: rechazos y ausencias.
                                            <br/>
                                            - Incidencias y reclamaciones surgidas en el transcurso de la encuesta.
                                            <br/>
                                            - Técnicas de resolución de reclamaciones y quejas en la encuesta.
                                            <br/>
                                            Sistema de evaluación del trabajo de campo y desempeño de los miembros del equipo de trabajo:
                                            <br/>
                                            - Criterios y técnicas de supervisión y control del trabajo de campo.
                                            <br/>
                                            - Verificación de cuestionarios: edición, registro, codificación y transferencia de datos.
                                            <br/>
                                            - Medidas para la corrección y validación de los cuestionarios.
                                            <br/>
                                            - Evaluación de la calidad del trabajo y desempeño de los encuestadores.
                                            <br/>
                                            - Ratios de control.
                                            <br/>
                                            - Propuestas de mejora y subsanación de errores.
                                            <br/>
                                            - Informes de evaluación y control de la actividad de los encuestadores.
                                            <br/>
                                            - Elaboración de informes de control del trabajo de campo, recogiendo la evaluación de los objetivos y los errores detectados y utilizando las aplicaciones informáticas.
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
                                                La formación del módulo contribuye a alcanzar los objetivos generales f), g), o), p), q), r), s), t), u), v) y x) del ciclo formativo, y las competencias e), l), m), n), ñ), o), p) y r) del título.
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
