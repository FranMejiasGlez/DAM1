<?xml version="1.0" encoding="UTF-8"?>


<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <xsl:template match="/">
        <xsl:variable name="codigoModulo" select="'1007'"></xsl:variable>
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
                                            Preparación de los materiales de comunicación:
                                            <br/>
                                            - Fuentes de información offline y online utilizadas habitualmente por su fiabilidad y coste en el sector de la publicidad y el diseño gráfico.
                                            <br/>
                                            - Motores de búsqueda online de bancos de imágenes.
                                            <br/>
                                            - Normas de uso y copyright de bancos de datos e imágenes, tanto online como offline.
                                            <br/>
                                            - Los derechos de autor.
                                            <br/>
                                            - Características y funciones de la papelería corporativa.
                                            <br/>
                                            - Soportes informativos de los eventos, productos y servicios desarrollados.
                                            <br/>
                                            - Importancia del diseño del etiquetado del producto, envase, embalaje secundario y terciario.
                                            <br/>
                                            - Características y funciones de los soportes publicitarios utilizados en el exterior.
                                            <br/>
                                            - Otros materiales de comunicación publicitaria.
                                            <br/>
                                            - Medios tradicionales de comunicación de masas.
                                            <br/>
                                            - Medios de comunicación multimedia.
                                            <br/>
                                            - Diseños existentes en Internet.
                                            <br/>
                                            Confección de materiales publicitarios en diferentes soportes:
                                            <br/>
                                            - Composición, color y tipografía de folletos, trípticos y carteles.
                                            <br/>
                                            - Redacción y maquetación de anuncios en prensa.
                                            <br/>
                                            - La composición de los elementos: escala, proporción, equilibrio en una composición y contraste de tono y escala.
                                            <br/>
                                            - La percepción visual.
                                            <br/>
                                            - Equilibrio, tensión y nivelación.
                                            <br/>
                                            - Sentido de la lectura.
                                            <br/>
                                            - Técnicas de comunicación visual.
                                            <br/>
                                            - Fases de elaboración de material audiovisual.
                                            <br/>
                                            - Ensayo del producto y revisión.
                                            <br/>
                                            - Banners.
                                            <br/>
                                            - Ventanas emergentes o pop-up y pop-under.
                                            <br/>
                                            - Marketing directo. Mailing personalizado.
                                            <br/>
                                            - Publicidad gratuita en buscadores y redes sociales.
                                            <br/>
                                            Aplicación de técnicas de comunicación persuasivas:
                                            <br/>
                                            - Tipos de publicidad.
                                            <br/>
                                            - Introducción al concepto de creatividad.
                                            <br/>
                                            - Estilos creativos de publicidad.
                                            <br/>
                                            - Creatividad publicitaria en medios y soportes impresos y audiovisuales.
                                            <br/>
                                            - Técnicas de creatividad publicitaria.
                                            <br/>
                                            - La creatividad en la comunicación publicitaria.
                                            <br/>
                                            - Modalidades de instrucciones creativas.
                                            <br/>
                                            - Sujeto creativo y producto creativo.
                                            <br/>
                                            - La dimensión persuasiva de la comunicación publicitaria.
                                            <br/>
                                            - Establecimiento de la estrategia publicitaria.
                                            <br/>
                                            - El briefing.
                                            <br/>
                                            - Los objetivos publicitarios: definición del público objetivo, características del producto y el presupuesto.
                                            <br/>
                                            - Fijación del calendario publicitario.
                                            <br/>
                                            - La importancia del posicionamiento.
                                            <br/>
                                            Elaboración de materiales publicitarios e informativos:
                                            <br/>
                                            - Diseño de plantillas para: presentaciones multimedia, e-mails y notas de prensa, entre otros.
                                            <br/>
                                            - Herramientas de presentaciones gráficas.
                                            <br/>
                                            - Programas generalistas destinados a la elaboración de material publicitario.
                                            <br/>
                                            - Programas específicos de diseño gráfico.
                                            <br/>
                                            - Programas para maquetación y composición de diseños de textos.
                                            <br/>
                                            - Programas específicos de manipulación de imágenes.
                                            <br/>
                                            - Aplicaciones específicas de diseño web.
                                            <br/>
                                            Organización del plan de difusión de materiales publipromocionales e informativos:
                                            <br/>
                                            - Objetivos publicitarios.
                                            <br/>
                                            - Presupuesto de publicidad.
                                            <br/>
                                            - Temporalidad publicitaria y calendarios de las inserciones publicitarias.
                                            <br/>
                                            - Tipos de calendarios de inserciones.
                                            <br/>
                                            - Factores determinantes de la planificación temporal.
                                            <br/>
                                            - Público objetivo y perfil de la audiencia.
                                            <br/>
                                            - Adecuación del medio publicitario al producto o servicio.
                                            <br/>
                                            - Alcance de los diferentes medios publicitarios.
                                            <br/>
                                            - Sistemas de medición de audiencias.
                                            <br/>
                                            - Coste de soporte, coste por contacto y coste útil.
                                            <br/>
                                            - Cobertura y distribución de combinaciones de soportes e indicadores derivados.
                                            <br/>
                                            - Indicadores de rentabilidad.
                                            <br/>
                                            - Proveedores de marketing directo. Contratación y outsourcing.
                                            <br/>
                                            - Copias de seguridad: métodos físicos y programas informáticos.
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
                                                La formación del módulo contribuye a alcanzar los objetivos generales n), o), p), q), r), s), t), u), v) y x) del ciclo formativo, y las competencias j), l), m), n), ñ), o), p) y r) del título.
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
