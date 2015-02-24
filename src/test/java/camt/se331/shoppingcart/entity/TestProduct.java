package camt.se331.shoppingcart.entity;

import camt.se331.shoppingcart.service.ProductService;
import camt.se331.shoppingcart.service.ProductServiceImpl;



import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.Profile;

import static junitparams.JUnitParamsRunner.$;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Punjasin on 24/2/2558.
 */
public class TestProduct {
    ProductService productService;
    @Before
    public void setUp() {
        productService = new ProductServiceImpl();


    }


    @Test
    public void testNetPrice() {
        Product products = new Product();
        VatEntity.getInstance().setVat(0.10);
        assertThat(productService.getProduct(1l).getNetPrice(), is(900.00));
        VatEntity.getInstance().setVat(0.05);
        assertThat(productService.getProduct(2l).getNetPrice(),is(1900.00));
        VatEntity.getInstance().setVat(0.00);
        assertThat(productService.getProduct(3l).getNetPrice(),is(2500.00));
        VatEntity.getInstance().setVat(1.00);
        assertThat(productService.getProduct(4l).getNetPrice(),is(0.00));
    }}


