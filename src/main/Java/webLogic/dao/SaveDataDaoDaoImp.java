package webLogic.dao;

import org.hibernate.procedure.ProcedureCall;
import webLogic.entity.AllDayEntity;
import webLogic.entity.ProductComputationlyEntity;
import webLogic.entity.ProductEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.util.List;
import java.util.Set;

/**
 * Created by yansolo on 16.08.2018.
 */
@Repository("SaveDataDao")
@Transactional
public class SaveDataDaoDaoImp implements SaveDataDaoInterface {

    @Resource(name = "sessionFactory")
    public SessionFactory sessionFactory;

    Set postEntity = null;
    org.hibernate.query.Query query = null;
    Session session = null;

    /*
    public List getFilmsByDate(String dateNow, String dateLater) {
        List result = null;
        org.hibernate.query.Query query = null;
        Session session = null;
        String hqlString = "FROM FilmEntity  where film_date >= :dateOne and film_date <= :dateTwo";

        System.out.printf("Dao : getFilmByDate -- " + dateNow + " - " + dateLater);
        try{
            session = sessionFactory.getCurrentSession();
            query = session.createQuery(hqlString);
            query.setParameter("dateOne",dateNow);
            query.setParameter("dateTwo",dateLater);
            result = query.getResultList();


        }catch(Exception e){
            System.out.println("" + e);


        }
        return result;
    }
    */

    public boolean saveProduct(ProductEntity productEntity) {
        try {
            sessionFactory.getCurrentSession().save(productEntity);

            return true;

        } catch (Exception e) {

            System.out.println("" + e);
            return false;

        }
    }

    public boolean saveProducts(List<ProductEntity> productEntityList) {
        try {
            //sessionFactory.getCurrentSession().save(productEntityList.);
            for (ProductEntity prodEnity : productEntityList) {
                sessionFactory.getCurrentSession().save(prodEnity);
                //  session.save(productEntity);
            }
            // session.close();
            return true;

        } catch (Exception e) {

            System.out.println("" + e);
            return false;

        }
    }

    public boolean updateProduct(ProductEntity productEntity) {
        try {
            sessionFactory.getCurrentSession().update(productEntity);

            return true;

        } catch (Exception e) {

            System.out.println("" + e);
            return false;

        }
    }

    public boolean updateProducts(List<ProductEntity> productEntityList) {
        try {
            //sessionFactory.getCurrentSession().save(productEntityList.);
            for (ProductEntity prodEnity : productEntityList) {
                sessionFactory.getCurrentSession().update(prodEnity);
                //  session.save(productEntity);
            }
            // session.close();
            return true;

        } catch (Exception e) {

            System.out.println("" + e);
            return false;

        }
    }

