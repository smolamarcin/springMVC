<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" ; charset="UTF-8">
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <title>Produkty</title>
</head>
<body>
<section>
    <div class="jumbotron">
        <div class="container">
            <h1>Produkty</h1>
            <p>Wszystkie produty dostepne w naszym sklepie</p>
        </div>
    </div>
</section>
<section class="container">
    <div class="row">
            <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
                <div class="thumbnail">
                    <div class="caption">
                        <h3>${product.name}</h3>
                        <p>${product.description}</p>
                        <p>Kategoria:${product.category}</p>
                        <p>Liczba sztuk w magazynie: ${product.unitsInStock}</p>
                        <p>Opis: ${product.description}</p>
                        <p>
                            <%--<a href="<spring:url value="/products"/>" class="btn btndefault">--%>
                                <%--<span class="glyphicon-hand-left glyphicon"></span>Wstecz--%>
                            <%--</a>--%>
                            <a href="#" class="btn btn-warning btn-large">
                            <span class="glyphicon-shopping-cart glyphicon">
                                Zamow teraz
                            </span>
                            </a>
                        </p>
                    </div>
                </div>
            </div>
    </div>
</section>
</body>
</html>