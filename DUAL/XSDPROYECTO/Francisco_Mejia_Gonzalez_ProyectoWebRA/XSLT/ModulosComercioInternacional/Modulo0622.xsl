<?xml version="1.0" encoding="UTF-8"?>


<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <xsl:template match="/">
        <xsl:variable name="codigoModulo" select="'0622'"></xsl:variable>
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
                                            Determinación de los distintos modos y medios de transporte:
                                            <br></br>
                                            – Transporte por carretera. Marco normativo.
                                            <br></br>
                                            – Transporte ferroviario. Redes de infraestructura. Marco normativo.
                                            <br></br>
                                            – Transporte marítimo. Marco normativo.
                                            <br></br>
                                            – Transporte fluvial. Marco normativo.
                                            <br></br>
                                            – Transporte aéreo. Marco normativo.
                                            <br></br>
                                            – Variables del transporte.
                                            <br></br>
                                            – Mercancías peligrosas. Marco normativo.
                                            <br></br>
                                            – Normas UNE de la calidad de la gestión del transporte público.
                                            <br></br>
                                            – Organismos públicos y empresas públicas del transporte.
                                            <br></br>
                                            Selección de los modos y medios de transporte y de las rutas óptimas:
                                            <br></br>
                                            – Combinación de diferentes modos de transporte. Tipología de empresas y servicios. Transporte multimodal. Marco normativo.
                                            <br></br>
                                            – Plataformas logísticas.
                                            <br></br>
                                            – Puntos físicos de origen y destino.
                                            <br></br>
                                            – Terminales de carga y puntos de frontera.
                                            <br></br>
                                            – Características de carga.
                                            <br></br>
                                            – Operativa de carga.
                                            <br></br>
                                            – Planificación y distribución de cargas.
                                            <br></br>
                                            – Selección de rutas. Optimización.
                                            <br></br>
                                            Elaboración y cumplimentación de contratos de transporte:
                                            <br></br>
                                            – Contrato de transporte. Aspectos generales.
                                            <br></br>
                                            – Clases de contrato según el medio de transporte utilizado.
                                            <br></br>
                                            – Sistemas de responsabilidad. Transferencia de riesgos.
                                            <br></br>
                                            – Daños resarcibles.
                                            <br></br>
                                            – Los sujetos del contrato de transporte.
                                            <br></br>
                                            – Agentes en el transporte internacional: agentes transitarios, agentes de aduanas, agentes marítimos, corredores marítimos (shipbroker), corresponsales y delegados.
                                            <br></br>
                                            – Técnicas y tarifas de transporte. Componentes.
                                            <br></br>
                                            – Costes: cálculo y control.
                                            <br></br>
                                            – Transferencia de riesgos. Cámara de Comercio Internacional (ICC).
                                            <br></br>
                                            – Términos internacionales de comercio.
                                            <br></br>
                                            Determinación de los elementos que garantizan la integridad y el tránsito de las mercancías:
                                            <br></br>
                                            – Integridad física de mercancías. Unidades de transporte y embalajes.
                                            <br></br>
                                            – Riesgos de la fase del transporte.
                                            <br></br>
                                            – Protección física de mercancías y tipos de embalaje.
                                            <br></br>
                                            – Contenedores.
                                            <br></br>
                                            – Tipos de contenedores: aéreos y marítimos.
                                            <br></br>
                                            – Palés aéreos y marítimos.
                                            <br></br>
                                            – Normativa sobre la consolidación y la compatibilidad de productos.
                                            <br></br>
                                            – Manipulación y estiba de mercancías.
                                            <br></br>
                                            – Marcas. Códigos de barras.
                                            <br></br>
                                            Formalización y gestión de la documentación de las operaciones de transporte internacional:
                                            <br></br>
                                            – Documentación de operaciones de transporte según el modo elegido.
                                            <br></br>
                                            – Documentación de operaciones de transporte de mercancías especiales.
                                            <br></br>
                                            – Organismos de inspección.
                                            <br></br>
                                            Secuenciación de las fases del transporte:
                                            <br></br> 
                                            – Sistemas de información y comunicación. Sistemas de intercambio de información.
                                            <br></br>
                                            – Puntos de verificación de la mercancía y trazabilidad.
                                            <br></br>
                                            – Variaciones producidas en la ruta.
                                            <br></br>
                                            – Indicadores de calidad y medidas correctoras.
                                            <br></br>
                                            Tramitación del seguro de las mercancías durante el transporte:
                                            <br></br>
                                            – Protección jurídica de las mercancías. El seguro en el transporte internacional de mercancías. Marco legal.
                                            <br></br>
                                            – El contrato de seguro. Características esenciales. Elementos.
                                            <br></br>
                                            – Tipos de pólizas de seguro según la modalidad de transporte.
                                            <br></br>
                                            – Identificación de los riesgos asegurables y necesidades de cobertura.
                                            <br></br>
                                            – Selección de la póliza más adecuada en función de las condiciones del contrato de compraventa y los incoterms.
                                            <br></br>
                                            – Procedimiento de gestión y contratación de la póliza. Documentación.
                                            <br></br>
                                            – Actuación en caso de incidencia o siniestro.
                                            <br></br>
                                            – Utilización de las herramientas informáticas para la gestión de seguros.
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