    public boolean saveOrUpdateAllDay(AllDayEntity allDayEntity) {
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(allDayEntity);
            // sessionFactory.getC
            return true;

        } catch (Exception e) {

            System.out.println("" + e);
            return false;

        }

    }

    public boolean saveOrUpdateProductComps(Set<ProductComputationlyEntity> productCompEntitySet) {
        try {
            for (ProductComputationlyEntity prodEnity : productCompEntitySet) {
                sessionFactory.getCurrentSession().save(prodEnity);
            }
            return true;

        } catch (Exception e) {

            System.out.println("" + e);
            return false;
        }

    }

    public boolean updateOrSaveProduct(ProductEntity productEntity) {
        try {

            sessionFactory.getCurrentSession().saveOrUpdate(productEntity);

            return true;
        } catch (Exception e) {

            System.out.println("" + e);
            return false;

        }
    }

    public boolean saveOrUpdateProductComps(ProductComputationlyEntity prodEnity) {
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(prodEnity);
            return true;

        } catch (Exception e) {

            System.out.println("" + e);
            return false;
        }

    }

    public boolean isProdByIdProduct(String uniqueId_Product) {

        {
            List result = null;
            String hqlString = "FROM ProductEntity where feedstock_uniqueId=:uniqueId_Product";

            try {
                session = sessionFactory.getCurrentSession();
                query = session.createQuery(hqlString);
                query.setParameter("uniqueId_Product", uniqueId_Product);

                result = query.getResultList();

                if ((result == null) || (result.size() == 0)) {
                    return false;
                } else {
                    return true;
                }
            } catch (Exception e) {
                System.out.println("" + e);

            }
            return false;
        }
    }


    public boolean isProdCompByIdProduct(String uniqueId_Product) {

        {
            List result = null;
            String hqlString = "FROM ProductComputationlyEntity where fsComputationly_uniqueId_Product=:uniqueId_Product";

            try {
                session = sessionFactory.getCurrentSession();
                query = session.createQuery(hqlString);
                query.setParameter("uniqueId_Product", uniqueId_Product);

                result = query.getResultList();

                if ((result == null) || (result.size() == 0)) {
                    return false;
                } else {
                    return true;
                }
            } catch (Exception e) {
                System.out.println("" + e);

            }
            return false;
        }
    }

    public ProductComputationlyEntity getProdCompByIdProduct(String uniqueId_Product) {

        {
            List result = null;
            String hqlString = "FROM ProductComputationlyEntity where fsComputationly_uniqueId_Product=:uniqueId_Product";

            try {
                session = sessionFactory.getCurrentSession();
                query = session.createQuery(hqlString);
                query.setParameter("uniqueId_Product", uniqueId_Product);

                result = query.getResultList();

                return (ProductComputationlyEntity) result.get(0);

            } catch (Exception e) {
                System.out.println("" + e);
            }
            return null;
        }
    }

    public ProductEntity getProductByIdProduct(String uniqueId_Product) {

        {
            List result = null;
            String hqlString = "FROM ProductEntity where feedstock_uniqueId=:uniqueId_Product";

            try {
                session = sessionFactory.getCurrentSession();
                query = session.createQuery(hqlString);
                query.setParameter("uniqueId_Product", uniqueId_Product);

                result = query.getResultList();

                return (ProductEntity) result.get(0);

            } catch (Exception e) {
                System.out.println("" + e);
            }
            return null;
        }
    }


    public boolean isAllDayByDate(String date) {
        List result = null;
        String hqlString = "FROM AllDayEntity where AD_date=:Date";

        try {
            session = sessionFactory.getCurrentSession();
            query = session.createQuery(hqlString);
            query.setParameter("Date", date);

            result = query.getResultList();

            if ((result == null) || (result.size() == 0)) {
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            System.out.println("" + e);
        }
        return false;
    }

    public List getAllDayByDates(String dateLater, String dateBefor) {
        List result = null;
        String hqlString = "FROM AllDayEntity where AD_date >=:dateLater and AD_date <=:dateBefor";

        try {
            session = sessionFactory.getCurrentSession();
            query = session.createQuery(hqlString);
            query.setParameter("dateLater", dateLater);
            query.setParameter("dateBefor", dateBefor);

            result = query.getResultList();

            if ((result == null) || (result.size() == 0)) {
                return null;
            } else {
                return result;
            }
        } catch (Exception e) {
            System.out.println("" + e);
        }
        return null;
    }

    public AllDayEntity getAllDayByDate(String date) {
        List result = null;
        String hqlString = "FROM AllDayEntity where AD_date=:Date";

        try {
            session = sessionFactory.getCurrentSession();
            query = session.createQuery(hqlString);
            query.setParameter("Date", date);

            result = query.getResultList();

            // session.close();
            return (AllDayEntity) result.get(0);

        } catch (Exception e) {
            System.out.println("" + e);
        }
        return null;
    }

//    @Override
//    public List getAllDayByNumberPage(int number) {
//        List result = null;
//
//        String hqlString = "FROM AllDayEntity ORDER BY date";
//
//        try {
//            session = sessionFactory.getCurrentSession();
//            query = session.createQuery(hqlString);
//            //    query.setParameter("NUMBER_1",number);
//            //  query.setParameter("NUMBER_2",number - 10);
//            query.setMaxResults(1);
//
//            result = query.getResultList();
//
//            // session.close();
//            return result;
//
//        } catch (Exception e) {
//            System.out.println("" + e);
//        }
//        return null;
//
//    }



    @Override
    public List getAllDayByNumberPage(int fromPage,int count) {
        StoredProcedureQuery query = null;
        try {
            //postEntity = getListAtHQL(HQL,login,paramInHQL,sessionFactory);
            Session session = sessionFactory.getCurrentSession();

            query = session
                    .createStoredProcedureQuery("getAllDayByNumPage",AllDayEntity.class)
                    .registerStoredProcedureParameter(1, Integer.class,
                            ParameterMode.IN)
                    .registerStoredProcedureParameter(2, Integer.class,
                            ParameterMode.IN)
                   ;


            query.setParameter(1,fromPage);
            query.setParameter(2,count);

            query.execute();

            //  System.out.println("" + query.getOutputParameterValue(1));

        } catch (Exception e) {
            e.printStackTrace();
        }


        //ToDo
        List res =  query.getResultList();

        return res;

    }





}