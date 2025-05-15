<?xml version="1.0" encoding="UTF-8"?>


<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <xsl:template match="/">
        <xsl:variable name="codigoModulo" select="'0827'"></xsl:variable>
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
                                            Elaboración del plan de marketing digital internacional:
                                            <br/>
                                            – Desarrollo del plan de marketing digital internacional.
                                            <br/>
                                            – Características específicas del cliente online internacional.
                                            <br/>
                                            – Promoción online y offline de la web exportadora.
                                            <br/>
                                            – Herramientas de posicionamiento en buscadores internacionales: e-mailmarketing, SEM, SEO y campañas en páginas afines.
                                            <br/>
                                            – Políticas de captación: proceso de creación de una marca.
                                            <br/>
                                            – Análisis de estadísticas y medición de resultados.
                                            <br/>
                                            – Marketing internacional de afiliación.
                                            <br/>
                                            – Marketing relacional y gestión de la relación con los clientes (CRM).
                                            <br/>
                                            – Cross marketing.
                                            <br/>
                                            – Marketing viral.
                                            <br/>
                                            – Marketing one-to-one.
                                            <br/>
                                            – Aplicaciones del mobile marketing y TDT, entre otros.
                                            <br/>
                                            – Internet TV, videoblogs y web TV, entre otros.
                                            <br/>
                                            Realización de las tareas básicas para la utilización de Internet:
                                            <br/>
                                            – Internet y su origen.
                                            <br/>
                                            – Funcionamiento: servidores y clientes, el protocolo TCP/IP, la World Wide Web y los dominios de la red.
                                            <br/>
                                            – Modos de conectarse a Internet.
                                            <br/>
                                            – Configuración de acceso.
                                            <br/>
                                            – Las intranets y las extranets.
                                            <br/>
                                            – El navegador y su funcionamiento: navegadores más utilizados.
                                            <br/>
                                            – Búsqueda de información nacional e internacional en la red.
                                            <br/>
                                            – Los buscadores: motores de búsqueda e índices, buscadores temáticos, multibuscadores y metabuscadores.
                                            <br/>
                                            – Conceptos básicos de búsqueda con operadores, sintaxis especiales de búsqueda, la opción de búsqueda avanzada, los servicios adicionales y las herramientas específicas.
                                            <br/>
                                            Gestión de diversos servicios de Internet:
                                            <br/>
                                            – Correo electrónico. Su funcionamiento.
                                            <br/>
                                            – El correo web: creación de una cuenta. Las funciones básicas de leer, responder y enviar.
                                            <br/>
                                            – Correo no deseado.
                                            <br/>
                                            – Correo POP3. Su utilización.
                                            <br/>
                                            – Gestión de envío, recepción y mantenimiento de correo POP3.
                                            <br/>
                                            – Transferencia de archivos. Su utilización.
                                            <br/>
                                            – Servidores FTP. Aplicaciones FTP.
                                            <br/>
                                            – Redes P2P (peer to peer). Aplicaciones.
                                            <br/>
                                            – Los foros internacionales. Leer y escribir en un foro.
                                            <br/>
                                            – Los grupos de discusión internacionales.
                                            <br/>
                                            – Redes sociales internacionales.
                                            <br/>
                                            – Weblogs, blogs o bitácoras.
                                            <br/>
                                            – Redes sociales internacionales para empresas.
                                            <br/>
                                            – Añadir elementos a una página de una red social internacional.
                                            <br/>
                                            – Comprar y vender en redes sociales internacionales.
                                            <br/>
                                            Definición de la política de comercio electrónico internacional de una empresa:
                                            <br/>
                                            – Diseño de una tienda virtual internacional.
                                            <br/>
                                            – Modelos de negocio digital: portales horizontales, B2B y B2C, entre otros.
                                            <br/>
                                            – Selección y registro de dominio.
                                            <br/>
                                            – Escaparate web. Catálogo electrónico.
                                            <br/>
                                            – Control logístico de las mercancías vendidas online.
                                            <br/>
                                            – La reclamación como instrumento de fidelización del cliente.
                                            <br/>
                                            – La importancia financiera de la reclamación.
                                            <br/>
                                            – Medios internacionales de pago electrónico.
                                            <br/>
                                            – Períodos de reflexión y cancelaciones.
                                            <br/>
                                            – Criptografía: clave simétrica, clave asimétrica y cifrado de clave única.
                                            <br/>
                                            – Firma.
                                            <br/>
                                            – Certificados digitales.
                                            <br/>
                                            – Encriptación.
                                            <br/>
                                            – Negocios electrónicos: e-shop, e-mail, e-procurement, e-marketplace y e-auction, entre otros.
                                            <br/>
                                            Realización de facturas electrónicas internacionales y otras tareas administrativas:
                                            <br/>
                                            – Factura electrónica.
                                            <br/>
                                            – Programas de facturación electrónica.
                                            <br/>
                                            – Seguridad: firma electrónica reconocida.
                                            <br/>
                                            – Relación con otras empresas y organismos públicos: banca electrónica, ministerios con atribuciones en comercio internacional y páginas de los servicios de hacienda sobre aduanas, entre otras.
                                            <br/>
                                            – Instituciones que tienen que ver con el comercio internacional: OMC, UE, ICEX y cámaras de comercio, entre otras.
                                            <br/>
                                            – Seguridad en Internet. Spam, virus informáticos, spyware, phising.
                                            <br/>
                                            – Los programas antivirus, cortafuegos y antiespías.
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
                                                La formación del módulo contribuye a alcanzar los objetivos generales n), ñ), o), p), q), r), s), t), u),v) y w) del ciclo formativo, y las competencias l), m), n), ñ), o), p), q), r) y s) del título.


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
