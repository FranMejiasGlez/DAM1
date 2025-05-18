<?xml version="1.0" encoding="UTF-8"?>


<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <xsl:template match="/">
        <xsl:variable name="codigoModulo" select="'1110'"></xsl:variable>
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
                                            Organización del departamento de atención al cliente:
                                            <br/>
                                            - La atención al cliente en las empresas y organizaciones.
                                            <br/>
                                            - Marketing relacional y de relación con los clientes.
                                            <br/>
                                            - Gestión de las relaciones con clientes.
                                            <br/>
                                            - Factores que influyen en la atención al cliente de una empresa u organización.
                                            <br/>
                                            - La identidad corporativa y la imagen de marca. Posicionamiento y diferenciación.
                                            <br/>
                                            - Servicios de atención al cliente, consumidor o usuario.
                                            <br/>
                                            - El departamento de atención al cliente en las empresas y organizaciones. Objetivos. Estructura y organización.
                                            <br/>
                                            - Funciones del departamento.
                                            <br/>
                                            - Dependencia funcional. Relaciones con otros departamentos.
                                            <br/>
                                            - Estructuras organizativas: organigramas. Tipos.
                                            <br/>
                                            - Competencias generales y específicas del personal del departamento de atención al cliente, consumidor o usuario.
                                            <br/>
                                            - Los contact centers. Funciones que desempeñan en el sistema de relación con los clientes. Servicios que prestan.
                                            <br/>
                                            Utilización de técnicas de comunicación en situaciones de atención al cliente:
                                            <br/>
                                            - La comunicación en la empresa. Información y comunicación.
                                            <br/>
                                            - El proceso de comunicación.
                                            <br/>
                                            - Tipos de comunicación.
                                            <br/>
                                            - La comunicación en situaciones de información al cliente, consumidor o usuario. Actitudes y técnicas de comunicación.
                                            <br/>
                                            - La empatía.
                                            <br/>
                                            - La asertividad.
                                            <br/>
                                            - La comunicación oral.
                                            <br/>
                                            - La comunicación no verbal.
                                            <br/>
                                            - La comunicación telefónica.
                                            <br/>
                                            - Utilización de las nuevas tecnologías en la comunicación telefónica.
                                            <br/>
                                            - La comunicación escrita. Tipos de cartas y documentos escritos. Las comunicaciones formales.
                                            <br/>
                                            - La comunicación escrita a través de la red (Internet/Intranet).
                                            <br/>
                                            - El correo electrónico. Mensajería instantánea.
                                            <br/>
                                            - Comunicación en tiempo real: chat. videoconferencia.
                                            <br/>
                                            - Comunicación diferida (foros).
                                            <br/>
                                            Organización de un sistema de información:
                                            <br/>
                                            - Técnicas de organización y archivo de documentación.
                                            <br/>
                                            - Sistemas de clasificación, catalogación y archivo de documentos.
                                            <br/>
                                            - Tipología de archivos. Archivos manuales e informáticos.
                                            <br/>
                                            - Tratamiento y organización de documentos de atención al cliente, consumidor o usuario.
                                            <br/>
                                            - Ficheros de clientes.
                                            <br/>
                                            - Las bases de datos.
                                            <br/>
                                            - Bases de datos documentales.
                                            <br/>
                                            - Herramientas de gestión de las relaciones con clientes (CRM).
                                            <br/>
                                            - Manejo de bases de datos de clientes. Tratamiento de la información.
                                            <br/>
                                            - Acceso a la información. Realización de consultas.
                                            <br/>
                                            - Transmisión de información en la empresa. Elaboración de informes.
                                            <br/>
                                            - Protección de datos. Normativa legal.
                                            <br/>
                                            Identificación de los distintos organismos e instituciones de protección al consumidor y usuario:
                                            <br/>
                                            - Concepto de consumidor y usuario.
                                            <br/>
                                            - Caracterización de diferentes tipos de consumidores y usuarios.
                                            <br/>
                                            - Derechos del consumidor.
                                            <br/>
                                            - La defensa del consumidor. Normativa legal.
                                            <br/>
                                            - Instituciones públicas de protección del consumidor. Tipología, organigrama funcional y competencias.
                                            <br/>
                                            - Entidades privadas de protección al consumidor. Tipología, organigrama funcional y competencias.
                                            <br/>
                                            Gestión de quejas y reclamaciones:
                                            <br/>
                                            - Tipos de consultas, quejas, reclamaciones y denuncias más habituales en materia de consumo.
                                            <br/>
                                            - Normativa vigente en materia de consumo aplicable a la gestión de reclamaciones y denuncias.
                                            <br/>
                                            - Proceso de gestión de reclamaciones y denuncias. Fases del proceso.
                                            <br/>
                                            - Procedimiento de recogida de las reclamaciones y denuncias.
                                            <br/>
                                            - Proceso de tramitación y gestión de la reclamación.
                                            <br/>
                                            - Las reclamaciones ante la Administración. Actuación administrativa. Los actos administrativos. El silencio administrativo.
                                            <br/>
                                            - Las técnicas de comunicación en situaciones de quejas y reclamaciones.
                                            <br/>
                                            - Tratamiento al cliente, consumidor o usuario ante las quejas y reclamaciones. La escucha activa y empática. La asertividad.
                                            <br/>
                                            - La negociación en la resolución de quejas y reclamaciones o denuncias.
                                            <br/>
                                            - El plan de negociación. Fases. Preparación. Estrategia. Desarrollo. Técnicas y tácticas de negociación en las reclamaciones. Acuerdo.
                                            <br/>
                                            Descripción de los procesos de mediación y arbitraje:
                                            <br/>
                                            - Conceptos de mediación y arbitraje. Características diferenciadoras.
                                            <br/>
                                            - Situaciones de conflicto en materia de consumo en las que se puede utilizar una mediación.
                                            <br/>
                                            - El proceso de mediación.
                                            <br/>
                                            - Situaciones de conflicto en materia de consumo en las que se puede plantear un arbitraje.
                                            <br/>
                                            - El proceso de arbitraje en materia de consumo.
                                            <br/>
                                            Elaboración de un plan de calidad y de mejora del servicio de atención al cliente, consumidor o usuario:
                                            <br/>
                                            - Incidencias, anomalías y retrasos en el proceso de atención/información al cliente y en la resolución de quejas y reclamaciones.
                                            <br/>
                                            - Tratamiento de las incidencias o anomalías.
                                            <br/>
                                            - Procedimientos de control del servicio de atención al cliente.
                                            <br/>
                                            - Evaluación del servicio de atención al cliente.
                                            <br/>
                                            - Métodos para evaluar la eficacia del servicio y el nivel de satisfacción del cliente.
                                            <br/>
                                            - Normativa aplicable en materia de atención al cliente. Ley de Ordenación del Comercio Minorista. Ley de servicios de la sociedad de la información y el comercio electrónico. Ley de Protección de Datos de Carácter Personal.
                                            <br/>
                                            - Estrategias y técnicas de fidelización de clientes.
                                            <br/>
                                            - Programas de fidelización.
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
                                                La formación del módulo contribuye a alcanzar los objetivos generales j), k), o), p), q), r), s), t), u), v), w) y x) del ciclo formativo, y las competencias g), l), m), n), ñ), o), p), q) y r) del título.
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
