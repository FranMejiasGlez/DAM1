<?xml version="1.0" encoding="UTF-8"?>


<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <xsl:template match="/">
        <xsl:variable name="codigoModulo" select="'0824'"></xsl:variable>
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
                                            <br/>
                                            Selección de clientes y/o proveedores potenciales:
                                            <br/>
                                            – Instrumentos promocionales de apoyo a la exportación.
                                            <br/>
                                            – Factores de riesgo internos: cliente y/o proveedor.
                                            <br/>
                                            – Factores de riesgo externos: coyuntura y/o mercado.
                                            <br/>
                                            – Licitaciones y concursos internacionales.
                                            <br/>
                                            – Selección de proveedores.
                                            <br/>
                                            – Selección de clientes.
                                            <br/>
                                            Establecimiento del proceso de comunicación en las relaciones internacionales:
                                            <br/>
                                            – Fuentes de información sobre comercio internacional.
                                            <br/>
                                            – Medios y sistemas de comunicación internacionales.
                                            <br/>
                                            – La comunicación verbal.
                                            <br/>
                                            – La comunicación no verbal.
                                            <br/>
                                            – La entrevista.
                                            <br/>
                                            – Protocolo internacional.
                                            <br/>
                                            Diseño del proceso de negociación con clientes y/o proveedores internacionales:
                                            <br/>
                                            – Preparación de la negociación internacional.
                                            <br/>
                                            – El margen de la negociación.
                                            <br/>
                                            – Desarrollo de la negociación internacional.
                                            <br/>
                                            – Etapas del proceso de negociación.
                                            <br/>
                                            – Consolidación de la negociación internacional.
                                            <br/>
                                            – Técnicas de negociación internacional.
                                            <br/>
                                            – Estilos nacionales de negociación comercial en diferentes países: anglosajón, francés, alemán, nipón, chino, norteamericano, hispanoamericano y árabe, entre otros.
                                            <br/>
                                            – Factores de éxito en una negociación internacional.
                                            <br/>
                                            – Utilización de procesadores de texto.
                                            <br/>
                                            – Programas de presentaciones gráficas.
                                            <br/>
                                            Interpretación de la normativa y usos habituales que regulan la contratación internacional:
                                            <br/>
                                            – Regulación de la compraventa internacional.
                                            <br/>
                                            – Instrumentos de armonización: Lex Mercatum.
                                            <br/>
                                            – Reglas de la Cámara de Comercio Internacional.
                                            <br/>
                                            – Los incoterms.
                                            <br/>
                                            – El arbitraje internacional.
                                            <br/>
                                            Elaboración de contratos internacionales:
                                            <br/>
                                            – El contrato de compraventa internacional.
                                            <br/>
                                            – Los contratos de intermediación comercial.
                                            <br/>
                                            – Los contratos de cooperación empresarial.
                                            <br/>
                                            – El contrato de suministro.
                                            <br/>
                                            – Los contratos de prestación de servicios y resultado.
                                            <br/>
                                            – Contratación mediante concursos o licitaciones internacionales.
                                            <br/>
                                            Planificación del desarrollo y control de los acuerdos contractuales internacionales:
                                            <br/>
                                            – Organización de operaciones de compraventa internacional.
                                            <br/>
                                            – Técnicas de motivación, perfeccionamiento y temporalización de la red de ventas.
                                            <br/>
                                            – Ratios de control de operaciones internacionales.
                                            <br/>
                                            – Control de calidad de operaciones internacionales.
                                            <br/>
                                            – Sistemas de información y control de incidencias en operaciones de control internacional. 
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
                                                La formación del módulo contribuye a alcanzar los objetivos generales e), f), ñ), o), p), q), r), s), t), u), v) y w) del ciclo formativo, y las competencias e), m), n), ñ), o), p), q), r) y s) del título.
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
