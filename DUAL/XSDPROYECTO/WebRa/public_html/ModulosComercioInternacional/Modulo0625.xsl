<?xml version="1.0" encoding="UTF-8"?>


<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <xsl:template match="/">
        <xsl:variable name="codigoModulo" select="'0625'"></xsl:variable>
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
                                            Normativa específica del almacenaje:
                                            <br></br>
                                            – Marco legal del contrato de depósito y actividad de almacenaje-distribución.
                                            <br></br>
                                            – Normativa específica para mercancías especiales: peligrosas y perecederas, entre otras.
                                            <br></br>
                                            – Regímenes de almacenamiento en comercio internacional.
                                            <br></br>
                                            Organización del proceso de almacén:
                                            <br></br>
                                            – Organización de los almacenes en empresas de fabricación, distribución y servicios.
                                            <br></br>
                                            – Tipos de almacenes. Análisis de los tipos de sistemas de almacenaje: ventajas y desventajas.
                                            <br></br>
                                            – Sistemas modulares. Unidades de carga: palés, y contenedores.
                                            <br></br>
                                            – Sistemas de seguimiento de las mercancías: terminales de radio-frecuencia, codificación y lectores de barras, entre otros. Terminales portátiles y sistemas de reconocimiento de voz.
                                            <br></br>
                                            – Organización de actividades y flujos de mercancías en el almacén: administración, recepción, expedición, almacenaje, movimientos, picking, pasillos y preparación de pedidos y distribución. Cross docking.
                                            <br></br>
                                            – Gestión del embalaje.
                                            <br></br>
                                            – Normativa de seguridad e higiene en almacenes. Instalaciones generales y específicas.
                                            <br></br>
                                            Confección y control del presupuesto del almacén:
                                            <br></br>
                                            – Costes de almacenamiento: variables que intervienen en su cálculo.
                                            <br></br>
                                            – Coste de adquisición.
                                            <br></br>
                                            – Coste por unidad almacenada.
                                            <br></br>
                                            – La hoja de cálculo como herramienta de procesamiento de los datos.
                                            <br></br>
                                            Gestión de stocks:
                                            <br></br>
                                            – La gestión de stocks.
                                            <br></br>
                                            – Control económico. Control de incidencias.
                                            <br></br>
                                            – El ciclo del pedido de cliente.
                                            <br></br>
                                            – Criterios de valoración de las existencias en almacén.
                                            <br></br>
                                            – Software general que integre todos los aspectos del almacén, utilizando procesador de texto, hoja de cálculo, base de datos y cronogramas, entre otros.
                                            <br></br>
                                            – Programas específicos de gestión de almacenes y existencias: gestión de muelles, gestión de almacenes, gestión de aprovisionamientos, gestión de existencias y elaboración de etiquetas, entre otros.
                                            <br></br>
                                            – Programas de gestión de compras/almacén/ventas: gestión de artículos, gestión de almacén, gestión de fabricación y gestión de ventas, entre otros.
                                            <br></br>
                                            Gestión de las operaciones sujetas a la logística inversa:
                                            <br></br>
                                            – Devoluciones.
                                            <br></br>
                                            – Costes afectos a las devoluciones.
                                            <br></br>
                                            – Reutilización de unidades y equipos de carga.
                                            <br></br>
                                            – Contenedores y embalajes reutilizables.
                                            <br></br>
                                            Supervisión de los procesos realizados en el almacén:
                                            <br></br>
                                            – Sistemas de calidad en el almacén.
                                            <br></br>
                                            – Aplicación de sistemas de seguridad para personas y mercancías.
                                            <br></br>
                                            – Planes de formación inicial y continua en el equipo de trabajo del almacén: objetivos y métodos de formación. Evaluación de planes de formación.
                                            <br></br>
                                            – Nuevas tecnologías aplicadas a la automatización e informatización de los procesos o subprocesos del almacén.
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
                                                La formación del módulo se relaciona con los objetivos generales j), ñ), o), p), q), r), s), t), u), v) y w) del ciclo formativo, y las competencias h), l), m), n), ñ), o), p), q), r) y s) del título.
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
